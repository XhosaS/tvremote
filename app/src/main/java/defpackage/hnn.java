package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.flexbox.FlexboxLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
class hnn implements ViewTreeObserver.OnGlobalLayoutListener {
    final int a;
    final /* synthetic */ int b;
    final /* synthetic */ hns c;

    public hnn(hns hnsVar, int i) {
        this.b = i;
        this.c = hnsVar;
        this.a = (hnsVar.J * 4) + (i * 3);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        hns hnsVar = this.c;
        FlexboxLayout flexboxLayout = hnsVar.E;
        int childCount = flexboxLayout.getChildCount();
        float f = -hnsVar.I;
        boolean z = true;
        for (int i = 0; i < childCount; i++) {
            View childAt = flexboxLayout.getChildAt(i);
            boolean z2 = childAt.getY() <= ((float) this.a);
            childAt.setClickable(z2);
            childAt.setFocusable(z2);
            z &= z2;
            if (childAt.getY() <= hnsVar.J) {
                float x = childAt.getX() + childAt.getWidth();
                if (f < x) {
                    f = x;
                }
            }
        }
        if (!z) {
            ViewGroup viewGroup = hnsVar.F;
            int i2 = this.a;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = i2;
            viewGroup.setLayoutParams(layoutParams);
        }
        flexboxLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view = hnsVar.H;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMarginStart((int) f);
        view.setLayoutParams(marginLayoutParams);
        flexboxLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
