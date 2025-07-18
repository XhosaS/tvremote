package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dao extends cuo {
    private static final Rect e = new Rect(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager a;
    public final View b;
    private dan j;
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final int[] i = new int[2];
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    private int k = Integer.MIN_VALUE;

    public dao(View view) {
        this.b = view;
        this.a = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private final AccessibilityEvent r(int i, int i2) {
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            this.b.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        cyq cyqVarB = b(i);
        accessibilityEventObtain2.getText().add(cyqVarB.e());
        accessibilityEventObtain2.setContentDescription(cyqVarB.d());
        accessibilityEventObtain2.setScrollable(cyqVarB.af());
        accessibilityEventObtain2.setPassword(cyqVarB.ae());
        accessibilityEventObtain2.setEnabled(cyqVarB.ab());
        accessibilityEventObtain2.setChecked(cyqVarB.b.isChecked());
        f(i, accessibilityEventObtain2);
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(cyqVarB.c());
        View view = this.b;
        accessibilityEventObtain2.setSource(view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    private final cyq s(int i) {
        cyq cyqVarB = cyq.b();
        cyqVarB.z(true);
        cyqVarB.B(true);
        cyqVarB.t("android.view.View");
        Rect rect = e;
        cyqVarB.p(rect);
        cyqVarB.q(rect);
        View view = this.b;
        cyqVarB.L(view);
        h(i, cyqVarB);
        if (cyqVarB.e() == null && cyqVarB.d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.g;
        cyqVarB.l(rect2);
        Rect rect3 = this.f;
        cyqVarB.m(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = cyqVarB.b.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        cyqVarB.J(view.getContext().getPackageName());
        cyqVarB.R(view, i);
        if (this.c == i) {
            cyqVarB.n(true);
            cyqVarB.i(128);
        } else {
            cyqVarB.n(false);
            cyqVarB.i(64);
        }
        boolean z = this.d == i;
        if (z) {
            cyqVarB.i(2);
        } else if (cyqVarB.ac()) {
            cyqVarB.i(1);
        }
        cyqVarB.C(z);
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            j(cyqVarB, rect2);
            cyqVarB.m(rect3);
        }
        Rect rect4 = this.h;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                cyqVarB.q(rect3);
                if (rect3 != null && !rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            cyqVarB.Y(true);
                        }
                    }
                }
            }
        }
        return cyqVarB;
    }

    private final void t(int i) {
        int i2 = this.k;
        if (i2 == i) {
            return;
        }
        this.k = i;
        q(i, 128);
        q(i2, 256);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean u(int r18, android.graphics.Rect r19) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dao.u(int, android.graphics.Rect):boolean");
    }

    protected abstract int a(float f, float f2);

    final cyq b(int i) {
        if (i != -1) {
            return s(i);
        }
        View view = this.b;
        cyq cyqVar = new cyq(AccessibilityNodeInfo.obtain(view));
        int[] iArr = cww.a;
        AccessibilityNodeInfo accessibilityNodeInfo = cyqVar.b;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        if (accessibilityNodeInfo.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cyqVar.k(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return cyqVar;
    }

    protected abstract void c(List list);

    public final void d(int i) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.a.isEnabled() || (parent = (view = this.b).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventR = r(i, RecyclerView.ItemAnimator.FLAG_MOVED);
        accessibilityEventR.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventR);
    }

    public final void e(boolean z, int i, Rect rect) {
        int i2 = this.d;
        if (i2 != Integer.MIN_VALUE) {
            l(i2);
        }
        if (z) {
            u(i, rect);
        }
    }

    @Override // defpackage.cuo
    public final cyt getAccessibilityNodeProvider(View view) {
        if (this.j == null) {
            this.j = new dan(this);
        }
        return this.j;
    }

    protected abstract void h(int i, cyq cyqVar);

    public final void j(cyq cyqVar, Rect rect) {
        cyqVar.p(rect);
        Rect rect2 = new Rect();
        rect2.set(rect);
        if (cyqVar.c != -1) {
            cyq cyqVarB = cyq.b();
            Rect rect3 = new Rect();
            for (int i = cyqVar.c; i != -1; i = cyqVarB.c) {
                cyqVarB.M(this.b, -1);
                cyqVarB.p(e);
                h(i, cyqVarB);
                cyqVarB.l(rect3);
                rect2.offset(rect3.left, rect3.top);
            }
        }
        View view = this.b;
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        rect2.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        cyqVar.q(rect2);
    }

    public final boolean k(int i) {
        if (this.c != i) {
            return false;
        }
        this.c = Integer.MIN_VALUE;
        this.b.invalidate();
        q(i, 65536);
        return true;
    }

    public final boolean l(int i) {
        if (this.d != i) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        i(i, false);
        q(i, 8);
        return true;
    }

    public final boolean m(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.k == Integer.MIN_VALUE) {
                    return false;
                }
                t(Integer.MIN_VALUE);
                return true;
            }
            int iA = a(motionEvent.getX(), motionEvent.getY());
            t(iA);
            if (iA != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return u(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return u(1, null);
            }
            return false;
        }
        int i2 = 66;
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    if (keyCode == 19) {
                        i2 = 33;
                    } else if (keyCode == 21) {
                        i2 = 17;
                    } else if (keyCode != 22) {
                        i2 = 130;
                    }
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i < repeatCount && u(i2, null)) {
                        i++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        int i3 = this.d;
        if (i3 != Integer.MIN_VALUE) {
            o(i3, 16, null);
        }
        return true;
    }

    protected abstract boolean o(int i, int i2, Bundle bundle);

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        g(cyqVar);
    }

    public final boolean p(int i) {
        int i2;
        View view = this.b;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.d) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            l(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.d = i;
        i(i, true);
        q(i, 8);
        return true;
    }

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.a.isEnabled() || (parent = (view = this.b).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, r(i, i2));
    }

    protected void g(cyq cyqVar) {
    }

    protected void f(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void i(int i, boolean z) {
    }
}
