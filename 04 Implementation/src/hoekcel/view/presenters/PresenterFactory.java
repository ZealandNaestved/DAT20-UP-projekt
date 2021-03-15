package hoekcel.view.presenters;

public class PresenterFactory {

    public PresentAsOnes getPresentAsOnesPresenter() {
        return new PresentAsOnes();
    }
    public PresentAsThousands getPresentAsThousandsPresenter() {
        return new PresentAsThousands();
    }
}
