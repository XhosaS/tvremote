package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.videos.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class juk extends sbx {
    public final jaf a;
    public final irc b;
    private final hfw c;

    public juk(hfw hfwVar, irc ircVar, jaf jafVar) {
        ircVar.getClass();
        jafVar.getClass();
        this.c = hfwVar;
        this.b = ircVar;
        this.a = jafVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jui juiVar = (jui) obj;
        juo juoVar = new juo(this.c.a);
        juoVar.a = new jsi(this, juiVar, 7);
        juoVar.b = new jtt(this, juiVar, 3);
        return juoVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) throws Resources.NotFoundException {
        int i;
        String string;
        jui juiVar = (jui) obj;
        juo juoVar = (juo) obj2;
        juoVar.F(((ixi) juiVar).a, new String[0]);
        jxd jxdVar = new jxd(1);
        isi isiVar = (isi) juiVar.e;
        m(isiVar.b(jxdVar));
        iod iodVar = isiVar.i;
        vun vunVar = iodVar.d;
        wtz wtzVar = (wtz) juiVar.b;
        boolean z = (vunVar.contains(wtzVar.i) || iodVar.h.contains(wtzVar.i) || iodVar.c || iodVar.h.contains(wtzVar.i)) ? false : true;
        if (juoVar.o != z) {
            juoVar.o = z;
            Iterator it = juoVar.p.iterator();
            while (it.hasNext()) {
                ((sdd) it.next()).a();
            }
        }
        wls wlsVar = wtzVar.b;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(juoVar.c, wlsVar)) {
            juoVar.c = wlsVar;
            juoVar.G(0);
        }
        wls wlsVar2 = wtzVar.c;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(juoVar.d, wlsVar2)) {
            juoVar.d = wlsVar2;
            juoVar.G(1);
        }
        sco scoVar = new sco(wtzVar.f);
        if (!yks.e(juoVar.j, scoVar)) {
            juoVar.j = scoVar;
            juoVar.G(7);
        }
        boolean z2 = wtzVar.h;
        if (!yks.e(Boolean.valueOf(juoVar.n), Boolean.valueOf(z2))) {
            juoVar.n = z2;
            juoVar.G(11);
        }
        vun vunVar2 = wtzVar.d;
        vunVar2.getClass();
        Iterator<E> it2 = vunVar2.iterator();
        int i2 = 0;
        while (true) {
            i = 2;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                yfm.w();
            }
            wlx wlxVar = (wlx) next;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4 && !yks.e(juoVar.i, wlxVar)) {
                                juoVar.i = wlxVar;
                                juoVar.G(6);
                            }
                        } else if (!yks.e(juoVar.h, wlxVar)) {
                            juoVar.h = wlxVar;
                            juoVar.G(5);
                        }
                    } else if (!yks.e(juoVar.g, wlxVar)) {
                        juoVar.g = wlxVar;
                        juoVar.G(4);
                    }
                } else if (!yks.e(juoVar.f, wlxVar)) {
                    juoVar.f = wlxVar;
                    juoVar.G(3);
                }
            } else if (!yks.e(juoVar.e, wlxVar)) {
                juoVar.e = wlxVar;
                juoVar.G(2);
            }
            i2 = i3;
        }
        int iMin = wtzVar.e - Math.min(wtzVar.d.size(), 5);
        if (iMin > 0) {
            string = ((Context) juiVar.d).getResources().getString(R.string.setup_additional_icons_gtv, Integer.valueOf(iMin));
            string.getClass();
        } else {
            string = "";
        }
        sco scoVar2 = new sco(string);
        if (!yks.e(juoVar.k, scoVar2)) {
            juoVar.k = scoVar2;
            juoVar.G(8);
        }
        juoVar.l = new scc("R.id.setup_prompt_cta", juoVar, new jla((Object) this, (ixi) juiVar, 20));
        juoVar.G(9);
        juoVar.m = new scc("R.id.setup_dismiss", juoVar, new jub(juiVar, i));
        juoVar.G(10);
    }
}
