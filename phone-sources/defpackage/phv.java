package defpackage;

import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phv implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public phv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.b;
        if (i == 0) {
            ((phw) this.a).a();
            return true;
        }
        if (i == 1) {
            ((CoordinatorLayout) this.a).e(0);
            return true;
        }
        Object obj = this.a;
        ExpandableDialogView expandableDialogView = (ExpandableDialogView) obj;
        expandableDialogView.getViewTreeObserver().removeOnPreDrawListener(this);
        Property property = rme.a;
        int[] iArr = cww.a;
        expandableDialogView.setPivotX(((View) obj).getLayoutDirection() == 1 ? expandableDialogView.a.left : expandableDialogView.a.right);
        expandableDialogView.setPivotY(expandableDialogView.a.top);
        return true;
    }
}
