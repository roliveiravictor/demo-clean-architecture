package stonetree.com.stntech.login.worker;

import stonetree.com.stntech.core.model.CoreErrorModel;
import stonetree.com.stntech.login.model.LoginRequest;
import stonetree.com.stntech.login.model.LoginResponse;

public interface ILoginWorker {

    public interface Callback {
        void onSuccess(final LoginResponse response);
        void onFailure(final CoreErrorModel response);
    }

    void fetch(LoginRequest body, ILoginWorker.Callback callback);

}
