/**
 * lớp đại diện cho biểu thức cộng
 *
 * @author 16021008
 */
public class Addition extends BinaryExpression {

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
    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Lấy giá trị của biểu thức addition _ cộng 2 biểu thức 
     *
     * @return giá trị của biểu thức addition
     */
    @Override
    public int evaluate() {
        return right.evaluate() + left.evaluate();
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
        return "Add = " + evaluate();
    }
}
