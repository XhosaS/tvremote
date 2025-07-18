package com.google.android.apps.play.movies.common.view.subtitles;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.fsp;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SubtitleView extends View {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private Layout.Alignment alignment;
    private int backgroundColor;
    private final float cornerRadius;
    private int edgeColor;
    private int edgeType;
    private int foregroundColor;
    private boolean hasMeasurements;
    private int innerPaddingX;
    private int lastMeasuredWidth;
    private StaticLayout layout;
    private final RectF lineBounds;
    private final float outlineWidth;
    private final Paint paint;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private CharSequence text;
    private final TextPaint textPaint;

    public SubtitleView(Context context) {
        this(context, null);
    }

    private boolean computeMeasurements(int i) {
        if (this.hasMeasurements && i == this.lastMeasuredWidth) {
            return true;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i2 = this.innerPaddingX;
        int i3 = i - (paddingLeft + (i2 + i2));
        if (i3 <= 0) {
            return false;
        }
        this.hasMeasurements = true;
        this.lastMeasuredWidth = i3;
        this.layout = new StaticLayout(this.text, this.textPaint, i3, this.alignment, this.spacingMult, this.spacingAdd, true);
        return true;
    }

    private void forceUpdate(boolean z) {
        if (z) {
            this.hasMeasurements = false;
            requestLayout();
        }
        invalidate();
    }

    private void setTypeface(Typeface typeface) {
        if (Objects.equals(this.textPaint.getTypeface(), typeface)) {
            return;
        }
        this.textPaint.setTypeface(typeface);
        forceUpdate(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if (r2 == 4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onDraw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            android.text.StaticLayout r0 = r13.layout
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r14.save()
            int r2 = r13.innerPaddingX
            int r3 = r13.getPaddingLeft()
            int r3 = r3 + r2
            int r4 = r13.getPaddingTop()
            float r4 = (float) r4
            float r3 = (float) r3
            r14.translate(r3, r4)
            android.text.TextPaint r3 = r13.textPaint
            android.graphics.Paint r4 = r13.paint
            android.graphics.RectF r5 = r13.lineBounds
            int r6 = r0.getLineCount()
            int r7 = r13.backgroundColor
            int r7 = android.graphics.Color.alpha(r7)
            r8 = 0
            if (r7 <= 0) goto L60
            float r7 = r13.cornerRadius
            int r9 = r0.getLineTop(r8)
            float r9 = (float) r9
            int r10 = r13.backgroundColor
            r4.setColor(r10)
            android.graphics.Paint$Style r10 = android.graphics.Paint.Style.FILL
            r4.setStyle(r10)
            r10 = r8
        L3e:
            if (r10 >= r6) goto L60
            float r11 = r0.getLineLeft(r10)
            float r12 = (float) r2
            float r11 = r11 - r12
            r5.left = r11
            float r11 = r0.getLineRight(r10)
            float r11 = r11 + r12
            r5.right = r11
            r5.top = r9
            int r9 = r0.getLineBottom(r10)
            float r9 = (float) r9
            r5.bottom = r9
            float r9 = r5.bottom
            r14.drawRoundRect(r5, r7, r7, r4)
            int r10 = r10 + 1
            goto L3e
        L60:
            int r2 = r13.edgeType
            r4 = 1
            if (r2 != r4) goto L7d
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.ROUND
            r3.setStrokeJoin(r2)
            float r2 = r13.outlineWidth
            r3.setStrokeWidth(r2)
            int r2 = r13.edgeColor
            r3.setColor(r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            r3.setStyle(r2)
            r0.draw(r14)
            goto Lbd
        L7d:
            r5 = 2
            if (r2 != r5) goto L8a
            float r2 = r13.shadowRadius
            float r4 = r13.shadowOffset
            int r5 = r13.edgeColor
            r3.setShadowLayer(r2, r4, r4, r5)
            goto Lbd
        L8a:
            r5 = 3
            if (r2 == r5) goto L91
            r4 = 4
            if (r2 != r4) goto Lbd
            goto L94
        L91:
            if (r2 != r5) goto L94
            goto L95
        L94:
            r4 = r8
        L95:
            r2 = -1
            if (r4 == 0) goto L9a
            r5 = r2
            goto L9c
        L9a:
            int r5 = r13.edgeColor
        L9c:
            if (r4 == 0) goto La0
            int r2 = r13.edgeColor
        La0:
            float r4 = r13.shadowRadius
            int r6 = r13.foregroundColor
            r3.setColor(r6)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r3.setStyle(r6)
            float r6 = r13.shadowRadius
            r7 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r7
            float r7 = -r4
            r3.setShadowLayer(r6, r7, r7, r5)
            r0.draw(r14)
            float r5 = r13.shadowRadius
            r3.setShadowLayer(r5, r4, r4, r2)
        Lbd:
            int r2 = r13.foregroundColor
            r3.setColor(r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r3.setStyle(r2)
            r0.draw(r14)
            r0 = 0
            r3.setShadowLayer(r0, r0, r0, r8)
            r14.restoreToCount(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.common.view.subtitles.SubtitleView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        computeMeasurements(i3 - i);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (!computeMeasurements(View.MeasureSpec.getSize(i))) {
            setMeasuredDimension(16777216, 16777216);
            return;
        }
        StaticLayout staticLayout = this.layout;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i3 = this.innerPaddingX;
        int i4 = i3 + i3;
        int height = staticLayout.getHeight() + getPaddingTop() + getPaddingBottom();
        int lineCount = staticLayout.getLineCount();
        int iMax = 0;
        for (int i5 = 0; i5 < lineCount; i5++) {
            iMax = Math.max((int) Math.ceil(staticLayout.getLineWidth(i5)), iMax);
        }
        setMeasuredDimension(iMax + paddingLeft + i4, height);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
        forceUpdate(false);
    }

    public void setStyle(fsp fspVar) {
        this.foregroundColor = fspVar.b;
        this.backgroundColor = fspVar.c;
        this.edgeType = fspVar.e;
        this.edgeColor = fspVar.f;
        setTypeface(fspVar.g);
        super.setBackgroundColor(fspVar.d);
        forceUpdate(true);
    }

    public void setText(CharSequence charSequence) {
        this.text = charSequence;
        forceUpdate(true);
    }

    public void setTextSize(float f) {
        if (this.textPaint.getTextSize() != f) {
            this.textPaint.setTextSize(f);
            this.innerPaddingX = (int) ((f * INNER_PADDING_RATIO) + 0.5f);
            forceUpdate(true);
        }
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SubtitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lineBounds = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.text, R.attr.textSize, R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, i, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 15);
        this.spacingAdd = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.spacingMult = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float f = getContext().getResources().getDisplayMetrics().densityDpi;
        float fRound = Math.round((f + f) / 160.0f);
        this.cornerRadius = fRound;
        this.outlineWidth = fRound;
        this.shadowRadius = fRound;
        this.shadowOffset = fRound;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        this.alignment = Layout.Alignment.ALIGN_CENTER;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.innerPaddingX = 0;
        setText(text);
        setTextSize(dimensionPixelSize);
        setStyle(fsp.a);
    }
}
