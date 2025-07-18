package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snz extends cuo {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ CoordinatorLayout b;
    final /* synthetic */ AppBarLayout.BaseBehavior c;

    public snz(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        this.c = baseBehavior;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        cyqVar.t(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.a;
        if (appBarLayout.f() == 0) {
            return;
        }
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        View viewL = AppBarLayout.BaseBehavior.L(this.b);
        if (viewL != null) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((soc) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    if (baseBehavior.F() != (-appBarLayout.f())) {
                        cyqVar.j(cyp.d);
                        cyqVar.P(true);
                    }
                    if (baseBehavior.F() != 0) {
                        if (!viewL.canScrollVertically(-1)) {
                            cyqVar.j(cyp.e);
                            cyqVar.P(true);
                            return;
                        } else {
                            if ((-appBarLayout.b()) != 0) {
                                cyqVar.j(cyp.e);
                                cyqVar.P(true);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.cuo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 4096) {
            this.a.j(false);
            return true;
        }
        if (i != 8192) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        if (baseBehavior.F() != 0) {
            CoordinatorLayout coordinatorLayout = this.b;
            View viewL = AppBarLayout.BaseBehavior.L(coordinatorLayout);
            if (!viewL.canScrollVertically(-1)) {
                this.a.j(true);
                return true;
            }
            AppBarLayout appBarLayout = this.a;
            int i2 = -appBarLayout.b();
            if (i2 != 0) {
                baseBehavior.M(coordinatorLayout, appBarLayout, viewL, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
