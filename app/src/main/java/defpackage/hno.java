package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.flexbox.FlexboxLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
class hno implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ hns b;

    public hno(hns hnsVar, ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = hnsVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        hns hnsVar = this.b;
        FlexboxLayout flexboxLayout = hnsVar.E;
        int childCount = flexboxLayout.getChildCount();
        float f = -hnsVar.I;
        for (int i = 0; i < childCount; i++) {
            View childAt = flexboxLayout.getChildAt(i);
            boolean z = childAt.getY() <= ((float) hnsVar.J);
            childAt.setClickable(z);
            childAt.setFocusable(z);
            if (z) {
                float x = childAt.getX() + childAt.getWidth();
                if (f < x) {
                    f = x;
                }
            }
        }
        View view = hnsVar.H;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMarginStart((int) f);
        view.setLayoutParams(marginLayoutParams);
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
