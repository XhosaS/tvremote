package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum lbh implements vug {
    HDCP_UNKNOWN(0),
    HDCP_NONE(1),
    HDCP_V1(2),
    HDCP_V2(3),
    HDCP_V2_1(8),
    HDCP_V2_2(9),
    HDCP_V2_3(11),
    HDCP_DISCONNECTED(10),
    UNRECOGNIZED(-1);

    private final int k;

    lbh(int i) {
        this.k = i;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
