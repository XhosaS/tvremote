package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum yea implements abxf {
    UNKNOWN(0),
    IDLE(1),
    UI_DISPLAYED(2),
    POST_TRIM_MEMORY_SIGNAL(3),
    IDLE_AFTER_UI_DISMISSED(4);

    public final int f;

    yea(int i) {
        this.f = i;
    }

    public static yea b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return IDLE;
        }
        if (i == 2) {
            return UI_DISPLAYED;
        }
        if (i == 3) {
            return POST_TRIM_MEMORY_SIGNAL;
        }
        if (i != 4) {
            return null;
        }
        return IDLE_AFTER_UI_DISMISSED;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
