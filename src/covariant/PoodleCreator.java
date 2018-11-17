package covariant;

public class PoodleCreator extends DogCreator {

//    Dog create() {
//        return new Poodle();  // third type, return
//    }

    Poodle create() {
        return new Poodle();  //  covariant
    }
}
