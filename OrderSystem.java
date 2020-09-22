public abstract class OrderSystem {
    public SlotMachine purchaseMachine(String type){
        SlotMachine machine;

        machine = manufactureMachine(type);
        machine.fetchComponents();
        machine.assembleComponents();
        machine.testHardware();
        machine.uploadSoftware();
        machine.testSoftware();

        return machine;
    }

    abstract SlotMachine manufactureMachine(String type);
}