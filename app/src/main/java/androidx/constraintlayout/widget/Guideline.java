package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.zr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Guideline extends View {
    private final boolean a;

    public Guideline(Context context) {
        super(context);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        zr zrVar = (zr) getLayoutParams();
        if (this.a && zrVar.a == i) {
            return;
        }
        zrVar.a = i;
        setLayoutParams(zrVar);
    }

    public void setGuidelineEnd(int i) {
        zr zrVar = (zr) getLayoutParams();
        if (this.a && zrVar.b == i) {
            return;
        }
        zrVar.b = i;
        setLayoutParams(zrVar);
    }

    public void setGuidelinePercent(float f) {
        zr zrVar = (zr) getLayoutParams();
        if (this.a && zrVar.c == f) {
            return;
        }
        zrVar.c = f;
        setLayoutParams(zrVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
