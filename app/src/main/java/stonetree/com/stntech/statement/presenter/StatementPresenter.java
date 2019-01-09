package stonetree.com.stntech.statement.presenter;

import java.lang.ref.WeakReference;

import stonetree.com.stntech.statement.view.IStatementActivity;

public class StatementPresenter implements IStatementPresenter {

    public WeakReference<IStatementActivity> view;

}
