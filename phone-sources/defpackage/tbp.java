package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbp extends LinearLayout {
    public ValueAnimator a;
    public final /* synthetic */ TabLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbp(TabLayout tabLayout, Context context) {
        super(context);
        this.b = tabLayout;
        setWillNotDraw(false);
    }

    private final void e(int i) {
        TabLayout tabLayout = this.b;
        if (tabLayout.D == 0 || (tabLayout.m.getBounds().left == -1 && tabLayout.m.getBounds().right == -1)) {
            View childAt = getChildAt(i);
            Drawable drawable = tabLayout.m;
            RectF rectFH = szg.h(tabLayout, childAt);
            drawable.setBounds((int) rectFH.left, drawable.getBounds().top, (int) rectFH.right, drawable.getBounds().bottom);
            tabLayout.a = i;
        }
    }

    public final void a() {
        e(this.b.a());
    }

    public final void b(int i) {
        TabLayout tabLayout = this.b;
        Rect bounds = tabLayout.m.getBounds();
        tabLayout.m.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        if (view == null || view.getWidth() <= 0) {
            TabLayout tabLayout = this.b;
            Drawable drawable = tabLayout.m;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.m.getBounds().bottom);
        } else {
            TabLayout tabLayout2 = this.b;
            tabLayout2.E.i(tabLayout2, view, view2, f, tabLayout2.m);
        }
        postInvalidateOnAnimation();
    }

    public final void d(boolean z, int i, int i2) {
        TabLayout tabLayout = this.b;
        if (tabLayout.a == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.a());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a();
            return;
        }
        tabLayout.a = i;
        tbo tboVar = new tbo(this, childAt, childAt2, 0);
        if (!z) {
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(tboVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.B);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(tboVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.b;
        int iHeight = tabLayout.m.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.m.getIntrinsicHeight();
        }
        int i = tabLayout.v;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            int height2 = getHeight() - iHeight;
            iHeight = (getHeight() + iHeight) / 2;
            height = height2 / 2;
        }
        if (tabLayout.m.getBounds().width() > 0) {
            Rect bounds = tabLayout.m.getBounds();
            tabLayout.m.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.m.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(false, this.b.a(), -1);
            return;
        }
        TabLayout tabLayout = this.b;
        int iA = tabLayout.a;
        if (iA == -1) {
            iA = tabLayout.a();
            tabLayout.a = iA;
        }
        e(iA);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.b;
        if (tabLayout.t == 1 || tabLayout.w == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax > 0) {
                int iF = (int) sil.f(getContext(), 16);
                if (iMax * childCount <= getMeasuredWidth() - (iF + iF)) {
                    boolean z = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z = true;
                        }
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    tabLayout.t = 0;
                    tabLayout.p(false);
                }
                super.onMeasure(i, i2);
            }
        }
    }
}
