class animal {
    public void makeSound() {
        System.out.println("Este animal esta haciendo un sonido");
    }
}

class Dog extends animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow Meow");
    }
}



 


