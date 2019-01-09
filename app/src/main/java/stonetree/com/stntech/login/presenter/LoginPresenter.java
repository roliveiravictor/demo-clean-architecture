package stonetree.com.stntech.login.presenter;

import java.lang.ref.WeakReference;

import stonetree.com.stntech.login.view.ILoginActivity;

public class LoginPresenter implements ILoginPresenter {

    public WeakReference<ILoginActivity> view;

}
