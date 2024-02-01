// Q1: Abstract class Pen
abstract class Pen {
    abstract void write();
    abstract void refill();
}

// Q2: Concrete class FountainPen extending Pen
class FountainPen extends Pen {
    void changeNib() {
        System.out.println("Changing the nib of the fountain pen.");
    }

    @Override
    void write() {
        System.out.println("Writing with the fountain pen.");
    }

    @Override
    void refill() {
        System.out.println("Refilling the ink of the fountain pen.");
    }
}

// Q3: Class Monkey
class Monkey {
    void jump() {
        System.out.println("Monkey is jumping.");
    }

    void bite() {
        System.out.println("Monkey is biting.");
    }
}

// Q3: Class Human inheriting from Monkey and implementing BasicAnimal interface
interface BasicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping.");
    }
}

// Q4: Abstract class Telephone
abstract class Telephone {
    abstract void dial();
    abstract void lift();
    abstract void disconnect();
}

// Q5: Concrete class SmartTelephone extending Telephone
class SmartTelephone extends Telephone {
    @Override
    void dial() {
        System.out.println("Dialing a number using a smart telephone.");
    }

    @Override
    void lift() {
        System.out.println("Lifting the smart telephone to answer a call.");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting the smart telephone call.");
    }
}

// Q6: Interface TVRemote
interface TVRemote {
    void turnOn();
    void turnOff();
}

// Q6: Interface SmartTVRemote inheriting from TVRemote
interface SmartTVRemote extends TVRemote {
    void browseInternet();
}

// Q7: Class TV implementing TVRemote interface
class TV implements TVRemote {
    @Override
    public void turnOn() {
        System.out.println("Turning on the TV.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the TV.");
    }
}

public class PS11 {
    public static void main(String[] args) {
        // Q2: Using FountainPen
        FountainPen fountainPen = new FountainPen();
        fountainPen.write();
        fountainPen.refill();
        fountainPen.changeNib();

        // Q3: Demonstrating Polymorphism with Monkey and Human
        Monkey monkey = new Monkey();
        Human human = new Human();

        monkey.jump();
        monkey.bite();

        human.jump();   
        human.bite();  
        human.eat();
        human.sleep();

        // Q5: Demonstrating Polymorphism with SmartTelephone
        SmartTelephone smartTelephone = new SmartTelephone();
        smartTelephone.dial();
        smartTelephone.lift();
        smartTelephone.disconnect();

        // Q7: Using TV implementing TVRemote interface
        TV tv = new TV();
        tv.turnOn();
        tv.turnOff();
    }
}
