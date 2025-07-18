package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgq {
    public int A;
    private final Paint B;
    private final Paint C;
    public final float a;
    public final float b;
    public final TextPaint c;
    public CharSequence d;
    public float e;
    public int f;
    public int g;
    public float h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public float p;
    public float q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public StaticLayout w;
    public StaticLayout x;
    public int y;
    public int z;

    public bgq(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.a = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float f = context.getResources().getDisplayMetrics().densityDpi;
        Math.round((f + f) / 160.0f);
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.B = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.C = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.w;
        StaticLayout staticLayout2 = this.x;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.y, this.z);
        if (Color.alpha(0) > 0) {
            Paint paint = this.B;
            paint.setColor(0);
            int i = -this.A;
            float width = staticLayout.getWidth() + this.A;
            canvas2 = canvas;
            canvas2.drawRect(i, 0.0f, width, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        TextPaint textPaint = this.c;
        textPaint.setColor(this.l);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
