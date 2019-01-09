package stonetree.com.stntech.login.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import stonetree.com.stntech.R;
import stonetree.com.stntech.core.view.CoreActivity;
import stonetree.com.stntech.login.configurator.LoginConfigurator;
import stonetree.com.stntech.login.interactor.ILoginInteractor;
import stonetree.com.stntech.login.router.ILoginRouter;
import stonetree.com.stntech.utils.CredentialUtils;


public class LoginActivity extends CoreActivity implements ILoginActivity {

    public ILoginInteractor interactor;
    public ILoginRouter router;

    private EditText username;
    private EditText password;

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginConfigurator.INSTANCE.configure(this);

        findViews();
        setListeners();
    }

    @Override
    public void findViews() {
        super.findViews();

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login_action);
    }

    @Override
    public void setListeners() {
        login.setOnClickListener(view -> {
            showLoading();

            final String requestedName = username.getText().toString();
            final String requestPassword = password.getText().toString();

            if(CredentialUtils.isNotValidCpf(requestedName) && CredentialUtils.isNotValidEmail(requestedName)) {
                toast(getString(R.string.login_username_error));
                return;
            }

            if(CredentialUtils.isNotValidPassword(requestPassword)) {
                toast(getString(R.string.login_password_error));
                return;
            }

            interactor.requestLogin(requestedName, requestPassword);
        });
    }

    @Override
    public void proceedToStatement() {
        router.executeScreenTransition(new Bundle());
    }


}
