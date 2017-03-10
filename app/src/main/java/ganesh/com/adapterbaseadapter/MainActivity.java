package ganesh.com.adapterbaseadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView l1;
    String[] t1={"Video1","Video2"};
    String[] d1={"Session1","Session2"};
    int[] i1={R.mipmap.ic_launcher,R.mipmap.ic_launcher};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        l1= (ListView) findViewById(R.id.list);
        l1.setAdapter(new dataListAdapter(t1,d1,i1,this));

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),t1[i]+" And "+d1[i],Toast.LENGTH_SHORT).show();

            }
        });
    }
}
