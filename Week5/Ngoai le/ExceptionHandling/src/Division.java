/**
 * Lớp đại diện cho biểu thức Chia
 * 
 * @author 16021008
 */
public class Division extends BinaryExpression {
    // biểu thức bên trái
    private Expression left;
    // biểu thức bên phải
    private Expression right;

    /**
     * Constrcutor khởi taọ 
     *
     * @param left biểu thức bên trái
     * @param right biểu thức bên phải
     */
    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Lấy giá trị của biểu thức Division _ trừ 2 biểu thức 
     *
     * @return giá trị của biểu thức Division
     */
    @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }

    /**
     * Lấy biểu thức bên trái
     *
     * @return biểu thức bên trái
     */
    @Override
    public Expression left() {
        return left;
    }

    /**
     * Lấy biểu thức bên phải
     *
     * @return biểu thức bên phải
     */
    @Override
    public Expression right() {
        return right;
    }

    /**
     * Lấy thông tin của biểu thức
     * 
     * @return thông tin của biểu thức
     */
    @Override
    public String toString() {
        return "Divide = " + evaluate();
    }
}
