package deqo.mlie.mysimplestack;

/**
 * classe Item
 * represente un element pouvant etre manipule par une pile
 *
 * @author Mathieu Lievre
 *
 *
 *   \o__
 *   |
 *  |\
 *
 */
public class Item {

    private int id;
    private String description;
    private Item previous;

    /**
     * constructeur avec description
     * permet de construire un item avec son id (numero) et sa description
     *
     * @param id numero de l'item
     * @param description description textuelle de l'item
     */
    public Item(int id, String description) {
        this.id = id;
        this.description = description;
        this.previous = null;
    }

    /**
     * constructeur sans description
     * permet de construire un item avec son id (numero)
     *
     * @param id numero de l'item
     */
    public Item(int id) {
        this.id = id;
        this.description = "";
        this.previous = null;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public int getId() {
        return id;
    }

    /**
     * Getter for property 'description'.
     *
     * @return Value for property 'description'.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for property 'description'.
     *
     * @param description Value to set for property 'description'.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for property 'previous'.
     *
     * @return Value for property 'previous'.
     */
    public Item getPrevious() {
        return previous;
    }

    /**
     * Setter for property 'previous'.
     *
     * @param previous Value to set for property 'previous'.
     */
    public void setPrevious(Item previous) {
        this.previous = previous;
    }

}
