package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class egp extends HorizontalScrollView implements duj {
    public final dvz a;
    public int b;
    public int c;
    public boolean d;
    public egq e;
    public ValueAnimator f;
    public mpw g;
    public efs h;
    private dtf i;

    public egp(Context context) {
        super(context);
        this.d = true;
        dvz dvzVar = new dvz(context);
        this.a = dvzVar;
        addView(dvzVar);
    }

    @Override // defpackage.duj
    public final void a(List list) {
        list.add(this.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dtf dtfVar = this.i;
        if (dtfVar != null) {
            dtfVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        efs efsVar = this.h;
        if (efsVar != null) {
            efsVar.a(this);
        }
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        super.fling(i);
        efs efsVar = this.h;
        if (efsVar != null) {
            efsVar.b = true;
        }
    }

    @Override // defpackage.duh
    public final dtf getDispatchTouchListener() {
        return this.i;
    }

    @Override // defpackage.duh
    public final void i(dtf dtfVar) {
        this.i = dtfVar;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.b, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        egp egpVar;
        super.onScrollChanged(i, i2, i3, i4);
        if (this.e != null) {
            mpw mpwVar = this.g;
            if (mpwVar != null) {
                int scrollX = getScrollX();
                int i5 = this.e.a;
                View childAt = getChildAt(0);
                CommandOuterClass$Command commandOuterClass$CommandA = mpwVar.b.a();
                acyb acybVar = acyb.a;
                acya acyaVar = new acya();
                float f = scrollX;
                if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acyaVar.y();
                }
                float f2 = mpwVar.d;
                acyb acybVar2 = (acyb) acyaVar.b;
                acybVar2.b |= 1;
                acybVar2.c = f / f2;
                acyb acybVar3 = (acyb) acyaVar.v();
                acys acysVar = acys.a;
                acyr acyrVar = new acyr();
                float measuredHeight = childAt.getMeasuredHeight();
                if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acyrVar.y();
                }
                acys acysVar2 = (acys) acyrVar.b;
                acysVar2.b |= 2;
                acysVar2.d = measuredHeight / f2;
                float measuredWidth = childAt.getMeasuredWidth() / f2;
                if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acyrVar.y();
                }
                oal oalVar = mpwVar.c;
                oaa oaaVar = mpwVar.a;
                acys acysVar3 = (acys) acyrVar.b;
                acysVar3.b |= 1;
                acysVar3.c = measuredWidth;
                nyx nyxVar = (nyx) oalVar;
                egpVar = this;
                mpy.c(egpVar, oaaVar, commandOuterClass$CommandA, nyxVar.q, nyxVar.m, acybVar3, (acys) acyrVar.v(), f2);
            } else {
                egpVar = this;
            }
            egpVar.e.a = getScrollX();
        } else {
            egpVar = this;
        }
        efs efsVar = egpVar.h;
        if (efsVar != null) {
            efsVar.b(this);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d) {
            return false;
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        efs efsVar = this.h;
        if (efsVar != null) {
            efsVar.c(this, motionEvent);
        }
        return zOnTouchEvent;
    }
}
