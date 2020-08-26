class PS {
    
    private int tu,mau;
    
    public void setTu(int tu)   {this.tu  = tu;     };
    public void setMau(int mau) {this.mau = mau;    };
    public int getTu()          {return this.tu;    };
    public int getMau()         {return this.mau;   };
    public String getPS()   {  return tu+"/"+mau;   };
    
    public PS(int tu, int mau){
        this.tu  = tu;
        this.mau = mau;
    } 
    //ham lay ucln
    public int UCLN(int a, int b){
        int i;
            while(b!=0)   { i=b; b=a%b; a=i; }
		         return a;
    }
    //ham lay toi gian phan so
    public void toigian(){
        int mc = UCLN(this.getTu(),this.getMau());
        this.setTu(this.getTu()/mc);
        this.setMau(this.getMau()/mc);
    }
    //ham cong 2 phan so
    public void cong(PS pso){
        int _tu  =(this.tu*pso.mau) + (pso.tu*this.mau);
        int _mau =pso.mau*this.mau;
        PS last = new PS(_tu,_mau);
        last.toigian();
        System.out.println("Ket qua Cong: " + last.getPS()); 
    }
    //ham tru 2 phan so
    public void tru(PS pso){
        int _tu  = (this.tu*pso.mau) - (pso.tu*this.mau);
        int _mau = pso.mau*this.mau;
        PS last = new PS(_tu,_mau);
        last.toigian();
        System.out.println("Ket qua Tru: " + last.getPS()); 
    }
    //ham nhan 2 phan so
    public void nhan(PS pso){
        int _tu  =(this.tu)* (pso.tu);
        int _mau =pso.mau*this.mau;
        PS last = new PS(_tu,_mau);
        last.toigian();
        System.out.println("Ket qua Nhan: " + last.getPS()); 
    }
    //ham chia 2 phan so
    public void chia(PS pso){
        int _tu  =(this.tu*pso.mau);
        int _mau =pso.tu*this.mau;
        PS last = new PS(_tu,_mau);
        last.toigian();
        System.out.println("Ket qua Chia: " + last.getPS()); 
    }
    //kiem tra 2 phan so co giong nhau khong?

   // @Override
    public boolean equals(Object obj){
        if(obj instanceof PS){
            if(((PS)obj).tu*this.mau == ((PS)obj).mau*this.tu) {
                return true;
            }
          }
        return false;
     }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    PS p1 = new PS(12,3);
        System.out.print("phan so thu 1 : " +p1.tu +"/"+p1.mau +"\n");
    PS p2 = new PS(4,1);
        System.out.print("phan so thu 2 : " +p2.tu +"/"+p2.mau+"\n");
    p1.cong(p2);
    p1.tru(p2);
    p1.nhan(p2);
    p1.chia(p2);
    p1.toigian();
    p2.toigian();
    if(p1.equals(p2)){
        System.out.println("phan so 1 giong phan so 2");
    }
    else System.out.println("phan so 1 khac phan so 2");
    
}
    
}
