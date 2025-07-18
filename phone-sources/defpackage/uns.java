package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uns {
    public static final /* synthetic */ int a = 0;
    private static final byte b = Byte.parseByte("01110000", 2);
    private static final byte c = Byte.parseByte("00001111", 2);

    public static final String a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b2 = bArrArray[0];
        bArrArray[16] = b2;
        bArrArray[0] = (byte) ((b2 & c) | b);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
