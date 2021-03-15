package hoekcel.view.presenters;

import java.math.BigInteger;

public class PresentAsOnes implements Presenter{

    @Override
    public String convertOutput(BigInteger output) {

        return output.toString();
    }
}
