package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtb extends sbx {
    public final jaf a;
    public final mem b;
    public final irc c;
    private final hfw d;

    public jtb(hfw hfwVar, irc ircVar, jaf jafVar, mem memVar) {
        ircVar.getClass();
        jafVar.getClass();
        memVar.getClass();
        this.d = hfwVar;
        this.c = ircVar;
        this.a = jafVar;
        this.b = memVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        final ixi ixiVar = (ixi) obj;
        final int i = ixiVar.h() ? 163715 : ihz.U(ixiVar.g()) ? 163713 : 163714;
        jtf jtfVar = new jtf(this.d.a);
        jtfVar.a = new scg() { // from class: jta
            @Override // defpackage.scg
            public final void a(Object obj2, View view) {
                view.getClass();
                this.a.a.a(view, jbr.D(i, ixiVar, (jtf) obj2), yhc.a);
            }
        };
        jtfVar.b = new jtt(this, ixiVar, 1);
        return jtfVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        String str = ixiVar.a;
        jtf jtfVar = (jtf) obj2;
        jtfVar.F(str, new String[0]);
        wlx wlxVarG = ixiVar.g();
        if (!yks.e(jtfVar.c, wlxVarG)) {
            jtfVar.c = wlxVarG;
            jtfVar.G(0);
        }
        boolean zU = ihz.U(ixiVar.g());
        if (!yks.e(Boolean.valueOf(jtfVar.d), Boolean.valueOf(zU))) {
            jtfVar.d = zU;
            jtfVar.G(1);
        }
        boolean zH = ixiVar.h();
        if (!yks.e(Boolean.valueOf(jtfVar.e), Boolean.valueOf(zH))) {
            jtfVar.e = zH;
            jtfVar.G(2);
        }
        wls wlsVar = ((wtv) ixiVar.b).d;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        wlsVar.getClass();
        if (!yks.e(jtfVar.f, wlsVar)) {
            jtfVar.f = wlsVar;
            jtfVar.G(3);
        }
        jtfVar.g = new scc("R.id.search_suggestion_item_component", jtfVar, new jla(ixiVar, this, 19));
        jtfVar.G(4);
        if (yks.e(jtfVar.h, str)) {
            return;
        }
        jtfVar.h = str;
        jtfVar.G(5);
    }
}
