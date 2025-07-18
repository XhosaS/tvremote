package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ctv implements ctn {
    public final String a;
    public final csy b;
    public final csy c;
    public final cti d;
    public final boolean e;

    public ctv(String str, csy csyVar, csy csyVar2, cti ctiVar, boolean z) {
        this.a = str;
        this.b = csyVar;
        this.c = csyVar2;
        this.d = ctiVar;
        this.e = z;
    }

    @Override // defpackage.ctn
    public final cqw a(cqd cqdVar, cph cphVar, cug cugVar) {
        return new crj(cqdVar, cugVar, this);
    }
}
