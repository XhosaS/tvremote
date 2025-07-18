package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vgt implements vug {
    UNSPECIFIED(0),
    TRUE(1),
    FALSE(2);

    public final int d;

    vgt(int i) {
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
