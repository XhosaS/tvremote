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
public abstract class uyc extends uye {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public uyc() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    @Override // defpackage.uye
    protected final void R(CoordinatorLayout coordinatorLayout, View view, int i) throws Throwable {
        View viewT = t(coordinatorLayout.b(view));
        if (viewT == null) {
            coordinatorLayout.j(view, i);
            this.c = 0;
            return;
        }
        aap aapVar = (aap) view.getLayoutParams();
        Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + aapVar.leftMargin, viewT.getBottom() + aapVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - aapVar.rightMargin, ((coordinatorLayout.getHeight() + viewT.getBottom()) - coordinatorLayout.getPaddingBottom()) - aapVar.bottomMargin);
        ajc lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.b();
            rect.right -= lastWindowInsets.c();
        }
        Rect rect2 = this.b;
        int i2 = aapVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iW = w(viewT);
        view.layout(rect2.left, rect2.top - iW, rect2.right, rect2.bottom - iW);
        this.c = rect2.top - viewT.getBottom();
    }

    public int s(View view) {
        throw null;
    }

    public abstract View t(List list);

    public void v(View view) {
        throw null;
    }

    public final int w(View view) {
        if (this.d == 0) {
            return 0;
        }
        v(view);
        int i = this.d;
        return adm.a((int) (i * 0.0f), 0, i);
    }

    public boolean y() {
        return false;
    }

    public uyc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
