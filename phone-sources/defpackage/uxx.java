package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uxx implements vug {
    UNKNOWN_ALIGNMENT(0),
    RIGHT(1),
    CENTER(2);

    public final int d;

    uxx(int i) {
        this.d = i;
    }

    public static uxx b(int i) {
        if (i == 0) {
            return UNKNOWN_ALIGNMENT;
        }
        if (i == 1) {
            return RIGHT;
        }
        if (i != 2) {
            return null;
        }
        return CENTER;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
