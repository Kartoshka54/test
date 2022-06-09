package LabExam3;

public class FriendsInfo {

    int age;
    int virusIndex;

    public FriendsInfo(int age , int virusIndex) {
        this.age=age;
        this.virusIndex=virusIndex;
    }

    @Override
    public String toString() {
        return age + "," + virusIndex;

    }

}