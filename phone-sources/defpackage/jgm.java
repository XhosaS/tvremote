package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgm extends sbx {
    public final jaf a;
    public final irc b;
    private final cvw c;

    public jgm(cvw cvwVar, irc ircVar, jaf jafVar) {
        ircVar.getClass();
        jafVar.getClass();
        this.c = cvwVar;
        this.b = ircVar;
        this.a = jafVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jgp jgpVar = new jgp(this.c.a);
        jgpVar.a = new jeu(this, ixiVar, 6);
        jgpVar.b = new jev(this, ixiVar, 5);
        return jgpVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        jgp jgpVar = (jgp) obj2;
        jgpVar.F(ixiVar.a, new String[0]);
        wsa wsaVar = (wsa) ixiVar.b;
        wls wlsVar = wsaVar.c;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jgpVar.c, wlsVar)) {
            jgpVar.c = wlsVar;
            jgpVar.G(0);
        }
        wls wlsVar2 = wsaVar.d;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(jgpVar.d, wlsVar2)) {
            jgpVar.d = wlsVar2;
            jgpVar.G(1);
        }
        boolean z = (wsaVar.b & 8) != 0;
        if (!yks.e(Boolean.valueOf(jgpVar.f), Boolean.valueOf(z))) {
            jgpVar.f = z;
            jgpVar.G(3);
        }
        int iAL = a.aL(wsaVar.g);
        int i = iAL != 0 ? iAL : 1;
        if (jgpVar.h != i) {
            jgpVar.h = i;
            jgpVar.G(4);
        }
        if (jgpVar.f) {
            sco scoVar = new sco(wsaVar.e);
            if (!yks.e(jgpVar.e, scoVar)) {
                jgpVar.e = scoVar;
                jgpVar.G(2);
            }
            jgpVar.g = new scc("R.id.action_button", jgpVar, new iut((sbx) this, (Object) ixiVar, 10));
            jgpVar.G(5);
        }
    }
}
