package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xaw implements vug {
    POLICY_SINGLE_TIMER(1),
    POLICY_DUAL_TIMERS(2),
    POLICY_FIXED_TIME(3);

    public final int d;

    xaw(int i) {
        this.d = i;
    }

    public static xaw b(int i) {
        if (i == 1) {
            return POLICY_SINGLE_TIMER;
        }
        if (i == 2) {
            return POLICY_DUAL_TIMERS;
        }
        if (i != 3) {
            return null;
        }
        return POLICY_FIXED_TIME;
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
