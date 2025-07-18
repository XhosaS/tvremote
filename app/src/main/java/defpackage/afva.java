package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afva {
    public final afye a;
    public final Object b;
    public final Map c;
    private final afuy d;
    private final Map e;
    private final Map f;

    public afva(afuy afuyVar, Map map, Map map2, afye afyeVar, Object obj, Map map3) {
        this.d = afuyVar;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.a = afyeVar;
        this.b = obj;
        this.c = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    final afgo a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new afuz(this);
    }

    final afuy b(afil afilVar) {
        afuy afuyVar = (afuy) this.e.get(afilVar.b);
        if (afuyVar == null) {
            afuyVar = (afuy) this.f.get(afilVar.c);
        }
        return afuyVar == null ? this.d : afuyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            afva afvaVar = (afva) obj;
            if (yqs.a(this.d, afvaVar.d) && yqs.a(this.e, afvaVar.e) && yqs.a(this.f, afvaVar.f) && yqs.a(this.a, afvaVar.a) && yqs.a(this.b, afvaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("defaultMethodConfig", this.d);
        yqqVarB.b("serviceMethodMap", this.e);
        yqqVarB.b("serviceMap", this.f);
        yqqVarB.b("retryThrottling", this.a);
        yqqVarB.b("loadBalancingConfig", this.b);
        return yqqVarB.toString();
    }
}
