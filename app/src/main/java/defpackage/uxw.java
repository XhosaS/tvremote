package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uxw extends afn {
    final /* synthetic */ uxz a;
    final /* synthetic */ CoordinatorLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxw(uxz uxzVar, CoordinatorLayout coordinatorLayout) {
        super(afn.c);
        this.a = uxzVar;
        this.b = coordinatorLayout;
    }

    @Override // defpackage.afn
    public final void c(View view, ajr ajrVar) {
        View childAt;
        super.c(view, ajrVar);
        ajrVar.a.setClassName(ScrollView.class.getName());
        uxz uxzVar = this.a;
        if (uxzVar.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.b;
        int childCount = coordinatorLayout.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = coordinatorLayout.getChildAt(i);
            if (((aap) childAt.getLayoutParams()).a instanceof AppBarLayout$ScrollingViewBehavior) {
                break;
            } else {
                i++;
            }
        }
        if (childAt != null) {
            int childCount2 = uxzVar.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                int i3 = ((uxy) uxzVar.getChildAt(i2).getLayoutParams()).a;
            }
        }
    }

    @Override // defpackage.afn
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 4096) {
            throw null;
        }
        if (i == 8192) {
            return false;
        }
        return super.i(view, i, bundle);
    }
}
