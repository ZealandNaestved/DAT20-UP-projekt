package hoekcel.view.presenters;

import java.math.BigInteger;

public class PresentAsThousands implements Presenter {

    @Override
    public String convertOutput(BigInteger value) {


        return value.divide(new BigInteger("1000")).toString();
    }
}
