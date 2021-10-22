package Kodlamaİo;

public class CampManager {
    public void toRegister (Camps camps){
        System.out.println("Kayıt Başarıyla Gerçekleşti: "+camps.campName);
    }

    public void toFinish (Camps camps){
        System.out.println("Bu dersi tamamladın sıradakine geç. "+camps.campName);
    }
}
