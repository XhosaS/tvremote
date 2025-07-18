package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lq extends ykt implements yka {
    final /* synthetic */ yjv a;
    final /* synthetic */ pf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq(yjv yjvVar, pf pfVar) {
        super(3);
        this.a = yjvVar;
        this.b = pfVar;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j;
        bvv bvvVar = (bvv) obj;
        bwj bwjVarU = ((bvs) obj2).u(((clv) obj3).a);
        if (!bvvVar.cA() || ((Boolean) this.a.a(this.b.g())).booleanValue()) {
            j = (bwjVarU.a << 32) | (bwjVarU.b & 4294967295L);
        } else {
            j = 0;
        }
        return bvvVar.cz((int) (j >> 32), (int) (4294967295L & j), yhc.a, new lk(bwjVarU, 2));
    }
}
