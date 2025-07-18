package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzk {
    public final InputStream a;

    private zzk(InputStream inputStream) {
        this.a = inputStream;
    }

    public static zzk a(byte[] bArr) {
        return new zzk(new ByteArrayInputStream(bArr));
    }
}
