package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vhu implements vug {
    APP_BLOCK_STATE_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    vhu(int i) {
        this.d = i;
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
