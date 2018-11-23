package bbva.kumite.bbva_suggest;

public class Utilities {

    public static int findCategory(Integer number){
        switch(number){
            case 1: return R.drawable.ic_cat1;
            case 2: return R.drawable.ic_cat2;
            case 3: return R.drawable.ic_cat3;
            case 4: return R.drawable.ic_cat4;
            case 5: return R.drawable.ic_cat5;
            case 6: return R.drawable.ic_cat6;
            case 7: return R.drawable.ic_cat7;
            case 8: return R.drawable.ic_cat8;
            case 9: return R.drawable.ic_cat9;
        }
        return R.drawable.ic_cat1;
    }
}
