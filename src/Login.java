import  java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        username = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        if (username.equals("ceyy") && password.equals("1234")) {
            System.out.println("Giriş Başarılı.");
        }
        else {
            String select;
            System.out.println("Hatalı Giriş");
            System.out.println("Şifreyi sıfırlamak ister misiniz ? y/n");

            select = input.nextLine();

            if (select.equals("y") || select.equals("Y")) {
                String newPass;
                System.out.println("Yeni şifre giriniz..");
                newPass= input.nextLine();

                if(newPass.equals("1234")) {
                    System.out.println("Yeni şifreniz eskisi ile aynı olamaz.");
                }
                else {
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                }
            }
            else if(select.equals("n") || select.equals("N")) {
                System.out.println("Uygulama sonlandırılıyor..");
            }
            else {
                System.out.println("Hatalı Giriş Yaptınız.");
            }

        }
    }
}
