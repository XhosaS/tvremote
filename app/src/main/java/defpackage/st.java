package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class st {
    private static final Interpolator a = new ss();
    private int b = -1;

    public static int b(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 + i4;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public final int a(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public void c(qv qvVar) {
        throw null;
    }

    public abstract int d();

    public final int e(RecyclerView recyclerView, int i, int i2, long j) throws Resources.NotFoundException {
        int dimensionPixelSize = this.b;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.b = dimensionPixelSize;
        }
        int iAbs = Math.abs(i2);
        int iSignum = (int) Math.signum(i2);
        float interpolation = a.getInterpolation(Math.min(1.0f, iAbs / i));
        float f = j <= 2000 ? j / 2000.0f : 1.0f;
        int i3 = (int) (((int) (iSignum * dimensionPixelSize * interpolation)) * f * f * f * f * f);
        return i3 == 0 ? i2 > 0 ? 1 : -1 : i3;
    }

    public final void f(RecyclerView recyclerView, qv qvVar, float f, float f2, boolean z) {
        View view = qvVar.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            int[] iArr = ahj.a;
            Float fValueOf = Float.valueOf(ahc.a(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float fA = ahc.a(childAt);
                    if (fA > f3) {
                        f3 = fA;
                    }
                }
            }
            ahc.j(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    final int g(RecyclerView recyclerView) {
        return a(d(), recyclerView.getLayoutDirection());
    }

    public final boolean h(RecyclerView recyclerView) {
        return (g(recyclerView) & 16711680) != 0;
    }
}
