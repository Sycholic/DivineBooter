package studio.thamessia.Packets.Handshake;

public enum NextState {
    STATUS(0x1),
    LOGIN(0x2);

    public final int value;

    NextState(int value) {
        this.value = value;
    }
}