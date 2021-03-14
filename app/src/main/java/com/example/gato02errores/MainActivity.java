package com.example.gato02errores;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageButton btn00, btn01, btn02, btn10, btn11, btn12, btn20, btn21, btn22;
    boolean turno = true;
    int res00 = -1, res01 = -1, res02 = -1, res10 = -1, res11 = -1, res12 = -1, res20 = -1, res21 = -1, res22 = -1, puntos0 = 0, puntosX = 0;
    TextView texto;
    Button rein, recuerdos;
    String ganador;
    ArrayList<Ganadores> ganadores = new ArrayList<Ganadores>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.textView);
        btn00 = findViewById(R.id.img_0_0);
        btn01 = findViewById(R.id.img_0_1);
        btn02 = findViewById(R.id.img_0_2);
        btn10 = findViewById(R.id.img_1_0);
        btn11 = findViewById(R.id.img_1_1);
        btn12 = findViewById(R.id.img_1_2);
        btn20 = findViewById(R.id.img_2_0);
        btn21 = findViewById(R.id.img_2_1);
        btn22 = findViewById(R.id.img_2_2);
        rein = findViewById(R.id.reinicio);
        recuerdos = findViewById(R.id.recuerdos);

    }
    public void Finalizar(View v)
    {
        Intent intent = new Intent(this, resultados.class);
        //Bundle paquete = new Bundle();
        //paquete.putSerializable("ganadores", ganadores);
        intent.putExtra("ganadores", ganadores);
        startActivity(intent);
    }
    public void revision()
    {
        if ((res00 == res01) && (res00 == res02) ||(res00 == res10) && (res00 == res20) || (res00 == res11) && (res00 == res22))
        {
            if (res00 == 1)
            {
                texto.setText("Gano 0");
                puntos0 ++;
                inhabilitado();
                ganadores.add(new Ganadores("Circulo", 45));
            }
            else if (res00 == 2)
            {
                texto.setText("Gano X");
                puntosX ++;
                inhabilitado();
                ganadores.add(new Ganadores("Equis", 45));
            }
        }

        else if ((res01 == res11) && (res01 == res21))
        {
            if (res01 == 1)
            {
                texto.setText("Gano 0");
                puntos0 ++;
                inhabilitado();
                ganadores.add(new Ganadores("Circulo", 45));
            }
            else if (res01 == 2)
            {
                texto.setText("Gano X");
                puntosX ++;
                inhabilitado();
                ganadores.add(new Ganadores("Equis", 45));
            }
        }
        else if ((res02 == res12) && (res02 == res22))
        {
            if (res02 == 1)
            {
                texto.setText("Gano 0");
                puntos0 ++;
                inhabilitado();
                ganadores.add(new Ganadores("Circulo", 45));
            }
            else if (res02 == 2)
            {
                texto.setText("Gano X");
                puntosX ++;
                inhabilitado();
                ganadores.add(new Ganadores("Equis", 45));
            }
        }
        else if ((res10 == res11) && (res10 == res12))
        {
            if (res10 == 1)
            {
                texto.setText("Gano 0");
                puntos0 ++;
                inhabilitado();
                ganadores.add(new Ganadores("Circulo", 45));
            }
            else if (res10 == 2)
            {
                texto.setText("Gano X");
                puntosX ++;
                inhabilitado();
                ganadores.add(new Ganadores("Equis", 45));
            }
        }
        else if ((res20 == res21) && (res20 == res22) || (res20 == res11) && (res20 == res02))
        {
            if (res20 == 1)
            {
                texto.setText("Gano 0");
                puntos0 ++;
                inhabilitado();
                ganadores.add(new Ganadores("Circulo", 45));
            }
            else if (res20 == 2)
            {
                texto.setText("Gano X");
                puntosX ++;
                inhabilitado();
                ganadores.add(new Ganadores("Equis", 45));
            }
        }/*
        else if ((btn00==btn01) && (btn00==btn02) && (btn00==btn10) && (btn00==btn11) && (btn00==btn12) && (btn00==btn20) && (btn00==btn21) && (btn00==btn22))
        {
            texto.setText("Nadie gano");
        }*/
    }
    public void inhabilitado()
    {
        btn00.setEnabled(false);
        btn01.setEnabled(false);
        btn02.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
    }
    public void clicrein(View V)
    {
        texto.setText("El juego del gato");
        btn00.setEnabled(true);
        btn01.setEnabled(true);
        btn02.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn20.setEnabled(true);
        btn21.setEnabled(true);
        btn22.setEnabled(true);
        btn00.setImageResource(R.drawable.fondo);
        btn01.setImageResource(R.drawable.fondo);
        btn02.setImageResource(R.drawable.fondo);
        btn20.setImageResource(R.drawable.fondo);
        btn21.setImageResource(R.drawable.fondo);
        btn22.setImageResource(R.drawable.fondo);
        btn10.setImageResource(R.drawable.fondo);
        btn11.setImageResource(R.drawable.fondo);
        btn12.setImageResource(R.drawable.fondo);
        res00 = -1;
        res01 = -1;
        res02 = -1;
        res10 = -1;
        res11 = -1;
        res12 = -1;
        res20 = -1;
        res21 = -1;
        res22 = -1;
        turno = true;
    }
    public void clicbnt00(View V)
    {
        if(turno == true)
        {
            btn00.setImageResource(R.drawable.img_o_8080_);
            turno = false;
            res00 = 1;
        }
        else
        {
            btn00.setImageResource(R.drawable.img_x8080);
            turno = true;
            res00 = 2;
        }
        btn00.setEnabled(false);
        revision();
    }
    public void clicbnt01(View V)
    {
        if(turno == true)
        {
            btn01.setImageResource(R.drawable.img_o_8080_);
            turno = false;
            res01 = 1;
        }
        else
        {
            btn01.setImageResource(R.drawable.img_x8080);
            turno = true;
            res01 = 2;
        }
        btn01.setEnabled(false);
        revision();
    }
    public void clicbnt02(View V)
    {
        if(turno == true)
        {
            btn02.setImageResource(R.drawable.img_o_8080_);
            turno = false;
            res02 = 1;
        }
        else
        {
            btn02.setImageResource(R.drawable.img_x8080);
            turno = true;
            res02 = 2;
        }
        btn02.setEnabled(false);
        revision();
    }
    public void clicbnt10(View V)
    {
        if(turno == true)
        {
            btn10.setImageResource(R.drawable.img_o_8080_);
            turno = false;
            res10 = 1;
        }
        else
        {
            btn10.setImageResource(R.drawable.img_x8080);
            turno = true;
            res10 = 2;
        }
        btn10.setEnabled(false);
        revision();
    }
    public void clicbnt11(View V)
    {
        if(turno == true)
        {
            btn11.setImageResource(R.drawable.img_o_8080_);
            turno = false;
            res11 = 1;
        }
        else
        {
            btn11.setImageResource(R.drawable.img_x8080);
            turno = true;
            res11 = 2;
        }
        btn11.setEnabled(false);
        revision();
    }
    public void clicbnt12(View V)
    {
        if(turno == true)
        {
            btn12.setImageResource(R.drawable.img_o_8080_);
            turno = false;
            res12 = 1;
        }
        else
        {
            btn12.setImageResource(R.drawable.img_x8080);
            turno = true;
            res12 = 2;
        }
        btn12.setEnabled(false);
        revision();
    }
    public void clicbnt20(View V)
    {
        if(turno == true)
        {
            btn20.setImageResource(R.drawable.img_o_8080_);
            turno = false;
            res20 = 1;
        }
        else
        {
            btn20.setImageResource(R.drawable.img_x8080);
            turno = true;
            res20 = 2;
        }
        btn20.setEnabled(false);
        revision();
    }
    public void clicbnt21(View V)
    {
        if(turno == true)
        {
            btn21.setImageResource(R.drawable.img_o_8080_);
            turno = false;
            res21 = 1;
        }
        else
        {
            btn21.setImageResource(R.drawable.img_x8080);
            turno = true;
            res21 = 2;
        }
        btn21.setEnabled(false);
        revision();
    }
    public void clicbnt22(View V)
    {
        if(turno == true)
        {
            btn22.setImageResource(R.drawable.img_o_8080_);
            turno = false;
            res22 = 1;
        }
        else
        {
            btn22.setImageResource(R.drawable.img_x8080);
            turno = true;
            res22 = 2;
        }
        btn22.setEnabled(false);
        revision();
    }
}