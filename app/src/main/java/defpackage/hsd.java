package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.flexbox.FlexboxLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
class hsd implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ hsh b;

    public hsd(hsh hshVar, ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = hshVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        hsh hshVar = this.b;
        FlexboxLayout flexboxLayout = hshVar.y;
        int childCount = flexboxLayout.getChildCount();
        float f = -hshVar.B;
        for (int i = 0; i < childCount; i++) {
            View childAt = flexboxLayout.getChildAt(i);
            boolean z = childAt.getY() <= ((float) hshVar.C);
            childAt.setClickable(z);
            childAt.setFocusable(z);
            if (z) {
                float x = childAt.getX() + childAt.getWidth();
                if (f < x) {
                    f = x;
                }
            }
        }
        View view = hshVar.A;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMarginStart((int) f);
        view.setLayoutParams(marginLayoutParams);
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
