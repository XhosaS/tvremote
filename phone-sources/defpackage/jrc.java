package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrc extends sbx {
    public final jaf a;
    private final iyh b;
    private final mjb c;
    private final gag d;
    private final dxc e;

    public jrc(dxc dxcVar, iyh iyhVar, mjb mjbVar, jaf jafVar, gag gagVar) {
        mjbVar.getClass();
        jafVar.getClass();
        gagVar.getClass();
        this.e = dxcVar;
        this.b = iyhVar;
        this.c = mjbVar;
        this.a = jafVar;
        this.d = gagVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jra jraVar = (jra) obj;
        jrh jrhVar = new jrh();
        jrhVar.a = new jmm(this, jraVar, 17);
        jrhVar.b = new jnq(this, jraVar, 13);
        return jrhVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ids, java.lang.Object] */
    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jra jraVar = (jra) obj;
        jrh jrhVar = (jrh) obj2;
        m(this.c.a);
        iye iyeVar = ((iym) jraVar).a;
        n(iyeVar);
        gag gagVar = this.d;
        m(gagVar.b);
        for (Map.Entry entry : jraVar.b.entrySet()) {
            q((rrx) entry.getKey(), entry.getValue());
        }
        jrhVar.F(jraVar.d, new String[0]);
        iyk iykVar = (iyk) this.b.l(iyeVar);
        if (!yks.e(jrhVar.c, iykVar)) {
            jrhVar.c = iykVar;
            jrhVar.G(0);
        }
        int iL = gagVar.l();
        if (!a.r(jrhVar.d, iL)) {
            jrhVar.d = iL;
            jrhVar.G(1);
        }
        boolean zE = yks.e(p(jef.j), true);
        if (yks.e(Boolean.valueOf(jrhVar.e), Boolean.valueOf(zE))) {
            return;
        }
        jrhVar.e = zE;
        jrhVar.G(2);
    }
}
