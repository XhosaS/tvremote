package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vkc implements vug {
    UNSPECIFIED(0),
    TRUE(1),
    FALSE(2);

    public final int d;

    vkc(int i) {
        this.d = i;
    }

    public static vkc b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return TRUE;
        }
        if (i != 2) {
            return null;
        }
        return FALSE;
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
