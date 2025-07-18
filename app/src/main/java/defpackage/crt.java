package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class crt {
    public cxb d;
    private final crq e;
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public crt(List list) {
        crq crsVar;
        if (list.isEmpty()) {
            crsVar = new crp();
        } else {
            crsVar = list.size() == 1 ? new crs(list) : new crr(list);
        }
        this.e = crsVar;
    }

    private final float k() {
        float f = this.g;
        if (f != -1.0f) {
            return f;
        }
        float fB = this.e.b();
        this.g = fB;
        return fB;
    }

    public float a() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float fA = this.e.a();
        this.h = fA;
        return fA;
    }

    public final float b() {
        cwz cwzVarD = d();
        if (cwzVarD == null || cwzVarD.e()) {
            return 0.0f;
        }
        return cwzVarD.d.getInterpolation(c());
    }

    final float c() {
        if (this.b) {
            return 0.0f;
        }
        cwz cwzVarD = d();
        if (cwzVarD.e()) {
            return 0.0f;
        }
        return (this.c - cwzVarD.c()) / (cwzVarD.b() - cwzVarD.c());
    }

    public final cwz d() {
        cwz cwzVarC = this.e.c();
        coy.a();
        return cwzVarC;
    }

    public Object e() {
        Interpolator interpolator;
        float fC = c();
        if (this.d == null && this.e.d(fC)) {
            return this.f;
        }
        cwz cwzVarD = d();
        Interpolator interpolator2 = cwzVarD.e;
        Object objF = (interpolator2 == null || (interpolator = cwzVarD.f) == null) ? f(cwzVarD, b()) : g(cwzVarD, fC, interpolator2.getInterpolation(fC), interpolator.getInterpolation(fC));
        this.f = objF;
        return objF;
    }

    public abstract Object f(cwz cwzVar, float f);

    protected Object g(cwz cwzVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public final void h(cro croVar) {
        this.a.add(croVar);
    }

    public void i() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((cro) list.get(i)).d();
            i++;
        }
    }

    public void j(float f) {
        crq crqVar = this.e;
        if (crqVar.e()) {
            return;
        }
        if (f < k()) {
            f = k();
        } else if (f > a()) {
            f = a();
        }
        if (f != this.c) {
            this.c = f;
            if (crqVar.f(f)) {
                i();
            }
        }
    }
}
