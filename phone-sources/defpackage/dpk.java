package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpk {
    static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int i = doo.h;
        dom domVar = new dom(bArr);
        try {
            int i2 = domVar.c;
            if (i2 < 0) {
                throw new dpm("Failed to parse the message.");
            }
            if (i2 > domVar.d) {
                throw new dpm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            domVar.d = i2;
            int i3 = domVar.a + domVar.b;
            domVar.a = i3;
            if (i3 <= i2) {
                domVar.b = 0;
                return;
            }
            int i4 = i3 - i2;
            domVar.b = i4;
            domVar.a = i3 - i4;
        } catch (dpm e) {
            throw new IllegalArgumentException(e);
        }
    }
}
