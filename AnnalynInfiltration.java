class AnnalynInfiltration {
    public static void main(String[] args) {
        AnnalynInfiltration analynInfiltration = new AnnalynInfiltration();
        System.out.println("Can fast attack: " + analynInfiltration.canFastAttack(false));
        System.out.println("Can spy: " + analynInfiltration.canSpy(true, false, false));
        System.out.println("Can signal prisoner: " + analynInfiltration.canSignalPrisoner(true, false));
        System.out.println("Can free prisoner: " + analynInfiltration.canFreePrisoner(true, false, true, true));
    }

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (petDogIsPresent && !archerIsAwake) || (prisonerIsAwake && !archerIsAwake && !knightIsAwake);
    }
}