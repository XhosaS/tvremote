package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jfo implements yjz {
    final /* synthetic */ jfq a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    public jfo(jfq jfqVar, int i, int i2, int i3, int i4) {
        this.a = jfqVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
            baoVar.t();
        } else {
            this.a.i(this.b, this.c, this.d, this.e, baoVar, 0);
        }
        return ygi.a;
    }
}
