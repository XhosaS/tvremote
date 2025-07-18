package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kax implements yjk {
    final /* synthetic */ int a;
    final /* synthetic */ wsu b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bdy d;
    final /* synthetic */ bdy e;
    final /* synthetic */ bdy f;

    public kax(int i, wsu wsuVar, boolean z, bdy bdyVar, bdy bdyVar2, bdy bdyVar3) {
        this.a = i;
        this.b = wsuVar;
        this.c = z;
        this.d = bdyVar;
        this.e = bdyVar2;
        this.f = bdyVar3;
    }

    @Override // defpackage.yjk
    public final /* bridge */ /* synthetic */ Object a() {
        Integer num = (Integer) yfm.V(a.i(this.d), ((Number) this.e.a()).intValue());
        boolean z = false;
        if (num != null) {
            if (num.intValue() == this.a) {
                wni wniVar = this.b.i;
                if (wniVar == null) {
                    wniVar = wni.a;
                }
                String str = wniVar.b;
                str.getClass();
                if (str.length() > 0 && this.c && !((Boolean) this.f.a()).booleanValue()) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
