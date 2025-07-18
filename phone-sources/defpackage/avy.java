package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avy implements yjz {
    final /* synthetic */ yjz a;
    final /* synthetic */ yjz b;
    final /* synthetic */ chc c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;

    public avy(yjz yjzVar, yjz yjzVar2, chc chcVar, long j, long j2) {
        this.a = yjzVar;
        this.b = yjzVar2;
        this.c = chcVar;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            baoVar.x(-168976609);
            wv.z(this.b, this.a, this.c, this.d, this.e, baoVar, 0);
            baoVar.p();
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
