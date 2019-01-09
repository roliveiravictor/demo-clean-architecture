package stonetree.com.stntech.login.presenter;

import java.lang.ref.WeakReference;

import stonetree.com.stntech.core.model.CoreErrorModel;
import stonetree.com.stntech.core.model.Session;
import stonetree.com.stntech.login.model.LoginResponse;
import stonetree.com.stntech.login.view.ILoginActivity;

public class LoginPresenter implements ILoginPresenter {

    public WeakReference<ILoginActivity> view;

    @Override
    public void parse(LoginResponse response) {
        Session.getInstance().getUser().setName(response.getContract().getName());
        Session.getInstance().getUser().setAgency(response.getContract().getAgency());
        Session.getInstance().getUser().setBankAccount(response.getContract().getBankAccount());
        Session.getInstance().getUser().setBalance(response.getContract().getBalance());
        view.get().proceedToStatement();
        view.get().hideLoading();
    }

    @Override
    public void purge(CoreErrorModel response) {
        view.get().toast(response.getMessage());
        view.get().hideLoading();
    }
}
