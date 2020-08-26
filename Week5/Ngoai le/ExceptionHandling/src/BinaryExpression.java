/**
 * Lớp đại diện cho Biểu thức đôi
 *
 * @author 16021008
 */
public abstract class BinaryExpression extends Expression {

    /**
     * Phương thức trừu tượng khởi tạo biểu thức bên trái
     */
    public abstract Expression left();

    /**
     * Phương thức trừu tượng khởi tạo biểu thức bên phải
     */
    public abstract Expression right();
}
