package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzc extends ykt implements yjk {
    final /* synthetic */ bzd a;
    final /* synthetic */ bzz b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzc(bzd bzdVar, bzz bzzVar, long j) {
        super(0);
        this.a = bzdVar;
        this.b = bzzVar;
        this.c = j;
    }

    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        bza bzaVarB;
        bzd bzdVar = this.a;
        bwi bwfVar = null;
        if (cbp.V(bzdVar.p()) || bzdVar.f.c) {
            bzq bzqVar = bzdVar.r().w;
            if (bzqVar != null) {
                bwfVar = bzqVar.l;
            }
        } else {
            bzq bzqVar2 = bzdVar.r().w;
            if (bzqVar2 != null && (bzaVarB = bzqVar2.B()) != null) {
                bwfVar = bzaVarB.l;
            }
        }
        if (bwfVar == null) {
            bzz bzzVar = this.b;
            yjv yjvVar = bwk.a;
            bwfVar = new bwf(bzzVar);
        }
        long j = this.c;
        bza bzaVarB2 = bzdVar.r().B();
        bzaVarB2.getClass();
        bwfVar.s(bzaVarB2, j, 0.0f);
        return ygi.a;
    }
}
