package investmentcalculator2.rhodes.com.investmentcalculator2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.interest_calc_activity, container, false);
/*
        TextView tvNo = (TextView) rootView.findViewById(R.id.tvNo);
        tvNo.setOnClickListener(this);

        tvNo.setText("There should be something here.");
*/
        return rootView;
    }
    /*
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.tvNo:


                break;
        }
    }*/
}

    /*
    public class CalculatorStateFragmentTest
    {

        public void shouldNotBeNull() throws Exception
        {
            assertNotNull( new CalculatorStateFragment() );
        }
    }
}

Now add a test to CalculatorActivity to ensure that the fragment is present. It should fail!


public void shouldHaveCalculatorStateFragment() throws Exception
{
    assertNotNull( activity.getFragmentManager()
                           .findFragmentByTag( "calculator state" ) );
We're using findFragmentByTag() since this is a background fragment.
When we add the fragment to the activity, we'll use a tag so that we can reference the fragment.

Add a new instance of the fragment to our Activity's FragmentManager via a FragmentTransaction in onCreate().

    getFragmentManager().beginTransaction()
                        .add( new CalculatorStateFragment(),
                              CALCULATOR_STATE_FRAGMENT_TAG )
                        .commit();
Auto-generate a TAG for the calculator state fragment using the IDE.

Now retest - everything should pass.

        */