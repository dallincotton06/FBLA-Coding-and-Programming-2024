package interfaces;

public enum PartnershipList {
    NULL(new Partnership(null, null, null));

    final Partnership partnership;
    PartnershipList(Partnership partnership) {
        this.partnership = partnership;
    }

    public Partnership getPartnership() {
        return partnership;
    }
}
