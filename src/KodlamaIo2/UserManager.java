package KodlamaIo2;

public class UserManager {
    User user = new User();
    public void add(User user){
        System.out.println("Kullanıcı oluşturuldu; "+ user.getUserName());
    }
    public void remove(User user){
        System.out.println("Kullanıcı silindi; "+ user.getUserName());
    }
    public void update(User user){
        System.out.println("Kullanıcı bilgileri güncellendi; "+ user.getUserName());
    }
}
