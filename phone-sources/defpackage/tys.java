package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class tys extends tyu {
    private final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // defpackage.tyu
    public final void a(char c) {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.putChar(c);
        try {
            b(byteBuffer.array(), 2);
        } finally {
            this.a.clear();
        }
    }

    protected void b(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.tyu, defpackage.tza
    public final void c(byte[] bArr, int i) {
        sij.w(0, i, bArr.length);
        b(bArr, i);
    }
}
