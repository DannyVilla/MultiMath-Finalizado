package models;

/**
 *
 * @author edgargc
 */
public class Respuesta {

    private String Text;
    private boolean isCorrect;
    private boolean Selected;

    public Respuesta(String Text, boolean isCorrect, boolean Selected) {
        this.Text = Text;
        this.isCorrect = isCorrect;
        this.Selected = Selected;
    }

    public Respuesta() {
        
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

}
