package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uyx implements vug {
    PULSE_WITH_INNER_CIRCLE(0),
    PULSE(1);

    public final int c;

    uyx(int i) {
        this.c = i;
    }

    public static uyx b(int i) {
        if (i == 0) {
            return PULSE_WITH_INNER_CIRCLE;
        }
        if (i != 1) {
            return null;
        }
        return PULSE;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
