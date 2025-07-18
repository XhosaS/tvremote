package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqz implements yjz {
    final /* synthetic */ float a;
    final /* synthetic */ float b;

    public aqz(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            xo.b(zi.f(bkp.g, this.a, this.b), baoVar, 0);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
