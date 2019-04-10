public class Main {

    public static void main(String[] args) {
        Coada<String> coada = new Coada<>();
        coada.add("smecher");
        coada.add("ceva");
        coada.add("jackieChan");
        coada.add("manevre");
        //coada.afiseaza();


        for(String s : coada) {
            System.out.println(s);
        }

        Nod<String> nodDoi = coada.getFromPosition(2);
        System.out.println(nodDoi.getVal());

    }



}
