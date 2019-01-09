package stonetree.com.stntech.core.provider;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import stonetree.com.stntech.enums.Endpoint;
import stonetree.com.stntech.enums.Query;
import stonetree.com.stntech.login.model.LoginRequest;
import stonetree.com.stntech.login.model.LoginResponse;
import stonetree.com.stntech.statement.model.StatementResponse;

public interface ICoreProvider {

    @POST(Endpoint.LOGIN)
    Call<LoginResponse> requestLogin(@Body LoginRequest credentials);

    @GET(Endpoint.STATEMENT)
    Call<StatementResponse> requestStatement(@Path(Query.STATEMENT_ID) String statementId);

}
