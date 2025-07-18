package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ctl;
import defpackage.dg;
import defpackage.gjl;
import defpackage.gjm;
import defpackage.gjn;
import defpackage.gjq;
import defpackage.gju;
import defpackage.gjy;
import defpackage.gkc;
import defpackage.gli;
import defpackage.gmz;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FragmentTransitionSupport extends dg {
    private static boolean A(gju gjuVar) {
        return (x(gjuVar.d) && x(null) && x(null)) ? false : true;
    }

    @Override // defpackage.dg
    public final Object a(Object obj) {
        if (obj != null) {
            return ((gju) obj).clone();
        }
        return null;
    }

    @Override // defpackage.dg
    public final Object b(Object obj, Object obj2, Object obj3) {
        gju gjuVar = (gju) obj;
        gju gjuVar2 = (gju) obj2;
        gju gjuVar3 = (gju) obj3;
        if (gjuVar != null && gjuVar2 != null) {
            gkc gkcVar = new gkc();
            gkcVar.P(gjuVar);
            gkcVar.P(gjuVar2);
            gkcVar.R(1);
            gjuVar = gkcVar;
        } else if (gjuVar == null) {
            gjuVar = gjuVar2 != null ? gjuVar2 : null;
        }
        if (gjuVar3 == null) {
            return gjuVar;
        }
        gkc gkcVar2 = new gkc();
        if (gjuVar != null) {
            gkcVar2.P(gjuVar);
        }
        gkcVar2.P(gjuVar3);
        return gkcVar2;
    }

    @Override // defpackage.dg
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        gkc gkcVar = new gkc();
        gkcVar.P((gju) obj);
        return gkcVar;
    }

    @Override // defpackage.dg
    public final void d(Object obj, View view) {
        ((gju) obj).D(view);
    }

    @Override // defpackage.dg
    public final void e(Object obj, ArrayList arrayList) {
        gju gjuVar = (gju) obj;
        if (gjuVar == null) {
            return;
        }
        int i = 0;
        if (gjuVar instanceof gkc) {
            gkc gkcVar = (gkc) gjuVar;
            int iF = gkcVar.f();
            while (i < iF) {
                e(gkcVar.g(i), arrayList);
                i++;
            }
            return;
        }
        if (A(gjuVar) || !x(gjuVar.e)) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            gjuVar.D((View) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.dg
    public final void f(ViewGroup viewGroup, Object obj) {
        gjy.c(viewGroup, (gju) obj);
    }

    public final void g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        gju gjuVar = (gju) obj;
        int i = 0;
        if (gjuVar instanceof gkc) {
            gkc gkcVar = (gkc) gjuVar;
            int iF = gkcVar.f();
            while (i < iF) {
                g(gkcVar.g(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(gjuVar)) {
            return;
        }
        ArrayList arrayList3 = gjuVar.e;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            gjuVar.D((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                gjuVar.H((View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.dg
    public final void h(Object obj, View view, ArrayList arrayList) {
        ((gju) obj).C(new gjl(view, arrayList));
    }

    @Override // defpackage.dg
    public final void i(Object obj, Rect rect) {
        ((gju) obj).M(new gli());
    }

    @Override // defpackage.dg
    public final void j(Object obj, View view) {
        if (view != null) {
            y(view, new Rect());
            ((gju) obj).M(new gli());
        }
    }

    @Override // defpackage.dg
    public final void k(Object obj, View view, ArrayList arrayList) {
        gkc gkcVar = (gkc) obj;
        ArrayList arrayList2 = gkcVar.e;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        e(gkcVar, arrayList);
    }

    @Override // defpackage.dg
    public final void l(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        gkc gkcVar = (gkc) obj;
        if (gkcVar != null) {
            ArrayList arrayList3 = gkcVar.e;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            g(gkcVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.dg
    public final boolean m(Object obj) {
        return obj instanceof gju;
    }

    @Override // defpackage.dg
    public final boolean n() {
        return true;
    }

    @Override // defpackage.dg
    public final boolean o(Object obj) {
        boolean zD = ((gju) obj).d();
        if (!zD) {
            Objects.toString(obj);
        }
        return zD;
    }

    @Override // defpackage.dg
    public final Object p(Object obj, Object obj2) {
        gkc gkcVar = new gkc();
        if (obj != null) {
            gkcVar.P((gju) obj);
        }
        gkcVar.P((gju) obj2);
        return gkcVar;
    }

    @Override // defpackage.dg
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((gju) obj).C(new gjm(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.dg
    public final void r(Object obj, ctl ctlVar, Runnable runnable) {
        z(obj, ctlVar, null, runnable);
    }

    @Override // defpackage.dg
    public final Object s(ViewGroup viewGroup, Object obj) {
        gju gjuVar = (gju) obj;
        ArrayList arrayList = gjy.a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!gjuVar.d()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        gju gjuVarClone = gjuVar.clone();
        gkc gkcVar = new gkc();
        gkcVar.P(gjuVarClone);
        gjy.e(viewGroup, gkcVar);
        gli.k(viewGroup);
        gjy.d(viewGroup, gkcVar);
        viewGroup.invalidate();
        gkcVar.p = new gjq(gkcVar);
        gkcVar.C(gkcVar.p);
        return gkcVar.p;
    }

    @Override // defpackage.dg
    public final void t(Object obj) {
        ((gjq) obj).i();
    }

    @Override // defpackage.dg
    public final void u(Object obj, Runnable runnable) {
        ((gjq) obj).j(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    @Override // defpackage.dg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.lang.Object r11, float r12) {
        /*
            r10 = this;
            gjq r11 = (defpackage.gjq) r11
            boolean r0 = r11.b
            if (r0 == 0) goto L6c
            long r0 = r11.h()
            float r0 = (float) r0
            float r12 = r12 * r0
            long r0 = (long) r12
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 1
            if (r12 != 0) goto L16
            r0 = r4
        L16:
            long r6 = r11.h()
            int r12 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r6 = -1
            if (r12 != 0) goto L25
            long r0 = r11.h()
            long r0 = r0 + r6
        L25:
            dhb r12 = r11.g
            if (r12 != 0) goto L64
            long r8 = r11.a
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r12 == 0) goto L6c
            boolean r12 = r11.c
            if (r12 != 0) goto L59
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L3c
            int r12 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r12 <= 0) goto L3d
            goto L4d
        L3c:
            r2 = r0
        L3d:
            long r0 = r11.h()
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 != 0) goto L4c
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 >= 0) goto L4c
            long r6 = r0 + r4
            goto L4d
        L4c:
            r6 = r2
        L4d:
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 == 0) goto L58
            gju r12 = r11.f
            r12.x(r6, r8)
            r11.a = r6
        L58:
            r0 = r6
        L59:
            nuh r11 = r11.h
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r12 = (float) r0
            r11.h(r2, r12)
            return
        L64:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "setCurrentPlayTimeMillis() called after animation has been started"
            r11.<init>(r12)
            throw r11
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.FragmentTransitionSupport.w(java.lang.Object, float):void");
    }

    @Override // defpackage.dg
    public final void z(Object obj, ctl ctlVar, Runnable runnable, Runnable runnable2) {
        gju gjuVar = (gju) obj;
        gmz gmzVar = new gmz(runnable, gjuVar, runnable2);
        synchronized (ctlVar) {
            while (ctlVar.c) {
                try {
                    ctlVar.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (ctlVar.d != gmzVar) {
                ctlVar.d = gmzVar;
                if (ctlVar.a) {
                    gmzVar.a();
                }
            }
        }
        gjuVar.C(new gjn(runnable2));
    }
}
