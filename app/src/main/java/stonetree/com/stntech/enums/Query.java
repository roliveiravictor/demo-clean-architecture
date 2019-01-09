package stonetree.com.stntech.enums;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@StringDef({Query.STATEMENT_ID})
@Retention(RetentionPolicy.SOURCE)
public @interface Query {

    String STATEMENT_ID = "statementId";

}