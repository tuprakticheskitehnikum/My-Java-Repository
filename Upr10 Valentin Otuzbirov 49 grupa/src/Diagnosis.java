
enum Diagnosis{
    NOTSICK(10.0), LITTLESICK(20.0), SICK(50.0), VERYSICK(200.0);
    final double cureCost;
    Diagnosis(double cureCost){
        this.cureCost = cureCost;
    }
}
