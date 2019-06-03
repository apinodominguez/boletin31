package boletin31;

public interface IntegranteSeleccionFutbol {
    
    public void concentrarse();
    public void viajar();
    public void entrenar();
    public void jugarPartido();
    public default void ruedaPrensa(){
        System.out.println("Rueda de prensa de: ");
    }
    public default void videoPublicitario(){
        System.out.println("Video publicitario de: ");
    }
    
    }
