package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hdg {
    public hhu d;
    private final hdd e;
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public hdg(List list) {
        hdd hdfVar;
        if (list.isEmpty()) {
            hdfVar = new hdc();
        } else {
            hdfVar = list.size() == 1 ? new hdf(list) : new hde(list);
        }
        this.e = hdfVar;
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
        hhs hhsVarD = d();
        if (hhsVarD == null || hhsVarD.e()) {
            return 0.0f;
        }
        return hhsVarD.d.getInterpolation(c());
    }

    final float c() {
        if (this.b) {
            return 0.0f;
        }
        hhs hhsVarD = d();
        if (hhsVarD.e()) {
            return 0.0f;
        }
        return (this.c - hhsVarD.c()) / (hhsVarD.b() - hhsVarD.c());
    }

    public final hhs d() {
        hhs hhsVarC = this.e.c();
        hbd.a();
        return hhsVarC;
    }

    public Object e() {
        Interpolator interpolator;
        float fC = c();
        if (this.d == null && this.e.d(fC)) {
            return this.f;
        }
        hhs hhsVarD = d();
        Interpolator interpolator2 = hhsVarD.e;
        Object objF = (interpolator2 == null || (interpolator = hhsVarD.f) == null) ? f(hhsVarD, b()) : g(hhsVarD, fC, interpolator2.getInterpolation(fC), interpolator.getInterpolation(fC));
        this.f = objF;
        return objF;
    }

    public abstract Object f(hhs hhsVar, float f);

    protected Object g(hhs hhsVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public final void h(hdb hdbVar) {
        this.a.add(hdbVar);
    }

    public void i() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((hdb) list.get(i)).d();
            i++;
        }
    }

    public void j(float f) {
        hdd hddVar = this.e;
        if (hddVar.e()) {
            return;
        }
        if (f < k()) {
            f = k();
        } else if (f > a()) {
            f = a();
        }
        if (f != this.c) {
            this.c = f;
            if (hddVar.f(f)) {
                i();
            }
        }
    }
}
