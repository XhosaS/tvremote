package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsa extends sbx {
    public final jaf a;
    public final irc b;
    private final dxc c;

    public jsa(dxc dxcVar, irc ircVar, jaf jafVar) {
        ircVar.getClass();
        jafVar.getClass();
        this.c = dxcVar;
        this.b = ircVar;
        this.a = jafVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jry jryVar = (jry) obj;
        jse jseVar = new jse(this.c.a);
        jseVar.a = new jsi(this, jryVar, 1);
        jseVar.b = new jnq(this, jryVar, 17);
        return jseVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jry jryVar = (jry) obj;
        jse jseVar = (jse) obj2;
        iwg iwgVar = new iwg(19);
        isi isiVar = (isi) jryVar.d;
        m(isiVar.b(iwgVar));
        jseVar.F(((ixi) jryVar).a, new String[0]);
        vun vunVar = isiVar.i.f;
        wtj wtjVar = (wtj) jryVar.b;
        int i = 1;
        boolean z = !vunVar.contains(wtjVar.i);
        if (jseVar.k != z) {
            jseVar.k = z;
            Iterator it = jseVar.l.iterator();
            while (it.hasNext()) {
                ((sdd) it.next()).a();
            }
        }
        wls wlsVar = wtjVar.b;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jseVar.d, wlsVar)) {
            jseVar.d = wlsVar;
            jseVar.G(1);
        }
        wls wlsVar2 = wtjVar.c;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(jseVar.e, wlsVar2)) {
            jseVar.e = wlsVar2;
            jseVar.G(2);
        }
        wlx wlxVar = wtjVar.d;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        if (!yks.e(jseVar.c, wlxVar)) {
            jseVar.c = wlxVar;
            jseVar.G(0);
        }
        wls wlsVar3 = wtjVar.e;
        if (wlsVar3 == null) {
            wlsVar3 = wls.a;
        }
        if (!yks.e(jseVar.f, wlsVar3)) {
            jseVar.f = wlsVar3;
            jseVar.G(3);
        }
        wls wlsVar4 = wtjVar.f;
        if (wlsVar4 == null) {
            wlsVar4 = wls.a;
        }
        if (!yks.e(jseVar.g, wlsVar4)) {
            jseVar.g = wlsVar4;
            jseVar.G(4);
        }
        boolean z2 = wtjVar.h;
        if (!yks.e(Boolean.valueOf(jseVar.j), Boolean.valueOf(z2))) {
            jseVar.j = z2;
            jseVar.G(7);
        }
        jseVar.i = new scc("R.id.new_provider_card_component", jseVar, new jla((Object) this, (ixi) jryVar, 15));
        jseVar.G(6);
        jseVar.h = new scc("R.id.dismiss", jseVar, new jub(jryVar, i));
        jseVar.G(5);
    }
}
