public class WAOrderSystem extends OrderSystem{
    SlotMachine manufactureMachine(String type){
        if (type.equals("straight")){
            System.out.print("--- Making a Washington style Straight Slot Machine ---\n");
            return new WAStraightSlots();
        }
        else if (type.equals("bonus")){
            System.out.print("--- Making a Washington style Bonus Slot Machine ---\n");
            return new WABonusSlots();
        }
        else if (type.equals("progressive")){
            System.out.print("--- Making a Washington style Progressive Slot Machine ---\n");
            return new WAProgressiveSlots();
        } else return null;
    }
}