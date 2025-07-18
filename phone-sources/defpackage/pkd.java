package defpackage;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkd implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener, pks {
    private static final tui g = tui.l("com/google/android/libraries/logging/ve/ViewNode");
    public final View a;
    public final pju b;
    public ViewGroup c;
    public final pnw d;
    public final pkg f;
    private pju h;
    private List i;
    private final ViewTreeObserver.OnDrawListener p;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private pju m = null;
    private int q = 2;
    private final Rect n = new Rect();
    public Runnable e = null;
    private boolean o = false;

    public pkd(View view, pju pjuVar) {
        this.a = view;
        this.b = pjuVar;
        this.f = pjuVar.f;
        pnw pnwVar = (pnw) pjuVar.e.bI(pnv.a);
        this.d = pnwVar;
        int iBm = a.bm(pnwVar.b);
        if (iBm != 0 && iBm == 3) {
            this.p = new ViewTreeObserver.OnDrawListener() { // from class: pkc
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    pkd pkdVar = this.a;
                    if (pkdVar.c.isDirty() && pkdVar.e == null) {
                        pkdVar.e = new nur(pkdVar, 16);
                        sjl.d(pkdVar.e, pkdVar.d.c);
                    }
                }
            };
        } else {
            this.p = null;
        }
    }

    public static View a(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    public static View b(pju pjuVar) {
        pks pksVar = pjuVar.c;
        if (pksVar instanceof pkd) {
            return ((pkd) pksVar).a;
        }
        return null;
    }

    public static pju c(View view) {
        return (pju) view.getTag(com.google.android.videos.R.id.ve_tag);
    }

    public static boolean p(View view) {
        return view.getId() == 16908290;
    }

    private final void s() {
        Runnable runnable = this.e;
        if (runnable != null) {
            sjl.f(runnable);
            this.e = null;
        }
    }

    private final void t() {
        int iBm;
        s();
        pnw pnwVar = this.d;
        int iBm2 = a.bm(pnwVar.b);
        if (iBm2 != 0 && iBm2 == 3) {
            this.a.getViewTreeObserver().removeOnDrawListener(this.p);
        }
        if (this.c == null || ((iBm = a.bm(pnwVar.b)) != 0 && iBm == 2)) {
            this.a.removeOnLayoutChangeListener(this);
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.c = null;
        }
    }

    private final void u() {
        int iBm;
        a.ab(this.j);
        if (this.l) {
            ViewGroup viewGroup = (ViewGroup) this.a.getRootView().findViewById(R.id.content);
            viewGroup.getClass();
            this.c = viewGroup;
        } else {
            this.c = (ViewGroup) this.a.getParent();
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this);
        }
        if (this.c == null || ((iBm = a.bm(this.d.b)) != 0 && iBm == 2)) {
            this.a.addOnLayoutChangeListener(this);
        }
        int iBm2 = a.bm(this.d.b);
        if (iBm2 != 0 && iBm2 == 3) {
            this.a.getViewTreeObserver().addOnDrawListener(this.p);
        }
    }

    private static void v(View view, pkr pkrVar) {
        pju pjuVarC = c(view);
        if (pjuVarC != null) {
            pks pksVar = pjuVarC.c;
            if (pksVar instanceof pkd) {
                pkd pkdVar = (pkd) pksVar;
                if (pkdVar.h != null || pkdVar.l) {
                    return;
                }
            }
            pkrVar.b(pjuVarC);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                v(viewGroup.getChildAt(i), pkrVar);
            }
        }
    }

    private final int w() {
        View view = this.a;
        if (view.getVisibility() != 0) {
            return 2;
        }
        if (this.l && !view.isShown()) {
            return 2;
        }
        pnw pnwVar = this.d;
        int iBm = a.bm(pnwVar.b);
        if (iBm != 0 && iBm != 1) {
            ViewGroup viewGroup = this.c;
            if (viewGroup == null) {
                return 2;
            }
            Rect rect = this.n;
            rect.set(viewGroup.getScrollX(), this.c.getScrollY(), this.c.getWidth() + this.c.getScrollX(), this.c.getHeight() + this.c.getScrollY());
            if (view.getLeft() > rect.left || view.getTop() > rect.top || view.getRight() < rect.right || view.getBottom() < rect.bottom) {
                if (rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                    rect.toString();
                    int iWidth = ((rect.width() * rect.height()) * 100) / (view.getWidth() * view.getHeight());
                    pnu pnuVar = pnwVar.d;
                    if (pnuVar == null) {
                        pnuVar = pnu.a;
                    }
                    if (iWidth < pnuVar.b) {
                    }
                }
                return 2;
            }
        }
        return 1;
    }

    @Override // defpackage.pks
    public final /* bridge */ /* synthetic */ Object d() {
        if (o() || this.l) {
            return null;
        }
        pju pjuVar = this.h;
        if (pjuVar != null) {
            return pjuVar;
        }
        pju pjuVar2 = this.m;
        if (pjuVar2 != null) {
            return pjuVar2;
        }
        for (ViewParent parent = this.a.getParent(); parent != null && (parent instanceof View); parent = parent.getParent()) {
            View view = (View) parent;
            pju pjuVarC = c(view);
            if (pjuVarC != null) {
                if (!this.j) {
                    return pjuVarC;
                }
                this.m = pjuVarC;
                return pjuVarC;
            }
            if (p(view)) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.pks
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        pks pksVar = ((pju) obj).c;
        a.H(this.i.add(obj));
        pksVar.k(this.b);
        if (this.j) {
            pksVar.h();
        }
    }

    @Override // defpackage.pks
    public final void f() {
        sij.x(this.h != null, "No parent override to unset");
        this.h = null;
        if (this.j) {
            h();
        }
    }

    @Override // defpackage.pks
    public final void g() {
        if (this.f.f()) {
            View view = this.a;
            view.removeOnAttachStateChangeListener(this);
            int[] iArr = cww.a;
            if (view.isAttachedToWindow()) {
                onViewDetachedFromWindow(view);
            }
        }
        pju pjuVar = this.h;
        if (pjuVar != null) {
            pjuVar.c.j(this.b);
        }
        List<pju> list = this.i;
        if (list != null) {
            for (pju pjuVar2 : list) {
                if (this.j) {
                    pjuVar2.c.i();
                }
                pjuVar2.c.f();
            }
            this.i.clear();
            this.i = null;
        }
        this.m = null;
        this.a.setTag(com.google.android.videos.R.id.ve_tag, null);
    }

    @Override // defpackage.pks
    public final void h() {
        if (!this.j || this.k) {
            return;
        }
        this.k = true;
        this.f.c(this.b);
        List list = this.i;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((pju) it.next()).c.h();
            }
        }
    }

    @Override // defpackage.pks
    public final void i() {
        if (this.k) {
            this.k = false;
            List list = this.i;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((pju) it.next()).c.i();
                }
            }
            this.f.d(this.b);
            this.m = null;
        }
    }

    @Override // defpackage.pks
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        a.H(this.i.remove(obj));
        pks pksVar = ((pju) obj).c;
        if (this.j) {
            pksVar.i();
        }
        pksVar.f();
    }

    @Override // defpackage.pks
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        obj.getClass();
        pju pjuVar = this.h;
        boolean z = pjuVar == null;
        pju pjuVar2 = this.b;
        sij.A(z, "CVE (%s) has a parent override (%s). Swapping prohibited.", pjuVar2, pjuVar);
        sij.x(!this.l, "Isolated trees cannot have parents.");
        if (this.j) {
            sij.v(((pju) obj).c.n(), "Attached CVE (%s) cannot be a child of a detached CVE (%s).", pjuVar2, obj);
            i();
        }
        this.h = (pju) obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    public final void l() {
        s();
        int iW = w();
        if (iW != this.q) {
            this.q = iW;
            if (this.k) {
                pkg pkgVar = this.f;
                pju pjuVar = this.b;
                ?? r1 = pkgVar.a;
                if (!r1.isEmpty()) {
                    Iterator it = r1.iterator();
                    while (it.hasNext()) {
                        Object obj = ((pku) it.next()).a;
                        long jAd = rdd.ad();
                        if (jAd != -1) {
                            vty vtyVar = pjuVar.e;
                            long j = jAd * 1000;
                            if (!vtyVar.b.A()) {
                                vtyVar.u();
                            }
                            pka pkaVar = (pka) vtyVar.b;
                            pka pkaVar2 = pka.a;
                            pkaVar.b |= 4;
                            pkaVar.f = j;
                        }
                        pkv pkvVar = (pkv) obj;
                        if (pkvVar.b.d(pjuVar, iW)) {
                            pkvVar.b();
                        }
                    }
                }
            }
        }
        this.e = null;
    }

    @Override // defpackage.pks
    public final void m(pkr pkrVar) {
        View view = this.a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                v(viewGroup.getChildAt(i), pkrVar);
            }
        }
        List list = this.i;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                pkrVar.b((pju) this.i.get(size));
            }
        }
    }

    @Override // defpackage.pks
    public final boolean n() {
        return this.k;
    }

    @Override // defpackage.pks
    public final boolean o() {
        return (this.h == null && p(this.a)) || this.l;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iBm = a.bm(this.d.b);
        if (iBm == 0 || iBm != 2) {
            View view2 = this.a;
            if (view == view2) {
                a.ab(this.c == null);
                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                this.c = viewGroup;
                viewGroup.addOnLayoutChangeListener(this);
                view2.removeOnLayoutChangeListener(this);
            }
        } else {
            if (this.o && view == this.c) {
                this.o = false;
                return;
            }
            View view3 = this.a;
            boolean z = view != view3;
            if (view == view3) {
                this.o = true;
            } else {
                this.o = false;
            }
            if (this.c == null) {
                a.ab(!z);
                ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                this.c = viewGroup2;
                viewGroup2.addOnLayoutChangeListener(this);
            }
        }
        l();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((tug) ((tug) g.b()).j("com/google/android/libraries/logging/ve/ViewNode", "onViewAttachedToWindow", 392, "ViewNode.java")).B("onViewAttachedToWindow self=%s, view=%s", this.a, view);
        this.f.b(!this.j);
        this.j = true;
        u();
        h();
        l();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((tug) ((tug) g.b()).j("com/google/android/libraries/logging/ve/ViewNode", "onViewDetachedFromWindow", 408, "ViewNode.java")).B("onViewDetachedToWindow self=%s, view=%s", this.a, view);
        pkg pkgVar = this.f;
        pkgVar.b(this.j);
        this.j = false;
        t();
        pju pjuVar = this.h;
        if (pjuVar == null) {
            i();
            return;
        }
        pju pjuVar2 = this.b;
        pjuVar.c.j(pjuVar2);
        boolean z = this.k;
        Object[] objArr = {pjuVar2, this.h};
        if (z) {
            pkgVar.e(new IllegalStateException(sij.m("CVE (%s) was child of detached CVE (%s).", objArr)));
        }
    }

    public final void q(boolean z) {
        if (this.l == z) {
            return;
        }
        a.ab(this.h == null);
        a.H((z && p(this.a)) ? false : true);
        ((tug) ((tug) g.b()).j("com/google/android/libraries/logging/ve/ViewNode", "setIsolated", 155, "ViewNode.java")).v("setIsolated %s", this.a);
        if (this.j) {
            t();
        }
        this.l = z;
        if (this.j) {
            u();
        }
    }

    @Override // defpackage.pks
    public final int r() {
        return w();
    }
}
