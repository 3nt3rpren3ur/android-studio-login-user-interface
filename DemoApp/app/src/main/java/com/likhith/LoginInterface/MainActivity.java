package com.likhith.LoginInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton m=(RadioButton)findViewById(R.id.male);
        final RadioButton f=(RadioButton)findViewById(R.id.female);
        m.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                f.setChecked(false);
                ImageView img=(ImageView)findViewById(R.id.logavatar);
                img.setImageResource(R.drawable.male);
            }
        });
        f.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                m.setChecked(false);
                ImageView img=(ImageView)findViewById(R.id.logavatar);
                img.setImageResource(R.drawable.female);
            }
        });
    }
    public void buttonClick(View view)
    {
        EditText namef=(EditText)findViewById(R.id.namef);
        EditText passf=(EditText)findViewById(R.id.passf);
        String n = namef.getText().toString();
        String p = passf.getText().toString();
        if(!n.isEmpty() && !p.isEmpty())
        {
            int sc=0;
            for(int i=0;i<n.length();i++)
            {
                if(n.charAt(i)==' ')
                {
                    sc++;
                }
            }
            if(sc>0)
            {
                Toast.makeText(getApplicationContext(),"Space not allowed",Toast.LENGTH_SHORT).show();
            }
            else
            {
                if(n.equals("likhith") && p.equals("password"))
                {
                    Log.i("test","success");
                    startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                }
                else if(n.equals("likhith") && !p.equals("password"))
                {
                    Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Username",Toast.LENGTH_SHORT).show();
                }
            }
        }
        else if(!n.isEmpty() && p.isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Enter Password",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Enter Username",Toast.LENGTH_SHORT).show();
        }

    }
}
