package castles.cashub.ccore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import castles.cashub.ccoreapi.api.CCoreAPI;


public class MainActivity extends AppCompatActivity {




    private Button buttonTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTest = findViewById(R.id.btn_test);
        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                CCoreAPI cCoreAPI = new CCoreAPI();
//
//                cCoreAPI.iVendorPrint.Print();
//                cCoreAPI.iVendorModule.getCardUsageCount(0, false);
//                cCoreAPI.iVendorNetworks.getDataTraffic(3, 3, 3);
//                cCoreAPI.iVendorSystem.isDefaultApp(null);
//                cCoreAPI.iVendorDevice.openCashBox();
//                cCoreAPI.iVendorPackage.getInfo(null);
//                cCoreAPI.iVendorPaymentConfig.saveFile("");
//                cCoreAPI.iVendorPackage.getInfo("");

                finish();

            }
        });

    }




}
