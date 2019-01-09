package stonetree.com.stntech.enums;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static stonetree.com.stntech.enums.Endpoint.LOGIN;
import static stonetree.com.stntech.enums.Endpoint.STATEMENT;

@StringDef({LOGIN, STATEMENT})
@Retention(RetentionPolicy.SOURCE)
public @interface Endpoint {

    String LOGIN = "/api/login";
    String STATEMENT = "/api/statements/{" + Query.STATEMENT_ID + "}";

}
