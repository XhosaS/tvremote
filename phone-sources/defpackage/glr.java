package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glr extends cuo {
    final /* synthetic */ ViewPager a;

    public glr(ViewPager viewPager) {
        this.a = viewPager;
    }

    private final boolean a() {
        gll gllVar = this.a.b;
        return gllVar != null && gllVar.j() > 1;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        ViewPager viewPager;
        gll gllVar;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(a());
        if (accessibilityEvent.getEventType() != 4096 || (gllVar = (viewPager = this.a).b) == null) {
            return;
        }
        accessibilityEvent.setItemCount(gllVar.j());
        accessibilityEvent.setFromIndex(viewPager.c);
        accessibilityEvent.setToIndex(viewPager.c);
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        cyqVar.t("androidx.viewpager.widget.ViewPager");
        cyqVar.P(a());
        ViewPager viewPager = this.a;
        if (viewPager.canScrollHorizontally(1)) {
            cyqVar.i(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            cyqVar.i(8192);
        }
    }

    @Override // defpackage.cuo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) throws Resources.NotFoundException {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i == 4096) {
            ViewPager viewPager = this.a;
            if (!viewPager.canScrollHorizontally(1)) {
                return false;
            }
            viewPager.i(viewPager.c + 1);
            return true;
        }
        if (i != 8192) {
            return false;
        }
        ViewPager viewPager2 = this.a;
        if (!viewPager2.canScrollHorizontally(-1)) {
            return false;
        }
        viewPager2.i(viewPager2.c - 1);
        return true;
    }
}
