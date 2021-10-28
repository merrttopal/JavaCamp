package KodlamaIo2;

public class InstructorManager {
    User user = new User();
    public void add(User user){
        System.out.println("Eğitmen oluşturuldu; "+ user.getUserName());
    }
    public void remove(User user){
        System.out.println("Eğitmen silindi; "+ user.getUserName());
    }
    public void update(User user){
        System.out.println("Eğitmen bilgileri güncellendi; "+ user.getUserName());
    }
}
