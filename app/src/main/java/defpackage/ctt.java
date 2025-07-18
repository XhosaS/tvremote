package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ctt implements ctn {
    public final String a;
    public final csy b;
    public final ctj c;
    public final csy d;
    public final csy e;
    public final csy f;
    public final csy g;
    public final csy h;
    public final boolean i;
    public final boolean j;
    public final int k;

    public ctt(String str, int i, csy csyVar, ctj ctjVar, csy csyVar2, csy csyVar3, csy csyVar4, csy csyVar5, csy csyVar6, boolean z, boolean z2) {
        this.a = str;
        this.k = i;
        this.b = csyVar;
        this.c = ctjVar;
        this.d = csyVar2;
        this.e = csyVar3;
        this.f = csyVar4;
        this.g = csyVar5;
        this.h = csyVar6;
        this.i = z;
        this.j = z2;
    }

    @Override // defpackage.ctn
    public final cqw a(cqd cqdVar, cph cphVar, cug cugVar) {
        return new crh(cqdVar, cugVar, this);
    }
}
