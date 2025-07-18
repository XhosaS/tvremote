package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dy {
    private static boolean f(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    protected static void v(List list, View view) {
        int size = list.size();
        if (f(list, view, size)) {
            return;
        }
        int[] iArr = ahj.a;
        if (ahc.f(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!f(list, childAt, size) && ahc.f(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    protected static boolean y(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    public abstract void c(Object obj, View view);

    public abstract void d(Object obj, ArrayList arrayList);

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract void g(Object obj, View view, ArrayList arrayList);

    public abstract void h(Object obj, Rect rect);

    public abstract void i(Object obj, View view);

    public abstract void j(Object obj, View view, ArrayList arrayList);

    public abstract void k(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract boolean l(Object obj);

    public boolean m() {
        throw null;
    }

    public boolean n(Object obj) {
        throw null;
    }

    public abstract Object o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public void q(Object obj, adp adpVar, Runnable runnable) {
        throw null;
    }

    public abstract Object r(Object obj, Object obj2);

    public Object s(ViewGroup viewGroup, Object obj) {
        return null;
    }

    protected final void w(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public void z(Object obj, adp adpVar, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    public void t(Object obj) {
    }

    public void u(Object obj, Runnable runnable) {
    }

    public void x(Object obj, float f) {
    }
}
