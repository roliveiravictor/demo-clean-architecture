package stonetree.com.stntech.statement.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import stonetree.com.stntech.R;
import stonetree.com.stntech.statement.interactor.IStatementInteractor;
import stonetree.com.stntech.statement.router.IStatementRouter;


public class StatementActivity extends AppCompatActivity implements IStatementActivity {


    public IStatementInteractor interactor;
    public IStatementRouter router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statement);
    }

}
