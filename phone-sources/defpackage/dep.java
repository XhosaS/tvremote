package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dep {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int i = ddv.h;
        ddt ddtVar = new ddt(bArr);
        try {
            int i2 = ddtVar.c;
            if (i2 < 0) {
                throw new der("Failed to parse the message.");
            }
            if (i2 > ddtVar.d) {
                throw new der("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            ddtVar.d = i2;
            int i3 = ddtVar.a + ddtVar.b;
            ddtVar.a = i3;
            if (i3 <= i2) {
                ddtVar.b = 0;
                return;
            }
            int i4 = i3 - i2;
            ddtVar.b = i4;
            ddtVar.a = i3 - i4;
        } catch (der e) {
            throw new IllegalArgumentException(e);
        }
    }
}
