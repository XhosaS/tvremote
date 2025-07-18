package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmm {
    public final yyk a;
    public final yyk b;
    private final String c;

    static {
        new wmm(new wml());
    }

    private wmm(wml wmlVar) {
        this.c = wmlVar.a;
        this.a = wmlVar.b.f();
        this.b = wmlVar.c.f();
    }

    public final String toString() {
        return this.c + "@" + Integer.toHexString(hashCode());
    }
}
