class TwoGen <T , V> {
    T ob;
    V ob2;
    TwoGen(T ol, V о2 ) {
        ob = ol;
        ob2 = о2 ;
    }
    void showTypes() {
        System.out.println( "Tип Т: "+ ob.getClass().getName());
        System.out.println( "Tип V: "+ ob2.getClass().getName());
    }
    T getob(){
        return ob;
    }
    V getob2(){
        return ob2 ;
    }
}
