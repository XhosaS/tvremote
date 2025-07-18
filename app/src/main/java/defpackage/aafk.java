package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aafk implements aafl {
    private final aafu a;

    public aafk(aafu aafuVar) {
        this.a = aafuVar;
    }

    @Override // defpackage.aafl
    public final Object a(String str) throws GeneralSecurityException {
        Iterator it = aafm.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.a.a(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
