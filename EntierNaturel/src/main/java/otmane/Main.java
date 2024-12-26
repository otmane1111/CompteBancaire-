package otmane;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NombreNegatifException {


        EntierNaturel Ent = new EntierNaturel(1);
        EntierNaturel q = new EntierNaturel(-1);
        try{
            Ent.setVal(5);
            System.out.println("val :"+Ent);
        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");
        try{
            q.decrementer();
            System.out.println("val :"+q);

        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());

        }
    }
}