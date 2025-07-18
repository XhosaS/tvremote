package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlc {
    public static final Charset a = StandardCharsets.UTF_8;
    public static final InetAddress b;

    static {
        InetAddress byName;
        try {
            byName = InetAddress.getByName("224.0.0.251");
        } catch (UnknownHostException unused) {
            byName = null;
        }
        b = byName;
    }
}
