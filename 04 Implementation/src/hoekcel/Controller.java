package hoekcel;

import hoekcel.inputvalidation.InputChecker;
import hoekcel.model.IncomeStatement;
import hoekcel.model.IncomeStatementFactory;
import hoekcel.view.DisplayMode;
import hoekcel.view.presenters.INOUTFormat;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.math.BigInteger;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    IncomeStatementFactory incomeStatementFactory;
    IncomeStatement incomeStatement;
    InputChecker inputChecker;

    final String ERROR_HEADER_TEGN = "Du kan ikke bruge tegn.";
    final String ERROR_MESSAGE_TEGN = "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).";
    final String ERROR_HEADER_NEGATIV = "Negative tal kan ikke benyttes";
    final String ERROR_MESSAGE_NEGATIV = "Negative tal kan ikke benyttes. Du skal angive et heltal.";

    DisplayMode displayMode = DisplayMode.THOUSANDS;


    @FXML
    private Label mainLabel_Title, mainLabel_kr, mainLabel_Om, mainLabel_Vf, mainLabel_Btf, mainLabel_Mfomk,
            mainLabel_Mkbi, mainLabel_Indtbi, mainLabel_Resfr, mainLabel_Afskr, mainLabel_Ovkpomk,
            mainLabel_Rntomk, mainLabel_ResText, mainLabel_VisRes;

    @FXML
    private TextField mainText_Om, mainText_Mfomk, mainText_Mkbi, mainText_Ovkpomk, mainText_Indtbi,
            mainText_Afskr, mainText_Resfr, mainText_Rntomk, mainText_Vf, mainText_Btf;

    @FXML
    private Button mainButton_Close, mainButton_Help, mainButton_addComment, mainButton_VisBudget,
            mainButton_GenBudget, mainButton_Eksporter, mainButton_Oms, mainButton_Vareforbrug,
            mainButton_OvrigeKapOmk, mainButton_Afskrivninger;

    @FXML
    private ImageView toggleImage;

    @FXML
    private Button mainToggleButton_onAndOff;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.incomeStatementFactory = new IncomeStatementFactory();
        this.incomeStatement = incomeStatementFactory.getIncomeStatement();
        this.inputChecker = new InputChecker();


        mainText_Om.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                showError(ERROR_HEADER_TEGN, ERROR_MESSAGE_TEGN);
                mainText_Om.setText(oldValue);
                return;
            }

            if (checkNegativ(newValue)) {

                showError(ERROR_HEADER_NEGATIV, ERROR_MESSAGE_NEGATIV);
                mainText_Om.setText(oldValue);
                return;
            }
            incomeStatement.setTurnover(new BigInteger(newValue));

            if (isFilled(mainText_Vf)) {

                updateBtf();
            }
        });

        mainText_Vf.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                showError(ERROR_HEADER_TEGN, ERROR_MESSAGE_TEGN);
                mainText_Vf.setText(oldValue);
                return;
            }

            if (checkNegativ(newValue)) {

                showError(ERROR_HEADER_NEGATIV, ERROR_MESSAGE_NEGATIV);
                mainText_Vf.setText(oldValue);
                return;
            }

            incomeStatement.setProductConsumption(new BigInteger(newValue));
            if (isFilled(mainText_Om)) {

                updateBtf();
            }
        });

        mainText_Btf.textProperty().addListener((observable, oldValue, newValue) -> {
            if (checkInputOnlydigits(newValue)) {

                showError(ERROR_HEADER_TEGN, ERROR_MESSAGE_TEGN);
                mainText_Btf.setText(oldValue);
                return;
            }

            incomeStatement.setGrossProfits(new BigInteger(newValue));

            if (isFilled(mainText_Ovkpomk)) {

                updateMkbi();
            }
        });

        mainText_Mfomk.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                showError(ERROR_HEADER_TEGN, ERROR_MESSAGE_TEGN);
                mainText_Mfomk.setText(oldValue);
                return;
            }

            if (checkNegativ(newValue)) {

                showError(ERROR_HEADER_NEGATIV, ERROR_MESSAGE_NEGATIV);
                mainText_Mfomk.setText(oldValue);
                return;
            }

            incomeStatement.setMarketingCost(new BigInteger(newValue));

            if (isFilled(mainText_Btf)) {

                updateMkbi();
            }
        });

        mainText_Mkbi.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                showError(ERROR_HEADER_TEGN, ERROR_MESSAGE_TEGN);
                mainText_Mkbi.setText(oldValue);
                return;
            }

            incomeStatement.setMarketingContribution(new BigInteger(newValue));

            if (isFilled(mainText_Ovkpomk)) {

                updateIndtbi();
            }
        });

        mainText_Ovkpomk.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                mainText_Ovkpomk.setText(oldValue);
                return;
            }

            if (checkNegativ(newValue)) {

                showError(ERROR_HEADER_NEGATIV, ERROR_MESSAGE_NEGATIV);
                mainText_Ovkpomk.setText(oldValue);
                return;
            }
            incomeStatement.setCapacityCost(new BigInteger(newValue));

            if (isFilled(mainText_Mkbi)) {

                updateIndtbi();
            }
        });

        mainText_Indtbi.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                mainText_Indtbi.setText(oldValue);
                return;
            }

            incomeStatement.setEarningsContribution(new BigInteger(newValue));

            if (isFilled(mainText_Afskr)) {

                updateResfr();
            }
        });

        mainText_Afskr.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                mainText_Afskr.setText(oldValue);
                return;
            }

            if (checkNegativ(newValue)) {

                showError(ERROR_HEADER_NEGATIV, ERROR_MESSAGE_NEGATIV);
                mainText_Afskr.setText(oldValue);
                return;
            }

            incomeStatement.setDepreciations(new BigInteger(newValue));

            if (isFilled(mainText_Indtbi)) {

                updateResfr();
            }
        });

        mainText_Resfr.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                mainText_Resfr.setText(oldValue);
                return;
            }

            incomeStatement.setProfitBeforeInterest(new BigInteger(newValue));

            if (isFilled(mainText_Rntomk)) {

                updateVisRes();
            }
        });

        mainText_Rntomk.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                mainText_Rntomk.setText(oldValue);
                return;
            }

            if (checkNegativ(newValue)) {

                showError(ERROR_HEADER_NEGATIV, ERROR_MESSAGE_NEGATIV);
                mainText_Rntomk.setText(oldValue);
                return;
            }

            incomeStatement.setInterest(new BigInteger(newValue));

            if (isFilled(mainText_Resfr)) {

                updateVisRes();
            }
        });

    }

    @FXML
    private void flipDisplayMode() {
        if (displayMode.equals(DisplayMode.ONES)) {

            displayMode = DisplayMode.THOUSANDS;
            var toggleOnImage = new Image("assets/ToggleOn.png");
            mainLabel_kr.setText("Beløb angives i 1000kr.");
            this.mainToggleButton_onAndOff.setText("Beløb angives i 1000kr");
            toggleImage.setImage(toggleOnImage);
        } else {
            var toggleOffImage = new Image("assets/ToggleOff.png");
            toggleImage.setImage(toggleOffImage);
            mainLabel_kr.setText("Beløb angives i 1kr.");
            mainToggleButton_onAndOff.setText("Beløb angives i 1kr");
            displayMode = DisplayMode.ONES;
        }
    }

    private void updateBtf() {

        var turnover = incomeStatement.getTurnover();
        var productConsumption = incomeStatement.getProductConsumption();

        var grossProfit = incomeStatement.calculateGrossProfit(turnover, productConsumption);
        incomeStatement.setGrossProfits(grossProfit);

        mainText_Btf.setText(INOUTFormat.convertOutput(incomeStatement.getGrossProfits()));
    }

    private void updateVisRes() {

        var profitBeforeInterest = incomeStatement.getProfitsBeforeInterest();
        var interest = incomeStatement.getInterest();

        var result = incomeStatement.
                calculateResult(profitBeforeInterest, interest);

        incomeStatement.setResult(result);
        mainLabel_VisRes.setText(String.valueOf(incomeStatement.getResult()));
    }

    private void updateResfr() {

        var earningsContribution = incomeStatement.getEarningsContribution();
        var depreciation = incomeStatement.getDepreciations();

        var profitBeforeInterest = incomeStatement.
                calculateProfitBeforeInterest(earningsContribution, depreciation);

        incomeStatement.setProfitBeforeInterest(profitBeforeInterest);
        mainText_Resfr.setText(String.valueOf(incomeStatement.getProfitsBeforeInterest()));

    }

    private void updateIndtbi() {

        var marketingContribution = incomeStatement.getMarketingContribution();
        var capacityCost = incomeStatement.getCapacityCost();

        var earningsContribution = incomeStatement.calculateEarningsContribution(marketingContribution,
                capacityCost);

        incomeStatement.setEarningsContribution(earningsContribution);
        mainText_Indtbi.setText(String.valueOf(incomeStatement.getEarningsContribution()));
    }

    private void updateMkbi() {

        var grossProfits = incomeStatement.getGrossProfits();
        var marketingCosts = incomeStatement.getMarketingCost();

        var marketingContribution = incomeStatement.
                calculateMarketingContribution(grossProfits, marketingCosts);

        incomeStatement.setMarketingContribution(marketingContribution);
        mainText_Mkbi.setText(String.valueOf(incomeStatement.getMarketingContribution()));
    }

    private void showError(String headerText, String errorMessage) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION, errorMessage, ButtonType.OK);
        alert.setTitle("Fejl i indput");
        alert.setHeaderText(headerText);
        alert.setWidth(500);
        alert.setHeight(200);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.OK) {
            alert.close();
        }
    }

    private boolean checkInputOnlydigits(String input) {
        return inputChecker.onlyDigits(input);
    }

    private boolean checkNegativ(String input) {
        return inputChecker.isNegative(input);
    }

    private boolean isFilled(TextField field) {
        return !field.getText().isEmpty();
    }
}
