package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgb extends sbx {
    public final jaf a;
    public final irc b;
    private final ihg c;
    private final kja d;
    private final cvw e;

    public jgb(cvw cvwVar, jaf jafVar, irc ircVar, ihg ihgVar, kja kjaVar) {
        jafVar.getClass();
        ircVar.getClass();
        kjaVar.getClass();
        this.e = cvwVar;
        this.a = jafVar;
        this.b = ircVar;
        this.c = ihgVar;
        this.d = kjaVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jge jgeVar = new jge(this.e.a);
        jgeVar.a = new jeu(this, ixiVar, 4);
        jgeVar.b = new jev(this, ixiVar, 3);
        return jgeVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        yva yvaVar = ((kiz) this.d).a;
        ixi ixiVar = (ixi) obj;
        jge jgeVar = (jge) obj2;
        o(yvaVar);
        jgeVar.F(ixiVar.a, new String[0]);
        wry wryVar = (wry) ixiVar.b;
        wls wlsVar = wryVar.c;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        wlsVar.getClass();
        if (!yks.e(jgeVar.c, wlsVar)) {
            jgeVar.c = wlsVar;
            jgeVar.G(0);
        }
        wls wlsVar2 = wryVar.d;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        wlsVar2.getClass();
        if (!yks.e(jgeVar.d, wlsVar2)) {
            jgeVar.d = wlsVar2;
            jgeVar.G(1);
        }
        wls wlsVar3 = wryVar.e;
        if (wlsVar3 == null) {
            wlsVar3 = wls.a;
        }
        wlsVar3.getClass();
        if (!yks.e(jgeVar.e, wlsVar3)) {
            jgeVar.e = wlsVar3;
            jgeVar.G(2);
        }
        boolean z = wryVar.g;
        if (!yks.e(Boolean.valueOf(jgeVar.g), Boolean.valueOf(z))) {
            jgeVar.g = z;
            jgeVar.G(4);
        }
        jgeVar.f = new scc("R.id.dialog_list_item_component", jgeVar, new iut((sbx) this, (Object) ixiVar, 9));
        jgeVar.G(3);
        if (this.c.a()) {
            int iAQ = a.aQ(wryVar.h);
            int i = iAQ != 0 ? iAQ : 1;
            if (jgeVar.i != i) {
                jgeVar.i = i;
                jgeVar.G(5);
            }
            wfo wfoVar = (wfo) yvaVar.d();
            if (yks.e(jgeVar.h, wfoVar)) {
                return;
            }
            jgeVar.h = wfoVar;
            jgeVar.G(6);
        }
    }
}
