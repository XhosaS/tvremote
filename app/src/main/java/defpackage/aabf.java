package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabf {
    public static final aabf a = new aabf();
    private final Map b = new HashMap();

    public final synchronized void a(aadw aadwVar, Class cls) {
        Map map = this.b;
        aadw aadwVar2 = (aadw) map.get(cls);
        if (aadwVar2 != null && !aadwVar2.equals(aadwVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        map.put(cls, aadwVar);
    }
}
