package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afqw extends afiw {
    private static final boolean a = afjt.b(afqw.class.getClassLoader());

    @Override // defpackage.afiq
    public final afiv a(URI uri, afio afioVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        path.getClass();
        yqw.J(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String strSubstring = path.substring(1);
        uri.getAuthority();
        return new afqv(strSubstring, afioVar, afrq.m, new yrn(), a);
    }

    @Override // defpackage.afiq
    public final String b() {
        return "dns";
    }

    @Override // defpackage.afiw
    public final Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.afiw
    protected final void d() {
    }

    @Override // defpackage.afiw
    public final void e() {
    }
}
