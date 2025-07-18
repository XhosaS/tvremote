package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxs extends dvv {
    public final int g;
    public final dxy h;
    public dxt i;
    private dvk j;

    public dxs(int i, dxy dxyVar) {
        this.g = i;
        this.h = dxyVar;
        if (dxyVar.h != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dxyVar.h = this;
        dxyVar.b = i;
    }

    @Override // defpackage.dvs
    protected final void f() {
        if (dxr.b(2)) {
            toString();
        }
        dxy dxyVar = this.h;
        dxyVar.d = true;
        dxyVar.f = false;
        dxyVar.e = false;
        dxyVar.h();
    }

    @Override // defpackage.dvs
    protected final void g() {
        if (dxr.b(2)) {
            toString();
        }
        dxy dxyVar = this.h;
        dxyVar.d = false;
        dxyVar.i();
    }

    @Override // defpackage.dvs
    public final void i(dvw dvwVar) {
        super.i(dvwVar);
        this.j = null;
        this.i = null;
    }

    public final void n() {
        dvk dvkVar = this.j;
        dxt dxtVar = this.i;
        if (dvkVar == null || dxtVar == null) {
            return;
        }
        super.i(dxtVar);
        d(dvkVar, dxtVar);
    }

    public final void o() {
        if (dxr.b(3)) {
            toString();
        }
        dxy dxyVar = this.h;
        dxyVar.f();
        dxyVar.e = true;
        dxt dxtVar = this.i;
        if (dxtVar != null) {
            i(dxtVar);
            if (dxtVar.c) {
                if (dxr.b(2)) {
                    Objects.toString(dxtVar.a);
                }
                dxtVar.b.c();
            }
        }
        dxs dxsVar = dxyVar.h;
        if (dxsVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (dxsVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        dxyVar.h = null;
        dxyVar.f = true;
        dxyVar.d = false;
        dxyVar.e = false;
        dxyVar.g = false;
    }

    final void p(dvk dvkVar, dxq dxqVar) {
        dxt dxtVar = new dxt(this.h, dxqVar);
        d(dvkVar, dxtVar);
        dvw dvwVar = this.i;
        if (dvwVar != null) {
            i(dvwVar);
        }
        this.j = dvkVar;
        this.i = dxtVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.g);
        sb.append(" : ");
        dxy dxyVar = this.h;
        sb.append(dxyVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(dxyVar)));
        sb.append("}}");
        return sb.toString();
    }
}
