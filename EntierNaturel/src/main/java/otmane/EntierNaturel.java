package otmane;

public class EntierNaturel {
    int  Val;

    public EntierNaturel(int Val) {
        this.Val = Val;

    }

    public int getVal(int a) throws NombreNegatifException{
        return Val;
    }

    public void setVal(int Val) throws NombreNegatifException {
        this.Val = Val;
        if(Val<0)throw new NombreNegatifException("nombre negatif");
    }
    public void decrementer() throws NombreNegatifException {
        this.Val--;
        if(Val<0)throw new NombreNegatifException("nombre negatif");

    }

    @Override
    public String toString() {
        return "val : "+Val;
    }
}
