package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
class dky implements dal {
    private final ByteBuffer a = ByteBuffer.allocate(8);

    @Override // defpackage.dal
    public final /* bridge */ /* synthetic */ void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        ByteBuffer byteBuffer = this.a;
        synchronized (byteBuffer) {
            byteBuffer.position(0);
            messageDigest.update(byteBuffer.putLong(l.longValue()).array());
        }
    }
}
