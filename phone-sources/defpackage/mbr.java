package defpackage;

import android.content.Intent;
import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbr implements idy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public mbr(Object obj, Object obj2, int i) {
        this.b = i;
        this.a = obj;
        this.c = obj2;
    }

    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        int i = this.b;
        if (i == 0) {
            Intent intent = new Intent(((ieg) obj).m() ? ((mbs) this.a).b : ((mbs) this.a).c);
            ksn ksnVar = (ksn) this.c;
            Intent intentPutExtra = intent.putExtra("authAccount", ksnVar.a);
            mbs mbsVar = (mbs) this.a;
            mbsVar.a.c(intentPutExtra);
            mbsVar.b(ksnVar);
            return;
        }
        if (i == 1) {
            ieg iegVar = (ieg) obj;
            if (!iegVar.m()) {
                ((lkp) this.a).f((kwx) this.c, iegVar.i());
                return;
            }
            Object obj2 = this.a;
            Object obj3 = this.c;
            Subtitles subtitles = (Subtitles) iegVar.g();
            lkp lkpVar = (lkp) obj2;
            if (a.Q(obj3, lkpVar.F)) {
                lkpVar.V.l(subtitles);
                lnr lnrVar = lkpVar.o;
                a.ab(lnrVar.q);
                int iO = lnrVar.O();
                Iterator it = lnrVar.o.iterator();
                while (it.hasNext()) {
                    ((lnn) it.next()).l(iO, (kwx) obj3);
                }
                return;
            }
            return;
        }
        ieg iegVar2 = (ieg) obj;
        if (!iegVar2.m()) {
            mrt mrtVar = (mrt) this.a;
            if (mrtVar.f != this.c) {
                mrtVar.a();
                return;
            }
            mrtVar.f = null;
            int i2 = mrtVar.g;
            if (i2 == 2) {
                mrtVar.h(mrtVar.e != null ? 3 : 5);
                return;
            } else if (i2 == 3) {
                mrtVar.h(4);
                return;
            } else {
                if (i2 != 4) {
                    return;
                }
                mrtVar.h(5);
                return;
            }
        }
        rin rinVar = (rin) iegVar2.g();
        Object obj4 = this.c;
        mrt mrtVar2 = (mrt) this.a;
        lck lckVar = mrtVar2.d;
        maj majVar = (maj) obj4;
        Object obj5 = majVar.d;
        if (obj5 == lckVar) {
            mrtVar2.i = rinVar;
            return;
        }
        maj majVar2 = mrtVar2.f;
        if (majVar2 == null) {
            rin.n(rinVar);
            return;
        }
        if (mrtVar2.i != null && obj4 != majVar2) {
            rin.n(rinVar);
            mrtVar2.a();
            return;
        }
        int i3 = majVar.a;
        lck lckVar2 = (lck) obj5;
        mrtVar2.j(lckVar2, i3);
        if (!rin.o(mrtVar2.h, rinVar)) {
            rin rinVar2 = mrtVar2.h;
            mrtVar2.h = rinVar;
            mrtVar2.i(lckVar2, i3, rinVar.a());
            rin.n(rinVar2);
        }
        if (mrtVar2.f != obj4) {
            mrtVar2.a();
        } else {
            mrtVar2.f = null;
            mrtVar2.b();
        }
    }
}
