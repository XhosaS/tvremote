package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfx extends ViewGroup implements SurfaceHolder.Callback, mfy {
    public final mfw a;
    public final View b;
    public meq c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public msg j;
    private final Runnable k;
    private boolean l;
    private boolean m;
    private lmi n;

    public mfx(Context context, SurfaceView surfaceView) {
        super(context, null);
        this.c = new meq(0, 0);
        mfw mfwVar = new mfw(this, context, surfaceView);
        this.a = mfwVar;
        mfwVar.c.getHolder().addCallback(this);
        View view = new View(context);
        this.b = view;
        view.setBackgroundColor(-16777216);
        this.k = new ljl(this, 16, null);
        m();
    }

    @Override // defpackage.mfy
    public final Surface a() {
        return this.a.c.getHolder().getSurface();
    }

    @Override // defpackage.mfy
    public final void b() {
        View view = this.b;
        view.removeCallbacks(this.k);
        view.setVisibility(0);
    }

    @Override // defpackage.mfy
    public final void c() {
        this.b.postDelayed(this.k, 500L);
    }

    @Override // defpackage.mfy
    public final void d() {
        if (this.l) {
            mfw mfwVar = this.a;
            removeView(mfwVar);
            addView(mfwVar, 0);
        }
    }

    @Override // defpackage.mfy
    public final void e() {
        lmi lmiVar;
        if (this.m && (lmiVar = this.n) != null) {
            lmiVar.q();
        }
        this.n = null;
        Surface surface = this.a.c.getHolder().getSurface();
        if (surface != null) {
            surface.release();
        }
    }

    @Override // defpackage.mfy
    public final void f(int i, int i2) {
        meq meqVar = this.c;
        int i3 = meqVar.a;
        int i4 = meqVar.b;
        if (i3 == i && i4 == i2) {
            return;
        }
        this.c = new meq(i, i2);
        this.a.a();
    }

    @Override // defpackage.mfy
    public final void g(int i) {
        if (this.i) {
            this.f = i;
        } else {
            h(i);
        }
    }

    public final void h(int i) {
        if (this.e != i) {
            this.e = i;
            this.a.a();
        }
    }

    @Override // defpackage.mfy
    public final void i(boolean z) {
        if (this.d != z) {
            this.d = z;
            msg msgVar = this.j;
            if (msgVar != null) {
                msgVar.a();
            }
        }
    }

    @Override // defpackage.mfy
    public final boolean j() {
        return this.m;
    }

    @Override // defpackage.mfy
    public final boolean k() {
        if (!this.d || this.i) {
            return false;
        }
        mfw mfwVar = this.a;
        return mfwVar.b <= 0.9f && mfwVar.a <= 0.9f;
    }

    @Override // defpackage.mfy
    public final void l(lmi lmiVar) {
        this.n = lmiVar;
    }

    @Override // defpackage.mfy
    public final void m() {
        if (this.l) {
            return;
        }
        this.l = true;
        addView(this.a);
        addView(this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mfw mfwVar = this.a;
        mfwVar.layout(0, 0, mfwVar.getMeasuredWidth(), mfwVar.getMeasuredHeight());
        View view = this.b;
        if (view.getVisibility() != 8) {
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        mfw mfwVar = this.a;
        mfwVar.measure(i, i2);
        View view = this.b;
        int measuredWidth = mfwVar.getMeasuredWidth();
        int measuredHeight = mfwVar.getMeasuredHeight();
        if (view.getVisibility() != 8) {
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.m = true;
        lmi lmiVar = this.n;
        if (lmiVar != null) {
            lmiVar.h();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.m = false;
        lmi lmiVar = this.n;
        if (lmiVar != null) {
            lmiVar.q();
        }
        b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }
}
