package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
class dkz implements dal {
    private final ByteBuffer a = ByteBuffer.allocate(4);

    @Override // defpackage.dal
    public final /* bridge */ /* synthetic */ void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        ByteBuffer byteBuffer = this.a;
        synchronized (byteBuffer) {
            byteBuffer.position(0);
            messageDigest.update(byteBuffer.putInt(num.intValue()).array());
        }
    }
}
