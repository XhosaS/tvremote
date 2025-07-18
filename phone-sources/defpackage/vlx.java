package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vlx implements vug {
    UNKNOWN(0),
    SYSTEM_TRAY(1),
    IN_APP(2);

    public final int d;

    vlx(int i) {
        this.d = i;
    }

    public static vlx b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SYSTEM_TRAY;
        }
        if (i != 2) {
            return null;
        }
        return IN_APP;
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
