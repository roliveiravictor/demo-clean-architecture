package stonetree.com.stntech.login.configurator;

import java.lang.ref.WeakReference;

import stonetree.com.stntech.login.interactor.LoginInteractor;
import stonetree.com.stntech.login.presenter.LoginPresenter;
import stonetree.com.stntech.login.router.LoginRouter;
import stonetree.com.stntech.login.view.LoginActivity;
import stonetree.com.stntech.login.worker.LoginWorker;

public enum LoginConfigurator {

    INSTANCE;

    public void configure(LoginActivity activity) {

        final LoginWorker worker = new LoginWorker();

        final LoginRouter router = new LoginRouter();
        router.view = new WeakReference<>(activity);

        final LoginPresenter presenter = new LoginPresenter();
        presenter.view = new WeakReference<>(activity);

        final LoginInteractor interactor = new LoginInteractor();
        interactor.presenter = presenter;
        interactor.worker = worker;

        if (activity.interactor == null) {
            activity.interactor = interactor;
        }

        if (activity.router == null) {
            activity.router = router;
        }

    }

}
