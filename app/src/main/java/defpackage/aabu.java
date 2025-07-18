package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabu {
    public final Map a;
    public final Map b;

    public aabu() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public final void a(aabs aabsVar) throws GeneralSecurityException {
        aabv aabvVar = new aabv(aabsVar.b, aabsVar.c);
        Map map = this.a;
        if (!map.containsKey(aabvVar)) {
            map.put(aabvVar, aabsVar);
            return;
        }
        aabs aabsVar2 = (aabs) map.get(aabvVar);
        if (!aabsVar2.equals(aabsVar) || !aabsVar.equals(aabsVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(aabvVar.toString()));
        }
    }

    public final void b(aabx aabxVar) throws GeneralSecurityException {
        Map map = this.b;
        if (!map.containsKey(zzy.class)) {
            map.put(zzy.class, aabxVar);
            return;
        }
        aabx aabxVar2 = (aabx) map.get(zzy.class);
        if (!aabxVar2.equals(aabxVar) || !aabxVar.equals(aabxVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzy.class.toString()));
        }
    }

    public aabu(aabw aabwVar) {
        this.a = new HashMap(aabwVar.a);
        this.b = new HashMap(aabwVar.b);
    }
}
