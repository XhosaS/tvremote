package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxe extends fxc {
    public final fxp d;
    public final List e;
    private final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxe(fxp fxpVar, String str) {
        super(fxpVar.a(fxf.class), null);
        fxpVar.getClass();
        this.e = new ArrayList();
        this.d = fxpVar;
        this.f = str;
    }

    public final fxd c() {
        fxd fxdVar = (fxd) super.a();
        fyu fyuVar = fxdVar.f;
        for (fxb fxbVar : this.e) {
            if (fxbVar != null) {
                int iB = fxbVar.b();
                String strF = fxbVar.f();
                if (iB == 0) {
                    if (strF == null) {
                        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    }
                    iB = 0;
                }
                fxd fxdVar2 = fyuVar.a;
                if (fxdVar2.f() != null && yks.e(strF, fxdVar2.f())) {
                    throw new IllegalArgumentException(a.ck(fxdVar2, fxbVar, "Destination ", " cannot have the same route as graph "));
                }
                if (iB == fxdVar2.b()) {
                    throw new IllegalArgumentException(a.ck(fxdVar2, fxbVar, "Destination ", " cannot have the same id as graph "));
                }
                kp kpVar = fyuVar.b;
                fxb fxbVar2 = (fxb) kq.a(kpVar, iB);
                if (fxbVar2 == fxbVar) {
                    continue;
                } else {
                    if (fxbVar.c != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (fxbVar2 != null) {
                        fxbVar2.c = null;
                    }
                    fxbVar.c = fxdVar2;
                    kpVar.h(fxbVar.b(), fxbVar);
                }
            }
        }
        String str = this.f;
        fxd fxdVar3 = fyuVar.a;
        if (yks.e(str, fxdVar3.f())) {
            throw new IllegalArgumentException("Start destination " + str + " cannot use the same route as the graph " + fxdVar3);
        }
        if (ylh.L(str)) {
            throw new IllegalArgumentException("Cannot have an empty start destination route");
        }
        fyuVar.c = fus.g(str).hashCode();
        fyuVar.e = str;
        return fxdVar;
    }
}
