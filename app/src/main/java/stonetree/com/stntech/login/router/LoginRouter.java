package stonetree.com.stntech.login.router;

import android.os.Bundle;

import java.lang.ref.WeakReference;

import stonetree.com.stntech.login.view.LoginActivity;
import stonetree.com.stntech.statement.view.StatementActivity;
import stonetree.com.stntech.utils.IntentStarterUtils;

public class LoginRouter implements ILoginRouter {

    public WeakReference<LoginActivity> view;

    @Override
    public void executeScreenTransition(Bundle bundle) {
        IntentStarterUtils.goFromTo(view.get(), StatementActivity.class);
    }

}
