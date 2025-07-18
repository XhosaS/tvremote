package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aaae {
    ALGORITHM_NOT_FIPS,
    ALGORITHM_REQUIRES_BORINGCRYPTO;

    public final boolean a() {
        Boolean bool;
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return !aaaf.a();
        }
        if (iOrdinal != 1) {
            throw null;
        }
        if (aaaf.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                aaaf.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = false;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
