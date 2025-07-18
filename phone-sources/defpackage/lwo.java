package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwo {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    private final RectF f;

    public lwo(float f, float f2, float f3, float f4, float f5) {
        RectF rectF = new RectF();
        this.f = rectF;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        rectF.set(f - f3, f2 - f4, f + f3, f2 + f4);
    }

    public final void a(Canvas canvas, Paint paint) {
        float f = this.e;
        boolean z = true;
        if (f >= -3.0f && f <= 3.0f) {
            z = false;
        }
        if (z) {
            canvas.save();
            canvas.rotate(-f, this.a, this.b);
        }
        canvas.drawOval(this.f, paint);
        if (z) {
            canvas.restore();
        }
    }

    public final void b(RectF rectF) {
        float f = this.a;
        float fMax = Math.max(this.c, this.d);
        rectF.left = f - fMax;
        float f2 = this.b;
        rectF.top = f2 - fMax;
        rectF.right = f + fMax;
        rectF.bottom = f2 + fMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lwo lwoVar = (lwo) obj;
        if (Float.compare(lwoVar.a, this.a) == 0 && Float.compare(lwoVar.b, this.b) == 0 && Float.compare(lwoVar.c, this.c) == 0 && Float.compare(lwoVar.d, this.d) == 0 && Float.compare(lwoVar.e, this.e) == 0) {
            return this.f.equals(lwoVar.f);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f.hashCode() * 31;
        float f = this.a;
        int iFloatToIntBits = (iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.b;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.c;
        int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.d;
        int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.e;
        return iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0);
    }
}
