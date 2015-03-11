package investmentcalculator2.rhodes.com.investmentcalculator2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class InterestCalc extends Activity {

    Button calculate;
    Button messageBox;
    EditText principal;
    EditText rate;
    EditText period;
    TextView simpleInterest;
    TextView siText;
    Context context;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interest_calc_activity);
        context = this.getApplicationContext();

        //Get all the UI components

        siText = (TextView)findViewById(R.id.textSimpleInterest);
        simpleInterest = (TextView)findViewById(R.id.textSI);




		/*calculate = (Button)findViewById(R.id.buttonCalculate);
		calculate.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				principal = (EditText)findViewById(R.id.pAmount);
				rate = (EditText)findViewById(R.id.rate);
				period = (EditText)findViewById(R.id.period);

				try{
					if(principal.getText().toString().equals("")){
						Toast.makeText(context, "Principal Missing", Toast.LENGTH_SHORT).show();
					}
					else if(rate.getText().toString().equals("")){
						Toast.makeText(context, "Rate Of Interest Missing", Toast.LENGTH_SHORT).show();
					}
					else if(period.getText().toString().equals("")){
						Toast.makeText(context, "Period Missing", Toast.LENGTH_SHORT).show();
					}
					else{

						Double p = Double.parseDouble(principal.getText().toString());
						Double r = Double.parseDouble(rate.getText().toString());
						Double t = Double.parseDouble(period.getText().toString());


						Double si;
						System.out.println("P = "+p+"\nR = "+r+"\nT = "+t);

						si = (p*r*t)/100;



						simpleInterest.setText(si.toString());

						simpleInterest.setVisibility(TextView.VISIBLE);
						siText.setVisibility(TextView.VISIBLE);
					}
				}catch(Exception e){
					System.out.println("In catch block");
					e.printStackTrace();

				}
			}
		}); */


        messageBox = (Button)findViewById(R.id.box);
        messageBox.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                principal = (EditText)findViewById(R.id.pAmount);
                rate = (EditText)findViewById(R.id.rate);
                period = (EditText)findViewById(R.id.period);

                try{
                    if(principal.getText().toString().equals("")){
                        Toast.makeText(context, "Principal Missing", Toast.LENGTH_SHORT).show();
                    }
                    else if(rate.getText().toString().equals("")){
                        Toast.makeText(context, "Rate Of Interest Missing", Toast.LENGTH_SHORT).show();
                    }
                    else if(period.getText().toString().equals("")){
                        Toast.makeText(context, "Period Missing", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        Double p = Double.parseDouble(principal.getText().toString());
                        Double r = Double.parseDouble(rate.getText().toString());
                        Double t = Double.parseDouble(period.getText().toString());


                        Double si;
                        System.out.println("P = "+p+"\nR = "+r+"\nT = "+t);

                        si = (p*r*t)/100;



                        // prepare the alert box
                        AlertDialog.Builder alertbox = new AlertDialog.Builder(v.getContext());
                        System.out.println("Alert builder");
                        // set the message to display
                        alertbox.setMessage("Simple Interest = "+si.toString());

                        // add a neutral button to the alert box and assign a click listener

                        alertbox.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                            // click listener on the alert box
                            public void onClick(DialogInterface arg0, int arg1) {
                                // the button was clicked
                                Toast.makeText(getApplicationContext(), "Your screwed!!!!", Toast.LENGTH_LONG).show();
                            }
                        });

                        // show it
                        alertbox.show();

                        System.out.println("Alert show");

                        //	simpleInterest.setText(si.toString());

                        //simpleInterest.setVisibility(TextView.VISIBLE);
                        //siText.setVisibility(TextView.VISIBLE);
                    }
                }catch(Exception e){
                    System.out.println("In catch block");
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("In OnStart");
    }
}