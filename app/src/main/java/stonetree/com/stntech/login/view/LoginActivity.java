package stonetree.com.stntech.login.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import stonetree.com.stntech.R;
import stonetree.com.stntech.login.configurator.LoginConfigurator;
import stonetree.com.stntech.login.interactor.ILoginInteractor;
import stonetree.com.stntech.login.router.ILoginRouter;


public class LoginActivity extends AppCompatActivity implements ILoginActivity {

    public ILoginInteractor interactor;
    public ILoginRouter router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginConfigurator.INSTANCE.configure(this);
    }


}
