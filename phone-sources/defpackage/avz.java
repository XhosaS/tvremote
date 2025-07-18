package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avz implements yjz {
    final /* synthetic */ yjz a;
    final /* synthetic */ yjz b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;

    public avz(yjz yjzVar, yjz yjzVar2, long j, long j2) {
        this.a = yjzVar;
        this.b = yjzVar2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            bcm.i(axa.a.c(axh.a(2, baoVar)), bga.k(969655473, new avy(this.a, this.b, axh.a(10, baoVar), this.c, this.d), baoVar), baoVar, 56);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
