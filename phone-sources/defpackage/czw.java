package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czw extends cuo {
    @Override // defpackage.cuo
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.c() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.c());
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        int iC;
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        cyqVar.t(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (iC = nestedScrollView.c()) <= 0) {
            return;
        }
        cyqVar.P(true);
        if (nestedScrollView.getScrollY() > 0) {
            cyqVar.j(cyp.e);
            cyqVar.j(cyp.h);
        }
        if (nestedScrollView.getScrollY() < iC) {
            cyqVar.j(cyp.d);
            cyqVar.j(cyp.j);
        }
    }

    @Override // defpackage.cuo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.q(iMax);
                return true;
            }
            if (i != 16908346) {
                return false;
            }
        }
        int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.c());
        if (iMin == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.q(iMin);
        return true;
    }
}
