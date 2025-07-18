package com.google.android.apps.googletv.app.presentation.views.expandabletextview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import defpackage.cso;
import defpackage.kjk;
import defpackage.tdc;
import defpackage.ykn;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExpandableTextView extends tdc {
    public boolean a;
    public Paint b;
    public GradientDrawable c;
    private float d;
    private boolean e;
    private final boolean f;
    private final String g;
    private Paint h;
    private int i;
    private int j;
    private final float k;
    private final Paint l;
    private boolean m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
        context.getClass();
        attributeSet.getClass();
    }

    private final void a(Drawable drawable, Canvas canvas, int i, int i2) {
        canvas.save();
        canvas.translate(canvas.getWidth(), getPaddingTop());
        if (drawable != null) {
            drawable.setBounds(i - i2, i, 0, i2);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(android.graphics.Canvas r21, int r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.googletv.app.presentation.views.expandabletextview.ExpandableTextView.b(android.graphics.Canvas, int, int, boolean):void");
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.e) {
            int height = getHeight() - getPaddingBottom();
            Layout layout = getLayout();
            if (layout != null) {
                setContentDescription(layout.getText());
                int lineCount = layout.getLineCount();
                int i = 0;
                while (true) {
                    if (i >= lineCount) {
                        canvas2 = canvas;
                        break;
                    }
                    int lineTop = layout.getLineTop(i);
                    if (layout.getLineBottom(i) - ((int) getLineSpacingExtra()) > height) {
                        if (lineTop <= height) {
                            int paddingTop = getPaddingTop() + lineTop;
                            float width = getWidth();
                            Paint paint = this.b;
                            paint.getClass();
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, paddingTop, width, height, paint);
                        } else {
                            canvas2 = canvas;
                        }
                        if (i > 0) {
                            b(canvas2, getWidth(), i - 1, true);
                        }
                    } else {
                        Canvas canvas3 = canvas;
                        if (i == lineCount - 1 && this.f) {
                            b(canvas3, getWidth(), i, false);
                        }
                        i++;
                        canvas = canvas3;
                    }
                }
                if (this.m && this.a) {
                    int i2 = lineCount - 1;
                    int lineTop2 = layout.getLineTop(i2);
                    int lineBottom = layout.getLineBottom(i2);
                    Resources resources = getResources();
                    Resources.Theme theme = getContext().getTheme();
                    ThreadLocal threadLocal = cso.a;
                    a(resources.getDrawable(com.google.android.videos.R.drawable.ic_expand_less_24dp, theme), canvas2, lineBottom, (lineBottom - lineTop2) + lineBottom);
                }
            }
        }
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = (this.a && this.m) ? 1.0f : 0.0f;
        this.d = f;
        if (f == 0.0f || View.MeasureSpec.getMode(i2) == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + ((int) (this.d * getLineHeight())));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        float fMax;
        super(context, attributeSet, i);
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kjk.a);
        typedArrayObtainStyledAttributes.getClass();
        this.e = typedArrayObtainStyledAttributes.hasValue(3);
        this.f = typedArrayObtainStyledAttributes.getBoolean(5, false);
        if (this.e) {
            int color = typedArrayObtainStyledAttributes.getColor(3, -1);
            Paint paint = new Paint();
            this.b = paint;
            paint.setColor(color);
            Paint paint2 = this.b;
            if (paint2 != null) {
                paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            }
            this.i = resources.getDimensionPixelSize(com.google.android.videos.R.dimen.play_text_view_fadeout);
            this.c = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{16777215 & color, color});
            this.j = resources.getDimensionPixelSize(com.google.android.videos.R.dimen.play_text_view_fadeout_hint_margin);
        }
        String string = typedArrayObtainStyledAttributes.getString(4);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, false);
        if (string == null) {
            string = "";
        } else if (z) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            string = string.toUpperCase(locale);
            string.getClass();
        }
        this.g = string;
        if (string.length() > 0) {
            Paint paint3 = new Paint();
            this.h = paint3;
            paint3.setColor(typedArrayObtainStyledAttributes.getColor(6, getCurrentTextColor()));
            Paint paint4 = this.h;
            if (paint4 != null) {
                paint4.setTextSize(getTextSize());
            }
            Paint paint5 = this.h;
            if (paint5 != null) {
                paint5.setTypeface(getTypeface());
            }
            Paint paint6 = this.h;
            if (paint6 != null) {
                paint6.setAntiAlias(true);
            }
        }
        typedArrayObtainStyledAttributes.getInt(1, 1);
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            fMax = Math.max(0.0f, 1.0f - ((getTextSize() * 1.172f) / (Math.abs(fontMetrics.ascent) + Math.abs(fontMetrics.descent))));
        } else {
            fMax = 0.0f;
        }
        this.d = fMax;
        if (fMax > 0.0f) {
            setLineSpacing(((-fMax) * getTextSize()) + (getLineHeight() * (getLineSpacingMultiplier() - 1.0f)), 1.0f);
        }
        typedArrayObtainStyledAttributes.recycle();
        float dimension = context.getResources().getDimension(com.google.android.videos.R.dimen.play_text_view_outline);
        this.k = dimension;
        Paint paint7 = new Paint();
        this.l = paint7;
        paint7.setStrokeWidth(dimension);
        paint7.setStyle(Paint.Style.STROKE);
        setWillNotDraw(false);
    }

    public /* synthetic */ ExpandableTextView(Context context, AttributeSet attributeSet, int i, int i2, ykn yknVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.textViewStyle : i);
    }
}
