/**
 * Lớp đại diện cho phép bình phương một biểu thức
 *
 * @author 16021008
 */
class Square extends Expression {

    //Biểu thức expression
    private Expression expression;

    /**
     * Constructor khởi tạo
     *
     * @param expression
     */
    Square(Expression expression) {
        this.expression = expression;
    }
    
    /**
     * Lấy giá trị của biểu thức bình phương
     * 
     * @return giá trị của biểu thức bình phương
     */
    @Override
    public int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
    
    /**
     * Trả về thông tin của biểu thức
     * 
     * @return thông tin của biểu thức
     */
    @Override
    public String toString() {
        return "Square(" + expression + ") = " + evaluate();
    }
}
