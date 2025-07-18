package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaap {
    private static final Logger c = Logger.getLogger(aaap.class.getName());
    public static final aaap a = new aaap();
    private final ConcurrentMap d = new ConcurrentHashMap();
    public final ConcurrentMap b = new ConcurrentHashMap();

    private final synchronized void d(aaax aaaxVar) {
        ConcurrentMap concurrentMap = this.b;
        String str = aaaxVar.a;
        if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
        }
        ConcurrentMap concurrentMap2 = this.d;
        aaax aaaxVar2 = (aaax) concurrentMap2.get(str);
        if (aaaxVar2 != null && !aaaxVar2.getClass().equals(aaaxVar.getClass())) {
            c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, aaaxVar2.getClass().getName(), aaaxVar.getClass().getName()));
        }
        concurrentMap2.putIfAbsent(str, aaaxVar);
        concurrentMap.put(str, true);
    }

    public final synchronized aaax a(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.d;
        if (!concurrentMap.containsKey(str)) {
            throw new GeneralSecurityException(a.e(str, "No key manager found for key type ", ", see https://developers.google.com/tink/faq/registration_errors"));
        }
        return (aaax) concurrentMap.get(str);
    }

    public final synchronized void b(aaax aaaxVar) {
        c(aaaxVar, aaae.ALGORITHM_NOT_FIPS);
    }

    public final synchronized void c(aaax aaaxVar, aaae aaaeVar) {
        if (!aaaeVar.a()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        d(aaaxVar);
    }
}
