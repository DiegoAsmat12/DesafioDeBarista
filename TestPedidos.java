public class TestPedidos{
    public static void main(String[] args) {

        Articulo cafe = new Articulo("Café",12.50);
        Articulo cafePasado = new Articulo("Café Pasado",15);
        Articulo capuchino = new Articulo("Capuchino", 18.50);
        Articulo moccachino = new Articulo("Moccachino", 20.50);
        Articulo frappuchino = new Articulo("Frappuchino", 20);


        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido("Michael");
        Pedido pedido4 = new Pedido("Alex");
        Pedido pedido5 = new Pedido("Marco");

        pedido1.addArticulo(cafePasado);
        pedido1.addArticulo(moccachino);

        pedido2.addArticulo(cafe);
        pedido2.addArticulo(capuchino);

        pedido3.addArticulo(frappuchino);
        pedido3.addArticulo(cafe);

        pedido4.addArticulo(frappuchino);
        pedido4.addArticulo(moccachino);

        pedido5.addArticulo(cafe);
        pedido5.addArticulo(cafePasado);

        pedido1.display();
        pedido2.display();
        pedido3.display();
        pedido4.display();
        pedido5.display();

        pedido2.setListo(true);
        pedido3.setListo(true);

        System.out.println( pedido1.getStatusMessage());
        System.out.println( pedido2.getStatusMessage());
        System.out.println( pedido3.getStatusMessage());
        System.out.println( pedido4.getStatusMessage());
        System.out.println( pedido5.getStatusMessage());

    }
}