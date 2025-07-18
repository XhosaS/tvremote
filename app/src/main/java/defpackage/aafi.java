package defpackage;

import java.security.Provider;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aafi implements aafl {
    private final aafu a;

    public aafi(aafu aafuVar) {
        this.a = aafuVar;
    }

    @Override // defpackage.aafl
    public final Object a(String str) {
        Iterator it = aafm.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.a.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.a.a(str, null);
    }
}
