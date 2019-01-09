package stonetree.com.stntech.login.configurator;

import java.lang.ref.WeakReference;

import stonetree.com.stntech.login.interactor.LoginInteractor;
import stonetree.com.stntech.login.presenter.LoginPresenter;
import stonetree.com.stntech.login.router.LoginRouter;
import stonetree.com.stntech.login.view.ILoginActivity;
import stonetree.com.stntech.login.view.LoginActivity;

public enum LoginConfigurator {

    INSTANCE;

    public void configure(LoginActivity activity){

        LoginRouter router = new LoginRouter();
        router.view = new WeakReference<>(activity);

        LoginPresenter presenter = new LoginPresenter();
        presenter.view = new WeakReference<ILoginActivity>(activity);

        LoginInteractor interactor = new LoginInteractor();
        interactor.presenter = presenter;

        if (activity.interactor == null){
            activity.interactor = interactor;
        }
        if (activity.router == null){
            activity.router = router;
        }
    }

}
