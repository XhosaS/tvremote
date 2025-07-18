package com.google.android.libraries.speech.transcription.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.uai;
import defpackage.yxl;
import defpackage.zdv;
import defpackage.zdy;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DrawSoundLevelsView extends View {
    private static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/ui/DrawSoundLevelsView");
    private final int b;
    private final Paint c;
    private final yxl d;

    public DrawSoundLevelsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iIntValue = 0;
        canvas.drawColor(0);
        if (isEnabled()) {
            int iMin = Math.min(getHeight(), getWidth());
            int i = this.b;
            int i2 = iMin - i;
            yxl yxlVar = this.d;
            int size = yxlVar.size();
            if (size != 0) {
                if (size == 1) {
                    iIntValue = ((Integer) yxlVar.peek()).intValue();
                } else {
                    Iterator it = yxlVar.iterator();
                    double d = 0.0d;
                    while (it.hasNext()) {
                        double dIntValue = ((Integer) it.next()).intValue();
                        d += ((dIntValue + dIntValue) * iIntValue) / ((size - 1) * size);
                        iIntValue++;
                    }
                    iIntValue = (int) d;
                }
            }
            int i3 = ((i2 * iIntValue) / 100) + i;
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, i3 / 2, this.c);
        }
    }

    public void setSpeechLevel(int i) {
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/ui/DrawSoundLevelsView", "setSpeechLevel", 53, "DrawSoundLevelsView.java")).v("#setSpeechLevel %d", i);
        this.d.add(Integer.valueOf(i));
        invalidate();
    }

    public DrawSoundLevelsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new yxl(20);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uai.a, i, 0);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        this.b = (int) typedArrayObtainStyledAttributes.getDimension(0, 2.1311672E9f);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(color);
    }
}
