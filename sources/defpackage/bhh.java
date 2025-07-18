package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class bhh extends mo {
    private bhi a;

    public bhh() {
    }

    protected void at(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.i(view, i);
    }

    @Override // defpackage.mo
    public boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        at(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new bhi(view);
        }
        bhi bhiVar = this.a;
        View view2 = bhiVar.a;
        bhiVar.b = view2.getTop();
        bhiVar.c = view2.getLeft();
        bhi bhiVar2 = this.a;
        View view3 = bhiVar2.a;
        int top = view3.getTop() - bhiVar2.b;
        int[] iArr = qv.a;
        view3.offsetTopAndBottom(-top);
        view3.offsetLeftAndRight(-(view3.getLeft() - bhiVar2.c));
        return true;
    }

    public bhh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
