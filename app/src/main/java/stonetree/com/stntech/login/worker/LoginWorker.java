package stonetree.com.stntech.login.worker;

import retrofit2.Call;
import retrofit2.Response;
import stonetree.com.stntech.core.model.CoreErrorModel;
import stonetree.com.stntech.core.provider.CoreProvider;
import stonetree.com.stntech.core.provider.ICoreProvider;
import stonetree.com.stntech.login.model.LoginRequest;
import stonetree.com.stntech.login.model.LoginResponse;

public class LoginWorker implements ILoginWorker {

    @Override
    public void fetch(LoginRequest body, ILoginWorker.Callback callback) {
        final ICoreProvider provider = CoreProvider.getRetrofit().create(ICoreProvider.class);
        final Call<LoginResponse> call = provider.requestLogin(body);
        call.enqueue(execute(callback));
    }

    private retrofit2.Callback<LoginResponse> execute(ILoginWorker.Callback callback) {

        return new retrofit2.Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable throwable) {
                callback.onFailure(CoreErrorModel.create(throwable));
            }
        };

    }

}

