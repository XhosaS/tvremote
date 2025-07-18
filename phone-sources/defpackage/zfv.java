package defpackage;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfv implements zfw {
    private zfw a;
    private final zft b;

    public zfv(zft zftVar) {
        this.b = zftVar;
    }

    private final synchronized zfw e(SSLSocket sSLSocket) {
        if (this.a == null && this.b.a(sSLSocket)) {
            Class<?> cls = sSLSocket.getClass();
            Class<?> superclass = cls;
            while (superclass != null && !yks.e(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    Objects.toString(cls);
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type ".concat(String.valueOf(cls)));
                }
            }
            superclass.getClass();
            this.a = new zfu(superclass);
        }
        return this.a;
    }

    @Override // defpackage.zfw
    public final String a(SSLSocket sSLSocket) {
        zfw zfwVarE = e(sSLSocket);
        if (zfwVarE != null) {
            return zfwVarE.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.zfw
    public final void b(SSLSocket sSLSocket, String str, List list) {
        zfw zfwVarE = e(sSLSocket);
        if (zfwVarE != null) {
            zfwVarE.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.zfw
    public final boolean c() {
        return true;
    }

    @Override // defpackage.zfw
    public final boolean d(SSLSocket sSLSocket) {
        return this.b.a(sSLSocket);
    }
}
