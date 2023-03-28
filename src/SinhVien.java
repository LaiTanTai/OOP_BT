import java.util.Scanner;

public class SinhVien {
        private String name ;
        private int age;
        private int ID;
        private String Major;
        private String gender;
        private double Average ;
        private String level ;

    public SinhVien(String name , int age , int ID , String Major , String gender){
        this.name = name ;
        this.age = age ;
        this.ID = ID ;
        this.Major = Major;
        this.gender = gender;
    }
    public SinhVien(){

    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getID() {
        return ID;
    }
    public String getMajor() {
        return Major;
    }
    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMajor(String major) {
        Major = major;
    }
    public void Student_input(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập vào các thông tin sau : ");
        System.out.print("Tên : ");
        String name = scn.nextLine();
        this.name =  name ;
        System.out.print("Tuổi : ");
        int age = scn.nextInt();
        this.age = age;
        System.out.print("Mã Số Sinh Viên : ");
        int ID = scn.nextInt();
        this.ID = ID ;
        System.out.print("Mã Ngành : ");
        String Major = scn.nextLine();
        this.Major = Major ;
        System.out.print("Giới Tính : ");
        String gender = scn.nextLine();
        this.gender = gender;
    }
    public void Student_output(){
        System.out.print("Thông Tin Sinh Viên");
        System.out.print("Tên : " + this.name);
        System.out.print("Tuổi : "+ this.age);
        System.out.print("Mã Số Sinh Viên : "+this.ID);
        System.out.print("Mã Ngành : "+ this.Major);
        System.out.print("Giới Tính : "+this.gender);
    }
    public void Average(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập vào số môn học : ");
        int subject = scn.nextInt();
        double[] subject_arr = new double[subject];
        for(int i = 0 ; i < subject ;i++){
            System.out.print("Nhập môn thứ "+(i+1));
            subject_arr[i] = scn.nextDouble();
        }
        int average = 0;
        for(int i = 0 ; i < subject;i++){
            average+=subject_arr[i];
        }
        this.Average = average/subject;
        System.out.print("Điểm Trung Bình : " + average/subject);
    }
    public void rank(){
        if(this.Average >= 9){
            this.level = "giỏi";
            System.out.print("Học Lực Giỏi");
        }else if(this.Average >= 6.5){
            this.level = "khá";
            System.out.print("Học Lực Khá");
        }else if(this.Average >= 5){
            this.level = "trung bình ";
            System.out.print("Học Lực Trung Bình");
        }else{
            this.level = "yếu";
            System.out.print("Học Lực Yếu ");
        }
    }
    public static void main(){
        SinhVien sv1 = new SinhVien("tai",18,3122,"CNTT","Nam");
        sv1.Student_output();
        sv1.Average();
        sv1.rank();
    }
}