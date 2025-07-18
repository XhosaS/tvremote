package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jql extends sbx {
    public final jaf a;
    private final mop b;
    private final dxc c;

    public jql(dxc dxcVar, mop mopVar, jaf jafVar) {
        jafVar.getClass();
        this.c = dxcVar;
        this.b = mopVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jry jryVar = (jry) obj;
        jqp jqpVar = new jqp();
        jqpVar.a = new jmm(this, jryVar, 15);
        jqpVar.b = new jnq(this, jryVar, 11);
        return jqpVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        jry jryVar = (jry) obj;
        jqp jqpVar = (jqp) obj2;
        jqpVar.F(((ixi) jryVar).a, new String[0]);
        Object obj3 = jryVar.d;
        obj3.getClass();
        mom momVar = (mom) this.b.l(obj3);
        if (yks.e(jqpVar.c, momVar)) {
            return;
        }
        jqpVar.c = momVar;
        jqpVar.G(0);
    }
}
