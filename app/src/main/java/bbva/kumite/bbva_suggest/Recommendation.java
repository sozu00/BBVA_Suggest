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
        r.mTitle = "Entradas de cine al 50%";
        r.mDescription = "Hazte socio del Club Yelmo Cines y podrás comprar tus entradas al 50% antes de las 17.00 de la tarde o después de de las 23.00 de la noche, todos los días de la semana.";
        r.mImageURL = "https://resizer-oferplan.hoy.es/resizer/resizer.php?imagen=https%3A%2F%2Foferplan.hoy.es%2F%2Fimages%2Fsized%2Fimages%2FCinesa_entradas_definitiva6_1505734681-497x280.jpg";;
        r.mDate = "Por tiempo indefinido";
        r.mCategory = 0;
        r.mPhoneNumber = "902 22 09 22";
        r.mUrl = "www.yelmocines.es";
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
        r.mTitle = "Anastasia: el musical";
        r.mDescription = "Madrid será la primera ciudad europea donde se estrene este musical que triunfa en Broadway. Entradas desde 23 €";
        r.mImageURL = "https://www.anastasiamusical.es/sites/default/files/styles/facebook/public/2018-03/rrss-1200x630.png";
        r.mDate = "13/05/2019";
        r.mCategory = 1;
        r.mPhoneNumber = "902 488 488";
        r.mUrl = "https://www.anastasiamusical.es";
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
        r.mTitle = " Fabrik: Clásicos Back to the Disco con 2 copas  ";
        r.mDescription = "Una entrada oficial para Clásicos Back to the Disco en Fabrik el sábado 15 de diciembre de 19:00 a cierre. 2 consumiciones si entras antes de las 21:00. Después podrás acceder pero sin consumiciones y aparcamiento por 22,55 €";
        r.mImageURL = "https://www.clubbingspain.com/imagenes/elrow-fabrik.jpg";
        r.mDate = "15712/2018";
        r.mCategory = 2;
        r.mPhoneNumber = "911 876 636";
        r.mUrl = "http://www.grupo-kapital.com/fabrik/";
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
        r.mTitle = "Concierto de los Backstreet Boys";
        r.mDescription = "El gran regreso de Backstreet Boys a Madrid y Barcelona en su gira DNA World Tour 2019. Consigue tus entradas y no te pierdas esta oportunidad única. Entradas a partir de los 55 €.";
        r.mImageURL = "https://upload.wikimedia.org/wikipedia/commons/9/9a/BSB_Old_Navy_Performance.jpg";
        r.mDate = "24/11/18 - 3/02/19";
        r.mCategory = 3;
        r.mPhoneNumber = "902150025";
        r.mUrl = "https://www.ticketmaster.es/event/backstreet-boys-entradas/14031";
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
        r.mTitle = "Ginos 2x1";
        r.mDescription = "Disfruta cada domingo del increíble 2x1 de Ginos, en compras superiores a 12 €. Busca tu Ginos más cercano";
        r.mImageURL = "http://www.infoceliaco.com/images/ginos-nueva-carta-celiacos.png";
        r.mDate = "25/11/18 - 22/02/19";
        r.mCategory = 4;
        r.mPhoneNumber = "911 23 08 87";
        r.mUrl = "https://www.grupovips.com";
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
        r.mTitle = "La moda en el Museo Nacional Thyssen-Bornemisza";
        r.mDescription = "La moda refleja la evolución de la sociedad a lo largo del tiempo. No solo forma parte de la cultura, también constituye una forma de distinción y una actitud determinada ante la vida. El Museo Nacional Thyssen-Bornemisza te invita a viajar por el mundo de la moda a través de las obras de su colección. Sala a sala descubrirás la evolución de los tejidos, las texturas, los colores y el lenguaje implícito en la vestimenta de cada época por 15,90 €";
        r.mImageURL = "https://www.biko2.com/wp-content/uploads/2017/05/cabecera-thyssen.jpg";
        r.mDate = "24/11/18 - 08/05/19";
        r.mCategory = 5;
        r.mPhoneNumber = "917 911 370";
        r.mUrl = "https://www.museothyssen.org/";
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
        r.mTitle = "La casa de Papel: Scape Room";
        r.mDescription = "El Escape Room oficial de La Casa de Papel llega a Madrid por tiempo limitado. Una superproducción de Fever Originals, Atresmedia y Enigma Exprés, única en su formato y con la ambientación y el attrezzo original de la serie. ¡Sí, has oído bien! Incluido el auténtico teléfono rojo de El Profesor. ¿Conseguirás escapar con los 2.400 millones de euros?";
        r.mImageURL = "http://static.t13.cl/images/sizes/1200x675/1536074123-la-casa-de-papel.jpg";
        r.mDate = "06/10/18 - 06/05/19";
        r.mCategory = 6;
        r.mPhoneNumber = "911876636";
        r.mUrl = "https://lacasadepapelescaperoom.com";
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
        r.mTitle = "Disfruta de los magníficos descuentos de Ryanair";
        r.mDescription = "Vuelos desde 9,79 € corre que vuelan";
        r.mImageURL = "http://cadenaser00.epimg.net/ser/imagenes/2017/05/23/economia/1495539750_304809_1495540421_noticia_normal.jpg";
        r.mDate = "17/11/2018 - 15/12/2018";
        r.mCategory = 7;
        r.mPhoneNumber = "-";
        r.mUrl = "https://www.ryanair.com/es/es/";
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

        r = new Recommendation();
        r.mTitle = "Airsoft para 8 personas";
        r.mDescription = "En una partida de airsoft la puntería es tan importante como la coordinación con tu equipo, ¡así que escoge bien a los amigos que te acompañarán en esta aventura! En Ocius Park disfrutarás de unas instalaciones perfectas para este deporte, ellos se encargan del material y de todo lo demás, así tú podrás centrarte en tu misión...";
        r.mImageURL = "https://www.experiencedays.co.uk/images/Full-day-Airsoft-5-1920x1080-resize.JPG";
        r.mDate = "A partir de 5/01/2018";
        r.mCategory = 8;
        r.mPhoneNumber = "-";
        r.mUrl = "https://almoroxball.es/airsoft-en-toledo/";

        for (Recommendation rec: recommendationsToInclude) {
            if (categoriesSelected.get(rec.mCategory))
                recommendations.add(rec);
        }

    }
}
