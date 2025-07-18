package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxz extends swu {
    public final int o;
    public final int p;
    public boolean q;
    public int r;
    public Integer s;
    public int t;
    public float u;
    public boolean v;
    public boolean w;

    public sxz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        TypedArray typedArrayA = suy.a(context, attributeSet, sya.c, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        this.o = typedArrayA.getInt(0, 1);
        int i = typedArrayA.getInt(1, 0);
        this.p = i;
        this.r = typedArrayA.getDimensionPixelSize(4, 0);
        if (typedArrayA.hasValue(3)) {
            this.s = Integer.valueOf(typedArrayA.getDimensionPixelSize(3, 0));
        }
        TypedValue typedValuePeekValue = typedArrayA.peekValue(2);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                this.t = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayA.getResources().getDisplayMetrics()), this.a / 2);
                this.v = false;
                this.w = true;
            } else if (typedValuePeekValue.type == 6) {
                this.u = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.v = true;
                this.w = true;
            }
        }
        typedArrayA.recycle();
        b();
        this.q = i == 1;
    }

    @Override // defpackage.swu
    public final void b() {
        super.b();
        if (this.r < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.o == 0) {
            if ((a() > 0 || (this.w && g() > 0)) && this.i == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.e.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    @Override // defpackage.swu
    public final boolean f() {
        return super.f() && g() == a();
    }

    public final int g() {
        if (!this.w) {
            return a();
        }
        if (!this.v) {
            return this.t;
        }
        return (int) (this.a * this.u);
    }
}
