package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class soj extends sol {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public soj() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    public float D(View view) {
        throw null;
    }

    public int E(View view) {
        throw null;
    }

    public abstract View F(List list);

    public final int H(View view) {
        if (this.d == 0) {
            return 0;
        }
        float fD = D(view);
        int i = this.d;
        return cmq.l((int) (fD * i), 0, i);
    }

    public boolean J() {
        return false;
    }

    @Override // defpackage.sol
    protected final void ew(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewF = F(coordinatorLayout.a(view));
        if (viewF == null) {
            coordinatorLayout.f(view, i);
            this.c = 0;
            return;
        }
        cqx cqxVar = (cqx) view.getLayoutParams();
        Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + cqxVar.leftMargin, viewF.getBottom() + cqxVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - cqxVar.rightMargin, ((coordinatorLayout.getHeight() + viewF.getBottom()) - coordinatorLayout.getPaddingBottom()) - cqxVar.bottomMargin);
        cyh cyhVar = coordinatorLayout.e;
        if (cyhVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += cyhVar.b();
            rect.right -= cyhVar.c();
        }
        Rect rect2 = this.b;
        int i2 = cqxVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iH = H(viewF);
        view.layout(rect2.left, rect2.top - iH, rect2.right, rect2.bottom - iH);
        this.c = rect2.top - viewF.getBottom();
    }

    public soj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
