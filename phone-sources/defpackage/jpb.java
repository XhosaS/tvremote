package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpb extends sbx {
    public final jaf a;
    public final irc b;
    private final ihg c;
    private final kja d;
    private final dxc e;

    public jpb(dxc dxcVar, irc ircVar, jaf jafVar, ihg ihgVar, kja kjaVar) {
        ircVar.getClass();
        jafVar.getClass();
        kjaVar.getClass();
        this.e = dxcVar;
        this.b = ircVar;
        this.a = jafVar;
        this.c = ihgVar;
        this.d = kjaVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        joz jozVar = (joz) obj;
        int i = ((wqx) jozVar.b).c;
        int i2 = 11;
        jpf jpfVar = new jpf(this.e.a, i == 10 ? R.layout.fullbleed_article_layout : i == 11 ? R.layout.card_article_layout : i == 14 ? R.layout.news_article_layout : R.layout.compact_article_layout);
        jpfVar.a = new jmm(this, jozVar, i2);
        jpfVar.b = new jnq(this, jozVar, 7);
        return jpfVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, yft] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        joz jozVar = (joz) obj;
        jpf jpfVar = (jpf) obj2;
        int i = 11;
        int i2 = 10;
        if (this.c.a()) {
            yva yvaVar = ((kiz) this.d).a;
            o(yvaVar);
            int i3 = ((wqx) jozVar.b).c;
            if (i3 == 14) {
                wfo wfoVar = (wfo) yvaVar.d();
                if (!yks.e(jpfVar.n, wfoVar)) {
                    jpfVar.n = wfoVar;
                    jpfVar.G(11);
                }
            } else if (i3 == 10) {
                wfo wfoVar2 = (wfo) yvaVar.d();
                if (!yks.e(jpfVar.o, wfoVar2)) {
                    jpfVar.o = wfoVar2;
                    jpfVar.G(12);
                }
            }
        }
        jpfVar.F(((ixi) jozVar).a, new String[0]);
        wqx wqxVar = (wqx) jozVar.b;
        wlx wlxVar = wqxVar.d;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        if (!yks.e(jpfVar.d, wlxVar)) {
            jpfVar.d = wlxVar;
            jpfVar.G(1);
        }
        if (wqxVar.c == 14) {
            wls wlsVar = wqxVar.e;
            if (wlsVar == null) {
                wlsVar = wls.a;
            }
            if (!yks.e(jpfVar.f, wlsVar)) {
                jpfVar.f = wlsVar;
                jpfVar.G(3);
            }
        } else {
            wls wlsVar2 = wqxVar.e;
            if (wlsVar2 == null) {
                wlsVar2 = wls.a;
            }
            if (!yks.e(jpfVar.e, wlsVar2)) {
                jpfVar.e = wlsVar2;
                jpfVar.G(2);
            }
        }
        wls wlsVar3 = wqxVar.g;
        if (wlsVar3 == null) {
            wlsVar3 = wls.a;
        }
        if (!yks.e(jpfVar.h, wlsVar3)) {
            jpfVar.h = wlsVar3;
            jpfVar.G(5);
        }
        wls wlsVar4 = wqxVar.h;
        if (wlsVar4 == null) {
            wlsVar4 = wls.a;
        }
        if (!yks.e(jpfVar.i, wlsVar4)) {
            jpfVar.i = wlsVar4;
            jpfVar.G(6);
        }
        boolean z = jozVar.d;
        int i4 = 9;
        if (!yks.e(Boolean.valueOf(jpfVar.l), Boolean.valueOf(z))) {
            jpfVar.l = z;
            jpfVar.G(9);
        }
        int i5 = 8;
        int i6 = (wqxVar.b & 256) == 0 ? 8 : 0;
        if (!a.r(jpfVar.m, i6)) {
            jpfVar.m = i6;
            jpfVar.G(10);
        }
        scf scfVar = null;
        if ((wqxVar.b & 256) != 0 && jozVar.d) {
            scfVar = (scf) jozVar.e.a();
        }
        if (!yks.e(jpfVar.c, scfVar)) {
            jpfVar.c = scfVar;
            jpfVar.G(0);
        }
        jpfVar.j = new scc("R.id.article_card_component", jpfVar, new jla((Object) this, (ixi) jozVar, i5));
        jpfVar.G(7);
        jpfVar.g = new scc("R.id.heading_annotation", jpfVar, new jla((Object) this, (ixi) jozVar, i4));
        jpfVar.G(4);
        jpfVar.k = new scc("R.id.share_button", jpfVar, new jla((Object) this, (ixi) jozVar, i2));
        jpfVar.G(8);
        jpfVar.p = new scc("R.id.expand_more_button", jpfVar, new jla(jozVar, this, i));
        jpfVar.G(13);
        r().az(new ixz());
    }
}
