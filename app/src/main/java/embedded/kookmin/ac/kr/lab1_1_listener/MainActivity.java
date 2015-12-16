package embedded.kookmin.ac.kr.lab1_1_listener;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this.getApplication().getApplicationContext();
        bt = (Button)this.findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Toast.makeText(mContext, "Click Button", Toast.LENGTH_LONG).show();
            }
        });
    }
}
