package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.sio;
import defpackage.tdk;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StarRatingBar extends View {
    private float a;
    private float b;
    private final float c;
    private boolean d;
    private boolean e;
    private final float f;
    private final double g;
    private final double h;
    private final Path i;
    private final Path j;
    private final Path k;
    private final Paint l;
    private int m;
    private final Paint n;
    private final TextPaint o;
    private final int p;
    private int q;
    private int r;
    private int s;
    private float t;
    private String u;

    public StarRatingBar(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final int getBaseline() {
        return this.e ? getPaddingTop() + this.s : getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        Paint paint = this.l;
        int iSave = canvas.save();
        paint.setColor(this.m);
        TextPaint textPaint = this.o;
        textPaint.setColor(this.p);
        int[] iArr = cww.a;
        if (getLayoutDirection() == 1 && !this.e) {
            canvas.translate(getWidth(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        float paddingTop = getPaddingTop();
        float paddingStart = getPaddingStart();
        if (this.e) {
            canvas.save();
            canvas.translate(paddingStart, paddingTop);
            canvas.drawText(this.u, paddingStart, paddingTop + this.s, textPaint);
            canvas.restore();
            canvas.save();
            float f2 = this.f;
            float f3 = this.t + f2;
            float f4 = this.c;
            canvas.translate(paddingStart + f3 + f4 + f4, (((r3 - getPaddingBottom()) + getMeasuredHeight()) - (this.r / 2)) + ((float) (this.h - f2)));
            canvas.drawPath(this.i, paint);
            canvas.restore();
        } else {
            float f5 = this.a;
            int i = (int) f5;
            int iCompare = Float.compare(f5 % 1.0f, 0.0f);
            float f6 = this.f;
            float f7 = paddingStart + f6;
            double d = this.h;
            int i2 = 0;
            while (true) {
                f = ((float) d) + paddingTop;
                if (i2 >= i) {
                    break;
                }
                canvas.save();
                canvas.translate((i2 * (f6 + f6 + this.c)) + f7, f);
                canvas.drawPath(this.i, paint);
                canvas.restore();
                i2++;
            }
            if (iCompare > 0) {
                canvas.save();
                canvas.translate((i2 * (f6 + f6 + this.c)) + f7, f);
                canvas.drawPath(this.j, paint);
                canvas.drawPath(this.k, this.n);
                canvas.restore();
                i2++;
            }
            if (this.d) {
                while (true) {
                    float f8 = i2;
                    if (f8 >= this.b) {
                        break;
                    }
                    canvas.save();
                    canvas.translate((f8 * (f6 + f6 + this.c)) + f7, f);
                    canvas.drawPath(this.i, this.n);
                    canvas.restore();
                    i2++;
                }
            }
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (this.e) {
            this.t = this.o.measureText(this.u);
            float paddingLeft2 = getPaddingLeft() + getPaddingRight() + this.t;
            float f = this.c;
            float f2 = this.f;
            paddingTop = (int) (getPaddingTop() + getPaddingBottom() + Math.max(this.r, this.g));
            paddingLeft = (int) (paddingLeft2 + f + f + f2 + f2);
        } else {
            float fCeil = this.d ? this.b : (float) Math.ceil(this.a);
            paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + ((fCeil + fCeil) * this.f) + (((-1.0f) + fCeil) * this.c));
            paddingTop = (int) (getPaddingTop() + getPaddingBottom() + this.g);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    public StarRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tdk.l);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.a = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        double dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, resources.getDimensionPixelSize(R.dimen.play_star_height_default));
        this.g = dimensionPixelSize;
        this.b = typedArrayObtainStyledAttributes.getInt(2, 5);
        this.d = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.e = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, resources.getDimensionPixelSize(R.dimen.play_medium_size));
        this.m = typedArrayObtainStyledAttributes.getColor(6, resources.getColor(R.color.play_white));
        int color = typedArrayObtainStyledAttributes.getColor(5, resources.getColor(R.color.play_transparent));
        int color2 = typedArrayObtainStyledAttributes.getColor(8, resources.getColor(R.color.play_secondary_text));
        this.p = color2;
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.l = paint;
        paint.setColor(this.m);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.n = paint2;
        paint2.setColor(color);
        paint2.setStyle(Paint.Style.FILL);
        double dSin = dimensionPixelSize / (Math.sin(0.9424777960769379d) + 1.0d);
        this.h = dSin;
        this.f = (float) (dSin * Math.sin(1.2566370614359172d));
        TextPaint textPaint = new TextPaint(1);
        this.o = textPaint;
        textPaint.density = resources.getDisplayMetrics().density;
        textPaint.setTextSize(this.q);
        textPaint.setFakeBoldText(false);
        textPaint.setColor(color2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        this.r = (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom));
        this.s = (int) Math.abs(fontMetrics.top);
        float f = this.a;
        if (sio.a == null) {
            sio.a = NumberFormat.getNumberInstance();
            sio.a.setMinimumFractionDigits(1);
            sio.a.setMaximumFractionDigits(1);
            sio.b = new SparseArray();
        }
        int iRound = Math.round(10.0f * f);
        String str = (String) sio.b.get(iRound);
        if (str == null) {
            str = sio.a.format(f);
            sio.b.put(iRound, str);
        }
        this.u = str;
        PointF[] pointFArr = new PointF[10];
        for (int i = 0; i < 10; i++) {
            pointFArr[i] = new PointF();
        }
        double dSin2 = (Math.sin(0.39269908169872414d) * dSin) / Math.sin(2.1205750411731104d);
        double dSin3 = Math.sin(0.6283185307179586d);
        double dCos = Math.cos(0.6283185307179586d);
        double dSin4 = Math.sin(1.2566370614359172d);
        double dCos2 = Math.cos(1.2566370614359172d);
        pointFArr[0].x = 0.0f;
        pointFArr[0].y = -((float) dSin);
        pointFArr[1].x = (float) (dSin2 * dSin3);
        pointFArr[1].y = -((float) (dSin2 * dCos));
        pointFArr[2].x = (float) (dSin * dSin4);
        pointFArr[2].y = -((float) (dSin * dCos2));
        pointFArr[3].x = (float) (dSin2 * dSin4);
        pointFArr[3].y = (float) (dSin2 * dCos2);
        pointFArr[4].x = (float) (dSin * dSin3);
        pointFArr[4].y = (float) (dSin * dCos);
        pointFArr[5].x = 0.0f;
        pointFArr[5].y = (float) dSin2;
        pointFArr[6].x = -pointFArr[4].x;
        pointFArr[6].y = pointFArr[4].y;
        pointFArr[7].x = -pointFArr[3].x;
        pointFArr[7].y = pointFArr[3].y;
        pointFArr[8].x = -pointFArr[2].x;
        pointFArr[8].y = pointFArr[2].y;
        pointFArr[9].x = -pointFArr[1].x;
        pointFArr[9].y = pointFArr[1].y;
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(pointFArr[0].x, pointFArr[0].y);
        for (int i2 = 1; i2 < 10; i2++) {
            path.lineTo(pointFArr[i2].x, pointFArr[i2].y);
        }
        path.close();
        this.i = path;
        Path path2 = new Path();
        path2.setFillType(Path.FillType.EVEN_ODD);
        path2.moveTo(pointFArr[0].x, pointFArr[0].y);
        for (int i3 = 5; i3 < 10; i3++) {
            path2.lineTo(pointFArr[i3].x, pointFArr[i3].y);
        }
        path2.close();
        this.j = path2;
        Path path3 = new Path();
        path3.setFillType(Path.FillType.EVEN_ODD);
        path3.moveTo(pointFArr[0].x, pointFArr[0].y);
        for (int i4 = 1; i4 <= 5; i4++) {
            path3.lineTo(pointFArr[i4].x, pointFArr[i4].y);
        }
        path3.close();
        this.k = path3;
        setWillNotDraw(false);
    }
}
