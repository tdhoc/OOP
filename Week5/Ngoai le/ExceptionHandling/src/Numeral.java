/**
 * Lớp đại diện cho : số 
 * 
 * @author 16021008
 */
public class Numeral extends Expression {
    // giá trị của số
    private int value;
    /**
     * Constructor khởi tạo mặc định
     */
    Numeral() {
    }
    /**
     * Constructor khởi tạo 
     * 
     * @param value là giá trị của số
     */
    Numeral(int value) {
        this.value = value;
    }
    
    /**
     * Phương thức evaluate lấy giá trị cúa số
     * 
     * @return giá trị của số
     */
    @Override
    public int evaluate() {
        return value ;
    }
    
    /**
     * Lấy thông tin của số
     * 
     * @return chuỗi thông tin của số
     */
    @Override
    public String toString(){
        return ""+value;
    }
}
