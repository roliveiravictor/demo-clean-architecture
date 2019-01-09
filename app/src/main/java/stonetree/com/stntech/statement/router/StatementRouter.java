package stonetree.com.stntech.statement.router;

import android.os.Bundle;

import java.lang.ref.WeakReference;

import stonetree.com.stntech.statement.view.StatementActivity;

public class StatementRouter implements IStatementRouter {

    public WeakReference<StatementActivity> view;

    @Override
    public void executeScreenTransition(Bundle bundle) {

    }
}
