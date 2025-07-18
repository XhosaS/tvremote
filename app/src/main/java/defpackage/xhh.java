package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xhh implements abxf {
    UNKNOWN(0),
    ANDROID(1),
    IOS(2),
    WEB(3),
    ELEMENTS(4);

    public final int f;

    xhh(int i) {
        this.f = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
