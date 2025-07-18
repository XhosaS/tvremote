package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adlm implements abxf {
    UNKNOWN(0),
    DEFAULT_ONESHOT(1),
    DEFAULT_CONTINUOUS(2),
    AMBIENT_ONESHOT(3),
    AMBIENT_CONTINUOUS(4),
    AMBIENT_TELEPHONY(7),
    FARFIELD_ONESHOT(5),
    FARFIELD_CONTINUOUS(6),
    NATCON_ONESHOT(9),
    HIGH_QUALITY_CONTINUOUS(10),
    BALANCED_CONTINUOUS(11);

    public static final abxg l = new abxg() { // from class: adlk
    };
    public final int m;

    adlm(int i) {
        this.m = i;
    }

    public static adlm b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DEFAULT_ONESHOT;
            case 2:
                return DEFAULT_CONTINUOUS;
            case 3:
                return AMBIENT_ONESHOT;
            case 4:
                return AMBIENT_CONTINUOUS;
            case 5:
                return FARFIELD_ONESHOT;
            case 6:
                return FARFIELD_CONTINUOUS;
            case 7:
                return AMBIENT_TELEPHONY;
            case 8:
            default:
                return null;
            case 9:
                return NATCON_ONESHOT;
            case 10:
                return HIGH_QUALITY_CONTINUOUS;
            case 11:
                return BALANCED_CONTINUOUS;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
