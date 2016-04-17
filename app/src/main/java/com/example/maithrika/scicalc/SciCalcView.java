package com.example.maithrika.scicalc;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.maithrika.scicalc.R;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SciCalcView extends AppCompatActivity {

    final List<String> recentKeys = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_calc_view);

        Button plusButton = (Button)findViewById(R.id.plus);
        Button minusButton = (Button)findViewById(R.id.minus);
        Button multButton = (Button)findViewById(R.id.mult);
        Button dvideButton = (Button)findViewById(R.id.dvide);
        Button sinButton = (Button)findViewById(R.id.sin);
        Button sinNeg1Button = (Button)findViewById(R.id.sinneg1);
        Button sinhButton = (Button)findViewById(R.id.sinh);
        Button sinhNeg1Button = (Button)findViewById(R.id.sinhneg1);
        Button cosButton = (Button)findViewById(R.id.cos);
        Button cosNeg1Button = (Button)findViewById(R.id.cosneg1);
        Button coshButton = (Button)findViewById(R.id.cosh);
        Button coshNeg1Button = (Button)findViewById(R.id.coshneg1);
        Button tanButton = (Button)findViewById(R.id.tan);
        Button tanNeg1Button = (Button)findViewById(R.id.tanneg1);
        Button tanhButton = (Button)findViewById(R.id.tanh);
        Button tanhNeg1Button = (Button)findViewById(R.id.tanhneg1);
        Button logButton = (Button)findViewById(R.id.log);
        Button log2Button = (Button)findViewById(R.id.log2);
        Button lnButton = (Button)findViewById(R.id.ln);
        Button xnButton = (Button)findViewById(R.id.xn);
        Button x2Button = (Button)findViewById(R.id.x2);
        Button x3Button = (Button)findViewById(R.id.x3);
        Button xNeg1Button = (Button)findViewById(R.id.xneg1);
        Button factButton = (Button)findViewById(R.id.xFact);
        Button rootButton = (Button)findViewById(R.id.rootx);
        Button root3Button = (Button)findViewById(R.id.threerootx);
        Button equalButton = (Button)findViewById(R.id.equal);
        Button negButton = (Button)findViewById(R.id.negative);
        Button bkspButton = (Button)findViewById(R.id.bksp);
        Button clearButton = (Button)findViewById(R.id.clear);

        Button openParenButton = (Button)findViewById(R.id.openParen);
        Button closeParenButton = (Button)findViewById(R.id.closeParen);
        Button percentButton = (Button)findViewById(R.id.percent);
        Button decimalButton = (Button)findViewById(R.id.decimal);
        Button zeroButton = (Button)findViewById(R.id.zero);
        Button oneButton = (Button)findViewById(R.id.one);
        Button twoButton = (Button)findViewById(R.id.two);
        Button threeButton = (Button)findViewById(R.id.three);
        Button fourButton = (Button)findViewById(R.id.four);
        Button fiveButton = (Button)findViewById(R.id.five);
        Button sixButton = (Button)findViewById(R.id.six);
        Button sevenButton = (Button)findViewById(R.id.seven);
        Button eightButton = (Button)findViewById(R.id.eight);
        Button nineButton = (Button)findViewById(R.id.nine);
        Button piButton = (Button)findViewById(R.id.pi);
        Button eButton = (Button)findViewById(R.id.e);

        final TextView textView = (TextView) findViewById(R.id.textView);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);

        textView.setText("");
        textView2.setText("");
        recentKeys.clear();


        View.OnClickListener numberListener = new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                String entry = (String)textView.getText();
                entry = entry + ((Button)button).getText() ;
                textView.setText(entry);

                recordKey(textView, textView2, (String)((Button)button).getText());
            }
        };


        View.OnClickListener functionListener = new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                String entry = (String)textView.getText();
                entry = entry + ((Button)button).getText() ;
                textView.setText(entry);

                recordKey(textView, textView2, (String)((Button)button).getText());
            }
        };


        View.OnClickListener arithmeticListener = new View.OnClickListener() {
            //TODO add logic for single arithmetic symbols
            @Override
            public void onClick(View button) {
                String entry = (String)textView.getText();
                /*if ( text.substring(text.length()-1).equals((Button)button) )
                    ;
                else {

                }*/
                entry = entry + ((Button)button).getText() ;
                textView.setText(entry);

                recordKey(textView, textView2, (String)((Button)button).getText());
            }
        };

        /*String entry = (String)textView.getText();
        if ( entry.substring(entry.length()-1).equals((Button)button) ) */


        View.OnClickListener bkspListener = new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                String entry = (String)textView.getText();
                if (entry.length() >= 1)
                    entry = entry.substring(0, entry.length() - 1);
                    textView.setText(entry);
            }

        };

        /*View.OnLongClickListener bkspLongListener = new View.OnLongClickListener() {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void onLongClick(View button) {
                String entry = (String)textView.getText();
                if (entry.length() >= 1)
                    entry = entry.substring(0, entry.length() - 1);
                    textView.setText(entry);
                }
            }, 10);
        };


             public void onLongClick(View button) {
                String entry = (String)textView.getText();
                if (entry.length() >= 1)
                    entry = entry.substring(0, entry.length() - 1);
                    textView.setText(entry);

            }
        };*/


        View.OnClickListener clearListener = new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                textView.setText("");
                textView2.setText("");
                recentKeys.clear();
            }
        };

        View.OnClickListener equalListener = new View.OnClickListener() {
            public void onClick (View button) {

                recordKey(textView, textView2, (String) ((Button) button).getText());
            }
        };



        //TODO bkspButton
        //NumberEntered = NumberEntered.substring(0, NumberEntered.length() - 1);

        //TODO negButton
        //String text = (String)textView.getText();
        //if subString(0) /== -
        //  text = "-" + text;
        //else

        //TODO superscript does this work?
        //((Button)findViewById(R.id.xn)).setText(Html.fromHtml("x<sup>n<sup/>"));



        plusButton.setOnClickListener(arithmeticListener);
        minusButton.setOnClickListener(arithmeticListener);
        multButton.setOnClickListener(arithmeticListener);
        decimalButton.setOnClickListener(arithmeticListener);
        dvideButton.setOnClickListener(arithmeticListener);
        openParenButton.setOnClickListener(arithmeticListener);
        closeParenButton.setOnClickListener(arithmeticListener);
        percentButton.setOnClickListener(arithmeticListener);

        equalButton.setOnClickListener(equalListener);

        sinButton.setOnClickListener(functionListener);
        sinhButton.setOnClickListener(functionListener);
        cosButton.setOnClickListener(functionListener);
        coshButton.setOnClickListener(functionListener);
        tanButton.setOnClickListener(functionListener);
        tanhButton.setOnClickListener(functionListener);
        lnButton.setOnClickListener(functionListener);
        logButton.setOnClickListener(functionListener);

        zeroButton.setOnClickListener(numberListener);
        oneButton.setOnClickListener(numberListener);
        twoButton.setOnClickListener(numberListener);
        threeButton.setOnClickListener(numberListener);
        fourButton.setOnClickListener(numberListener);
        fiveButton.setOnClickListener(numberListener);
        sixButton.setOnClickListener(numberListener);
        sevenButton.setOnClickListener(numberListener);
        eightButton.setOnClickListener(numberListener);
        nineButton.setOnClickListener(numberListener);
        piButton.setOnClickListener(numberListener);
        eButton.setOnClickListener(numberListener);

        bkspButton.setOnClickListener(bkspListener);
        //bkspButton.setOnLongClickListener(bkspLongListener);
        clearButton.setOnClickListener(clearListener);

    }

    private void recordKey(final TextView textView, final TextView textView2, String key) {
        recentKeys.add(key);

        if (recentKeys.size() > 2) {
            if (Arrays.asList("÷", "0", "=").equals(recentKeys.subList(recentKeys.size() - 3, recentKeys.size()))) {
                //TODO: Do things
                Log.i("Temp", "hi");
                textView2.setText("um");
            }

            else if (recentKeys.size() >= 4 && Arrays.asList("÷", "0", "=", "=").equals(recentKeys.subList(recentKeys.size() - 4, recentKeys.size()))) {
                //TODO: Do more things
                textView2.setText("umm");
                Log.i("Temp", "");
            }

            else if (recentKeys.size() >= 5 && Arrays.asList("÷", "0", "=", "=", "=").equals(recentKeys.subList(recentKeys.size() - 5, recentKeys.size()))) {
                //TODO: Do things again
                textView2.setText("ummm");
                Log.i("Temp", "");
            }

            else if (recentKeys.size() >= 6 && Arrays.asList("÷", "0", "=", "=", "=", "=").equals(recentKeys.subList(recentKeys.size() - 6, recentKeys.size()))) {
                textView2.setText("ok");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText("");
                        textView2.setText("");
                        startActivity(new Intent(getApplicationContext(), DVideRedButton.class));
                        recentKeys.clear();
                    }
                }, 500);
            }

        }
    }
}
