package stonetree.com.stntech.core.model;

import stonetree.com.stntech.constants.Constants;

public class CoreErrorModel {

    private int code;
    private String message;

    public CoreErrorModel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public CoreErrorModel() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CharSequence getToastMessage() {
        return this.getMessage();
    }

    public static CoreErrorModel getDefault() {
        return new CoreErrorModel(Constants.DUMMY, "Avoiding Crash - Please Retry");
    }

    public static CoreErrorModel create(Throwable throwable) {
        final CoreErrorModel error = new CoreErrorModel();
        error.code = Constants.DUMMY;
        error.message = throwable.getMessage();
        return error;
    }

}
