package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vkf implements vug {
    CHANNEL_GROUP_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    vkf(int i) {
        this.d = i;
    }

    public static vkf b(int i) {
        if (i == 0) {
            return CHANNEL_GROUP_UNKNOWN;
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
