package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrm extends jrp {
    public final float a(float f, float f2) {
        return f * ((f2 * 3.725f) + 1.0f);
    }

    public final float b(float f) {
        if (f < 0.66f) {
            return 0.0f;
        }
        return (f - 0.66f) / 0.33999997f;
    }

    public final float c(float f, float f2) {
        if (f < 1.0f) {
            return f + f;
        }
        float f3 = (f2 * 0.15999997f) + 1.0f;
        return f3 + f3;
    }

    public final void d(RectF rectF, float f, float f2) {
        float f3 = f2 * f;
        rectF.set(-f3, -f, f3, f);
    }

    public final void e(float f, float f2) {
        float fA = a(f2, f);
        this.c = c(fA, f);
        RectF rectF = this.e;
        d(rectF, fA, 1.0f);
        Path.Direction direction = Path.Direction.CW;
        Path path = this.b;
        path.addOval(rectF, direction);
        d(rectF, fA, 0.95f);
        path.addOval(rectF, Path.Direction.CW);
    }
}
