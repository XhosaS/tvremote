package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bhf extends bhh {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public bhf() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    public int W() {
        throw null;
    }

    public void X(View view) {
        throw null;
    }

    public final int Y(View view) {
        if (this.d == 0) {
            return 0;
        }
        X(view);
        int i = this.d;
        return mo.E((int) (i * 0.0f), 0, i);
    }

    public abstract View a(List list);

    public boolean aa() {
        return false;
    }

    @Override // defpackage.bhh
    protected final void at(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewA = a(coordinatorLayout.a(view));
        if (viewA == null) {
            coordinatorLayout.i(view, i);
            this.c = 0;
            return;
        }
        mr mrVar = (mr) view.getLayoutParams();
        Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + mrVar.leftMargin, viewA.getBottom() + mrVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - mrVar.rightMargin, ((coordinatorLayout.getHeight() + viewA.getBottom()) - coordinatorLayout.getPaddingBottom()) - mrVar.bottomMargin);
        sf sfVar = coordinatorLayout.e;
        if (sfVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += sfVar.b();
            rect.right -= sfVar.c();
        }
        Rect rect2 = this.b;
        int i2 = mrVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iY = Y(viewA);
        view.layout(rect2.left, rect2.top - iY, rect2.right, rect2.bottom - iY);
        this.c = rect2.top - viewA.getBottom();
    }

    public bhf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
