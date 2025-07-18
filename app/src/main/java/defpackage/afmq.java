package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afmq implements agaf {
    public final ByteBuffer a;

    public afmq(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.agaf
    public final int a() {
        return this.a.position();
    }

    @Override // defpackage.agaf
    public final int b() {
        return this.a.remaining();
    }

    @Override // defpackage.agaf
    public final void c(byte b) {
        this.a.put(b);
    }

    @Override // defpackage.agaf
    public final void d(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }
}
