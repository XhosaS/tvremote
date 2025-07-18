package defpackage;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yek {
    public static final Logger a = Logger.getLogger(yeh.class.getName());
    public static final zgn b;

    static {
        zgn zgnVar = zgn.a;
        b = wcq.aD("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    public static int b(zgm zgmVar) {
        return (zgmVar.d() & 255) | ((zgmVar.d() & 255) << 16) | ((zgmVar.d() & 255) << 8);
    }

    public static IOException c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    public static IllegalArgumentException d(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }
}
