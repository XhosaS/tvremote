package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.tdk;
import defpackage.thq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayCardLabelView extends View {
    private int a;
    private int b;
    private final int c;
    private float d;
    private final TextPaint e;
    private final TextPaint f;
    private int g;
    private int h;
    private boolean i;

    public PlayCardLabelView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean zDispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() != 8) {
            return zDispatchPopulateAccessibilityEvent;
        }
        accessibilityEvent.getText().add(getContentDescription());
        return true;
    }

    @Override // android.view.View
    @ViewDebug.ExportedProperty(category = "layout")
    public final int getBaseline() {
        return getPaddingTop() + this.h;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        int[] iArr = cww.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int layoutDirection = getLayoutDirection();
        int width = getWidth();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        boolean z = this.i;
        boolean z2 = layoutDirection == 0;
        if (z && !TextUtils.isEmpty(null)) {
            canvas.drawText(null, thq.c(width, this.b, z2, paddingStart), this.h + paddingTop, this.e);
            paddingStart += this.b + this.c;
        }
        if (!zIsEmpty) {
            canvas.drawText(null, thq.c(width, this.a, z2, paddingStart), paddingTop + this.h, this.f);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMeasureText;
        int i3;
        int paddingStart = 0;
        boolean z = View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getSize(i) == 0;
        int size = View.MeasureSpec.getSize(i);
        this.b = 0;
        this.i = false;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        if (!z) {
            if (zIsEmpty) {
                iMeasureText = 0;
            } else {
                iMeasureText = (int) this.f.measureText(null);
                this.a = iMeasureText;
            }
            if (!zIsEmpty2) {
                int iMeasureText2 = (int) this.e.measureText(null);
                this.b = iMeasureText2;
                int i4 = iMeasureText2 + (!zIsEmpty ? this.c : 0);
                if (size <= 0 || (i3 = i4 + iMeasureText) > size) {
                    this.i = false;
                } else {
                    this.i = true;
                    iMeasureText = i3;
                }
            }
            int[] iArr = cww.a;
            paddingStart = iMeasureText + getPaddingStart() + getPaddingEnd();
        }
        setMeasuredDimension(paddingStart, this.g + getPaddingTop() + getPaddingBottom());
    }

    public PlayCardLabelView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Resources resources = context.getResources();
        resources.getDimensionPixelSize(R.dimen.play_card_label_icon_gap);
        this.c = resources.getDimensionPixelSize(R.dimen.play_card_label_texts_gap);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tdk.f);
        this.d = typedArrayObtainStyledAttributes.getDimension(1, resources.getDimension(R.dimen.play_medium_size));
        String string = typedArrayObtainStyledAttributes.getString(0);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        textPaint.density = resources.getDisplayMetrics().density;
        textPaint.setTextSize(this.d);
        textPaint.setFakeBoldText(false);
        TextPaint textPaint2 = new TextPaint(1);
        this.e = textPaint2;
        textPaint2.density = resources.getDisplayMetrics().density;
        textPaint2.setTextSize(this.d);
        textPaint2.setColor(resources.getColor(R.color.play_fg_secondary));
        textPaint2.setStrikeThruText(true);
        textPaint2.setFakeBoldText(false);
        if (string != null) {
            Typeface typefaceCreate = Typeface.create(string, 0);
            textPaint.setTypeface(typefaceCreate);
            textPaint2.setTypeface(typefaceCreate);
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        this.g = (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom));
        this.h = (int) Math.abs(fontMetrics.top);
        setWillNotDraw(false);
    }
}
