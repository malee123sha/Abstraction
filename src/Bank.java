abstract class Bank {
    abstract int interestRate();
}
class BOC extends Bank {
    @Override
    int interestRate() {
        return 8;
    }
}
class HNB extends Bank {
    @Override
    int interestRate() {
        return 10;
    }
}
class NSB extends Bank {
    @Override
    int interestRate() {
        return 5;
    }
}
class Testing {
    public static void main(String[] args) {
        Bank b;
        b = new BOC();
        System.out.println("BOC Rate of Interest :-"+b.interestRate()+"%");
        b = new HNB();
        System.out.println("HNB Rate of Interest :-"+b.interestRate()+"%");
        b = new NSB();
        System.out.println("NSB Rate of Interest :-"+b.interestRate()+"%");
    }
}
