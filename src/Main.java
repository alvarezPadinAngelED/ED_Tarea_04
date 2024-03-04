package cuentas;

import cuentas.CCuenta;

/**
 * Esta clase constituye la principal del programa, permite operar con los métodos disponibles en la clase importada CCuenta
 * 
 * @author Padín
 * @version 2.0
 * @since 1.5
 * 
 * 
 * 
 *  */
public class Main {
	
	/**
	 * 
	 * Realiza una operativa completa
	 * @return Estado de la cuenta y operaciones realizadas
	 * 
	 * 
	 */
	public static void main(String[] args) {
		operativa_cuenta(210);
	}
	
	
	/**
	 * 
	 * Crea un objeto de la clase CCuenta, obtiene el estado, y realiza retirada e ingreso
	 * 
	 * @param cantidad
	 */

	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
            
        }
        
	}
	
}
