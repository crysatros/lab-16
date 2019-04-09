public class Main {
    public static void main (String args[]){
        Gen< Integer> iOb1;
        iOb1 = new Gen< Integer> (88);
        iOb1.showType();
        int v1 = iOb1.getob();
        System.out.println ( "Знaчeниe : "+ v1);
        Gen<String> strOb1 = new Gen<String> ( "Тест обобщений ");
        strOb1.showType();
        String str1 = strOb1.getob();
        System.out.println("Знaчeниe : "+ str1);
        System.out.println();

        NonGen iOb2;
        iOb2 = new NonGen( 88);
        iOb2.showType();
        int v2 = ( Integer)iOb2.getob();
        System.out.println("Знaчeниe : " + v2);
        NonGen strOb2 = new NonGen ( "Tecт без обобщений" );
        strOb2.showType();
        String str2 = (String) strOb2.getob();
        System.out.println( "Знaчeниe : "+ str2);
        try{
            iOb2 = strOb2; /*Переменная экземпляра strOb ссылается на объект, содержащий смвольную строку, а не целое число.
        Присвоение синтаксически корректно потому, что все ссылки NonGen одинаковы и любая ссылка типа NonGen может
        указывать на любой другой объект типа NonGen.*/
            v2 = (Integer) iOb2.getob(); // Ошибка во время выполнения
            }catch (Exception e){
            System.out.println("Благодаря обобщению ошибка присвоения iOb2 = strOb2, возникающая во время выполнения, преобразована в ошибку, обнаруженную при компиляции: " + e);
            System.out.println();
        }

        TwoGen< Integer, String> tgObj = new TwoGen< Integer, String>(88, "Обобщения");
        tgObj.showTypes();
        int v3 = tgObj.getob();
        System.out.println("Знaчeниe : "+ v3) ;
        String str3 = tgObj.getob2();
        System.out.println("Знaчeниe : "+ str3) ;
    }
}
