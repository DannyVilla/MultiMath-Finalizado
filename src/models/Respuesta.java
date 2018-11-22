package models;

/**
 *
 * @author edgargc
 */
public class Respuesta {

    public String Text;
    public boolean isCorrect;
    public boolean Selected;
    public String Value;
    public int Resultado;

    public Respuesta(String Text, String Value, boolean isCorrect, boolean Selected) {
        this.Text = Text;
        this.Value = Value;

        this.isCorrect = isCorrect;
        this.Selected = Selected;

    }

    public Respuesta() {
    }

    public int getResultado() {
        return Resultado;
    }

    public void setResultado(int Resultado) {
        this.Resultado = Resultado;
    }
    

    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    public boolean isIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public boolean isSelected() {
        return Selected;
    }

    public void setSelected(boolean Selected) {
        this.Selected = Selected;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

}
