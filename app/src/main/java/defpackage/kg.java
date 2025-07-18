package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kg extends ViewGroup {
    protected final kf a;
    public final Context b;
    public ActionMenuView c;
    public kw d;
    public int e;
    protected ahw f;
    private boolean g;
    private boolean h;

    kg(Context context) {
        this(context, null);
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public final int b(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        int i5 = measuredHeight + i4;
        if (z) {
            view.layout(i - measuredWidth, i4, i, i5);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, i5);
        return measuredWidth;
    }

    public final ahw c(int i, long j) {
        ahw ahwVar = this.f;
        if (ahwVar != null) {
            ahwVar.a();
        }
        if (i != 0) {
            ahw ahwVarD = ahj.d(this);
            ahwVarD.b(0.0f);
            ahwVarD.c(j);
            kf kfVar = this.a;
            kfVar.d(ahwVarD, i);
            ahwVarD.d(kfVar);
            return ahwVarD;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ahw ahwVarD2 = ahj.d(this);
        ahwVarD2.b(1.0f);
        ahwVarD2.c(j);
        kf kfVar2 = this.a;
        kfVar2.d(ahwVarD2, 0);
        ahwVarD2.d(kfVar2);
        return ahwVarD2;
    }

    public final int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.a.a : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, hs.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        kw kwVar = this.d;
        if (kwVar != null) {
            kwVar.h = ih.a(kwVar.b);
            jj jjVar = kwVar.c;
            if (jjVar != null) {
                jjVar.j(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lc
            r5.h = r1
            r0 = r2
        Lc:
            boolean r3 = r5.h
            r4 = 1
            if (r3 != 0) goto L1c
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1c
            if (r6 != 0) goto L1d
            r5.h = r4
            goto L1d
        L1c:
            r2 = r0
        L1d:
            r6 = 10
            if (r2 == r6) goto L24
            r6 = 3
            if (r2 != r6) goto L26
        L24:
            r5.h = r1
        L26:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg.onHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            actionMasked = 0;
        }
        if (!this.g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.g = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ahw ahwVar = this.f;
            if (ahwVar != null) {
                ahwVar.a();
            }
            super.setVisibility(i);
        }
    }

    public kg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public kg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new kf(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
