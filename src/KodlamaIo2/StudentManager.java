package KodlamaIo2;

public class StudentManager {
    User user = new User();
    public void add(User user){
        System.out.println("Öğrenci oluşturuldu; "+ user.getUserName());
    }
    public void remove(User user){
        System.out.println("Öğrenci silindi; "+ user.getUserName());
    }
    public void update(User user){
        System.out.println("Öğrenci bilgileri güncellendi; "+ user.getUserName());
    }
}
