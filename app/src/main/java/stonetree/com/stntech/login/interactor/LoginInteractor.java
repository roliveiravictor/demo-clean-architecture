package stonetree.com.stntech.login.interactor;

import stonetree.com.stntech.login.presenter.ILoginPresenter;
import stonetree.com.stntech.login.worker.ILoginWorker;

public class LoginInteractor implements ILoginInteractor {

    public ILoginPresenter presenter;

    public ILoginWorker worker;

}
