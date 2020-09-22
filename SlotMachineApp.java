public class SlotMachineApp {
    public static void main(String[] args){
        OrderSystem nvOrder = new NVOrderSystem();
        OrderSystem njOrder = new NJOrderSystem();
        System.out.println("The Taj Mahal orders a:\n");
        SlotMachine tajMachine = njOrder.purchaseMachine("bonus");
        System.out.println("The Peppermill orders a:\n");
        SlotMachine pepMachine = nvOrder.purchaseMachine("progressive");
    }
}