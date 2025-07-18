package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vuo {
    public static final Charset a;
    public static final byte[] b;
    public static final ByteBuffer c;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        c = ByteBuffer.wrap(bArr);
        vte.M(bArr);
    }

    static void a(vvj vvjVar) {
        if (vvjVar instanceof vsh) {
            throw null;
        }
    }
}
