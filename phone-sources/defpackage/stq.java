package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stq implements TypeEvaluator {
    final Object a;
    private final /* synthetic */ int b;

    public stq(RectF rectF, int i) {
        this.b = i;
        this.a = rectF;
    }

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        if (this.b == 0) {
            float fFloatValue = ((FloatEvaluator) this.a).evaluate(f, (Number) obj, (Number) obj2).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
        RectF rectF = (RectF) obj;
        RectF rectF2 = (RectF) obj2;
        float f2 = rectF.top + ((rectF2.top - rectF.top) * f);
        Object obj3 = this.a;
        RectF rectF3 = (RectF) obj3;
        rectF3.top = f2;
        rectF3.left = rectF.left + ((rectF2.left - rectF.left) * f);
        rectF3.right = rectF.right + ((rectF2.right - rectF.right) * f);
        rectF3.bottom = rectF.bottom + (f * (rectF2.bottom - rectF.bottom));
        return obj3;
    }

    public stq(int i) {
        this.b = i;
        this.a = new FloatEvaluator();
    }
}
