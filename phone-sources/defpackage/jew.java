package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jew extends sbx {
    public final jaf a;
    public final irc b;
    private final xiq c;
    private final cvw d;

    public jew(cvw cvwVar, irc ircVar, jaf jafVar, xiq xiqVar) {
        ircVar.getClass();
        jafVar.getClass();
        this.d = cvwVar;
        this.b = ircVar;
        this.a = jafVar;
        this.c = xiqVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jfa jfaVar = new jfa(this.d.a);
        int i = 0;
        jfaVar.a = new jeu(this, ixiVar, i);
        jfaVar.b = new jev(this, ixiVar, i);
        return jfaVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        jfa jfaVar = (jfa) obj2;
        jfaVar.F(ixiVar.a, new String[0]);
        wrc wrcVar = (wrc) ixiVar.b;
        wls wlsVar = wrcVar.d;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jfaVar.c, wlsVar)) {
            jfaVar.c = wlsVar;
            jfaVar.G(0);
        }
        jfaVar.d = new scc("R.id.browse_card_component", jfaVar, new iut((sbx) this, (Object) ixiVar, 6));
        jfaVar.G(1);
        if ((wrcVar.b & 32) != 0) {
            wlx wlxVar = wrcVar.h;
            if (wlxVar == null) {
                wlxVar = wlx.a;
            }
            if (!yks.e(jfaVar.e, wlxVar)) {
                jfaVar.e = wlxVar;
                jfaVar.G(2);
            }
        } else {
            int iAL = a.aL(wrcVar.c);
            if (iAL == 0) {
                iAL = 1;
            }
            int i = iAL - 1;
            int i2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? R.drawable.empty : R.drawable.ic_language_24dp : R.drawable.ic_family_24dp : R.drawable.ic_shows_24dp : R.drawable.ic_movies_24dp;
            if (!a.r(jfaVar.f, i2)) {
                jfaVar.f = i2;
                jfaVar.G(3);
            }
        }
        if (((Boolean) xir.a.et(((xir) this.c).b)).booleanValue()) {
            return;
        }
        wkv wkvVar = wrcVar.f;
        if (wkvVar == null) {
            wkvVar = wkv.a;
        }
        if (!yks.e(jfaVar.h, wkvVar)) {
            jfaVar.h = wkvVar;
            jfaVar.G(5);
        }
        wkv wkvVar2 = wrcVar.g;
        if (wkvVar2 == null) {
            wkvVar2 = wkv.a;
        }
        if (yks.e(jfaVar.g, wkvVar2)) {
            return;
        }
        jfaVar.g = wkvVar2;
        jfaVar.G(4);
    }
}
