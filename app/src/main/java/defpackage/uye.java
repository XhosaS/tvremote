package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class uye extends aam {
    private uyf a;

    public uye() {
    }

    protected void R(CoordinatorLayout coordinatorLayout, View view, int i) throws Throwable {
        coordinatorLayout.j(view, i);
    }

    @Override // defpackage.aam
    public boolean d(CoordinatorLayout coordinatorLayout, View view, int i) throws Throwable {
        R(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new uyf(view);
        }
        uyf uyfVar = this.a;
        View view2 = uyfVar.a;
        uyfVar.b = view2.getTop();
        uyfVar.c = view2.getLeft();
        uyf uyfVar2 = this.a;
        View view3 = uyfVar2.a;
        int top = view3.getTop() - uyfVar2.b;
        int[] iArr = ahj.a;
        view3.offsetTopAndBottom(-top);
        view3.offsetLeftAndRight(-(view3.getLeft() - uyfVar2.c));
        return true;
    }

    public uye(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
