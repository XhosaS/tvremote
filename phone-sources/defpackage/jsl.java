package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsl extends sbx {
    public final jaf a;
    public final irc b;
    private final ihg c;
    private final kja d;
    private final dxc e;

    public jsl(dxc dxcVar, irc ircVar, jaf jafVar, ihg ihgVar, kja kjaVar) {
        ircVar.getClass();
        jafVar.getClass();
        kjaVar.getClass();
        this.e = dxcVar;
        this.b = ircVar;
        this.a = jafVar;
        this.c = ihgVar;
        this.d = kjaVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jsy jsyVar = new jsy(this.e.a, 1, null);
        jsyVar.a = new jsi(this, ixiVar, 2);
        jsyVar.b = new jnq(this, ixiVar, 19);
        return jsyVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        jsy jsyVar = (jsy) obj2;
        if (this.c.a()) {
            yva yvaVar = ((kiz) this.d).a;
            o(yvaVar);
            wfo wfoVar = (wfo) yvaVar.d();
            if (!yks.e(jsyVar.g, wfoVar)) {
                jsyVar.g = wfoVar;
                jsyVar.G(4);
            }
        }
        jsyVar.F(ixiVar.a, new String[0]);
        wtl wtlVar = (wtl) ixiVar.b;
        wls wlsVar = wtlVar.c;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jsyVar.d, wlsVar)) {
            jsyVar.d = wlsVar;
            jsyVar.G(1);
        }
        wls wlsVar2 = wtlVar.d;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(jsyVar.e, wlsVar2)) {
            jsyVar.e = wlsVar2;
            jsyVar.G(2);
        }
        wlx wlxVar = wtlVar.b;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        if (!yks.e(jsyVar.c, wlxVar)) {
            jsyVar.c = wlxVar;
            jsyVar.G(0);
        }
        jsyVar.f = new scc("R.id.people_row_card_component", jsyVar, new jla((Object) this, ixiVar, 16));
        jsyVar.G(3);
    }
}
