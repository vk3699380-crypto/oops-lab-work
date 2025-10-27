interface SensitiveData { }

class CustomerInfo implements SensitiveData {
    String name;
    String email;

    CustomerInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

class sensitive {
    void encryptData(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("Data does not require encryption.");
        }
    }
}

public class SensitiveDataTagging {
    public static void main(String[] args) {
        CustomerInfo customer = new CustomerInfo("Aakhya", "aakhya@gmail.com");
       sensitive processor = new sensitive();

        processor.encryptData(customer);

        String nonSensitive = "Public info";
        processor.encryptData(nonSensitive);
    }
}
