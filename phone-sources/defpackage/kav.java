package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kav extends yiz implements yjz {
    final /* synthetic */ boolean a;
    final /* synthetic */ kbc b;
    final /* synthetic */ yjv c;
    final /* synthetic */ bdy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kav(boolean z, kbc kbcVar, yjv yjvVar, bdy bdyVar, yih yihVar) {
        super(2, yihVar);
        this.a = z;
        this.b = kbcVar;
        this.c = yjvVar;
        this.d = bdyVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kav) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new kav(this.a, this.b, this.c, this.d, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        if (this.a) {
            kbc kbcVar = this.b;
            bdy bdyVar = this.d;
            yjv yjvVar = this.c;
            List listI = a.i(bdyVar);
            listI.getClass();
            yjvVar.getClass();
            yvc yvcVar = kbcVar.i;
            if (!yks.e(yvcVar.d(), listI)) {
                yvcVar.e(listI);
                kbcVar.j.e(-1);
            }
            kbcVar.a(yjvVar);
        }
        return ygi.a;
    }
}
