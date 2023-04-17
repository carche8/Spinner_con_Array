
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapp9spinnerconarray.R;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private Spinner sp1;

    private String paises[] = {"España", "Francia", "Portugal", "Alemania", "China"};
    private String idioma[] = {"Español", "Francés", "Portugues", "Alemán", "Mandarín"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        sp1 = (Spinner) findViewById(R.id.sp1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, paises);
        sp1.setAdapter(adapter);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                tv1.setText("En " + sp1.getItemAtPosition(i) + " se habla " + idioma[i]);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView){

            }
        });
    }
}