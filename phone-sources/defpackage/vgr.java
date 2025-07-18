package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vgr implements vug {
    CHANNEL_GROUP_STATE_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    vgr(int i) {
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
