package stonetree.com.stntech.core.provider;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import stonetree.com.stntech.constants.Constants;

public class CoreProvider {

    public static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Constants.HOST_DOMAIN)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
