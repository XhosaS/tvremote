package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aak implements agk {
    final /* synthetic */ CoordinatorLayout a;

    public aak(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // defpackage.agk
    public final ajc a(View view, ajc ajcVar) {
        CoordinatorLayout coordinatorLayout = this.a;
        if (!Objects.equals(coordinatorLayout.e, ajcVar)) {
            coordinatorLayout.e = ajcVar;
            boolean z = ajcVar.d() > 0;
            coordinatorLayout.f = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            aiy aiyVar = ajcVar.b;
            if (!aiyVar.q()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    int[] iArr = ahj.a;
                    if (childAt.getFitsSystemWindows() && ((aap) childAt.getLayoutParams()).a != null && aiyVar.q()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return ajcVar;
    }
}
