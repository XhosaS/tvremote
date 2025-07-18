package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.google.android.katniss.R;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class utp extends Drawable.ConstantState {
    public int a;
    public float b;
    public float c;
    public yqi d;
    public final RectF e;
    public final long f;
    public boolean g;
    public Bitmap h;

    protected utp(Resources resources, Resources.Theme theme) throws Resources.NotFoundException {
        RectF rectF = new RectF();
        this.e = rectF;
        this.g = true;
        int i = utq.c;
        WeakHashMap weakHashMap = aco.a;
        this.a = resources.getColor(i, theme);
        this.b = resources.getDimension(utq.b);
        this.c = utk.a(resources, theme);
        this.f = resources.getInteger(R.integer.card_focused_animation_duration_ms);
        float dimension = resources.getDimension(R.dimen.spotlight_shadow_y_offset);
        rectF.top = dimension;
        rectF.bottom = -dimension;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        final float fraction = resources.getFraction(R.fraction.spotlight_shadow_alpha_max, 1, 1);
        final float fraction2 = resources.getFraction(R.fraction.spotlight_shadow_alpha_at_max_area, 1, 1);
        final float fraction3 = resources.getFraction(R.fraction.spotlight_shadow_alpha_min, 1, 1);
        final float fraction4 = resources.getFraction(R.fraction.spotlight_shadow_alpha_at_min_area, 1, 1);
        final float f = displayMetrics.widthPixels * displayMetrics.heightPixels;
        this.d = new yqi() { // from class: utn
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                float f2;
                Rect rect = (Rect) obj;
                float fWidth = (rect.width() * rect.height()) / f;
                float f3 = fraction2;
                if (fWidth < f3) {
                    f2 = 0.0f;
                } else {
                    float f4 = fraction4;
                    f2 = fWidth > f4 ? 1.0f : (fWidth - f4) / (f3 - f4);
                }
                return Float.valueOf((fraction * (1.0f - f2)) + (fraction3 * f2));
            }
        };
    }

    public final void a(float f) {
        float f2 = (int) f;
        if (this.c != f2) {
            this.c = f2;
            this.h = null;
        }
    }

    public final void b(float f) {
        if (this.b != f) {
            this.b = f;
            this.h = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 4096;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final /* synthetic */ Drawable newDrawable() {
        return new utq(this);
    }

    protected utp(Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes;
        this(resources, theme);
        if (theme != null) {
            typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSet, utl.a, 0, 0);
        } else {
            typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, utl.a);
        }
        this.a = typedArrayObtainAttributes.getColor(4, this.a);
        b(typedArrayObtainAttributes.getDimension(2, this.b));
        a(typedArrayObtainAttributes.getDimension(3, this.c));
        this.f = typedArrayObtainAttributes.getInteger(7, (int) this.f);
        this.g = typedArrayObtainAttributes.getBoolean(6, this.g);
        if (typedArrayObtainAttributes.hasValue(0)) {
            final float f = typedArrayObtainAttributes.getFloat(0, 1.0f);
            this.d = new yqi() { // from class: uto
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return Float.valueOf(f);
                }
            };
        }
        RectF rectF = this.e;
        rectF.left = typedArrayObtainAttributes.getDimension(9, rectF.left);
        RectF rectF2 = this.e;
        rectF2.right = typedArrayObtainAttributes.getDimension(10, rectF2.right);
        if (typedArrayObtainAttributes.getBoolean(1, true) && resources.getConfiguration().getLayoutDirection() == 1) {
            float f2 = this.e.left;
            RectF rectF3 = this.e;
            rectF3.left = rectF3.right;
            this.e.right = f2;
        }
        RectF rectF4 = this.e;
        rectF4.top = typedArrayObtainAttributes.getDimension(11, rectF4.top);
        RectF rectF5 = this.e;
        rectF5.bottom = typedArrayObtainAttributes.getDimension(8, rectF5.bottom);
        typedArrayObtainAttributes.recycle();
    }
}
