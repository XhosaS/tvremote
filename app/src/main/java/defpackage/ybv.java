package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ybv implements abxf {
    EXPERIENCE_TYPE_UNKNOWN(0),
    WATSON_EXPERIENCE_TYPE(1),
    AMATI_EXPERIENCE_TYPE(2);

    public final int d;

    ybv(int i) {
        this.d = i;
    }

    public static ybv b(int i) {
        if (i == 0) {
            return EXPERIENCE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return WATSON_EXPERIENCE_TYPE;
        }
        if (i != 2) {
            return null;
        }
        return AMATI_EXPERIENCE_TYPE;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
