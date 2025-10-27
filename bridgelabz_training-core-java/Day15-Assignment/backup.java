interface BackupSerializable { }

class UserData implements BackupSerializable {
    String name;
    int age;

    UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class BackupProcessor {
    void processBackup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Data is marked for backup and serialized successfully.");
        } else {
            System.out.println("Data is not eligible for backup.");
        }
    }
}

public class backup {
    public static void main(String[] args) {
        UserData user = new UserData("Aakhya", 21);
        BackupProcessor processor = new BackupProcessor();

        processor.processBackup(user);

        String randomData = "Temporary data";
        processor.processBackup(randomData);
    }
}
