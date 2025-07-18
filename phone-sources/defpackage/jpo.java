package defpackage;

import com.google.android.videos.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpo extends sbx {
    public final jaf a;
    public final pjx b;
    public final irc c;
    private final ihg d;
    private final kja e;
    private final dxc f;

    public jpo(dxc dxcVar, irc ircVar, jaf jafVar, pjx pjxVar, lfn lfnVar, ihg ihgVar, kja kjaVar) {
        ircVar.getClass();
        jafVar.getClass();
        lfnVar.getClass();
        kjaVar.getClass();
        this.f = dxcVar;
        this.c = ircVar;
        this.a = jafVar;
        this.b = pjxVar;
        this.d = ihgVar;
        this.e = kjaVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* synthetic */ Object a(Object obj) {
        int iAV;
        jry jryVar = (jry) obj;
        boolean zA = this.d.a();
        int i = R.layout.info_banner_card_view_layout;
        if (zA) {
            wsy wsyVar = (wsy) jryVar.b;
            int i2 = 1;
            if (wsyVar.c == 3 && (iAV = a.aV(((Integer) wsyVar.d).intValue())) != 0) {
                i2 = iAV;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                i = R.layout.info_banner_title_unavailable_card_view_layout;
            } else if (i3 == 5) {
                i = R.layout.info_banner_movies_card_view_layout;
            }
        }
        jps jpsVar = new jps(this.f.a, i);
        jpsVar.a = new jmm(this, jryVar, 13);
        jpsVar.b = new jnq(this, jryVar, 9);
        return jpsVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        int iAV;
        jry jryVar = (jry) obj;
        jps jpsVar = (jps) obj2;
        int i = 0;
        jpsVar.F(((ixi) jryVar).a, new String[0]);
        iwg iwgVar = new iwg(18);
        isi isiVar = (isi) jryVar.d;
        m(isiVar.b(iwgVar));
        iod iodVar = isiVar.i;
        vun vunVar = iodVar.h;
        wsy wsyVar = (wsy) jryVar.b;
        vun vunVar2 = wsyVar.k;
        vunVar2.getClass();
        boolean zContainsAll = vunVar.containsAll(vunVar2);
        int i2 = 1;
        boolean z = zContainsAll && !iodVar.h.contains(wsyVar.j);
        if (jpsVar.n != z) {
            jpsVar.n = z;
            Iterator it = jpsVar.o.iterator();
            while (it.hasNext()) {
                ((sdd) it.next()).a();
            }
        }
        wls wlsVar = wsyVar.e;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jpsVar.c, wlsVar)) {
            jpsVar.c = wlsVar;
            jpsVar.G(0);
        }
        wls wlsVar2 = wsyVar.f;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(jpsVar.d, wlsVar2)) {
            jpsVar.d = wlsVar2;
            jpsVar.G(1);
        }
        boolean z2 = wsyVar.i;
        if (!yks.e(Boolean.valueOf(jpsVar.h), Boolean.valueOf(z2))) {
            jpsVar.h = z2;
            jpsVar.G(5);
        }
        jpsVar.e = new scc("R.id.dismiss", jpsVar, new ius(jryVar, 20));
        jpsVar.G(2);
        boolean zI = jryVar.i();
        if (!yks.e(Boolean.valueOf(jpsVar.k), Boolean.valueOf(zI))) {
            jpsVar.k = zI;
            jpsVar.G(8);
        }
        if (jryVar.i()) {
            sco scoVar = new sco(wsyVar.g);
            if (!yks.e(jpsVar.f, scoVar)) {
                jpsVar.f = scoVar;
                jpsVar.G(3);
            }
            jpsVar.g = new scc("R.id.info_banner_card_cta", jpsVar, new jla((Object) this, (ixi) jryVar, 12));
            jpsVar.G(4);
        }
        int i3 = wsyVar.c;
        if (i3 == 3) {
            int iAV2 = a.aV(((Integer) wsyVar.d).intValue());
            if (iAV2 == 0) {
                iAV2 = 1;
            }
            int i4 = iAV2 - 1;
            if (i4 == 1) {
                i = R.drawable.ic_info_banner_whats_new;
            } else if (i4 == 2) {
                i = R.drawable.ic_info_banner_library;
            } else if (i4 == 3) {
                i = R.drawable.ic_info_banner_highlights;
            } else if (i4 == 4) {
                i = R.drawable.ic_info_banner_watchlist;
            } else if (i4 == 5) {
                i = R.drawable.ic_movie_filter_24dp;
            }
            if (!a.r(jpsVar.i, i)) {
                jpsVar.i = i;
                jpsVar.G(6);
            }
        } else if (i3 == 4) {
            wlx wlxVar = (wlx) wsyVar.d;
            if (!yks.e(jpsVar.j, wlxVar)) {
                jpsVar.j = wlxVar;
                jpsVar.G(7);
            }
        }
        if (this.d.a()) {
            yva yvaVar = ((kiz) this.e).a;
            o(yvaVar);
            wfo wfoVar = (wfo) yvaVar.d();
            if (wsyVar.c == 3 && (iAV = a.aV(((Integer) wsyVar.d).intValue())) != 0) {
                i2 = iAV;
            }
            int i5 = i2 - 1;
            if (i5 == 0) {
                if (yks.e(jpsVar.m, wfoVar)) {
                    return;
                }
                jpsVar.m = wfoVar;
                jpsVar.G(10);
                return;
            }
            if (i5 == 5 && !yks.e(jpsVar.l, wfoVar)) {
                jpsVar.l = wfoVar;
                jpsVar.G(9);
            }
        }
    }
}
