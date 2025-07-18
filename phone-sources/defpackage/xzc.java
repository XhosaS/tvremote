package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzc {
    public final yba a;
    public final Object b;
    public final Map c;
    private final xza d;
    private final Map e;
    private final Map f;

    public xzc(xza xzaVar, Map map, Map map2, yba ybaVar, Object obj, Map map3) {
        this.d = xzaVar;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.a = ybaVar;
        this.b = obj;
        this.c = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    final xrc a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new xzb(this);
    }

    final xza b(xsq xsqVar) {
        xza xzaVar = (xza) this.e.get(xsqVar.b);
        if (xzaVar == null) {
            xzaVar = (xza) this.f.get(xsqVar.c);
        }
        return xzaVar == null ? this.d : xzaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            xzc xzcVar = (xzc) obj;
            if (a.Q(this.d, xzcVar.d) && a.Q(this.e, xzcVar.e) && a.Q(this.f, xzcVar.f) && a.Q(this.a, xzcVar.a) && a.Q(this.b, xzcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("defaultMethodConfig", this.d);
        tssVarH.b("serviceMethodMap", this.e);
        tssVarH.b("serviceMap", this.f);
        tssVarH.b("retryThrottling", this.a);
        tssVarH.b("loadBalancingConfig", this.b);
        return tssVarH.toString();
    }
}
