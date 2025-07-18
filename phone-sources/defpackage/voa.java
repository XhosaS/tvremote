package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum voa implements vug {
    UNKNOWN(0),
    ACTIVITY(1),
    SERVICE(2),
    BROADCAST(3),
    ACTIVITY_WITH_RESULT(4);

    public final int f;

    voa(int i) {
        this.f = i;
    }

    public static voa b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ACTIVITY;
        }
        if (i == 2) {
            return SERVICE;
        }
        if (i == 3) {
            return BROADCAST;
        }
        if (i != 4) {
            return null;
        }
        return ACTIVITY_WITH_RESULT;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
