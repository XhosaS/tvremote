package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrt extends sbx {
    public final jaf a;
    public final lfn b;
    private final dxc c;

    public jrt(dxc dxcVar, jaf jafVar, lfn lfnVar) {
        jafVar.getClass();
        lfnVar.getClass();
        this.c = dxcVar;
        this.a = jafVar;
        this.b = lfnVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jrs jrsVar = (jrs) obj;
        jrw jrwVar = new jrw(this.c.a);
        jrwVar.a = new jmm(this, jrsVar, 20);
        jrwVar.b = new jnq(this, jrsVar, 16);
        return jrwVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        jrs jrsVar = (jrs) obj;
        jrw jrwVar = (jrw) obj2;
        jrwVar.F(((ixi) jrsVar).a, new String[0]);
        Map map = (Map) p(jef.e);
        jiq jiqVar = new jiq(jrsVar, jrwVar, map, this, 3);
        wls wlsVarI = jrsVar.i();
        if (!yks.e(jrwVar.d, wlsVarI)) {
            jrwVar.d = wlsVarI;
            jrwVar.G(2);
        }
        wtf wtfVar = (wtf) jrsVar.b;
        wno wnoVar = wtfVar.b;
        if (wnoVar == null) {
            wnoVar = wno.a;
        }
        wlx wlxVar = wnoVar.e;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        wlxVar.getClass();
        if (!yks.e(jrwVar.h, wlxVar)) {
            jrwVar.h = wlxVar;
            jrwVar.G(6);
        }
        wkp wkpVar = wtfVar.c;
        if (wkpVar == null) {
            wkpVar = wkp.a;
        }
        wls wlsVar = wkpVar.d;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        wlsVar.getClass();
        if (!yks.e(jrwVar.e, wlsVar)) {
            jrwVar.e = wlsVar;
            jrwVar.G(3);
        }
        jrwVar.r(jrsVar.d);
        boolean zK = jrsVar.k();
        if (!yks.e(Boolean.valueOf(jrwVar.c), Boolean.valueOf(zK))) {
            jrwVar.c = zK;
            jrwVar.G(1);
        }
        jrwVar.f = new scc("R.id.checkbox", jrwVar, jiqVar);
        jrwVar.G(4);
        jrwVar.g = new scc("R.id.media_provider_selection_item_component", jrwVar, jiqVar);
        jrwVar.G(5);
        if (map != null) {
        }
    }
}
