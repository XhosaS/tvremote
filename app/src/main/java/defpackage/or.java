package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class or extends qr {
    protected PointF c;
    private final DisplayMetrics f;
    private float o;
    protected final LinearInterpolator a = new LinearInterpolator();
    protected final DecelerateInterpolator b = new DecelerateInterpolator();
    private boolean n = false;
    protected int d = 0;
    protected int e = 0;

    public or(Context context) {
        this.f = context.getResources().getDisplayMetrics();
    }

    private final int o(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int b(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    protected final int c(int i) {
        return (int) Math.ceil(d(i) / 0.3356d);
    }

    protected int d(int i) {
        float fAbs = Math.abs(i);
        if (!this.n) {
            this.o = a(this.f);
            this.n = true;
        }
        return (int) Math.ceil(fAbs * this.o);
    }

    protected int e() {
        PointF pointF = this.c;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.c.x <= 0.0f ? -1 : 1;
    }

    protected int f() {
        PointF pointF = this.c;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.c.y <= 0.0f ? -1 : 1;
    }

    @Override // defpackage.qr
    protected void g() {
        this.e = 0;
        this.d = 0;
        this.c = null;
    }

    @Override // defpackage.qr
    protected final void h(int i, int i2, qp qpVar) {
        if (j() == 0) {
            n();
            return;
        }
        int iO = o(this.d, i);
        this.d = iO;
        int iO2 = o(this.e, i2);
        this.e = iO2;
        if (iO == 0 && iO2 == 0) {
            PointF pointFK = k(this.g);
            if (pointFK == null || (pointFK.x == 0.0f && pointFK.y == 0.0f)) {
                qpVar.a = this.g;
                n();
                return;
            }
            float fSqrt = (float) Math.sqrt((pointFK.x * pointFK.x) + (pointFK.y * pointFK.y));
            pointFK.x /= fSqrt;
            pointFK.y /= fSqrt;
            this.c = pointFK;
            this.d = (int) (pointFK.x * 10000.0f);
            this.e = (int) (pointFK.y * 10000.0f);
            int iD = d(10000);
            qpVar.b((int) (this.d * 1.2f), (int) (this.e * 1.2f), (int) (iD * 1.2f), this.a);
        }
    }

    @Override // defpackage.qr
    protected void i(View view, qp qpVar) {
        or orVar;
        int iB;
        int iE = e();
        qd qdVar = this.i;
        int iB2 = 0;
        if (qdVar == null || !qdVar.ad()) {
            orVar = this;
            iB = 0;
        } else {
            qe qeVar = (qe) view.getLayoutParams();
            int iAw = qdVar.aw(view) - qeVar.leftMargin;
            int iAz = qdVar.az(view) + qeVar.rightMargin;
            int paddingLeft = qdVar.getPaddingLeft();
            int paddingRight = qdVar.H - qdVar.getPaddingRight();
            orVar = this;
            iB = orVar.b(iAw, iAz, paddingLeft, paddingRight, iE);
        }
        int iF = f();
        qd qdVar2 = orVar.i;
        if (qdVar2 != null && qdVar2.ae()) {
            qe qeVar2 = (qe) view.getLayoutParams();
            iB2 = orVar.b(qdVar2.aA(view) - qeVar2.topMargin, qdVar2.av(view) + qeVar2.bottomMargin, qdVar2.getPaddingTop(), qdVar2.I - qdVar2.getPaddingBottom(), iF);
        }
        int iC = c((int) Math.sqrt((iB * iB) + (iB2 * iB2)));
        if (iC > 0) {
            qpVar.b(-iB, -iB2, iC, orVar.b);
        }
    }
}
