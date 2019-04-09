public class NonGen {
    Object ob ;
    NonGen (Object o) {
        ob = o;
    }
    Object getob () {
        return ob ;
    }
    void showType () {
        System.out.println("Oбъeкт оb относится к типу " + ob.getClass().getName ( ) );
    }
}

