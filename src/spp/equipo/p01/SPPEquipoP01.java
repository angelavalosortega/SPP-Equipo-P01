/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.equipo.p01;
import java.util.Scanner;
/**
 *
 * @author Nohely
 */
public class SPPEquipoP01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int opEntrada1,opEntrada3, opEntrada4;
        double resultado;
        Scanner kb= new Scanner (System.in);
        System.out.println("Convertidor de Unidades métrico decimal a sistema inglés");
        System.out.println("Introduzca el sistema deseado");
        System.out.println("1.Sistema Métrico decimal a inglés");
        System.out.println("2.Sistema inglés a métrico decimal");
        System.out.println("3.Salir");
        opEntrada1= kb.nextInt();
        switch (opEntrada1){
            case 1:
                System.out.println("Bienvenido al convertidor de Sistema Métrico decimal a ingles");
                switch (pedirSistema()){
                    case 1:
                        System.out.println("Bienvenido al convertidor de volúmenes");
                        System.out.println("Introduzca la conversión deseada");
                        System.out.println("1.Litros a galones");
                        System.out.println("2.Mililitros a onza fluída");
                        opEntrada3=kb.nextInt();
                        switch (opEntrada3){
                            case 1:
                                resultado=(pedirMedida()/(3.785));
                                System.out.println(resultado +"galones");
                                break;
                            case 2:
                                resultado = (pedirMedida()/(29));
                                System.out.println(resultado +"onza fluída");
                                break;
                            default:
                                System.out.println("¡Vuelve pronto!");
                                break;
                        }
                    break;
                
                    case 2:
                        System.out.println("Bienvenido al convertidor de longitudes");
                        System.out.println("Introduzca la conversión deseada");
                        System.out.println("1.Kilómetros a millas");
                        System.out.println("2.Centímetros a pulgadas");
                        System.out.println("3.Centímetros a pies");
                        System.out.println("4.Centímetros a yardas");
                        opEntrada3= kb.nextInt();
                        switch (opEntrada3){
                            case 1:
                                resultado=(pedirMedida()/(1.6));
                                System.out.println(resultado +"millas");
                                break;
                            case 2:
                                    resultado=(pedirMedida()/(2.54));
                                    System.out.println(resultado +"in");
                                    break;
                            case 3:
                                resultado=(pedirMedida()/(30.48));
                                System.out.println(resultado + "pies");
                                break;
                            case 4:
                                resultado=(pedirMedida()/(91.4));
                                System.out.println(resultado + "yardas");
                                break; 
                            default:
                                System.out.println("¡Vuelve pronto!");
                                break;
                            }
                    break;    
                    case 3:
                        System.out.println("Bienvenido al convertidor de temperaturas");
                        System.out.println("Introduzca la conversión deseada");
                        System.out.println("1.Celsius a Fahrenheit");
                        System.out.println("2.Celsius a Kelvin");
                        opEntrada3= kb.nextInt();
                        switch (opEntrada3){
                            case 1:
                                resultado=((1.8*pedirMedida())+32);
                                System.out.println(resultado +"° Fahrenheit");
                                break;
                            case 2:
                                resultado=(273.15+pedirMedida());
                                System.out.println(resultado+ "° Kelvin");
                                break; 
                            default:
                                System.out.println("¡Vuelve pronto!");
                                break;
                        }
                    break;    
                    case 4:
                        System.out.println("Bienvenido al convertidor de masas");
                        System.out.println("Introduzca la conversión deseada");
                        System.out.println("1.Kilogramos a libras");
                        System.out.println("2.Gramos a onzas");
                        System.out.println("3.Salir");
                        opEntrada3=kb.nextInt();
                        switch (opEntrada3){
                            case 1:
                                resultado= (pedirMedida()*2.2046);
                                System.out.println(resultado +" libras");
                                        
                                break;
                            case 2:
                                resultado= (pedirMedida()*.035274);
                                System.out.println(resultado + " onzas");
                                        
                                break;
                            default:
                                System.out.println("¡Vuelve pronto!");
                                break;
                                
                        }
                    break;
                }
            break;
                     
            case 2:
                System.out.println("Bienvenido al convertidor de sistema inglés a métrico decimal");
                switch (pedirSistema()){
                    case 1:
                        System.out.println("Bienvenido al convertidor de volúmenes");
                        System.out.println("Introduzca la conversión deseada");
                        System.out.println("1.Galones a litros ");
                        System.out.println("2.Onza líquida a mililitros");
                        opEntrada4= kb.nextInt();
                        switch (opEntrada4){
                            case 1:
                                resultado=(pedirMedida()*3.785);
                                System.out.println(resultado+ "litros");
                                break;
                            case 2:
                                resultado = (29*pedirMedida());
                                System.out.println(resultado+"mililitros");
                                break;
                            default:
                                System.out.println("¡Vuelve pronto!");
                                break;
                                
                        }
                    break;    
                    case 2:
                        System.out.println("Bienvenido al convertidor de longitudes");
                        System.out.println("Introduzca la conversión deseada");
                        System.out.println("1.Millas a Kilómetros");
                        System.out.println("2.Pulgadas a centímetros");
                        System.out.println("3.Pies a centímetros");
                        System.out.println("4.Yardas a centímetros");
                        opEntrada4=kb.nextInt();
                        switch (opEntrada4){
                            case 1:
                                resultado=(pedirMedida()*1.6);
                                System.out.println(resultado +"km");
                                break;
                            case 2:
                                resultado=(pedirMedida()*2.54);
                                System.out.println(resultado +"cm");
                                break;
                            case 3: 
                                resultado=(pedirMedida()*30.48);
                                System.out.println(resultado + "cm");
                                break;
                            case 4:
                                resultado=(pedirMedida()*91.4);
                                System.out.println(resultado + "cm");
                                break;
                            default:
                                System.out.println("¡Vuelve pronto!");
                                break;
                        }
                    break;    
                    case 3:
                        System.out.println("Bienvenido al convertidor de temperaturas");
                        System.out.println("Introduzca la conversión deseada");
                        System.out.println("1.Fahrenheit a Celsius");
                        System.out.println("2.Kelvin a Celsius");
                        System.out.println("3.Fahrenheit a Kelvin");
                        System.out.println("4.Kelvin a Fahrenheit");
                        opEntrada4=kb.nextInt();
                        switch (opEntrada4){
                            case 1:
                                resultado=((pedirMedida()-32)*(5/9));
                                System.out.println(resultado +"° Celcius");
                                break;
                            case 2:
                                resultado= (pedirMedida()-273);
                                System.out.println(resultado +"° Celcius");
                                break;
                            case 3:
                                resultado= ((pedirMedida()+460)/(1.8));
                                System.out.println(resultado +"° Kelvin");
                                break;
                            case 4:
                                resultado= (pedirMedida()*1.8-460);
                                System.out.println(resultado +"° Fahrenheit");
                                break;
                            default:
                               System.out.println("¡Vuelve pronto!");
                               break;
                         
                        }
                        break;
                    case 4:
                        System.out.println("Bienvenido al convertidor de masas");
                        System.out.println("Introduzca la conversión deseada");
                        System.out.println("1.Libras a kilogramos");
                        System.out.println("2.Onzas a gramos");
                        System.out.println("3.Salir");
                        opEntrada4= kb.nextInt();
                        switch (opEntrada4){
                            case 1:
                                resultado= (pedirMedida()/2.2046);
                                System.out.println(resultado +" kilogramos");
                                        
                                break;
                            case 2:
                                resultado= (pedirMedida()/.035274);
                                System.out.println(resultado + " gramos");
                                        
                                break;
                            default:
                                System.out.println("¡Vuelve pronto!");
                                break;
                         
                        }               
                }
            break;   
                
        }
    }
    static double pedirMedida(){
        //Variables
        double medida;
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduzca la medida a convertir");
        medida=kb.nextDouble();
        return medida;
    }
    static int pedirSistema(){
        int opEntrada2;
        Scanner kb= new Scanner (System.in);
        System.out.println("Introduzca la opción deseada");
        System.out.println("1.Conversión de volúmenes");
        System.out.println("2.Conversión de longitud");
        System.out.println("3.Conversión de tempertaturas");
        System.out.println("4.Conversión de masas");
        System.out.println("5.Salir");
        opEntrada2= kb.nextInt();
        return opEntrada2;
        
    }
    
}
