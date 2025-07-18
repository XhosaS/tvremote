package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
import defpackage.a;
import defpackage.adp;
import defpackage.bug;
import defpackage.buh;
import defpackage.bui;
import defpackage.buj;
import defpackage.buk;
import defpackage.bul;
import defpackage.buu;
import defpackage.bvc;
import defpackage.bvg;
import defpackage.bvk;
import defpackage.dy;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FragmentTransitionSupport extends dy {
    private static boolean A(bvc bvcVar) {
        return (y(bvcVar.c) && y(null) && y(null)) ? false : true;
    }

    @Override // defpackage.dy
    public final Object a(Object obj) {
        if (obj != null) {
            return ((bvc) obj).clone();
        }
        return null;
    }

    @Override // defpackage.dy
    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        bvk bvkVar = new bvk();
        bvkVar.g((bvc) obj);
        return bvkVar;
    }

    @Override // defpackage.dy
    public final void c(Object obj, View view) {
        ((bvc) obj).G(view);
    }

    @Override // defpackage.dy
    public final void d(Object obj, ArrayList arrayList) {
        bvc bvcVar = (bvc) obj;
        if (bvcVar == null) {
            return;
        }
        int i = 0;
        if (bvcVar instanceof bvk) {
            bvk bvkVar = (bvk) bvcVar;
            int size = bvkVar.u.size();
            while (i < size) {
                d(bvkVar.f(i), arrayList);
                i++;
            }
            return;
        }
        if (A(bvcVar) || !y(bvcVar.d)) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            bvcVar.G((View) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.dy
    public final void e(ViewGroup viewGroup, Object obj) {
        bvc bvcVar = (bvc) obj;
        ArrayList arrayList = bvg.b;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (bvcVar == null) {
            bvcVar = bvg.a;
        }
        bvc bvcVarClone = bvcVar.clone();
        bvg.c(viewGroup, bvcVarClone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        bvg.b(viewGroup, bvcVarClone);
    }

    public final void f(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        bvc bvcVar = (bvc) obj;
        int i = 0;
        if (bvcVar instanceof bvk) {
            bvk bvkVar = (bvk) bvcVar;
            int size = bvkVar.u.size();
            while (i < size) {
                f(bvkVar.f(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(bvcVar)) {
            return;
        }
        ArrayList arrayList3 = bvcVar.d;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            bvcVar.G((View) arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                bvcVar.I((View) arrayList.get(size3));
            }
        }
    }

    @Override // defpackage.dy
    public final void g(Object obj, View view, ArrayList arrayList) {
        ((bvc) obj).F(new bui(view, arrayList));
    }

    @Override // defpackage.dy
    public final void h(Object obj, Rect rect) {
        ((bvc) obj).z(new bul());
    }

    @Override // defpackage.dy
    public final void i(Object obj, View view) {
        if (view != null) {
            w(view, new Rect());
            ((bvc) obj).z(new buh());
        }
    }

    @Override // defpackage.dy
    public final void j(Object obj, View view, ArrayList arrayList) {
        bvk bvkVar = (bvk) obj;
        ArrayList arrayList2 = bvkVar.d;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        d(bvkVar, arrayList);
    }

    @Override // defpackage.dy
    public final void k(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        bvk bvkVar = (bvk) obj;
        if (bvkVar != null) {
            ArrayList arrayList3 = bvkVar.d;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            f(bvkVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.dy
    public final boolean l(Object obj) {
        return obj instanceof bvc;
    }

    @Override // defpackage.dy
    public final boolean m() {
        return true;
    }

    @Override // defpackage.dy
    public final boolean n(Object obj) {
        boolean zD = ((bvc) obj).d();
        if (!zD) {
            Log.v("FragmentManager", a.c(obj, "Predictive back not available for AndroidX Transition ", ". Please enable seeking support for the designated transition by overriding isSeekingSupported()."));
        }
        return zD;
    }

    @Override // defpackage.dy
    public final Object o(Object obj, Object obj2) {
        bvk bvkVar = new bvk();
        if (obj != null) {
            bvkVar.g((bvc) obj);
        }
        bvkVar.g((bvc) obj2);
        return bvkVar;
    }

    @Override // defpackage.dy
    public final void p(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((bvc) obj).F(new buj(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.dy
    public final void q(Object obj, adp adpVar, Runnable runnable) {
        z(obj, adpVar, null, runnable);
    }

    @Override // defpackage.dy
    public final Object r(Object obj, Object obj2) {
        bvc bvcVar = (bvc) obj;
        bvc bvcVar2 = (bvc) obj2;
        if (bvcVar == null) {
            bvcVar = null;
        }
        if (bvcVar2 == null) {
            return bvcVar;
        }
        bvk bvkVar = new bvk();
        if (bvcVar != null) {
            bvkVar.g(bvcVar);
        }
        bvkVar.g(bvcVar2);
        return bvkVar;
    }

    @Override // defpackage.dy
    public final Object s(ViewGroup viewGroup, Object obj) {
        bvc bvcVar = (bvc) obj;
        ArrayList arrayList = bvg.b;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!bvcVar.d()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        bvc bvcVarClone = bvcVar.clone();
        bvk bvkVar = new bvk();
        bvkVar.g(bvcVarClone);
        bvg.c(viewGroup, bvkVar);
        viewGroup.setTag(R.id.transition_current_scene, null);
        bvg.b(viewGroup, bvkVar);
        viewGroup.invalidate();
        bvkVar.s = new buu(bvkVar);
        bvkVar.F(bvkVar.s);
        return bvkVar.s;
    }

    @Override // defpackage.dy
    public final void t(Object obj) {
        ((buu) obj).h();
    }

    @Override // defpackage.dy
    public final void u(Object obj, Runnable runnable) {
        ((buu) obj).i(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    @Override // defpackage.dy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.lang.Object r14, float r15) {
        /*
            r13 = this;
            buu r14 = (defpackage.buu) r14
            boolean r0 = r14.b
            if (r0 == 0) goto L5f
            bvc r0 = r14.h
            long r1 = r0.r
            float r3 = (float) r1
            float r15 = r15 * r3
            long r3 = (long) r15
            r5 = 0
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 1
            if (r15 != 0) goto L16
            r3 = r7
        L16:
            int r15 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r9 = -1
            if (r15 != 0) goto L1e
            long r3 = r1 + r9
        L1e:
            aqn r15 = r14.e
            if (r15 != 0) goto L57
            long r11 = r14.a
            int r15 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r15 == 0) goto L5f
            boolean r15 = r14.c
            if (r15 != 0) goto L4c
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 != 0) goto L35
            int r15 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r15 <= 0) goto L36
            goto L42
        L35:
            r5 = r3
        L36:
            int r15 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r15 != 0) goto L41
            int r15 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r15 >= 0) goto L41
            long r9 = r1 + r7
            goto L42
        L41:
            r9 = r5
        L42:
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 == 0) goto L4b
            r0.y(r9, r11)
            r14.a = r9
        L4b:
            r3 = r9
        L4c:
            bvn r14 = r14.f
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r15 = (float) r3
            r14.b(r0, r15)
            return
        L57:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "setCurrentPlayTimeMillis() called after animation has been started"
            r14.<init>(r15)
            throw r14
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.FragmentTransitionSupport.x(java.lang.Object, float):void");
    }

    @Override // defpackage.dy
    public final void z(Object obj, adp adpVar, Runnable runnable, Runnable runnable2) {
        bvc bvcVar = (bvc) obj;
        bug bugVar = new bug(runnable, bvcVar, runnable2);
        synchronized (adpVar) {
            while (adpVar.b) {
                try {
                    adpVar.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (adpVar.c != bugVar) {
                adpVar.c = bugVar;
                if (adpVar.a) {
                    bugVar.a();
                }
            }
        }
        bvcVar.F(new buk(runnable2));
    }
}
