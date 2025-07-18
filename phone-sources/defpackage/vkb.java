package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vkb implements vug {
    APP_BLOCK_STATE_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    vkb(int i) {
        this.d = i;
    }

    public static vkb b(int i) {
        if (i == 0) {
            return APP_BLOCK_STATE_UNKNOWN;
        }
        if (i == 1) {
            return ALLOWED;
        }
        if (i != 2) {
            return null;
        }
        return BANNED;
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
