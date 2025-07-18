package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmg extends FrameLayout {
    public hqb a;
    private boolean b;

    public hmg(Context context) {
        super(context);
    }

    private final FrameLayout.LayoutParams b(ViewGroup.LayoutParams layoutParams, int i) {
        FrameLayout.LayoutParams layoutParams2;
        if (layoutParams == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new FrameLayout.LayoutParams(layoutParams);
        }
        layoutParams2.gravity = i;
        return layoutParams2;
    }

    public final void a(hmf hmfVar) {
        int iA;
        FrameLayout.LayoutParams layoutParamsB;
        hqb hqbVar;
        if (hmfVar.b == null) {
            return;
        }
        int i = hmfVar.a.g;
        int iA2 = aeat.a(i);
        if (((iA2 != 0 && iA2 == 3) || ((iA = aeat.a(i)) != 0 && iA == 4)) && (hqbVar = this.a) != null && !this.b) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{hqbVar.n, hqbVar.o});
            View view = new View(getContext());
            view.setBackground(gradientDrawable);
            addView(view, 0, new FrameLayout.LayoutParams(-1, this.a.m, 80));
            this.b = true;
        }
        View view2 = hmfVar.b;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        int i2 = hmfVar.a.g;
        int iA3 = aeat.a(i2);
        if (iA3 != 0 && iA3 == 2) {
            layoutParamsB = b(layoutParams, 8388659);
        } else {
            int iA4 = aeat.a(i2);
            if (iA4 != 0 && iA4 == 3) {
                layoutParamsB = b(layoutParams, 8388691);
            } else {
                int iA5 = aeat.a(i2);
                if (iA5 != 0 && iA5 == 4) {
                    layoutParamsB = b(layoutParams, 8388693);
                } else {
                    int iA6 = aeat.a(i2);
                    if (iA6 != 0 && iA6 == 5) {
                        layoutParamsB = b(layoutParams, 17);
                    } else {
                        int iA7 = aeat.a(i2);
                        if (iA7 == 0 || iA7 != 8) {
                            return;
                        } else {
                            layoutParamsB = b(layoutParams, 8388627);
                        }
                    }
                }
            }
        }
        addView(view2, layoutParamsB);
    }
}
