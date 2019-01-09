package stonetree.com.stntech.statement.configurator;

import java.lang.ref.WeakReference;

import stonetree.com.stntech.statement.interactor.StatementInteractor;
import stonetree.com.stntech.statement.presenter.StatementPresenter;
import stonetree.com.stntech.statement.router.StatementRouter;
import stonetree.com.stntech.statement.view.IStatementActivity;
import stonetree.com.stntech.statement.view.StatementActivity;

public enum StatementConfigurator {

    INSTANCE;

    public void configure(StatementActivity activity){

        StatementRouter router = new StatementRouter();
        router.view = new WeakReference<>(activity);

        StatementPresenter presenter = new StatementPresenter();
        presenter.view = new WeakReference<IStatementActivity>(activity);

        StatementInteractor interactor = new StatementInteractor();
        interactor.presenter = presenter;

        if (activity.interactor == null){
            activity.interactor = interactor;
        }
        if (activity.router == null){
            activity.router = router;
        }
    }

}
