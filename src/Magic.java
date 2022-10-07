public final class Magic extends Hero {
    private Integer defends;
    private Integer damage1;

    public Magic(Integer helth, Integer damage1, Integer defends) {
        super(helth);
        this.defends = defends;
        this.damage1 = damage1;
    }

    public Integer getDefends() {
        return defends;
    }

    public Integer getDamage1() {
        return damage1;
    }

    public Magic(Integer helth) {
        super(helth);

    }
    public String printInfo() {
        return" Halth:"+ getHelth()+ " Damage: " + getDamage1() + " defence "+getDefends();
    }
}
