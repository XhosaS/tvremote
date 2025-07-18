package defpackage;

import android.content.Context;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class joa extends sbx {
    public final jaf a;
    public final iea b;
    public final isw c;
    public final iyz d;
    public final irc e;
    private final xhg f;
    private final ihg g;
    private final Context h;
    private final yow i;
    private final dhq j;

    public joa(dhq dhqVar, irc ircVar, isw iswVar, jaf jafVar, xhg xhgVar, jwq jwqVar, iea ieaVar, ihg ihgVar, Context context, iyz iyzVar, isf isfVar, yow yowVar, kjc kjcVar) {
        ircVar.getClass();
        iswVar.getClass();
        jafVar.getClass();
        jwqVar.getClass();
        iyzVar.getClass();
        isfVar.getClass();
        kjcVar.getClass();
        this.j = dhqVar;
        this.e = ircVar;
        this.c = iswVar;
        this.a = jafVar;
        this.f = xhgVar;
        this.b = ieaVar;
        this.g = ihgVar;
        this.h = context;
        this.d = iyzVar;
        this.i = yowVar;
        int i = context.getResources().getDisplayMetrics().densityDpi;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jnz jnzVar = (jnz) obj;
        boolean z = false;
        if (this.f.b()) {
            Context context = this.h;
            if (!jwq.g(context) && jwq.f(context)) {
                z = true;
            }
        }
        dhq dhqVar = this.j;
        int i = ((wsd) jnzVar.b).d;
        int i2 = R.layout.featured_carousel_immersive_card_view_layout;
        if (i == 15) {
            if (z) {
                i2 = R.layout.featured_carousel_portrait_immersive_card_view_layout;
            }
        } else if (i != 15) {
            i2 = R.layout.featured_carousel_card_view_layout;
        }
        jod jodVar = new jod(dhqVar.a, i2);
        jodVar.a = new jmm(this, jnzVar, 7);
        jodVar.b = new jnq(this, jnzVar, 3);
        return jodVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        joa joaVar;
        jnz jnzVar = (jnz) obj;
        String str = ((ixi) jnzVar).a;
        jod jodVar = (jod) obj2;
        jodVar.F(str, new String[0]);
        if (!yks.e(jodVar.t, str)) {
            jodVar.t = str;
            jodVar.G(18);
        }
        wsd wsdVar = (wsd) jnzVar.b;
        wls wlsVar = wsdVar.g;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jodVar.k, wlsVar)) {
            jodVar.k = wlsVar;
            jodVar.G(9);
        }
        wls wlsVar2 = wsdVar.h;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(jodVar.l, wlsVar2)) {
            jodVar.l = wlsVar2;
            jodVar.G(10);
        }
        wlx wlxVar = wsdVar.f;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        if (!yks.e(jodVar.c, wlxVar)) {
            jodVar.c = wlxVar;
            jodVar.G(0);
        }
        wls wlsVar3 = wsdVar.m;
        if (wlsVar3 == null) {
            wlsVar3 = wls.a;
        }
        if (!yks.e(jodVar.u, wlsVar3)) {
            jodVar.u = wlsVar3;
            jodVar.G(19);
        }
        ihg ihgVar = this.g;
        if (ihgVar.b() && this.f.b()) {
            int i = igw.a;
            jodVar.r(Integer.valueOf(igw.a));
        } else {
            Integer numValueOf = (wsdVar.d == 15 && this.f.b()) ? Integer.valueOf(R.drawable.fc_gradient_portrait_immersive) : wsdVar.d == 15 ? Integer.valueOf(R.drawable.fc_gradient_immersive) : Integer.valueOf(R.drawable.fc_gradient);
            if (!yks.e(jodVar.f, numValueOf)) {
                jodVar.f = numValueOf;
                jodVar.G(3);
            }
        }
        if (ihgVar.b()) {
            joaVar = this;
            ykr.q(this.i, null, 0, new ixs(joaVar, jnzVar, jodVar, (yih) null, 11), 3);
        } else {
            joaVar = this;
        }
        jodVar.v = new scc("R.id.badge", jodVar, new jla((Object) this, (ixi) jnzVar, 4));
        jodVar.G(20);
        int i2 = wsdVar.b;
        int i3 = 5;
        wlx wlxVar2 = (i2 == 5 || i2 == 10) ? (wlx) wsdVar.c : wlx.a;
        wlxVar2.getClass();
        if (!yks.e(jodVar.d, wlxVar2)) {
            jodVar.d = wlxVar2;
            jodVar.G(1);
        }
        if (wlxVar2.b == 1) {
            float f = ((wlu) wlxVar2.c).c;
            if (!sfy.i(jodVar.e, f)) {
                jodVar.e = f;
                jodVar.G(2);
            }
        }
        String str2 = wsdVar.j;
        if (!yks.e(jodVar.q, str2)) {
            jodVar.q = str2;
            jodVar.G(15);
        }
        if (wsdVar.i) {
            isw iswVar = joaVar.c;
            wll wllVar = wsdVar.l;
            if (wllVar == null) {
                wllVar = wll.a;
            }
            wllVar.getClass();
            ldy ldyVar = (ldy) joaVar.b;
            m(iswVar.b(new iog(wllVar, ((ksn) ldyVar.a().g()).a)));
            wll wllVar2 = wsdVar.l;
            if (wllVar2 == null) {
                wllVar2 = wll.a;
            }
            wllVar2.getClass();
            jodVar.s(Boolean.valueOf(iswVar.t(new iog(wllVar2, ((ksn) ldyVar.a().g()).a))));
            jodVar.p = new scc("R.id.fc_watch_list_icon", jodVar, new jla((Object) this, (ixi) jnzVar, i3));
            jodVar.G(14);
        } else {
            jodVar.s(null);
        }
        if (ihgVar.b()) {
            wls wlsVar4 = (wsdVar.d == 15 ? (wsc) wsdVar.e : wsc.a).c;
            if (wlsVar4 == null) {
                wlsVar4 = wls.a;
            }
            if (!yks.e(jodVar.n, wlsVar4)) {
                jodVar.n = wlsVar4;
                jodVar.G(12);
            }
        } else {
            wls wlsVar5 = (wsdVar.d == 15 ? (wsc) wsdVar.e : wsc.a).c;
            if (wlsVar5 == null) {
                wlsVar5 = wls.a;
            }
            if (!yks.e(jodVar.m, wlsVar5)) {
                jodVar.m = wlsVar5;
                jodVar.G(11);
            }
        }
        jodVar.r = new scc("R.id.featured_carousel_card_component", jodVar, new jla((Object) this, (ixi) jnzVar, 6));
        jodVar.G(16);
        jodVar.s = new scc("R.id.action_button", jodVar, new jla((Object) this, (ixi) jnzVar, 7));
        jodVar.G(17);
    }
}
