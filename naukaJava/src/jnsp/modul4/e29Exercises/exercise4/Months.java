package jnsp.modul4.e29Exercises.exercise4;

public enum Months {

    STYCZEŃ( 31 ),
    LUTY ( 28 ),
    MARZEC (31),
    KWIECIEŃ (30),
    MAJ (31),
    CZERWIEC (30),
    LIPIEC (31),
    SIERPIEŃ (31),
    WRZESIEŃ (30),
    PAŹDZIERNIK (31),
    LISTOPAD (30),
    GRUDZIEŃ (31);

    private final int days;

    Months(int days) {
        this.days = days;
    }
    public int getDays() {
        return days; }
}
