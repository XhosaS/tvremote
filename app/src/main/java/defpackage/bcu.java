package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bcu extends bcv implements bcj {
    final bcl a;
    final /* synthetic */ bcw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcu(bcw bcwVar, bcl bclVar, bcy bcyVar) {
        super(bcwVar, bcyVar);
        this.b = bcwVar;
        this.a = bclVar;
    }

    @Override // defpackage.bcj
    public final void a(bcl bclVar, bce bceVar) {
        bcl bclVar2 = this.a;
        bcf bcfVarA = bclVar2.ek().a();
        if (bcfVarA == bcf.a) {
            this.b.f(this.c);
            return;
        }
        bcf bcfVar = null;
        while (bcfVar != bcfVarA) {
            d(ct());
            bcfVar = bcfVarA;
            bcfVarA = bclVar2.ek().a();
        }
    }

    @Override // defpackage.bcv
    public final void b() {
        this.a.ek().c(this);
    }

    @Override // defpackage.bcv
    public final boolean c(bcl bclVar) {
        return this.a == bclVar;
    }

    @Override // defpackage.bcv
    public final boolean ct() {
        return this.a.ek().a().a(bcf.d);
    }
}
