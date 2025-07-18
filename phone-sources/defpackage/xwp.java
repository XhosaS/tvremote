package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwp extends xsy {
    private static final boolean a = ykn.E(xwp.class.getClassLoader());

    @Override // defpackage.xsu
    public final xsx a(URI uri, xss xssVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        path.getClass();
        sij.v(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String strSubstring = path.substring(1);
        uri.getAuthority();
        return new xwo(strSubstring, xssVar, xxc.n, new ttl(), a);
    }

    @Override // defpackage.xsu
    public final String b() {
        return "dns";
    }

    @Override // defpackage.xsy
    public final Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.xsy
    protected final void d() {
    }

    @Override // defpackage.xsy
    public final void e() {
    }
}
