package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagc {
    public static void a(ByteBuffer byteBuffer, long j) throws GeneralSecurityException {
        if (j < 0 || j >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBuffer.putInt((int) j);
    }
}
