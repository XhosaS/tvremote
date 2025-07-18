package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cua implements ctn {
    public final cte a;
    public final boolean b;
    private final String c;
    private final int d;

    public cua(String str, int i, cte cteVar, boolean z) {
        this.c = str;
        this.d = i;
        this.a = cteVar;
        this.b = z;
    }

    @Override // defpackage.ctn
    public final cqw a(cqd cqdVar, cph cphVar, cug cugVar) {
        return new crl(cqdVar, cugVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.c + ", index=" + this.d + "}";
    }
}
