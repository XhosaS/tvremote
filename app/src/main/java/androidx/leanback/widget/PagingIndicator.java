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
import com.google.android.katniss.R;
import defpackage.ahj;
import defpackage.atk;
import defpackage.azf;
import defpackage.azg;
import defpackage.azh;
import defpackage.azi;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PagingIndicator extends View {
    private static final TimeInterpolator n = new DecelerateInterpolator();
    private static final Property o = new azf(Float.class);
    private static final Property p = new azg(Float.class);
    private static final Property q = new azh(Float.class);
    private final AnimatorSet A;
    private final AnimatorSet B;
    public boolean a;
    public final int b;
    public final int c;
    final int d;
    final int e;
    int f;
    public int g;
    final Paint h;
    final Paint i;
    Bitmap j;
    Paint k;
    final Rect l;
    public final float m;
    private final int r;
    private final int s;
    private final int t;
    private azi[] u;
    private int[] v;
    private int[] w;
    private int[] x;
    private int y;
    private final AnimatorSet z;

    public PagingIndicator(Context context) {
        this(context, null, 0);
    }

    private final int a(TypedArray typedArray, int i, int i2) {
        return typedArray.getColor(i, getResources().getColor(i2));
    }

    private final int b(TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelOffset(i, getResources().getDimensionPixelOffset(i2));
    }

    private final int c() {
        int i = this.y - 3;
        int i2 = this.r;
        int i3 = this.s;
        int i4 = this.c;
        return i4 + i4 + i3 + i3 + (i * i2);
    }

    private final Animator d(float f, float f2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) o, f, f2);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(n);
        return objectAnimatorOfFloat;
    }

    private final Animator e(float f, float f2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) p, f, f2);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(n);
        return objectAnimatorOfFloat;
    }

    private final Animator f() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) q, (-this.s) + this.r, 0.0f);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(n);
        return objectAnimatorOfFloat;
    }

    private final Bitmap g() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_ic_nav_arrow);
        if (this.a) {
            return bitmapDecodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, false);
    }

    private final void h() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = paddingLeft + (getWidth() - getPaddingRight());
        int iC = c();
        int i = this.y;
        int[] iArr = new int[i];
        this.v = iArr;
        int[] iArr2 = new int[i];
        this.w = iArr2;
        int[] iArr3 = new int[i];
        this.x = iArr3;
        int i2 = width / 2;
        if (this.a) {
            int i3 = i2 - (iC / 2);
            int i4 = this.c;
            int i5 = this.r;
            int i6 = this.s;
            int i7 = i3 + i4;
            iArr[0] = (i7 - i5) + i6;
            iArr2[0] = i7;
            iArr3[0] = (i7 - (i5 + i5)) + i6 + i6;
            for (int i8 = 1; i8 < this.y; i8++) {
                int[] iArr4 = this.v;
                int[] iArr5 = this.w;
                int i9 = i8 - 1;
                iArr4[i8] = iArr5[i9] + i6;
                iArr5[i8] = iArr5[i9] + i5;
                this.x[i8] = iArr4[i9] + i6;
            }
        } else {
            int i10 = i2 + (iC / 2);
            int i11 = this.c;
            int i12 = this.r;
            int i13 = this.s;
            int i14 = i10 - i11;
            iArr[0] = (i14 + i12) - i13;
            iArr2[0] = i14;
            iArr3[0] = (i14 + (i12 + i12)) - (i13 + i13);
            for (int i15 = 1; i15 < this.y; i15++) {
                int[] iArr6 = this.v;
                int[] iArr7 = this.w;
                int i16 = i15 - 1;
                iArr6[i15] = iArr7[i16] - i13;
                iArr7[i15] = iArr7[i16] - i12;
                this.x[i15] = iArr6[i16] - i13;
            }
        }
        this.f = paddingTop + this.e;
        azi aziVar = this.u[0];
        aziVar.c = 0.0f;
        aziVar.d = 0.0f;
        PagingIndicator pagingIndicator = aziVar.j;
        aziVar.e = pagingIndicator.d;
        float f = pagingIndicator.e;
        aziVar.f = f;
        aziVar.g = f * pagingIndicator.m;
        aziVar.a = 1.0f;
        aziVar.a();
        azi aziVar2 = this.u[0];
        aziVar2.h = 1.0f;
        aziVar2.d = this.v[0];
        for (int i17 = 1; i17 < this.y; i17++) {
            this.u[i17].b();
            azi aziVar3 = this.u[i17];
            aziVar3.h = 1.0f;
            aziVar3.d = this.x[i17];
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        for (int i = 0; i < this.y; i++) {
            azi aziVar = this.u[i];
            float f = aziVar.d + aziVar.c;
            PagingIndicator pagingIndicator = aziVar.j;
            canvas.drawCircle(f, pagingIndicator.f, aziVar.f, pagingIndicator.h);
            if (aziVar.a > 0.0f) {
                Paint paint = pagingIndicator.i;
                paint.setColor(aziVar.b);
                canvas.drawCircle(f, pagingIndicator.f, aziVar.f, paint);
                Bitmap bitmap = pagingIndicator.j;
                Rect rect = pagingIndicator.l;
                float f2 = aziVar.g;
                float f3 = pagingIndicator.f;
                canvas.drawBitmap(bitmap, rect, new Rect((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2)), pagingIndicator.k);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int paddingTop = getPaddingTop() + this.d + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        int iMin = paddingTop + this.t;
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, View.MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            iMin = View.MeasureSpec.getSize(i2);
        }
        int paddingLeft = getPaddingLeft() + c() + getPaddingRight();
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, View.MeasureSpec.getSize(i));
        } else if (mode2 == 1073741824) {
            paddingLeft = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(paddingLeft, iMin);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 0;
        if (this.a != z) {
            this.a = z;
            this.j = g();
            azi[] aziVarArr = this.u;
            if (aziVarArr != null) {
                for (azi aziVar : aziVarArr) {
                    aziVar.i = true != aziVar.j.a ? -1.0f : 1.0f;
                }
            }
            h();
            invalidate();
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        setMeasuredDimension(i, i2);
        h();
    }

    public void setArrowBackgroundColor(int i) {
        this.g = i;
    }

    public void setArrowColor(int i) {
        if (this.k == null) {
            this.k = new Paint();
        }
        this.k.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i) {
        this.h.setColor(i);
    }

    public void setPageCount(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The page count should be a positive integer");
        }
        this.y = i;
        this.u = new azi[i];
        for (int i2 = 0; i2 < this.y; i2++) {
            this.u[i2] = new azi(this);
        }
        h();
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        AnimatorSet animatorSet = new AnimatorSet();
        this.B = animatorSet;
        Resources resources = getResources();
        int[] iArr = atk.c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ahj.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        int iB = b(typedArrayObtainStyledAttributes, 6, R.dimen.lb_page_indicator_dot_radius);
        this.c = iB;
        this.b = iB + iB;
        int iB2 = b(typedArrayObtainStyledAttributes, 2, R.dimen.lb_page_indicator_arrow_radius);
        this.e = iB2;
        int i2 = iB2 + iB2;
        this.d = i2;
        this.r = b(typedArrayObtainStyledAttributes, 5, R.dimen.lb_page_indicator_dot_gap);
        this.s = b(typedArrayObtainStyledAttributes, 4, R.dimen.lb_page_indicator_arrow_gap);
        int iA = a(typedArrayObtainStyledAttributes, 3, R.color.lb_page_indicator_dot);
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setColor(iA);
        this.g = a(typedArrayObtainStyledAttributes, 0, R.color.lb_page_indicator_arrow_background);
        if (this.k == null && typedArrayObtainStyledAttributes.hasValue(1)) {
            setArrowColor(typedArrayObtainStyledAttributes.getColor(1, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.a = resources.getConfiguration().getLayoutDirection() == 0;
        int color = resources.getColor(R.color.lb_page_indicator_arrow_shadow);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_radius);
        this.t = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.i = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_offset);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color);
        this.j = g();
        this.l = new Rect(0, 0, this.j.getWidth(), this.j.getHeight());
        this.m = this.j.getWidth() / i2;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.z = animatorSet2;
        animatorSet2.playTogether(d(0.0f, 1.0f), e(iB + iB, iB2 + iB2), f());
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.A = animatorSet3;
        animatorSet3.playTogether(d(1.0f, 0.0f), e(iB2 + iB2, iB + iB), f());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }
}
