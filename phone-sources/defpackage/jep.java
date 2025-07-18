package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jep extends sbx {
    public final jaf a;
    public final irc b;
    private final cvw c;

    public jep(cvw cvwVar, irc ircVar, jaf jafVar) {
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
        jes jesVar = new jes(this.c.a);
        int i = 1;
        jesVar.a = new jeu(this, ixiVar, i);
        jesVar.b = new jev(this, ixiVar, i);
        return jesVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        jes jesVar = (jes) obj2;
        jesVar.F(ixiVar.a, new String[0]);
        wqs wqsVar = (wqs) ixiVar.b;
        wls wlsVar = wqsVar.c;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jesVar.d, wlsVar)) {
            jesVar.d = wlsVar;
            jesVar.G(1);
        }
        wlx wlxVar = wqsVar.b;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        if (!yks.e(jesVar.c, wlxVar)) {
            jesVar.c = wlxVar;
            jesVar.G(0);
        }
        jesVar.e = new scc("R.id.app_card_component", jesVar, new iut((sbx) this, (Object) ixiVar, 5));
        jesVar.G(2);
    }
}
