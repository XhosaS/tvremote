package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.videos.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class juc extends sbx {
    public final jaf a;
    private final hfw b;

    public juc(hfw hfwVar, jaf jafVar) {
        jafVar.getClass();
        this.b = hfwVar;
        this.a = jafVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jtz jtzVar = (jtz) obj;
        jug jugVar = new jug(this.b.a);
        jugVar.a = new jsi(this, jtzVar, 6);
        jugVar.b = new jtt(this, jtzVar, 2);
        return jugVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) throws Resources.NotFoundException {
        String string;
        jtz jtzVar = (jtz) obj;
        jug jugVar = (jug) obj2;
        int i = 0;
        jugVar.F(((ixi) jtzVar).a, new String[0]);
        iwg iwgVar = new iwg(20);
        isi isiVar = (isi) jtzVar.e;
        m(isiVar.b(iwgVar));
        iod iodVar = isiVar.i;
        vun vunVar = iodVar.e;
        wty wtyVar = (wty) jtzVar.b;
        boolean z = (vunVar.contains(wtyVar.g) || iodVar.h.contains(wtyVar.g) || !iodVar.c || iodVar.h.contains(wtyVar.g)) ? false : true;
        if (jugVar.m != z) {
            jugVar.m = z;
            Iterator it = jugVar.n.iterator();
            while (it.hasNext()) {
                ((sdd) it.next()).a();
            }
        }
        wls wlsVar = wtyVar.b;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jugVar.c, wlsVar)) {
            jugVar.c = wlsVar;
            jugVar.G(0);
        }
        wls wlsVar2 = wtyVar.c;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(jugVar.d, wlsVar2)) {
            jugVar.d = wlsVar2;
            jugVar.G(1);
        }
        boolean z2 = wtyVar.f;
        if (!yks.e(Boolean.valueOf(jugVar.l), Boolean.valueOf(z2))) {
            jugVar.l = z2;
            jugVar.G(9);
        }
        vun vunVar2 = wtyVar.d;
        vunVar2.getClass();
        int i2 = 0;
        for (Object obj3 : vunVar2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                yfm.w();
            }
            wlx wlxVar = (wlx) obj3;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4 && !yks.e(jugVar.i, wlxVar)) {
                                jugVar.i = wlxVar;
                                jugVar.G(6);
                            }
                        } else if (!yks.e(jugVar.h, wlxVar)) {
                            jugVar.h = wlxVar;
                            jugVar.G(5);
                        }
                    } else if (!yks.e(jugVar.g, wlxVar)) {
                        jugVar.g = wlxVar;
                        jugVar.G(4);
                    }
                } else if (!yks.e(jugVar.f, wlxVar)) {
                    jugVar.f = wlxVar;
                    jugVar.G(3);
                }
            } else if (!yks.e(jugVar.e, wlxVar)) {
                jugVar.e = wlxVar;
                jugVar.G(2);
            }
            i2 = i3;
        }
        int iMin = wtyVar.e - Math.min(wtyVar.d.size(), 5);
        if (iMin > 0) {
            string = ((Context) jtzVar.d).getResources().getString(R.string.setup_additional_icons_gtv, Integer.valueOf(iMin));
            string.getClass();
        } else {
            string = "";
        }
        sco scoVar = new sco(string);
        if (!yks.e(jugVar.j, scoVar)) {
            jugVar.j = scoVar;
            jugVar.G(7);
        }
        jugVar.k = new scc("R.id.setup_dismiss", jugVar, new jub(jtzVar, i));
        jugVar.G(8);
    }
}
