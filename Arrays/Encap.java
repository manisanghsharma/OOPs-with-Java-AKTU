class Encap {
    private int emp_id;
    private String name;
    public void setEmpId(int emp_id){
        this.emp_id = emp_id;
    }
    public int getEmpId(){
        return emp_id;
    }
    public static void main(String[] args) {
        Encap obj1 = new Encap();
        obj1.setEmpId(123);
        System.out.println(obj1.getEmpId());
    }
}
