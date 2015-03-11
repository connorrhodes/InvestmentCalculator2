package investmentcalculator2.rhodes.com.investmentcalculator2;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class CalcMenu extends ListActivity {

    static final String[] menuList = new String[] {"Interest Calculator",
            "Compound Interest Calculator"};
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = getApplicationContext();
        ArrayAdapter<String> listItems = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menuList);
        setListAdapter(listItems);

        ListView lv = new ListView(this);
        lv.setTextFilterEnabled(true);
        System.out.println("List listener");
        lv.setOnItemClickListener(new OnItemClickListener() {

            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                System.out.println("ARG 2 = "+position);
                Intent i = new Intent(CalcMenu.this, InterestCalc.class);
                startActivity(i);
                finish();
            }
        });
    }
}
