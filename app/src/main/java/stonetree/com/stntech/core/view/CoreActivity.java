package stonetree.com.stntech.core.view;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.github.ybq.android.spinkit.SpinKitView;

import stonetree.com.stntech.R;
import stonetree.com.stntech.utils.ToastUtils;

public class CoreActivity extends AppCompatActivity implements ICoreActivity {

    private SpinKitView spinKitView;

    private ConstraintLayout rootLayout;

    public void findViews() {
        spinKitView = findViewById(R.id.spin_kit);
        rootLayout = findViewById(R.id.rootLayout);
    }

    @Override
    public void showLoading() {
        rootLayout.setVisibility(View.GONE);
        spinKitView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        rootLayout.setVisibility(View.VISIBLE);
        spinKitView.setVisibility(View.GONE);
    }

    @Override
    public void toast(String message) {
        ToastUtils.show(this, message, Toast.LENGTH_LONG);
    }

}
