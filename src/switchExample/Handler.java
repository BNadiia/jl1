package switchExample;

public class Handler {
    public static void main(String[] args) {
        int month = 8;
        String season = "";
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Undefined month";

                System.out.println(season);
        }


/*
        if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5){
            season = "Spring";
        }else if (month == 6 || month == 7 || month == 8){
            season = "Summer";
        }else if (month == 9 || month == 10 || month == 11){
            season = "Autumn";
        } else {
            season = "Undefined month";
        }
        System.out.println(season);
*/
    }
}
