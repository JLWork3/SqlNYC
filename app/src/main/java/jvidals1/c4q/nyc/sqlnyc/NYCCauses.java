package jvidals1.c4q.nyc.sqlnyc;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;

/**
 * Created by s3a on 7/17/15.
 */
public class NYCCauses {

    private static final String API_URL = "https://data.cityofnewyork.us/api/views/jb7j-dtam/rows.json?accessType=DOWNLOAD";

    public interface NYCData {
        @GET(API_URL)
        public void getNYCDataAsync(
                Callback<Deaths> callback

        );
    }

    public void loadForecastData(Callback<Deaths> callback) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API_URL)
                .build();

    }
}


