package Modelo;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 * La clase Eventos proporciona métodos para manejar eventos de teclado en
 * componentes
 * de interfaz de usuario, como JTextField, permitiendo restricciones en los
 * tipos de
 * caracteres que se pueden ingresar.
 * 
 * <p>
 * Esta clase contiene métodos para restringir la entrada de texto a solo
 * letras,
 * solo números, y números con decimales.
 * </p>
 * 
 * <p>
 * Ejemplo de uso:
 * 
 * <pre>
 * {@code
 * Eventos eventos = new Eventos();
 * textField.addKeyListener(new KeyAdapter() {
 *     public void keyTyped(KeyEvent evt) {
 *         eventos.textKeyPress(evt);
 *     }
 * });
 * }
 * </pre>
 * </p>
 * 
 * @version 1.0
 * @since 2024-06-06
 */
public class Eventos {

    /**
     * Restringe la entrada de texto a solo letras (mayúsculas y minúsculas),
     * permitiendo también el uso de la tecla de espacio y la tecla de retroceso.
     * 
     * @param evt el evento de teclado
     */
    public void textKeyPress(KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }

    /**
     * Restringe la entrada de texto a solo números, permitiendo también el uso
     * de la tecla de retroceso.
     * 
     * @param evt el evento de teclado
     */
    public void numberKeyPress(KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

    /**
     * Restringe la entrada de texto a solo números y un punto decimal, permitiendo
     * también el uso de la tecla de retroceso. Si el campo de texto ya contiene un
     * punto decimal, no permite ingresar otro.
     * 
     * @param evt       el evento de teclado
     * @param textField el campo de texto asociado con el evento
     */
    public void numberDecimalKeyPress(KeyEvent evt, JTextField textField) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && textField.getText().contains(".") && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }
}
