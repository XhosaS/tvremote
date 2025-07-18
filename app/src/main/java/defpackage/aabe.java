package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabe {
    private final Map c = new HashMap();
    private static final aabd b = new aabd() { // from class: aabc
        @Override // defpackage.aabd
        public final zzn a(zzw zzwVar) {
            throw null;
        }
    };
    public static final aabe a = c();

    private static aabe c() {
        aabe aabeVar = new aabe();
        try {
            aabeVar.b(b, aaba.class);
            return aabeVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized zzn a(zzw zzwVar, Integer num) {
        aabd aabdVar;
        aabdVar = (aabd) this.c.get(zzwVar.getClass());
        if (aabdVar == null) {
            throw new GeneralSecurityException(a.t(zzwVar, "Cannot create a new key for parameters ", ": no key creator for this class was registered."));
        }
        return aabdVar.a(zzwVar);
    }

    public final synchronized void b(aabd aabdVar, Class cls) {
        Map map = this.c;
        aabd aabdVar2 = (aabd) map.get(cls);
        if (aabdVar2 != null && !aabdVar2.equals(aabdVar)) {
            throw new GeneralSecurityException(a.t(cls, "Different key creator for parameters class ", " already inserted"));
        }
        map.put(cls, aabdVar);
    }
}
