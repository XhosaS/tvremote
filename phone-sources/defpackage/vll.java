package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vll implements vug {
    DELETION_STATUS_UNKNOWN(0),
    ACTIVE(1),
    DELETED(2);

    public final int d;

    vll(int i) {
        this.d = i;
    }

    public static vll b(int i) {
        if (i == 0) {
            return DELETION_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return DELETED;
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
