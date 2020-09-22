public class NVOrderSystem extends OrderSystem{
    SlotMachine manufactureMachine(String type){
        if (type.equals("straight")){
            System.out.print("--- Making a Nevada style Straight Slot Machine ---\n");
            return new NVStraightSlots();
        }
        else if (type.equals("bonus")){
            System.out.print("--- Making a Nevada style Bonus Slot Machine --\n");
            return new NVBonusSlots();
        }
        else if (type.equals("progressive")){
            System.out.print("--- Making a Nevada style Progressive Slot Machine ---\n");
            return new NVProgressiveSlots();
        } else return null;
    }
}