package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acx implements yjz {
    final /* synthetic */ acy a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;

    public acx(acy acyVar, int i, Object obj) {
        this.a = acyVar;
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            this.a.e(this.b, this.c, baoVar, 0);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
