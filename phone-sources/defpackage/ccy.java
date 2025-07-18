package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccy {
    public static final ccw a = new ccw();
    public final Rect b = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final ccx f = new ccx();
    public final ArrayList c = new ArrayList();

    public static final ViewGroup c(ViewGroup viewGroup, View view) {
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent;
                    if (viewGroup3.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup2 = viewGroup3;
                    }
                    parent = viewGroup3.getParent();
                } else if (viewGroup2 != null) {
                    return viewGroup2;
                }
            }
        }
        return viewGroup;
    }

    private final View d(ViewGroup viewGroup, View view, Rect rect, ArrayList arrayList, int i) {
        Rect rect2 = this.d;
        rect2.set(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = (View) arrayList.get(i2);
            if (!yks.e(view3, view) && !yks.e(view3, viewGroup)) {
                Rect rect3 = this.e;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                bmy bmyVarP = bnj.p(rect3);
                bmy bmyVarP2 = bnj.p(rect2);
                bmy bmyVarP3 = bnj.p(rect);
                blz blzVarT = d.T(i);
                if (d.B(bmyVarP, bmyVarP2, bmyVarP3, blzVarT != null ? blzVarT.a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    private static final void e(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY() + viewGroup.getHeight();
        int scrollX = viewGroup.getScrollX() + viewGroup.getWidth();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    private static final void f(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY();
        int scrollX = viewGroup.getScrollX();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    public final View a(ViewGroup viewGroup, View view, int i) {
        ViewGroup viewGroupC = c(viewGroup, view);
        View viewN = cbp.n(view, viewGroupC, i);
        boolean z = true;
        View viewN2 = viewN;
        while (viewN != null) {
            if (viewN.isFocusable() && viewN.getVisibility() == 0 && (!viewN.isInTouchMode() || viewN.isFocusableInTouchMode())) {
                break;
            }
            viewN = cbp.n(viewN, viewGroupC, i);
            boolean z2 = !z;
            if (!z) {
                viewN2 = viewN2 != null ? cbp.n(viewN2, viewGroupC, i) : null;
                if (viewN2 == viewN) {
                    break;
                }
            }
            z = z2;
        }
        viewN = null;
        if (viewN != null) {
            return viewN;
        }
        ArrayList arrayList = this.c;
        try {
            arrayList.clear();
            cbp.p(viewGroupC, arrayList, i);
            if (!arrayList.isEmpty()) {
                viewN = b(viewGroupC, view, null, i, arrayList);
            }
            return viewN;
        } finally {
            arrayList.clear();
        }
    }

    public final View b(ViewGroup viewGroup, View view, Rect rect, int i, ArrayList arrayList) {
        View view2;
        ArrayList arrayList2;
        View viewD;
        int iIndexOf;
        int iLastIndexOf;
        int i2;
        int i3;
        Rect rect2 = this.b;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 17 || i == 33) {
                    e(viewGroup, rect2);
                } else if (i == 66 || i == 130) {
                    f(viewGroup, rect2);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                e(viewGroup, rect2);
            } else {
                f(viewGroup, rect2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            f(viewGroup, rect2);
        } else {
            e(viewGroup, rect2);
        }
        if (i != 1 && i != 2) {
            if (i == 17 || i == 33 || i == 66 || i == 130) {
                return d(viewGroup, view, rect2, arrayList, i);
            }
            throw new IllegalArgumentException(a.cf(i, "Unknown direction: "));
        }
        try {
            ccx ccxVar = this.f;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ccxVar.d.g((View) arrayList.get(i4), i4);
            }
            int i5 = -1;
            int size2 = arrayList.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i6 = size2 - 1;
                    View view3 = (View) arrayList.get(size2);
                    view2 = null;
                    int nextFocusForwardId = view3.getNextFocusForwardId();
                    View viewN = (nextFocusForwardId == 0 || nextFocusForwardId == i5) ? null : cbp.n(view3, viewGroup, 2);
                    if (viewN != null) {
                        i3 = i5;
                        if (ccxVar.d.a(viewN) >= 0) {
                            ccxVar.a.j(view3, viewN);
                            ccxVar.b.j(viewN);
                        }
                    } else {
                        i3 = i5;
                    }
                    if (i6 < 0) {
                        break;
                    }
                    size2 = i6;
                    i5 = i3;
                }
            } else {
                view2 = null;
            }
            int size3 = arrayList.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    int i7 = size3 - 1;
                    View view4 = (View) arrayList.get(size3);
                    ki kiVar = ccxVar.a;
                    if (((View) kiVar.a(view4)) != null && !ccxVar.b.a(view4)) {
                        View view5 = view4;
                        while (view4 != null) {
                            ki kiVar2 = ccxVar.c;
                            View view6 = (View) kiVar2.a(view4);
                            if (view6 != null) {
                                if (view6 == view5) {
                                    break;
                                }
                                view4 = view5;
                                view5 = view6;
                            }
                            kiVar2.j(view4, view5);
                            view4 = (View) kiVar.a(view4);
                        }
                    }
                    if (i7 < 0) {
                        break;
                    }
                    size3 = i7;
                }
            }
            Collections.sort(arrayList, ccxVar);
            this.f.a();
            int size4 = arrayList.size();
            if (size4 < 2) {
                return view2;
            }
            if (i == 1) {
                arrayList2 = arrayList;
                viewD = (view == null || (iIndexOf = arrayList2.indexOf(view)) <= 0) ? (View) arrayList2.get(size4 - 1) : (View) arrayList2.get(iIndexOf - 1);
            } else if (i == 2) {
                arrayList2 = arrayList;
                viewD = (view == null || (iLastIndexOf = arrayList2.lastIndexOf(view)) < 0 || (i2 = iLastIndexOf + 1) >= size4) ? (View) arrayList2.get(0) : (View) arrayList2.get(i2);
            } else if (i == 17 || i == 33 || i == 66 || i == 130) {
                arrayList2 = arrayList;
                viewD = d(viewGroup, view, this.b, arrayList2, i);
            } else {
                viewD = view2;
                arrayList2 = arrayList;
            }
            return viewD == null ? (View) arrayList2.get(size4 - 1) : viewD;
        } catch (Throwable th) {
            this.f.a();
            throw th;
        }
    }
}
