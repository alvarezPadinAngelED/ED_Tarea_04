package cuentas;

/**
 * Esta clase simula el comportmiento de un cajero de banco, permitiendo consultar y hacer retiradas e ingresos
 * 
 * @author Padín
 * @version 2.0
 * @since 1.0
 * 
 * 
 * 
 *  */
public class CCuenta {
	
	/**
	 * 
	 * Devuelve el estado de la cuenta o permite hacer ingresos y retiradas
	 * @return Estado de la cuenta o éxito/fracaso en el ingreso/retirada
	 * 
	 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta(){
    	
    }

    public CCuenta(String nom, String cue, double sal, double tipo){
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double estado() {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
