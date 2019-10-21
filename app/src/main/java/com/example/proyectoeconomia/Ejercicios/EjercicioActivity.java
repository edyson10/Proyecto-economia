package com.example.proyectoeconomia.Ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.proyectoeconomia.R;
import com.example.proyectoeconomia.Solucion.SolucionInteresActivity;

public class EjercicioActivity extends AppCompatActivity {

    TextView titulo, enunciado;
    Button solucion;
    int boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        titulo = (TextView) findViewById(R.id.txtTituloEjercicio);
        enunciado = (TextView) findViewById(R.id.txtEnunciadoEjericico);
        solucion = (Button) findViewById(R.id.btnSolucionario);

        Bundle datos = this.getIntent().getExtras();
        boton = datos.getInt("boton");
        //Toast.makeText(getApplicationContext(), "--> " + boton, Toast.LENGTH_SHORT).show();
        vistaEjerecicio(boton);

    }

    private void vistaEjerecicio(final int vista){
        switch (vista){
            //EJERCICIO 1
            case 0:
                titulo.setText("EJERCICIO 1");
                enunciado.setText("Se desea duplicar un capital en tres años. ¿A qué tasa de interés quincenal debe invertirse?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 2
            case 1:
                titulo.setText("EJERCICIO 2");
                enunciado.setText("Una letra que vence en 145 días con un valor de $33.000.000 se descuenta, hoy por $23.814.000. ¿Encontrar la tasa de interés semanal del negocio?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 3
            case 2:
                titulo.setText("EJERCICIO 3");
                enunciado.setText("Una bicicleta tiene un valor de contado de $4.250.000. A plazos exigen una cuota inicial de $2.000.000 y el resto financiado para ser cancelado con 3 cuotas de $1.000.000; $1.500.000 y $512.000, en los meses dos, cinco y nueve despues de recibida la bicicleta. Encontrar el interés de financiación. Punto focal mes 9.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 4
            case 3:
                titulo.setText("EJERCICIO 4");
                enunciado.setText("Un socio de una empresa aportó $112.500.000, al finalizar el quinto año se retiró de la sociedad; llegando a un acuerdo con los demás socios le entregaron $132.000.000. ¿Qué rendimiento semestral simple obtuvo de su inversión en esa empresa?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 5
            case 4:
                titulo.setText("EJERCICIO 5");
                enunciado.setText("Se adquiere una máquina financiada y se pacta cubrir en tres pagos de $260.000, $480.000 y $600.000 en los meses 3, 5 y 22 meses, respectivamente. Hallar el valor de contado sabiendo que la financiación contempla una tasa de interés sobre saldo del 3,5% bimestral simple para los 6 primeros meses y del 6,8% trimestral simple de allí en adelante, punto focal mes 6.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 6
            case 5:
                titulo.setText("EJERCICIO 6");
                enunciado.setText("Una capital de $117,250.000 que se presta con el 27.3% de interés simple anual genera $9,139.000. ¿En cuántas quincenas?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 7
            case 6:
                titulo.setText("EJERCICIO 7");
                enunciado.setText("Hoy existe en una cuenta $22.000.000, cuánto dinero se consignó hace 25 bimestres, si por los primeros 9 bimestres se reconoció una tasa de interés del 7% trimestral simple y del 12% semestral simple de ahí en adelante. Resuelva el problema en el punto focal hoy.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 8
            case 7:
                titulo.setText("EJERCICIO 8");
                enunciado.setText("Cuánto debe invertirse hoy al 13.3% simple semestral para disponer de $226.000, dentro de 22 bimestres?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 9
            case 8:
                titulo.setText("EJERCICIO 9");
                enunciado.setText("Hoy se consignan $7.000.000 en una entidad que reconoce una tasa de interés del 8% trimestral simple; 5 trimestre más tarde se retiran $2.000.000; cuánto dinero se debe consignar dentro de 10 trimestres para que en el trimestre 15 existan $15.000.000. Considere que la tasa de interés cambia en el trimestre 8 al 15% semestral simple. Punto Focal trimestre 12.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 10
            case 9:
                titulo.setText("EJERCICIO 10");
                enunciado.setText("¿Si hoy, 25 de septiembre de 2016 se invierten $452.000, con qué tasa de interés simple trimestral se tendrán $552.000, el 5 de julio de 2018?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 11
            case 10:
                titulo.setText("EJERCICIO 11");
                enunciado.setText("¿Qué cantidad de dinero se recibió en préstamo el día 13 de marzo 2015 si se liquidó con $126.000.000 el 25 de septiembre de 2017 siguiente? Suponga que los intereses son del 29,5% simple anual.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 12
            case 11:
                titulo.setText("EJERCICIO 12");
                enunciado.setText("¿Qué tasa de interés simple trimestral se está cargando en un crédito de $1.676,750 que 200 dias después se paga con $1,799,110?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
                //EJERCICIO 13
            case 12:
                titulo.setText("EJERCICIO 13");
                enunciado.setText("Prestar un capital al 12.8% simple semestral es más redituable que invertido con el 0.15% simple semanal.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 14
            case 13:
                titulo.setText("EJERCICIO 14");
                enunciado.setText("El 15 de noviembre de 2015 un comerciante compró mercancía que canceló de la siguiente manera: un 35% de cuota inicial, un pago por $13.200.000, que corresponde al 40% el día 3 de marzo de 2016, y otro por el resto el día 22 de abril de 2017 (punto focal). Considerando cargos del 16.8% anual determinar: a) El valor de la mercancía el día de la compra. b)El monto que se paga al 22 de abril de 2017; c) El costo, es decir, los intereses por no pagar de contado.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 15
            case 14:
                titulo.setText("EJERCICIO 15");
                enunciado.setText("Se compra mercancía por un valor de $1.273,000 para pagarse de la siguiente manera $125.000 a los 3 meses, y el otro pago a los 5 meses de la compra. ¿De cuánto es este pago si se cargan intereses de 9.6% simple semestreal?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 16
            case 15:
                titulo.setText("EJERCICIO 16");
                enunciado.setText("Cuánto tiempo hay que esperar para que después de depositar hoy $150.000.000 en una cuenta de ahorros que se reconoce el 5% trimestral simple, podamos retirar $428.000.000?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 17
            case 16:
                titulo.setText("EJERCICIO 17");
                enunciado.setText("Una persona descuenta un título valor de valor nominal $25.000.000 en un banco que cobra una tasa de interés de descuento del 22% anual simple, si la operación se realiza 60 días antes de la maduración, ¿Cuál es el valor liquido recibido por la empresa?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 18
            case 17:
                titulo.setText("EJERCICIO 18");
                enunciado.setText("Una persona deposita hoy $14.500.000 en una corporación de ahorro que paga el 7% trimestral simple. Tres años después deposita $8.620.000, un año más tarde deposita $5.500.000, y dos años después decide retirar la cuarta parte del total acumulado hasta ese momento. Hallar el saldo en la cuenta de ahorros cinco meses después del retiro. Punto focal hoy.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 19
            case 18:
                titulo.setText("EJERCICIO 19");
                enunciado.setText("Una empresa adquiere un préstamo por $120.000.000 al 3.5% bimestral simple y para garantizar su pago firmó un pagaré por $148.000.000. ¿ Qué plazo le concedieron para cancelar la deuda y los intereses?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 20
            case 19:
                titulo.setText("EJERCICIO 20");
                enunciado.setText("Una persona desea vender una pulsera y recibe, el 18 de abril de 2017, las siguientes ofertas: a) $1.915.000 de contado, b) $585.000 de cuota inicial y se firma un pagaré de $1.680.000 con vencimiento el 16 de agosto de 2017 y c) $380.000 de cuota inicial y se firman dos pagarés: uno por $930.000 a 30 días de plazo y otro por $980.000 con fecha de vencimiento el 17 de julio de 2017. ¿Cuál oferta le conviene más si el rendimiento normal del dinero es de 5.5% trimestral simple?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
                //EJERCICIO 21
            case 20:
                titulo.setText("EJERCICIO 21");
                enunciado.setText("Una persona tiene la opción de liquidar una deuda pagando $2.245.300 ahora o pagar $2.865.000 dentro de 7 meses. Si opta por hacerlo dentro de 7meses. ¿Que tasa de interés anual simple se le carga?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 22
            case 21:
                titulo.setText("EJERCICIO 22");
                enunciado.setText("Carlos compró un curso de inglés en CD-ROM en $300.000 y lo vendió, tres semanas depués, en $350.000 ¿Que tasa anual simple de rendimiento obtuvo?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 23
            case 22:
                titulo.setText("EJERCICIO 23");
                enunciado.setText("Qué monto se obtiene en 50 meses a la tasa de 1,15% mensual simple, si se ganaron interese por $3.198.000? ¿Que capotal invirtió?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 24
            case 23:
                titulo.setText("EJERCICIO 24");
                enunciado.setText("El saldo de una cuenta en el banco era $84.000.000 el 10 de aogosto de 2016. La cuenta se abrió el10 de julio del 20102. ¿Cual fue elcapital originalmente depositaado, si la tasa de interés fue de 13% anual simple?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 25
            case 24:
                titulo.setText("EJERCICIO 25");
                enunciado.setText("Un inversionista coloco su capital  de $50.150.000 como prestamo a un particular por 6 años y a interés simple. Se sabe que durante este lpso de tiepo la tasa de interpes tuvo las siguientes variaciones . 1. 0,5% quincenal durante los primero 6 meses. 2. 1,5% semestral porlos 6 meses consecutivos. 3. 2% mensual por los siguientes 4 trimestres. 4 1.5% anual por los siguientes 5 semestres. 5. 0,012% diario por los siguientes 2 meses. 6. 1,25% bimestral por el tiempo restante a) El inversionista desea conocer el interés generado por su capital. b) ¿Cual es el ineterés promedio mensual?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 26
            case 25:
                titulo.setText("EJERCICIO 26");
                enunciado.setText("¿Qué interés simple semanal se obtiene por un préstamo de %11.350.000, si 190 días m´s tarde se pagan $11.890.000");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 27
            case 26:
                titulo.setText("EJERCICIO 27");
                enunciado.setText("¿Que capital prestado al 2,35% mensual simple produce un interés de $8.500.000 para 135 días de présatmo?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 28
            case 27:
                titulo.setText("EJERCICIO 28");
                enunciado.setText("Determine cual es el capital que en 140 días de préstamo produce un interés de %11.209.500, al 4,2% semestral de interés.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 29
            case 28:
                titulo.setText("EJERCICIO 29");
                enunciado.setText("Calcule el mmonto y lacantidad de intereses al cabo de 16meses de $1.260.000 invertidos al 28,8% anual simple.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 30
            case 29:
                titulo.setText("EJERCICIO 30");
                enunciado.setText("Se invierten $3.200.000 a 1,12% mensual de interés simple por tres años y cuatro meses. ¿Cúal es la cantidad acumulada al término de ese tiempo? ¿A cuanto asciende el interés ganado?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 31
            case 30:
                titulo.setText("EJERCICIO 30");
                enunciado.setText("El costo actual del pasaje en el transporte colectivo de la ciudad es de $1.800 y se prevé aumentos de 15% anual simple durante cinco años. ¿Cúal será el precio del pasaje al cabo de los cinco años?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 32
            case 31:
                titulo.setText("EJERCICIO 32");
                enunciado.setText("En las cuentas de ahorro del banco XXX, ofrece una tasa de interés anual del 5,6% anual simple. Si se invierten $4.122.000 el 4 de enero del 2017. ¿Cúal es el valor futuro el 19 de noviembre del 2018? Punto focal el 19 de novimbre del 2017");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 33
            case 32:
                titulo.setText("EJERCICIO 33");
                enunciado.setText("Un anuncio bancario publicado en la prensa dice 'El dinero que usted invierte cn nosotros gana un interés a 9,7 semestral simple'. Encuentre el interés ganado si usted decide invertir #3.175.0000 durante tres años en dicho banco si a los 14 meses de iniciada la inversión la tasa de interés la cambian al 22% anual simple. Punto focal en el añño 3");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 34
            case 33:
                titulo.setText("EJERCICIO 33");
                enunciado.setText("Una persona solicita un préstamo de $8.250.000 a tres mese de plazo con una tasa de interes de 13% semestral simple. En el contrato se estipula que en caso de moratoria el deudor debe de pagar un interés del 4% mensual simple sobre el sueldo vencio. ¿Que cantidad deberá si liquidasu deuda a los tres meses y quince días?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 35
            case 34:
                titulo.setText("EJERCICIO 35");
                enunciado.setText("El 01 de marzo de 1990 se compro un terreno por $250.000.000 si ese dinero se hubiera invertido a 6,5% anual simple. ¿Cuanto dinero se tendría el 01 de junio de 2018?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 36
            case 35:
                titulo.setText("EJERCICIO 36");
                enunciado.setText("¿Cuato tiempo le tomará a una inversion incrementarse 65% del captal original si la tasa de interés es de 2% mensual simple");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 37
            case 36:
                titulo.setText("EJERCICIO 37");
                enunciado.setText("Una persona es el beneficiario de una cuenta establecida para él por sus pdres cuando nció. Si la cantidad original ahorrada fue de $5.300.000 y actuamente el monto es de $12.346.172, ¿Que edad tiene actualmente esa persona?  e dinero gana un interés de 9,42% anual simple.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 38
            case 37:
                titulo.setText("EJERCICIO 38");
                enunciado.setText("Una compañia realizo una inveersion de $54.450.000 hace un año en un nuevo proceso de produccion y ha obtenido hasta la fecha una utilidad de $3.960.700. ¿Qué tiempo hubiera tenido que pasar de haberse colocado este dinero en una inversión financiera a 6,43% anual simple para obtener la misma utilidad?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 39
            case 38:
                titulo.setText("EJERCICIO 39");
                enunciado.setText("A que tasa de interes semestral simple se deben depositar $25.000.000 para disponer de $37.000.000 en un plazo de 4 años?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 40
            case 39:
                titulo.setText("EJERCICIO 40");
                enunciado.setText("Una persona invirtió $35.140.500 en un negocio y en 18 meses ganó $7.566.000 si hubiera invertido el dinero enun banco ¿Que tasa de interes le hubiera proporcionado la misma ganancia?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 41
            case 40:
                titulo.setText("EJERCICIO 41");
                enunciado.setText("Cual es el precio de un automovil que se adquiere con un anticipo del 40% y 6 mensualidaades de $12.300.000 cada una y que incluye intereses del 1,75% mensual simple. Punto focal al final de los 6 meses.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 42
            case 41:
                titulo.setText("EJERCICIO 42");
                enunciado.setText("Se compra una motocicleta de $3.700.000 con un pago inicial del 30% y 4 abonos trimestrales que crecen 50.000 con respecto al anterior reconociendo un interés del 15% anual simple. De cuanto es el pago. Punto focal al adquirir la motocicleta");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 43
            case 42:
                titulo.setText("EJERCICIO 43");
                enunciado.setText("Con el interes del 15,6% simple anual el precio de un equipo se amortiza con 8 mensualidades de $1.800.000. Obtenga el total que se paga por conceptos de interesese y el precio de contado. Punto focal al cancelar la mensualidad 8.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 44
            case 43:
                titulo.setText("EJERCICIO 44");
                enunciado.setText("Cuanto se acumula en 7 meses si se invierte $60.000 devengando intereses del 14,8% simple semestral. Lo primero que se hace es la grafica que represente el ejercicio");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 45
            case 44:
                titulo.setText("EJERCICIO 45");
                enunciado.setText("En cuantos días un capital crece 15% si se invierte con 6,03% simple anual.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 46
            case 45:
                titulo.setText("EJERCICIO 46");
                enunciado.setText("Si hoy se cconsignan $23.250.000 en una entidad que reconoce una tasa de interes simple del 10% anual. ¿Cual es el monto quese acumula al final del mes 6?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 47
            case 46:
                titulo.setText("EJERCICIO 47");
                enunciado.setText("Para acumular $35.000.000 en 14 meses al 11,7% simple semestral. ¿Cual debe ser la inversión inicial?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 48
            case 47:
                titulo.setText("EJERCICIO 48");
                enunciado.setText("Determinar el tiempo necesario en meses para que un capital de cuantia P colocado en un interes del 4% trimestal simple genere una igualdad a 3 veces el capital inicial.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 49
            case 48:
                titulo.setText("EJERCICIO 49");
                enunciado.setText("Una persona pretende acumular $35.000.000 y para eso seis meses antes abre una cuenta con $9.3000.000 ganando interes de 6,63% simple semestral. Dos meses despues deposita otros $9.700.000. ¿Cuanto deberá depositar tres meses despues de la apertura de lograr su objetivo? Punto focal 3 meses depues de la apertura de la cuenta.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //EJERCICIO 50
            case 49:
                titulo.setText("EJERCICIO 50");
                enunciado.setText("¿Con que tasa de interes simple anual se cancela un prestamo de $128.200.000 pagando $142.000.000 a los 9 meses?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;

            /* ===== INTERES COMPUESTO ===== */
            //SOLUCION 51
            case 50:
                titulo.setText("EJERCICIO 51");
                enunciado.setText("Dentro de cuantos trimestres se tendra en una cuenta de ahorros un salde de $25.900.000 sabiendo que hoy se hace un deposito de $14.400.000 y luego retiros asi: $1.800.000 dentro de 9 meses, $1.920.000 dentro de doce meses, si la cuenta de ahooros abona un interes del 9.5% trimestral.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 52
            case 51:
                titulo.setText("EJERCICIO 52");
                enunciado.setText("Una bicicleta tiene un valor de contado de $8.000.000. A plazos exigen una cuota inicial de $3.250.000 y el resto financiado para ser cancelado con tres cuotas de $2.000.000;2.500.000 y $2.000.000, en los meses ocho,doce y quince despues de recibida la bicicleta. encontrar el interes mensual de financiacion");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 53
            case 52:
                titulo.setText("EJERCICIO 53");
                enunciado.setText("Con cuanto cancela su deuda el dia de hoy 13 de mayo de 2018, si el 8 de octubre del 2017 se debian $20.250.000, el 10 de diciembre de 2017 le prestan $10.725.000 y otros $18.000.000 el 15 de febrero de 2018, suponga que la tasa es del 19.2% anual. punto focal 10 de diciembre de 2017");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 54
            case 53:
                titulo.setText("EJERCICIO 54");
                enunciado.setText("Con intereses del 15.6% anual nominal semestral,el precio de un equipo se amortiza con 8 mensualidades de $1.800.000. Obtenga el total que se paga por concepto de intereses y el precio de contado");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 55
            case 54:
                titulo.setText("EJERCICIO 55");
                enunciado.setText("Una persona contrajo una deuda hace 18 meses por $200.000.000 con 22% de interes anual nominal quincenal,que vence dentro de 4 meses. Además debe pagar otra deuda de $150.000.000 contraida hace 2 meses,con 15% de interes semestral nominal mensual y que vence dentro de dos meses. Considerando un interes de 17% semestral, ¿Que pago deberá hacer hoy para saldar sus deudas,si se compromete a pagar $100.000.000 dentro de 6 meses?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 56
            case 55:
                titulo.setText("EJERCICIO 56");
                enunciado.setText("Una persona pretende acumular $135.000.000 y para eso 6 meses antes abre una cuenta con $39.300.000, ganando intereses del 6.63% semestral nominal mensual. Dos meses despues deposita otros $39.700.000 ¿ Cuanto deberá depositar 3 meses después de la apertura para lograr su objetivo?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 57
            case 56:
                titulo.setText("EJERCICIO 57");
                enunciado.setText("Una persona tiene las siguientes deundas: $5.000.000 que se vencen el 13 de enero de 2016 que fueron prestados el 8 de octubre del 2014 a una tasa de interes del 14% semestral nominal quincenal; $12.000.000 que se vencen el 15 de noviembre de 2017 que fueron prestados el 13 de enero de 2015 con una tasa de interes del 2.5% mensual. Se desea cancelar todo el 3 de mayo de 2018. se acuerda una tasa de interes del 22% anual nominal semanal.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 58
            case 57:
                titulo.setText("EJERCICIO 58");
                enunciado.setText("Hace 22 bimestres deposité $18.565.000 y,9 bimestres después retiré $12.252.000 ¿Cuánto tendré acumulado hoy si hace tres bimestres deposité $14.300.000 y el interes que reconoce es del 4.7% semestral nominal quincenal por los primeros 6 bimestres y del 8% anual nominal bimestral de ahí en adelante?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 59
            case 58:
                titulo.setText("EJERCICIO 59");
                enunciado.setText("Cuál es el precio de un automovil que se adquiere con un anticipo del 40% y 6 cuotas trimestrales de $22.300.000 cada una, y que incluyen intereses de 1.75% mensual?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 60
            case 59:
                titulo.setText("EJERCICIO 60");
                enunciado.setText("Una persona compra un camión para transportar su cosecha de caña y lo liquida de la siguiente manera: una cuota inicial de $9.000.000; un abono a los 3 meses por $6.500.000 y otro por $8.250.000 cinco meses despues. Poco antes de efectuar el segundo abono decide con su acreedor cambiar los 2 compromisos por 4 mensuales haciendo el primero a los 3 meses de la compra ¿Por que cantidad son estos pagos, sabiendo que le cargan el 18.6% de interes anual nominal semanal y \n" +
                        "a) los 4 son iguales\n" +
                        "b) cada uno es 18% mayor que el anterior\n" +
                        "c) el ultimo es igual a la suma de los primeros 3 que son iguale");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 61
            case 60:
                titulo.setText("EJERCICIO 61");
                enunciado.setText("Se compra una camioneta con una cuota inicial del 25% del valor de contado,un pago a los 3 meses que corresponden al 35% del precio, y otro al mes 8 por $15.185.000. suponiendo interes del 15.6% anual nominal trimestral determine:\n" +
                        "a) el precio de ocntado del vehiculo\n" +
                        "b) el tamñano del pago a los 3 meses\n" +
                        "c) el costo por no pagar de contado, es decir, lo interes");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 62
            case 61:
                titulo.setText("EJERCICIO 62");
                enunciado.setText("Si se depositan hoy $17.180.000, dentro de 9 meses $15.450.000 y 8 meses despues de realizado el anterior deposito, $18.260.000 ¿Cuanto se tendrá acumulado 30 meses despues de efectuado el primer deposito si se reconoce el 3% bimestral nominal semanal por los primeros 10 meses y del 5% trimestral nominal mensual de ahi en adelante?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 63
            case 62:
                titulo.setText("EJERCICIO 63");
                enunciado.setText("Se compra una motocicleta de $3.700.000 con un pago inicial del 30% y 4 abonos trimestrales que crecen $50.000 con respecto al anterior, reconociendo unos intereses del 15% anual nominal semanal ¿de cueanto es cada pago?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 64
            case 63:
                titulo.setText("EJERCICIO 64");
                enunciado.setText("Una persona deposita $100.000.000 en una cuenta de ahorros que paga un interes del 7% trimestral nominal quincenal; dentro de 5 años retira la tercera parte del total acumulado en su cuenta, dos años mas tarde hace un deposito igual a la mitad del saldo existente en ese momento y dos años despues retira la totalidad del dinero existente en esa fecha.Hallar el valor de ese ultimo retiro.");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 65
            case 64:
                titulo.setText("EJERCICIO 65");
                enunciado.setText("Una deuda de $22.000.000 que vence en 8 trimestres y otra de $17.500.000 que vence dentro de 14 trimestres,se van a pagar mediante un abono de $13.000.000 realizado en este momento y dos pagos iguales que se harán dentro de 10 trimestres y dentro de 22 trimestres,respectivamente. Si el rendimiento del dinero es 8% trimestral nominal mensual ¿ de cuanto debe ser cada unos de los pagos?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 66
            case 65:
                titulo.setText("EJERCICIO 66");
                enunciado.setText("A tiene con B las sifuientes deudas $36.000.000 que se deben pagar dentro de 14 meses $51.000.000 que debe pagar dentro de 28 meses. B aceptó recibir un abono,el dia de hoy,de $16.000.000 que A tiene disponible. Si A desea liquidar su deuda mediante un segundo pago de %75.000.000 ¿ En que tiempo deberá realizarlo? la tasa de interes acordada es del 1.125% mensual");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 67
            case 66:
                titulo.setText("EJERCICIO 67");
                enunciado.setText("¿En cuanos dia un capital crece 15% si se invierte con el 6.03% anual?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 68
            case 67:
                titulo.setText("EJERCICIO 68");
                enunciado.setText("Un empresario tiene 4 obligaciones pendientes de $11.000.000; $13.000.000 y $14.600.000 con vencimineto a los 2,7,15 trimestres. para pagar esas deudas propone canjear las cuatro obligaciones en una sola cancelada dentro de 9 trimestres. Determinar el monto que tendria que cancelar si la tasa de interes fuera del 15% semestral");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 69
            case 68:
                titulo.setText("EJERCICIO 69");
                enunciado.setText("¿ De cuanto e cada pago trimestral que amortiza un credito de $16.000.000 en una año con un interes de 12.3% anual nominal bimestral? suponga que los pagos son iguales");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
            //SOLUCION 70
            case 69:
                titulo.setText("EJERCICIO 70");
                enunciado.setText("Un inversionista coloco su capital de $150.500.000 como pretamo a un particular por 6 años y a interes compuesto, se sabe que durante este lapso de tiempo, la tasa de interes tuvo las siguientes variaciones, o,5% quincenal durante los primeros 6 meses; 1.5% semstral por los 6 meses consecutivos; 2% mensual por los siguientes 4 trimestres; 1.5% aual por los siguientes 5 semestres; 0.012% diario por los siguientes 2 meses; 1.25% bimestral por el tiempo restante. \n" +
                        "a) el inversionista desea conocer el interes generado por su capital.\n" +
                        "b) ¿Cuál es el interes trimestral promedio?");
                solucion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), SolucionInteresActivity.class);
                        intent.putExtra("solucion", vista);
                        startActivity(intent);
                    }
                });
                break;
        }
    }
}
