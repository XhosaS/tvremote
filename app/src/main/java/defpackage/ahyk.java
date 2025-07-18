package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyk {
    public static UploadDataProvider a(byte[] bArr, int i, int i2) {
        return new ahyh(ByteBuffer.wrap(bArr, i, i2).slice());
    }
}
