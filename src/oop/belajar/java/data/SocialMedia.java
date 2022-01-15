package oop.belajar.java.data;

class SocialMedia {
    String name;
}

/*final class Facebook extends SocialMedia{
    final void login(String username, String password){
    }
}*/

/*ERROR jika class parent merupakan final class
class FakeFacebook extends Facebook{}*/

class Facebook extends SocialMedia{
    final void login(String username, String password){

    }
}

/*ERROR jika method di parent merupakan final method */
/*
class FakeFacebook extends Facebook{
    void login(String username, String password){

    }
}*/
