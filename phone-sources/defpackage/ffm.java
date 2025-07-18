package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffm extends fdw {
    final /* synthetic */ fef a;
    final /* synthetic */ ffn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffm(ffn ffnVar, fef fefVar, fef fefVar2) {
        super(fefVar);
        this.a = fefVar2;
        this.b = ffnVar;
    }

    @Override // defpackage.fdw, defpackage.fef
    public final fed b(long j) {
        fed fedVarB = this.a.b(j);
        feg fegVar = fedVarB.a;
        long j2 = fegVar.c;
        long j3 = fegVar.b;
        long j4 = this.b.a;
        feg fegVar2 = new feg(j3, j2 + j4);
        feg fegVar3 = fedVarB.b;
        return new fed(fegVar2, new feg(fegVar3.b, fegVar3.c + j4));
    }
}
