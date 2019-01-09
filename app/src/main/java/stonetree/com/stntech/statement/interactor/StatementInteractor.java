package stonetree.com.stntech.statement.interactor;

import stonetree.com.stntech.statement.presenter.IStatementPresenter;
import stonetree.com.stntech.statement.worker.IStatementWorker;

public class StatementInteractor implements IStatementInteractor {

    public IStatementPresenter presenter;

    public IStatementWorker worker;

}
