package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xug implements yby {
    public final ByteBuffer a;

    public xug(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.yby
    public final int a() {
        return this.a.position();
    }

    @Override // defpackage.yby
    public final int b() {
        return this.a.remaining();
    }

    @Override // defpackage.yby
    public final void c(byte b) {
        this.a.put(b);
    }

    @Override // defpackage.yby
    public final void d(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }
}
