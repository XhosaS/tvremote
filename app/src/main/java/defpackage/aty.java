package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aty {
    public final Paint a;
    private final float b;
    private final float c;

    public aty(int i, float f, float f2) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(Color.rgb(Color.red(i), Color.green(i), Color.blue(i)));
        f = f > 1.0f ? 1.0f : f;
        this.b = f < 0.0f ? 0.0f : f;
        f2 = f2 > 1.0f ? 1.0f : f2;
        this.c = f2 >= 0.0f ? f2 : 0.0f;
        a(1.0f);
    }

    public final void a(float f) {
        float f2 = this.b;
        float f3 = this.c;
        this.a.setAlpha((int) ((f3 + (f * (f2 - f3))) * 255.0f));
    }
}
