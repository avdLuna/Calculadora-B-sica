package calc.studio.com.calculadorabasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Calculadora Básica
 * Author: Amanda Vivian Alves de Luna e Costa
 */
public class MainActivity extends AppCompatActivity {

    private Button botaoC,botaoMaisMenos,botaoPorcento,botaoDivisao,botaoSete,botaoOito,botaoNove,botaoQuatro,botaoCinco,
            botaoSeis,botaoUm,botaoDois,botaoTres,botaoZero,botaoVirgula,botaoVezes,botaoMenos,botaoMais,botaoIgual;
    private TextView texto;
    private String operador;
    private double num1,num2,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.botaoC = findViewById(R.id.botaoC);
        this.botaoCinco = findViewById(R.id.botaoCinco);
        this.botaoDivisao = findViewById(R.id.botaoDivisao);
        this.botaoDois = findViewById(R.id.botaoDois);
        this.botaoIgual = findViewById(R.id.botaoIgual);
        this.botaoMais = findViewById(R.id.botaoMais);
        this.botaoMaisMenos = findViewById(R.id.botaoMaisMenos);
        this.botaoMenos = findViewById(R.id.botaoMenos);
        this.botaoNove = findViewById(R.id.botaoNove);
        this.botaoOito = findViewById(R.id.botaoOito);
        this.botaoSete = findViewById(R.id.botaoSete);
        this.botaoSeis = findViewById(R.id.botaoSeis);
        this.botaoQuatro = findViewById(R.id.botaoQuatro);
        this.botaoTres = findViewById(R.id.botaoTres);
        this.botaoUm = findViewById(R.id.botaoUm);
        this.botaoZero = findViewById(R.id.botaoZero);
        this.botaoVirgula = findViewById(R.id.botaoVirgula);
        this.botaoVezes = findViewById(R.id.botaoVezes);
        this.botaoPorcento = findViewById(R.id.botaoPorcento);
        this.texto = findViewById(R.id.textCalc);

        this.botaoUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tela = texto.getText().toString();
                tela += "1";
                texto.setText(tela);
            }
        });

        this.botaoDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tela = texto.getText().toString();
                tela += "2";
                texto.setText(tela);
            }
        });

        this.botaoTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tela = texto.getText().toString();
                tela += "3";
                texto.setText(tela);
            }
        });

        this.botaoQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tela = texto.getText().toString();
                tela += "4";
                texto.setText(tela);
            }
        });

        this.botaoCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tela = texto.getText().toString();
                tela += "5";
                texto.setText(tela);
            }
        });

        this.botaoSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tela = texto.getText().toString();
                tela += "6";
                texto.setText(tela);
            }
        });

        this.botaoSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tela = texto.getText().toString();
                tela += "7";
                texto.setText(tela);
            }
        });

        this.botaoOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tela = texto.getText().toString();
                tela += "8";
                texto.setText(tela);
            }
        });

        this.botaoNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tela = texto.getText().toString();
                tela += "9";
                texto.setText(tela);
            }
        });

        this.botaoZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tela = texto.getText().toString();
                tela += "0";
                texto.setText(tela);
            }
        });

        this.botaoMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "+";
                num1 = Double.parseDouble(texto.getText().toString());
                texto.setText("");
            }
        });

        this.botaoMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "-";
                num1 = Double.parseDouble(texto.getText().toString());
                texto.setText("");
            }
        });

        this.botaoVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "*";
                num1 = Double.parseDouble(texto.getText().toString());
                texto.setText("");
            }
        });

        this.botaoDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "/";
                num1 = Double.parseDouble(texto.getText().toString());
                texto.setText("");
            }
        });

        this.botaoMaisMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "+-";
                num1 = Double.parseDouble(texto.getText().toString());
                texto.setText(String.valueOf(-num1));
            }
        });

        this.botaoPorcento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "%";
                num1 = Double.parseDouble(texto.getText().toString());
                texto.setText(String.valueOf(num1/100));
            }
        });

        this.botaoVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tela = texto.getText().toString();
                tela += ".";
                texto.setText(tela);
            }
        });

        this.botaoIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Double.parseDouble(texto.getText().toString());

                if(operador.equals("+")){
                    resultado = num1 + num2;
                    texto.setText(String.valueOf(resultado));
                }

                if(operador.equals("-")){
                    resultado = num1 - num2;
                    if(resultado % 1 == 0){
                        resultado = (int) resultado;
                    }
                    texto.setText(String.valueOf(resultado));
                }

                if(operador.equals("*")){
                    resultado = num1 * num2;
                    if(resultado % 1 == 0){
                        resultado = (int) resultado;
                    }
                    texto.setText(String.valueOf(resultado));
                }

                if(operador.equals("/")){
                    if(num2 != 0) {
                        resultado = num1 / num2;
                        if(resultado % 1 == 0){
                            resultado = (int) resultado;
                        }
                        texto.setText(String.valueOf(resultado));
                    } else {
                        texto.setText("Operação inválida");
                    }
                }
            }
        });

        this.botaoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = 0;
                num2 = 0;
                texto.setText("");
            }
        });

    }
}
