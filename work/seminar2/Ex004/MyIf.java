package work.seminar2.Ex004;

public interface MyIf {
    
    int getUserId();

    default int getAdminId() {
        return 1;
    }

    static int getUniqueId() {
        return 0;
    }
}
