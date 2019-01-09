package stonetree.com.stntech.login.interactor;

import stonetree.com.stntech.core.model.CoreErrorModel;
import stonetree.com.stntech.login.model.LoginRequest;
import stonetree.com.stntech.login.model.LoginResponse;
import stonetree.com.stntech.login.presenter.ILoginPresenter;
import stonetree.com.stntech.login.worker.ILoginWorker;

public class LoginInteractor implements ILoginInteractor {

    public ILoginPresenter presenter;

    public ILoginWorker worker;

    @Override
    public void requestLogin(String username, String password) {
        final LoginRequest body = new LoginRequest();
        body.setUsername(username);
        body.setPassword(password);

        worker.fetch(body, new ILoginWorker.Callback() {
            @Override
            public void onSuccess(LoginResponse response) {
                presenter.parse(response);
            }

            @Override
            public void onFailure(CoreErrorModel response) {
                presenter.purge(response);
            }
        });
    }
}
