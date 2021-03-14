package hoekcel;

import hoekcel.exceptions.DoesNotContainNumbersOnly;
import hoekcel.exceptions.EmptyInput;
import hoekcel.exceptions.NegativNumberException;
import hoekcel.model.IncomeStatement;
import hoekcel.model.IncomeStatementFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    IncomeStatementFactory incomeStatementFactory;
    IncomeStatement incomeStatement;

    @FXML
    private Label mainLabel_Title, mainLabel_kr, mainLabel_Om, mainLabel_Vf, mainLabel_Btf,mainLabel_Mfomk,
            mainLabel_Mkbi, mainLabel_Indtbi, mainLabel_Resfr, mainLabel_Afskr, mainLabel_Ovkpomk,
            mainLabel_Rntomk, mainLabel_ResText,mainLabel_VisRes;

    @FXML
    private TextField mainText_Om, mainText_Mfomk, mainText_Mkbi, mainText_Ovkpomk, mainText_Indtbi,
            mainText_Afskr, mainText_Resfr,mainText_Rntomk, mainText_Vf, mainText_Btf;

    @FXML
    private Button mainButton_Close, mainButton_Help,mainButton_addComment,mainButton_VisBudget,
            mainButton_GenBudget,mainButton_Eksporter,mainButton_Oms, mainButton_Vareforbrug,
            mainButton_OvrigeKapOmk, mainButton_Afskrivninger;

    @FXML
    private ToggleButton mainToggleButton_kr;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.incomeStatementFactory = new IncomeStatementFactory();
        this.incomeStatement = incomeStatementFactory.getIncomeStatement();

        mainText_Om.textProperty().addListener((observable, oldValue, newValue) -> {
            incomeStatement.setTurnover(Long.parseLong(newValue));

            if (!mainText_Vf.getText().isEmpty()) {

                var turnoverAsString = String.valueOf(incomeStatement.getTurnover());
                var productConsumptionAsString = String.valueOf(incomeStatement.getProductConsumption());

                try {

                    var grossProfit = incomeStatement.calculateGrossProfit(turnoverAsString, productConsumptionAsString);
                    incomeStatement.setGrossProfits(grossProfit);
                    mainText_Btf.setText(String.valueOf(incomeStatement.getGrossProfits()));

                } catch (EmptyInput | DoesNotContainNumbersOnly | NegativNumberException exception) {

                }
            }
        });

        mainText_Vf.textProperty().addListener((observable, oldValue, newValue) -> {
            incomeStatement.setProductConsumption(Long.parseLong(newValue));
            if (!mainText_Om.getText().isEmpty()) {
                long turnover = incomeStatement.getTurnover();
                long productConsumption = incomeStatement.getProductConsumption();
                var turnoverAsString = String.valueOf(turnover);
                var productionConsumptionAsString = String.valueOf(productConsumption);

                try {
                    var grossProfit = incomeStatement.calculateGrossProfit(turnoverAsString, productionConsumptionAsString);

                    incomeStatement.setGrossProfits(grossProfit);
                    mainText_Btf.setText(String.valueOf(incomeStatement.getGrossProfits()));

                } catch (EmptyInput | DoesNotContainNumbersOnly | NegativNumberException exception) {

                }
            }
        });

        mainText_Btf.textProperty().addListener((observable, oldValue, newValue) -> {
            incomeStatement.setGrossProfits(Long.parseLong(newValue));
            updateMkbi(mainText_Mkbi);
        });

        mainText_Mfomk.textProperty().addListener((observable, oldValue, newValue) -> {
            incomeStatement.setMarketingCost(Long.parseLong(newValue));
            updateMkbi(mainText_Btf);
        });

        mainText_Mkbi.textProperty().addListener((observable, oldValue, newValue) -> {
            incomeStatement.setMarketingContribution(Long.parseLong(newValue));
            updateIndtbi();
        });

        mainText_Ovkpomk.textProperty().addListener((observable, oldValue, newValue) -> {
            incomeStatement.setCapacityCost(Long.parseLong(newValue));
            updateIndtbi();
        });

        mainText_Indtbi.textProperty().addListener((observable, oldValue, newValue) -> {
            incomeStatement.setEarningsContribution(Long.parseLong(newValue));
            updateResfr();
        });

        mainText_Afskr.textProperty().addListener((observable, oldValue, newValue) -> {
            incomeStatement.setDepreciations(Long.parseLong(newValue));
            updateResfr();
        });

        mainText_Resfr.textProperty().addListener((observable, oldValue, newValue) -> {
            incomeStatement.setProfitBeforeInterest(Long.parseLong(newValue));
            updateVisRes();
        });

        mainText_Rntomk.textProperty().addListener((observable, oldValue, newValue) -> {
            incomeStatement.setInterest(Long.parseLong(newValue));
            updateVisRes();
        });
    }

    private void updateVisRes() {
        long profitBeforeInterest = incomeStatement.getProfitsBeforeInterest();
        long interest = incomeStatement.getInterest();
        var profitBeforeInterestAsString = String.valueOf(profitBeforeInterest);
        var interestAsString = String.valueOf(interest);

        try {
            var result = incomeStatement.
                    calculateResult(profitBeforeInterestAsString, interestAsString);

            incomeStatement.setResult(result);
            mainLabel_VisRes.setText(String.valueOf(incomeStatement.getResult()));

        } catch (EmptyInput | DoesNotContainNumbersOnly exception) {

        }
    }

    private void updateResfr() {
        long earningsContribution = incomeStatement.getEarningsContribution();
        long depreciation = incomeStatement.getDepreciations();
        var earningContributionAsString = String.valueOf(earningsContribution);
        var depreciationAsString = String.valueOf(depreciation);

        try {
            var profitBeforeInterest = incomeStatement.
                    calculateProfitBeforeInterest(earningContributionAsString, depreciationAsString);

            incomeStatement.setProfitBeforeInterest(profitBeforeInterest);
            mainText_Resfr.setText(String.valueOf(incomeStatement.getProfitsBeforeInterest()));

        } catch (EmptyInput | DoesNotContainNumbersOnly | NegativNumberException exception) {

        }
    }

    private void updateIndtbi() {


        long marketingContribution = incomeStatement.getMarketingContribution();
        long capacityCost = incomeStatement.getCapacityCost();
        var marketingContributionAsString = String.valueOf(marketingContribution);
        var capacityCostAsString = String.valueOf(capacityCost);

        try {
            var earningsContribution = incomeStatement.calculateEarningsContribution(marketingContributionAsString,
                    capacityCostAsString);

            incomeStatement.setEarningsContribution(earningsContribution);
            mainText_Indtbi.setText(String.valueOf(incomeStatement.getEarningsContribution()));

        } catch (EmptyInput | DoesNotContainNumbersOnly | NegativNumberException exception) {

        }
    }

    private void updateMkbi(TextField mainText_mkbi) {
        if (!mainText_mkbi.getText().isEmpty()) {
            long grossProfits = incomeStatement.getGrossProfits();
            long marketingCosts = incomeStatement.getMarketingCost();
            var grossProfitsAsString = String.valueOf(grossProfits);
            var marketingCostAsString = String.valueOf(marketingCosts);

            try {
                var marketingContribution = incomeStatement.calculateMarketingContribution(grossProfitsAsString, marketingCostAsString);

                incomeStatement.setMarketingContribution(marketingContribution);
                mainText_Mkbi.setText(String.valueOf(incomeStatement.getMarketingContribution()));

            } catch (EmptyInput | DoesNotContainNumbersOnly | NegativNumberException exception) {

            }
        }
    }
}
