package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.tv.remote.service.R;
import defpackage.qv;
import defpackage.ux;
import defpackage.wb;
import defpackage.wc;
import defpackage.wd;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PagingIndicator extends View {
    private static final TimeInterpolator i = new DecelerateInterpolator();
    private static final Property j = new wb(Float.class);
    private static final Property k = new wc(Float.class);
    private static final Property l = new wd(Float.class);
    boolean a;
    final int b;
    final int c;
    final int d;
    final Paint e;
    final Paint f;
    Bitmap g;
    Paint h;
    private final int m;
    private final int n;
    private final int o;
    private int[] p;
    private int[] q;
    private int[] r;
    private final AnimatorSet s;
    private final AnimatorSet t;
    private final AnimatorSet u;

    public PagingIndicator(Context context) {
        this(context, null, 0);
    }

    private final int a(TypedArray typedArray, int i2, int i3) {
        return typedArray.getColor(i2, getResources().getColor(i3));
    }

    private final int b(TypedArray typedArray, int i2, int i3) {
        return typedArray.getDimensionPixelOffset(i2, getResources().getDimensionPixelOffset(i3));
    }

    private final int c() {
        int i2 = this.m;
        int i3 = this.n;
        int i4 = this.b;
        return i4 + i4 + i3 + i3 + (i2 * (-3));
    }

    private final Animator d() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) l, (-this.n) + this.m, 0.0f);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(i);
        return objectAnimatorOfFloat;
    }

    private final Bitmap e() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_ic_nav_arrow);
        if (this.a) {
            return bitmapDecodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, false);
    }

    private final void f() {
        int paddingLeft = getPaddingLeft();
        getPaddingTop();
        int width = paddingLeft + (getWidth() - getPaddingRight());
        int iC = c();
        int[] iArr = new int[0];
        this.p = iArr;
        int[] iArr2 = new int[0];
        this.q = iArr2;
        int[] iArr3 = new int[0];
        this.r = iArr3;
        int i2 = width / 2;
        if (this.a) {
            int i3 = i2 - (iC / 2);
            int i4 = this.b;
            int i5 = this.m;
            int i6 = this.n;
            int i7 = i3 + i4;
            iArr[0] = (i7 - i5) + i6;
            iArr2[0] = i7;
            iArr3[0] = (i7 - (i5 + i5)) + i6 + i6;
        } else {
            int i8 = i2 + (iC / 2);
            int i9 = this.b;
            int i10 = this.m;
            int i11 = this.n;
            int i12 = i8 - i9;
            iArr[0] = (i12 + i10) - i11;
            iArr2[0] = i12;
            iArr3[0] = (i12 + (i10 + i10)) - (i11 + i11);
        }
        throw null;
    }

    private static final Animator g(float f, float f2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) j, f, f2);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(i);
        return objectAnimatorOfFloat;
    }

    private static final Animator h(float f, float f2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) k, f, f2);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(i);
        return objectAnimatorOfFloat;
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int paddingTop = getPaddingTop() + this.c + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i3);
        int iMin = paddingTop + this.o;
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, View.MeasureSpec.getSize(i3));
        } else if (mode == 1073741824) {
            iMin = View.MeasureSpec.getSize(i3);
        }
        int paddingLeft = getPaddingLeft() + c() + getPaddingRight();
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, View.MeasureSpec.getSize(i2));
        } else if (mode2 == 1073741824) {
            paddingLeft = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(paddingLeft, iMin);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z = i2 == 0;
        if (this.a != z) {
            this.a = z;
            this.g = e();
            f();
            invalidate();
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        setMeasuredDimension(i2, i3);
        f();
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i2);
        AnimatorSet animatorSet = new AnimatorSet();
        this.u = animatorSet;
        Resources resources = getResources();
        int[] iArr = ux.b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        qv.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        this.b = b(typedArrayObtainStyledAttributes, 6, R.dimen.lb_page_indicator_dot_radius);
        int iB = b(typedArrayObtainStyledAttributes, 2, R.dimen.lb_page_indicator_arrow_radius);
        this.d = iB;
        this.c = iB + iB;
        this.m = b(typedArrayObtainStyledAttributes, 5, R.dimen.lb_page_indicator_dot_gap);
        this.n = b(typedArrayObtainStyledAttributes, 4, R.dimen.lb_page_indicator_arrow_gap);
        int iA = a(typedArrayObtainStyledAttributes, 3, R.color.lb_page_indicator_dot);
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(iA);
        a(typedArrayObtainStyledAttributes, 0, R.color.lb_page_indicator_arrow_background);
        if (this.h == null && typedArrayObtainStyledAttributes.hasValue(1)) {
            int color = typedArrayObtainStyledAttributes.getColor(1, 0);
            if (this.h == null) {
                this.h = new Paint();
            }
            this.h.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.a = resources.getConfiguration().getLayoutDirection() == 0;
        int color2 = resources.getColor(R.color.lb_page_indicator_arrow_shadow);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_radius);
        this.o = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_offset);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color2);
        this.g = e();
        new Rect(0, 0, this.g.getWidth(), this.g.getHeight());
        this.g.getWidth();
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.s = animatorSet2;
        animatorSet2.playTogether(g(0.0f, 1.0f), h(r13 + r13, iB + iB), d());
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.t = animatorSet3;
        animatorSet3.playTogether(g(1.0f, 0.0f), h(iB + iB, r13 + r13), d());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
    }
}
