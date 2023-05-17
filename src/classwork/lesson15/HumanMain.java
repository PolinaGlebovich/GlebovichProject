package classwork.lesson15;

import java.util.Optional;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Man", 10);
        Human father = new Human("Father", 40);
        Human mother = new Human("Mother", 35);
        Human anonim = new Human(null, 50);
        human.setFather(father);
        human.setMother(mother);
        System.out.println(human);
        System.out.println(anonim);
       System.out.println(human.getFather().getName());

        if(human.getFather() != null && human.getFather().getFather() != null && human.getFather().getFather().getName() != null) {
            System.out.println(human.getFather().getFather().getName());
        } else {
            System.out.println("unknown name");
        }

        Optional<Human> fatherOpt = Optional.ofNullable(anonim.getFather());
//        if(fatherOpt.isPresent()) {  // точно он есть или нет
//            System.out.println(fatherOpt.get().getName());
//        }

        fatherOpt.ifPresent(f -> System.out.println(f.getName()));  // вернёт имя, даже есди его нет (null)
//       Human possibleFather = fatherOpt.orElseThrow();  // если тут ничего нет, то появится ошибка
//      // Human possibleFather = fatherOpt.orElseThrow(() -> new RuntimeException("Here"));
        fatherOpt.ifPresentOrElse(fOpt -> System.out.println(fOpt.getName()), () -> System.out.println("Anonim"));
//
        Human protector = new Human("Prot", 100);  // default
        Human ourDef = fatherOpt.orElse(protector);
        Optional.ofNullable(human.getFather())
                .orElse(getDefaultHuman());
        Optional.ofNullable(human.getFather())
                .orElseGet(HumanMain:: getDefaultHuman);

        fatherOpt.map(f -> f.getFather())
                .map(f -> f.getFather())
                .ifPresent(ded -> System.out.println(ded.getName()));  // наличие и отца и имени отца

        Optional.ofNullable(human)
                .map(Human::getFather)
                .filter(f -> f.getName().startsWith("An"))
                .ifPresent(f -> System.out.println(f));

        if(human.getFather() != null && human.getFather().getName() != null && human.getFather().getName().startsWith("Ab")) {
            System.out.println(human.getFather());
        }

    }

    private static Human getDefaultHuman() {
        System.out.println("This is default human");
        return new Human("Prot", 100);
    }
}
