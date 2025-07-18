package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqt extends sbx {
    public final jaf a;
    private final mpg b;
    private final dxc c;

    public jqt(dxc dxcVar, mpg mpgVar, jaf jafVar) {
        jafVar.getClass();
        this.c = dxcVar;
        this.b = mpgVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jry jryVar = (jry) obj;
        jqx jqxVar = new jqx();
        jqxVar.a = new jmm(this, jryVar, 16);
        jqxVar.b = new jnq(this, jryVar, 12);
        return jqxVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        jry jryVar = (jry) obj;
        jqx jqxVar = (jqx) obj2;
        jqxVar.F(((ixi) jryVar).a, new String[0]);
        Object obj3 = jryVar.d;
        obj3.getClass();
        mpd mpdVar = (mpd) this.b.l(obj3);
        if (yks.e(jqxVar.c, mpdVar)) {
            return;
        }
        jqxVar.c = mpdVar;
        jqxVar.G(0);
    }
}
