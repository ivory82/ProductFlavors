package choi.gs.flavors;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String version = "";
        try {
            PackageInfo pInfo
                    = this.getPackageManager().getPackageInfo(getPackageName(), 0);
            version = pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        TextView tvTitle = (TextView) findViewById(R.id.tvTitle);

        String APP_PACKAGE_NAME = "APP_PACKAGE_NAME : " + getPackageName();
        String APP_VERSION_NAME = "APP_VERSION_NAME : " + version;

        String IS_LIVE_URL = BuildConfig.IS_LIVE_URL ? "TRUE" : "FALSE";
        IS_LIVE_URL = "IS_LIVE_URL : " + IS_LIVE_URL;

        String URL_ADDRESS = "URL_ADDRESS : " + LoadURL.ADDRESS ;


        tvTitle.setText( APP_PACKAGE_NAME
                + "\r\n"+ APP_VERSION_NAME
                + "\r\n" + IS_LIVE_URL
        +"\r\n" + URL_ADDRESS );

        int a;

        if( getNum() == 3 || true ){
            a = 2;
        } else {
            a = 3;
        }

        for( ;;){
        }

//        int aa;
//        aa ++;
//        aa = 5 + 10;

    }

    /**
     * important value
     * @return
     */
    private int getNum(){
        return 3;
    }
}
