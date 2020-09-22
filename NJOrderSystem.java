public class NJOrderSystem extends OrderSystem{
    SlotMachine manufactureMachine(String type){
        if (type.equals("straight")){
            System.out.print("--- Making a New Jersey style Straight Slot Machine ---\n");
            return new NJStraightSlots();
        }
        else if (type.equals("bonus")){
            System.out.print("--- Making a New Jersey style Bonus Slot Machine ---\n");
            return new NJBonusSlots();
        }
        else if (type.equals("progressive")){
            System.out.print("--- Making a New Jersey style Progressive Slot Machine ---\n");
            return new NJProgressiveSlots();
        } else return null;
    }
}