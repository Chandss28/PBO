package PraktikumPBO.Pert12Quiz;

interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    int getVolume();
}

class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("Volume Xiaomi naik: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("Volume Xiaomi turun: " + volume);
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 5;
            System.out.println("Volume iPhone naik: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 5;
            System.out.println("Volume iPhone turun: " + volume);
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 7;
            System.out.println("Volume Samsung naik: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 7;
            System.out.println("Volume Samsung turun: " + volume);
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Oppo menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Oppo mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 8;
            System.out.println("Volume Oppo naik: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 8;
            System.out.println("Volume Oppo turun: " + volume);
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void makePhoneLouder() {
        phone.volumeUp();
    }

    public void makePhoneSilent() {
        phone.volumeDown();
    }
}

public class MainQuiz3 {
    public static void main(String[] args) {
        Phone xiaomi = new Xiaomi();
        Phone samsung = new Samsung();
        Phone oppo = new Oppo();
        Phone iphone = new iPhone();

        PhoneUser userXiaomi = new PhoneUser(xiaomi);
        userXiaomi.turnOnThePhone();
        userXiaomi.makePhoneLouder();
        userXiaomi.makePhoneLouder();
        userXiaomi.makePhoneSilent();
        userXiaomi.turnOffThePhone();

        System.out.println();

        PhoneUser userSamsung = new PhoneUser(samsung);
        userSamsung.turnOnThePhone();
        userSamsung.makePhoneLouder();
        userSamsung.makePhoneSilent();
        userSamsung.turnOffThePhone();

        System.out.println();

        PhoneUser userIphone = new PhoneUser(iphone);
        userIphone.turnOnThePhone();
        userIphone.makePhoneLouder();
        userIphone.makePhoneLouder();
        userIphone.turnOffThePhone();

        System.out.println();

        PhoneUser userOppo = new PhoneUser(oppo);
        userOppo.turnOnThePhone();
        userOppo.makePhoneLouder();
        userOppo.makePhoneSilent();
        userOppo.turnOffThePhone();
    }
}