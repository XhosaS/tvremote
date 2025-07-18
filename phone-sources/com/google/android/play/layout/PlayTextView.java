package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.videos.R;
import defpackage.tdk;
import defpackage.thq;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayTextView extends AppCompatTextView {
    private final float a;
    private boolean b;
    private boolean c;
    private final String d;
    private Paint e;
    private Paint f;
    private GradientDrawable g;
    private int h;
    private int i;
    private float j;
    private Paint k;

    public PlayTextView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(android.graphics.Canvas r22, int r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.layout.PlayTextView.a(android.graphics.Canvas, int, int, boolean):void");
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.b) {
            int height = getHeight() - getPaddingBottom();
            int width = getWidth();
            Layout layout = getLayout();
            if (layout != null) {
                setContentDescription(layout.getText());
                int paddingTop = getPaddingTop();
                int lineCount = layout.getLineCount();
                int i = 0;
                while (i < lineCount) {
                    int lineTop = layout.getLineTop(i);
                    if (layout.getLineBottom(i) - ((int) getLineSpacingExtra()) > height) {
                        if (lineTop <= height) {
                            float f = paddingTop + lineTop;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f, width, height, this.e);
                        } else {
                            canvas2 = canvas;
                        }
                        if (i > 0) {
                            a(canvas2, width, i - 1, true);
                            return;
                        }
                        return;
                    }
                    Canvas canvas3 = canvas;
                    if (i == lineCount - 1 && this.c) {
                        a(canvas3, width, i, false);
                    }
                    i++;
                    canvas = canvas3;
                }
            }
        }
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) throws ExecutionException, InterruptedException {
        super.onMeasure(i, i2);
        float f = this.a;
        if (f == 0.0f || View.MeasureSpec.getMode(i2) == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + ((int) (f * getLineHeight())));
    }

    public PlayTextView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        float fMax;
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tdk.k);
        this.b = typedArrayObtainStyledAttributes.hasValue(3);
        this.c = typedArrayObtainStyledAttributes.getBoolean(5, false);
        if (this.b) {
            int color = typedArrayObtainStyledAttributes.getColor(3, resources.getColor(R.color.play_white));
            Paint paint = new Paint();
            this.e = paint;
            paint.setColor(color);
            this.e.setStyle(Paint.Style.FILL_AND_STROKE);
            this.h = resources.getDimensionPixelSize(R.dimen.play_text_view_fadeout);
            this.g = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{16777215 & color, color});
            this.i = resources.getDimensionPixelSize(R.dimen.play_text_view_fadeout_hint_margin);
        }
        String string = typedArrayObtainStyledAttributes.getString(4);
        string = typedArrayObtainStyledAttributes.getBoolean(2, false) ? string.toUpperCase(Locale.getDefault()) : string;
        this.d = string;
        if (!TextUtils.isEmpty(string)) {
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setColor(typedArrayObtainStyledAttributes.getColor(6, getCurrentTextColor()));
            this.f.setTextSize(getTextSize());
            this.f.setTypeface(getTypeface());
            this.f.setAntiAlias(true);
        }
        typedArrayObtainStyledAttributes.getInt(1, 3);
        int i = thq.a;
        context.getResources().getConfiguration().getLayoutDirection();
        float textSize = getTextSize();
        boolean z = resources.getBoolean(R.bool.play_text_compact_mode_enable);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        if (z && z2) {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            fMax = Math.max(0.0f, 1.0f - ((1.172f * textSize) / (Math.abs(fontMetrics.ascent) + Math.abs(fontMetrics.descent))));
            this.a = fMax;
        } else {
            this.a = 0.0f;
            fMax = 0.0f;
        }
        if (fMax > 0.0f) {
            setLineSpacing(((-fMax) * textSize) + (getLineHeight() * (getLineSpacingMultiplier() - 1.0f)), 1.0f);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.j = context.getResources().getDimension(R.dimen.play_text_view_outline);
        Paint paint3 = new Paint();
        this.k = paint3;
        paint3.setStrokeWidth(this.j);
        this.k.setStyle(Paint.Style.STROKE);
        setWillNotDraw(false);
    }
}
