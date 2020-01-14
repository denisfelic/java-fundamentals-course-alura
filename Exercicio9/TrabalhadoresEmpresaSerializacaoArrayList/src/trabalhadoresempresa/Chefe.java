package trabalhadoresempresa;

class Chefe extends Trabalhador{

     private float pgtoAdicional;
     private String cargo;

     public Chefe(){
        super();
        pgtoAdicional = 0.0f;
        cargo = "-";
     }

     public Chefe(String inNome, float inSalario, char inSexo, float inPgtoAdicional, String inCargo){
		super(inNome,inSalario, inSexo);  //executa o construtor da classe base
		setPgtoAdicional(inPgtoAdicional);
		setCargo(inCargo);
     }

     public float getPgtoAdicional(){
     	return pgtoAdicional;
     }

     public void setPgtoAdicional(float inPgtoAdicional){
     	pgtoAdicional = inPgtoAdicional;
     }

     public String getCargo(){
     	return cargo;
     }

     public void setCargo(String inCargo){
     	cargo = inCargo;
     }

     public float salarioAnual() { //método polimorfo
     	return(getSalario() * 13 + getSalario()/3 + getPgtoAdicional() * 12);
     }

     public String toString() { //método polimorfo
     	return (super.toString() + ", pgto. adicional mensal como chefe: R$ " 
                + pgtoAdicional + ", cargo: " + getCargo());
     }

}
