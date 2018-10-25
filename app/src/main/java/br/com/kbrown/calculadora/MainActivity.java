package br.com.kbrown.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String memoria;
    private String operacao;
    private double memoria;
    private double operacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView displayConta =

        final Button btn0 = (Button) findViewById(R.id.btn_0);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btnapagar = (Button) findViewById(R.id.btn_apagar);
        final Button btnsoma = (Button) findViewById(R.id.btn_soma);
        final Button btnsubtracao = (Button) findViewById(R.id.btn_subtracao);
        final Button btnmultiplicar = (Button) findViewById(R.id.btn_multiplicacao);
        final Button btndividir = (Button) findViewById(R.id.btn_divisao);
        final Button btnigual = (Button) findViewById(R.id.btn_igual);
        final Button btnponto = (Button) findViewById(R.id.btn_ponto);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "0");
            }
        });
        btnsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "+"

            }
        });
    }
}
