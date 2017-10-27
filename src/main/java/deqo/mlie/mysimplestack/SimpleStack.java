package deqo.mlie.mysimplestack;

import java.util.EmptyStackException;

/**
 * interface SimpleStack
 * represente une pile
 *
 * @author Mathieu Lievre
 *
 *
 *   \o__
 *   |
 *  |\
 *
 */
public interface SimpleStack {

    /**
     * Getter for property 'empty'.
     *
     * @return Value for property 'empty'.
     */
    boolean isEmpty();

    /**
     * Getter for property 'size'.
     *
     * @return Value for property 'size'.
     */
    int getSize();

    /**
     * methode push
     * permet d'ajouter un item en sommet de pilep
     *
     * @param item item a ajouter
     */
    void push(Item item);

    /**
     * methode peek
     * permet de connaitre l'item en sommet de pile sans le depiler
     *
     * @return top : l'item en sommet de pile
     * @throws EmptyStackException lorsque la pile est vide
     */
    Item peek() throws EmptyStackException;

    /**
     * methode pop
     * permet de depiler : enlever l'item en sommet de pile
     * la methode remplace l'item au sommet par son suivant s'il existe
     *
     * @return top : l'item en sommet de pile avant l'operation
     * @throws EmptyStackException lorsque la pile est vide
     */
    Item pop() throws EmptyStackException;

}
