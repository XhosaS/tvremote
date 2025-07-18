package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfg implements hev {
    public final heo a;
    public final boolean b;
    private final String c;
    private final int d;

    public hfg(String str, int i, heo heoVar, boolean z) {
        this.c = str;
        this.d = i;
        this.a = heoVar;
        this.b = z;
    }

    @Override // defpackage.hev
    public final hcj a(hbv hbvVar, hbk hbkVar, hfk hfkVar) {
        return new hcy(hbvVar, hfkVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.c + ", index=" + this.d + "}";
    }
}
