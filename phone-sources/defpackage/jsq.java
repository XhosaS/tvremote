package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsq extends sbx {
    public final jaf a;
    public final irc b;
    private final dxc c;

    public jsq(dxc dxcVar, irc ircVar, jaf jafVar) {
        ircVar.getClass();
        jafVar.getClass();
        this.c = dxcVar;
        this.b = ircVar;
        this.a = jafVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        wto wtoVar = ((wts) ixiVar.b).h;
        if (wtoVar == null) {
            wtoVar = wto.a;
        }
        int iBm = a.bm(wtoVar.c);
        if (iBm == 0) {
            iBm = 1;
        }
        jst jstVar = new jst(this.c.a, iBm + (-1) != 1 ? R.layout.poster_banner_card_dark_view : R.layout.poster_banner_card_light_view);
        jstVar.a = new jsi(this, ixiVar, 3);
        jstVar.b = new jfu(this, 5);
        return jstVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        jst jstVar = (jst) obj2;
        jstVar.F(ixiVar.a, new String[0]);
        wts wtsVar = (wts) ixiVar.b;
        wto wtoVar = wtsVar.h;
        if (wtoVar == null) {
            wtoVar = wto.a;
        }
        wkv wkvVar = wtoVar.b;
        if (wkvVar == null) {
            wkvVar = wkv.a;
        }
        if (!yks.e(jstVar.c, wkvVar)) {
            jstVar.c = wkvVar;
            jstVar.G(0);
        }
        wls wlsVar = wtsVar.b;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jstVar.d, wlsVar)) {
            jstVar.d = wlsVar;
            jstVar.G(2);
        }
        wls wlsVar2 = wtsVar.c;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(jstVar.e, wlsVar2)) {
            jstVar.e = wlsVar2;
            jstVar.G(3);
        }
        wtr wtrVar = wtsVar.f;
        if (wtrVar == null) {
            wtrVar = wtr.a;
        }
        wlx wlxVar = wtrVar.b;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        if (!yks.e(jstVar.m, wlxVar)) {
            jstVar.m = wlxVar;
            jstVar.G(12);
        }
        wtr wtrVar2 = wtsVar.f;
        if (wtrVar2 == null) {
            wtrVar2 = wtr.a;
        }
        int iBm = a.bm(wtrVar2.c);
        if (iBm == 0) {
            iBm = 1;
        }
        if (jstVar.n != iBm) {
            jstVar.n = iBm;
            jstVar.G(1);
        }
        wtn wtnVar = wtsVar.d;
        if (wtnVar == null) {
            wtnVar = wtn.a;
        }
        sco scoVar = new sco(wtnVar.b);
        if (!yks.e(jstVar.f, scoVar)) {
            jstVar.f = scoVar;
            jstVar.G(4);
        }
        wtq wtqVar = wtsVar.g;
        if (wtqVar == null) {
            wtqVar = wtq.a;
        }
        wls wlsVar3 = wtqVar.b;
        if (wlsVar3 == null) {
            wlsVar3 = wls.a;
        }
        if (!yks.e(jstVar.h, wlsVar3)) {
            jstVar.h = wlsVar3;
            jstVar.G(7);
        }
        wls wlsVar4 = wtqVar.c;
        if (wlsVar4 == null) {
            wlsVar4 = wls.a;
        }
        if (!yks.e(jstVar.i, wlsVar4)) {
            jstVar.i = wlsVar4;
            jstVar.G(8);
        }
        int iBm2 = a.bm(wtqVar.e);
        int i = iBm2 != 0 ? iBm2 : 1;
        if (jstVar.o != i) {
            jstVar.o = i;
            jstVar.G(6);
        }
        wtp wtpVar = wtqVar.d;
        if (wtpVar == null) {
            wtpVar = wtp.a;
        }
        wls wlsVar5 = wtpVar.b;
        if (wlsVar5 == null) {
            wlsVar5 = wls.a;
        }
        if (!yks.e(jstVar.j, wlsVar5)) {
            jstVar.j = wlsVar5;
            jstVar.G(9);
        }
        wtp wtpVar2 = wtqVar.d;
        if (wtpVar2 == null) {
            wtpVar2 = wtp.a;
        }
        wls wlsVar6 = wtpVar2.c;
        if (wlsVar6 == null) {
            wlsVar6 = wls.a;
        }
        if (!yks.e(jstVar.k, wlsVar6)) {
            jstVar.k = wlsVar6;
            jstVar.G(10);
        }
        wtp wtpVar3 = wtqVar.d;
        if (wtpVar3 == null) {
            wtpVar3 = wtp.a;
        }
        wls wlsVar7 = wtpVar3.d;
        if (wlsVar7 == null) {
            wlsVar7 = wls.a;
        }
        if (!yks.e(jstVar.l, wlsVar7)) {
            jstVar.l = wlsVar7;
            jstVar.G(11);
        }
        jstVar.g = new scc("R.id.banner_card", jstVar, new jla((Object) this, ixiVar, 17));
        jstVar.G(5);
    }
}
