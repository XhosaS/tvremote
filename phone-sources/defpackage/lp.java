package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lp extends ykt implements yjz {
    final /* synthetic */ boolean a;
    final /* synthetic */ bkp b;
    final /* synthetic */ mf c;
    final /* synthetic */ mg d;
    final /* synthetic */ String e;
    final /* synthetic */ yka f;
    final /* synthetic */ int g;
    final /* synthetic */ xx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(xx xxVar, boolean z, bkp bkpVar, mf mfVar, mg mgVar, String str, yka ykaVar, int i) {
        super(2);
        this.h = xxVar;
        this.a = z;
        this.b = bkpVar;
        this.c = mfVar;
        this.d = mgVar;
        this.e = str;
        this.f = ykaVar;
        this.g = i;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kv.i(this.h, this.a, this.b, this.c, this.d, this.e, this.f, (bao) obj, bdi.n(this.g | 1));
        return ygi.a;
    }
}
