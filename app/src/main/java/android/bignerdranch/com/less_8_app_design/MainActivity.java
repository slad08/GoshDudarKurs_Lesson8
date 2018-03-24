package android.bignerdranch.com.less_8_app_design;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView img;
    public EditText email,pass;
    public Button btn;
    private static final String  eml="example@mail.ru";
    private static final String  pas="123qwe";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    login();
       // PdfRenderer pdf = new PdfRenderer(getSeac);

    }


    public  void   login()
    {
        img = (ImageView)findViewById(R.id.imageView2);
        email = (EditText)findViewById(R.id.editText);
        pass = (EditText)findViewById(R.id.editText2);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(email.getText()).equals(eml)&& String.valueOf(pass.getText()).equals(pas))
                {
                    img.setImageResource(R.drawable.truepng);
                }else {
                    img.setImageResource(R.drawable.falsepng);
                }
            }
        });
    }
}
