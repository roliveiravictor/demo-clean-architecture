package stonetree.com.stntech.login;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import stonetree.com.stntech.R;
import stonetree.com.stntech.login.view.LoginActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

@RunWith(RobolectricTestRunner.class)
public class LoginActivityTest {

    public LoginActivity loginActivity;

    @Before
    public void setup() {
        loginActivity = Robolectric.setupActivity(LoginActivity.class);
    }

    @Test
    public void testEnabledLogin() {
        onView(withId(R.id.login_action)).check(matches(isEnabled()));
    }

    @Test
    public void testCpfLogin() {
        onView(withId(R.id.username)).perform(typeText("000.000.082-57"));
        onView(withId(R.id.password)).perform(typeText("mPassword"));
        onView(withId(R.id.login_action)).perform(click());
    }

    @Test
    public void testEmailLogin() {
        onView(withId(R.id.username)).perform(typeText("site@domain.com"));
        onView(withId(R.id.password)).perform(typeText("mPassword"));
        onView(withId(R.id.login_action)).perform(click());
    }
}
