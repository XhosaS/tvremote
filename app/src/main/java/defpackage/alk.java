package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class alk extends afn {
    private static final Rect i = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager a;
    public final View b;
    int f;
    int g;
    public int h;
    private final Rect j;
    private final Rect k;
    private final Rect l;
    private final int[] m;
    private alj n;

    public alk(View view) {
        super(afn.c);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new int[2];
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.b = view;
        this.a = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.afn
    public aju a(View view) {
        if (this.n == null) {
            this.n = new alj(this);
        }
        return this.n;
    }

    public final AccessibilityEvent j(int i2) {
        View view = this.b;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    final ajr l(int i2) {
        if (i2 == -1) {
            View view = this.b;
            ajr ajrVar = new ajr(AccessibilityNodeInfo.obtain(view));
            int[] iArr = ahj.a;
            AccessibilityNodeInfo accessibilityNodeInfo = ajrVar.a;
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            ArrayList arrayList = new ArrayList();
            m(arrayList);
            if (accessibilityNodeInfo.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                accessibilityNodeInfo.addChild(view, ((Integer) arrayList.get(i3)).intValue());
            }
            return ajrVar;
        }
        ajr ajrVar2 = new ajr(AccessibilityNodeInfo.obtain());
        ajrVar2.g();
        ajrVar2.h();
        AccessibilityNodeInfo accessibilityNodeInfo2 = ajrVar2.a;
        accessibilityNodeInfo2.setClassName("android.view.View");
        Rect rect = i;
        accessibilityNodeInfo2.setBoundsInParent(rect);
        accessibilityNodeInfo2.setBoundsInScreen(rect);
        View view2 = this.b;
        ajrVar2.b = -1;
        accessibilityNodeInfo2.setParent(view2);
        o(i2, ajrVar2);
        if (ajrVar2.a() == null && accessibilityNodeInfo2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.k;
        accessibilityNodeInfo2.getBoundsInParent(rect2);
        Rect rect3 = this.j;
        accessibilityNodeInfo2.getBoundsInScreen(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfo2.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfo2.setPackageName(view2.getContext().getPackageName());
        ajrVar2.c = i2;
        accessibilityNodeInfo2.setSource(view2, i2);
        if (this.f == i2) {
            accessibilityNodeInfo2.setAccessibilityFocused(true);
            accessibilityNodeInfo2.addAction(128);
        } else {
            accessibilityNodeInfo2.setAccessibilityFocused(false);
            accessibilityNodeInfo2.addAction(64);
        }
        boolean z = this.g == i2;
        if (z) {
            accessibilityNodeInfo2.addAction(2);
        } else if (accessibilityNodeInfo2.isFocusable()) {
            accessibilityNodeInfo2.addAction(1);
        }
        accessibilityNodeInfo2.setFocused(z);
        int[] iArr2 = this.m;
        view2.getLocationOnScreen(iArr2);
        if (rect3.equals(rect)) {
            accessibilityNodeInfo2.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (ajrVar2.b != -1) {
                ajr ajrVar3 = new ajr(AccessibilityNodeInfo.obtain());
                Rect rect5 = new Rect();
                for (int i4 = ajrVar2.b; i4 != -1; i4 = ajrVar3.b) {
                    ajrVar3.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo3 = ajrVar3.a;
                    accessibilityNodeInfo3.setParent(view2, -1);
                    accessibilityNodeInfo3.setBoundsInParent(rect);
                    o(0, ajrVar3);
                    accessibilityNodeInfo3.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            view2.getLocationOnScreen(iArr2);
            rect4.offset(iArr2[0] - view2.getScrollX(), iArr2[1] - view2.getScrollY());
            accessibilityNodeInfo2.setBoundsInScreen(rect4);
            accessibilityNodeInfo2.getBoundsInScreen(rect3);
        }
        Rect rect6 = this.l;
        if (view2.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr2[0] - view2.getScrollX(), iArr2[1] - view2.getScrollY());
            if (rect3.intersect(rect6)) {
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (rect3 != null && !rect3.isEmpty() && view2.getWindowVisibility() == 0) {
                    Object parent = view2.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view3 = (View) parent;
                            if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                break;
                            }
                            parent = view3.getParent();
                        } else if (parent != null) {
                            ajrVar2.k();
                        }
                    }
                }
            }
        }
        return ajrVar2;
    }

    protected abstract void m(List list);

    protected abstract void o(int i2, ajr ajrVar);

    public final void p(int i2) {
        int i3 = this.h;
        if (i3 == i2) {
            return;
        }
        this.h = i2;
        t(i2, 128);
        t(i3, 256);
    }

    public final boolean q(int i2) {
        if (this.f != i2) {
            return false;
        }
        this.f = Integer.MIN_VALUE;
        this.b.invalidate();
        t(i2, 65536);
        return true;
    }

    public final boolean r(int i2) {
        if (this.g != i2) {
            return false;
        }
        this.g = Integer.MIN_VALUE;
        t(i2, 8);
        return true;
    }

    protected abstract boolean s(int i2, int i3);

    public final void t(int i2, int i3) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventJ;
        if (i2 == Integer.MIN_VALUE || !this.a.isEnabled() || (parent = (view = this.b).getParent()) == null) {
            return;
        }
        if (i2 != -1) {
            accessibilityEventJ = AccessibilityEvent.obtain(i3);
            ajr ajrVarL = l(i2);
            accessibilityEventJ.getText().add(ajrVarL.a());
            AccessibilityNodeInfo accessibilityNodeInfo = ajrVarL.a;
            accessibilityEventJ.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventJ.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventJ.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventJ.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventJ.setChecked(accessibilityNodeInfo.isChecked());
            n(i2, accessibilityEventJ);
            if (accessibilityEventJ.getText().isEmpty() && accessibilityEventJ.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventJ.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventJ.setSource(view, i2);
            accessibilityEventJ.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventJ = j(i3);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventJ);
    }

    protected void n(int i2, AccessibilityEvent accessibilityEvent) {
    }
}
