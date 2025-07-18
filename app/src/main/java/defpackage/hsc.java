package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.flexbox.FlexboxLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
class hsc implements ViewTreeObserver.OnGlobalLayoutListener {
    final int a;
    final /* synthetic */ int b;
    final /* synthetic */ hsh c;

    public hsc(hsh hshVar, int i) {
        this.b = i;
        this.c = hshVar;
        this.a = (hshVar.C * 4) + (i * 3);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        hsh hshVar = this.c;
        FlexboxLayout flexboxLayout = hshVar.y;
        int childCount = flexboxLayout.getChildCount();
        float f = -hshVar.B;
        boolean z = true;
        for (int i = 0; i < childCount; i++) {
            View childAt = flexboxLayout.getChildAt(i);
            boolean z2 = childAt.getY() <= ((float) this.a);
            childAt.setClickable(z2);
            childAt.setFocusable(z2);
            z &= z2;
            if (childAt.getY() <= hshVar.C) {
                float x = childAt.getX() + childAt.getWidth();
                if (f < x) {
                    f = x;
                }
            }
        }
        if (!z) {
            ViewGroup viewGroup = hshVar.z;
            int i2 = this.a;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = i2;
            viewGroup.setLayoutParams(layoutParams);
        }
        flexboxLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view = hshVar.A;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMarginStart((int) f);
        view.setLayoutParams(marginLayoutParams);
        flexboxLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
