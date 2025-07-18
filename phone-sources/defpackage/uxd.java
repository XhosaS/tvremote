package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uxd implements vug {
    UNKNOWN_ACTION(0),
    DISMISSED(1),
    POSITIVE_RESPONSE(2),
    NEGATIVE_RESPONSE(3),
    CONTROL_NOT_SEEN(4),
    LEGACY_NOT_SEEN(5),
    ACKNOWLEDGE_RESPONSE(6),
    MAYBE_SEEN(7),
    UNRECOGNIZED(-1);

    private final int k;

    uxd(int i) {
        this.k = i;
    }

    public static uxd b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACTION;
            case 1:
                return DISMISSED;
            case 2:
                return POSITIVE_RESPONSE;
            case 3:
                return NEGATIVE_RESPONSE;
            case 4:
                return CONTROL_NOT_SEEN;
            case 5:
                return LEGACY_NOT_SEEN;
            case 6:
                return ACKNOWLEDGE_RESPONSE;
            case 7:
                return MAYBE_SEEN;
            default:
                return null;
        }
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
