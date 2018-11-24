package bbva.kumite.bbva_suggest;

import java.util.ArrayList;
import java.util.List;

import static bbva.kumite.bbva_suggest.Utilities.categoriesSelected;
import static bbva.kumite.bbva_suggest.Utilities.recommendations;

public class Recommendation {
    String mTitle;
    String mDescription;
    String mImageURL;
    String mDate;
    Integer mCategory;
    String mPhoneNumber;
    String mUrl;

    public static void getRecommendations() {
        recommendations.clear();
        List<Recommendation> recommendationsToInclude = new ArrayList<>();

        Recommendation r = new Recommendation();
        r.mTitle = "60% descuento en tus entradas Cinesa";
        r.mDescription = "¿Qué incluye? \nUna entrada de cine en Cinesa, válida hasta el 31 de enero de 2019, para el día, sesión y sala que elijas, excepto cines Xanadú y Equinoccio \nRecibirás un código alfanumérico para canjear en la web de Cinesa e ir directamente a taquilla con tu cupón o hacer la reserva online y elegir tus asientos";
        r.mImageURL = "https://resizer-oferplan.hoy.es/resizer/resizer.php?imagen=https%3A%2F%2Foferplan.hoy.es%2F%2Fimages%2Fsized%2Fimages%2FCinesa_entradas_definitiva6_1505734681-497x280.jpg";
        r.mDate = "31/11/2018 – 31/01/2019";
        r.mCategory = 0;
        r.mPhoneNumber = "659123446";
        r.mUrl = "https://www.cinesa.es/";
        recommendationsToInclude.add(r);

        r = new Recommendation();
        r.mTitle = "Nada es imposible - Mago Pop";
        r.mDescription = "Nada es imposible es el espectáculo de Antonio Díaz, El Mago Pop, que triunfa en el Teatro Rialto de Madrid, ofreciendo un viaje por lo extraordinario lleno de asombro, diversión, sensibilidad, sorpresas, ritmo y emoción, en una aventura llena de ilusiones que confirma que, cuando El Mago Pop está en escena, ¡nada es imposible!\n¿Todavía no le has visto en directo? Prepárate para ver cosas increíbles. ¡Te impresionará!\n¡Navidades y Nochevieja ya a la venta!";
        r.mImageURL = "https://cdn.atrapalo.com/common/photo/event/4/8/0/7280/511963/vertic_880_0.jpg";
        r.mDate = "24/11/2018 – 03/02/2019";
        r.mCategory = 1;
        r.mPhoneNumber = " 910 83 95 00";
        r.mUrl = "https://www.atrapalo.com/entradas/nada-es-imposible-mago-pop_e4807280/";
        recommendationsToInclude.add(r);

        r = new Recommendation();
        r.mTitle = "Fiesta Malecón discoteca Velvet Madrid";
        r.mDescription = "Cada sábado, a partir de las 0:00 h, vive una auténtica noche de fiesta en la discoteca Velvet. Velvet lleva siendo un punto de referencia los últimos años como sala de referencia en el centro de Madrid y actualmente lo sigue siendo cada fin de semana.\n¡No te pierdas la fiesta de la que todo el mundo habla!";
        r.mImageURL = "https://www.velvetdisco.es/s/cc_images/cache_11215405.jpg?t=1393257346";
        r.mDate = "08/12/2018";
        r.mCategory = 2;
        r.mPhoneNumber = " 91 683 75 06";
        r.mUrl = "https://discomadrid.com/fiestas/saturday-night-live-velvet/";
        recommendationsToInclude.add(r);

        r = new Recommendation();
        r.mTitle = "Concierto SIDECARS";
        r.mDescription = "El grupo Sidecars actuará el próximo 26 de febrero en el Teatro Nuevo Apolo de Madrid\nSidecars continúan presentando su cuarto disco \"Cuestión de gravedad\", que les ha catapultado como una de las más firmes apuestas de la actualidad musical, una promesa hecha realidad. Ahora, la banda madrileña le da una nueva vuelta de tuerca a las canciones de \"Cuestión de gravedad\", y presenta una GIRA DE TEATROS para este 2019\nLas entradas para Sidecars en el Teatro Nuevo \nApolo tienen un precio desde 15 euros  + gastos de gestión.\n¡No te quedes sin entradas!";
        r.mImageURL = "https://www.abc.es/media/espana/2017/01/07/sidecars-kOpB--620x349@abc.jpg";
        r.mDate = "26/02/2019";
        r.mCategory = 3;
        r.mPhoneNumber = " 910 53 00 46";
        r.mUrl = "https://www.ticketea.com/entradas-sidecars-teatro-nuevo-apolo-madrid/";
        recommendationsToInclude.add(r);

        r = new Recommendation();
        r.mTitle = "20% dto Take Away días de partidos en VIPS";
        r.mDescription = "¡Vive la fiesta del fútbol en casa con VIPS! Y que mejor forma de hacerlo que con un 20% de descuento en tus pedidos Take Away los días que tenemos partido!\nVálidos en todos los VIPS y VIPS Smart exceptuando los siguientes: VIPS Smart Segovia, VIPS Arturo Soria 177, VIPS Ciudad Lineal, VIPS Boadilla, VIPS Arco y VIPS Móstoles. No acumulable a otras ofertas existentes, ticket no fraccionable";
        r.mImageURL = "https://www.cc-carrefour-elpinar.com/wp-content/uploads/2018/10/vips-y-vips-mart-08-10-2018-800x351.jpg";
        r.mDate = "25/11/2018 – 12/12/2018";
        r.mCategory = 4;
        r.mPhoneNumber = "910 53 00 46";
        r.mUrl = "https://www.vips.es/promociones/20-dto-take-away-dias-de-partidos";

        recommendationsToInclude.add(r);
        r = new Recommendation();
        r.mTitle = "2x1 en el Museo de Cera de Madrid";
        r.mDescription = "Disfruta de una jornada divertida y sorprendente en el Museo de Cera de Madrid, donde podrás apreciar los grandes parecidos (y no tan parecidos pero igual de curiosos) con los personajes más famosos de las historia. Sorpréndete con todas sus figuras representativas de los personajes más famosos de la historia: Obama, Cervantes, Shakespeare, Einstein, George Clooney, Michael Jackson, Rafa Nadal, Cristiano Ronaldo, Andrés Iniesta, Drácula…";
        r.mImageURL = "https://www.cuantochollo.com/wp-content/uploads/2017/11/museoceramadrid1.jpg";
        r.mDate = "27/11/2018 – 31/12/2018";
        r.mCategory = 5;
        r.mPhoneNumber = "913 19 46 81";
        r.mUrl = "https://www.cuantochollo.com/2x1-y-descuentos/entradas/museo-de-cera-madrid-2x1-descuentos/";

        recommendationsToInclude.add(r);
        r = new Recommendation();
        r.mTitle = " Bowling Chamartín para 2 personas";
        r.mDescription = "2 partidas de bowling por persona con perrito caliente o sándwich y bebida por 16,95 € en vez de 31 €\nBowling Chamartín con 20 pistas de juego se ha convertido con los años en una de las referencias de la práctica de los bolos en España. No obstante es la bolera oficial de la Real Federación Española de Bolos. Además de poder pasar un buen rato con amigos o familia, se organizan campeonatos o incluso se puede organizar uno propio. También se celebran fiestas de cumpleaños para los más pequeños con merienda y refrescos";
        r.mImageURL = "https://img.grouponcdn.com/deal/cjCMzmiwTp7s1mcyNXgLEu/bolera_4g-960x576/v1/c700x420.jpg";
        r.mDate = "30/11/2018 – 31/12/2018";
        r.mCategory = 6;
        r.mPhoneNumber = "913 15 71 19";
        r.mUrl = "https://www.groupon.es/deals/bowling-chamartin-1?utm_source=google&utm_medium=cpc&utm_campaign=ES_dt_sea_ggl_txt_dsa_sr_cbp_ch1_nbr&gclid=CjwKCAiAiuTfBRAaEiwA4itUqAfNPCfgIH6b34H3My9ZzHKcSTh_93hVQclQtnXD4yhqPYzXqk4OfxoCuHYQAvD_BwE";

        recommendationsToInclude.add(r);
        r = new Recommendation();
        r.mTitle = "Circuito de 10 días en Turquía";
        r.mDescription = "Prepárate para iniciar un viaje inolvidable por la atractiva Turquía, un país único con el poder de transformar al viajero en el que descubrirás una sorprendente riqueza natural y gastronómica.\n¿Estás list@ para esta aventura?";
        r.mImageURL = "https://www.ecestaticos.com/imagestatic/clipping/58f/7fa/58f7fa33d2ab80d1fa99c9f9a746df5a/imagen-sin-titulo.jpg?mtime=1535044802";
        r.mDate = "15/12/2019 – 31/10/2019";
        r.mCategory = 7;
        r.mPhoneNumber = "913 27 45 83";
        r.mUrl = "https://www.logitravel.com/circuitos/turquia-de-estambul-a-esmirna-26410035.html";
        recommendationsToInclude.add(r);

        r = new Recommendation();
        r.mTitle = "XX Media Maratón Ciudad de Getafe";
        r.mDescription = "El Club de Atletismo Artyneon, con la colaboración del Excmo. Ayuntamiento de Getafe y el asesoramiento técnico de 42ypico eventos, organiza la XX Media Maratón Ciudad de Getafe con un recorrido de 21.097m, ¡Prepárate para la carrera!";
        r.mImageURL = "https://rasuechaplin.com/sitioweb/wp-content/uploads/2018/01/media-maraton-getafe-2015-recorrido.jpg";
        r.mDate = "27/01/2019";
        r.mCategory = 8;
        r.mPhoneNumber = "916 25 48 90";
        r.mUrl = "https://www.clubrunning.es/prueba/6189/XX-Media-Marat%C3%B3n-Ciudad-de-Getafe";
        recommendationsToInclude.add(r);

        for (Recommendation rec: recommendationsToInclude) {
            if (categoriesSelected.get(rec.mCategory))
                recommendations.add(rec);
        }

    }
}
