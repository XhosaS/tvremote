package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fto {
    public StaticLayout A;
    public int B;
    public int C;
    public int D;
    public Rect E;
    private final float F;
    private final float G;
    private final float H;
    private final Paint I;
    private final Paint J;
    public final float a;
    public final float b;
    public final TextPaint c;
    public CharSequence d;
    public Layout.Alignment e;
    public Bitmap f;
    public float g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public StaticLayout z;

    public fto(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.a = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float f = context.getResources().getDisplayMetrics().densityDpi;
        float fRound = Math.round((f + f) / 160.0f);
        this.F = fRound;
        this.G = fRound;
        this.H = fRound;
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.I = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.J = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r10 == 4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.graphics.Canvas r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fto.a(android.graphics.Canvas, boolean):void");
    }
}
