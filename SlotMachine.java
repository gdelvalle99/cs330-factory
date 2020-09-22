public abstract class SlotMachine {
    String cabinet;
    String display;
    String CPU;
    String OS;
    String payment;

    void fetchComponents(){
        System.out.println("fetching components: " + cabinet + ", " + payment + ", " + display + ", " + CPU + "\n");
    }

    void assembleComponents(){
        System.out.println("assembling components\n");
    }

    void testHardware(){
        System.out.println("testing hardware\n");
    }

    void uploadSoftware(){
        System.out.println("uploading software: "+ OS +"\n");
    }
    void testSoftware(){
        System.out.println("testing software\n");
    }
}