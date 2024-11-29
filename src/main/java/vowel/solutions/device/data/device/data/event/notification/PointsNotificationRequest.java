package vowel.solutions.device.data.device.data.event.notification;

public class PointsNotificationRequest {
    private String memberEmailAddress;
    private Integer memberTotalPoints;
    private Integer memberEventPoints;
    private String mnemonicDescription;

    public String getMemberEmailAddress() {
        return memberEmailAddress;
    }

    public PointsNotificationRequest setMemberEmailAddress(String memberEmailAddress) {
        this.memberEmailAddress = memberEmailAddress;
        return this;
    }

    public Integer getMemberTotalPoints() {
        return memberTotalPoints;
    }

    public PointsNotificationRequest setMemberTotalPoints(Integer memberTotalPoints) {
        this.memberTotalPoints = memberTotalPoints;
        return this;
    }

    public Integer getMemberEventPoints() {
        return memberEventPoints;
    }

    public PointsNotificationRequest setMemberEventPoints(Integer memberEventPoints) {
        this.memberEventPoints = memberEventPoints;
        return this;
    }

    public String getMnemonicDescription() {
        return mnemonicDescription;
    }

    public PointsNotificationRequest setMnemonicDescription(String mnemonicDescription) {
        this.mnemonicDescription = mnemonicDescription;
        return this;
    }

    @Override
    public String toString() {
        return "PointsNotificationRequest{" +
                "memberEmailAddress='" + memberEmailAddress + '\'' +
                ", memberTotalPoints=" + memberTotalPoints +
                ", memberEventPoints=" + memberEventPoints +
                ", mnemonicDescription='" + mnemonicDescription + '\'' +
                '}';
    }
}
