package stonetree.com.stntech.login.presenter;

import stonetree.com.stntech.core.model.CoreErrorModel;
import stonetree.com.stntech.login.model.LoginResponse;

public interface ILoginPresenter {

    void parse(LoginResponse response);

    void purge(CoreErrorModel response);

}
