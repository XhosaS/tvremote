package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zjg extends zji {
    public final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // defpackage.zji
    public final void a(char c) {
        this.a.putChar(c);
        b(2);
    }

    public final void b(int i) {
        try {
            c(this.a.array(), i);
        } finally {
            this.a.clear();
        }
    }

    protected void c(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.zji
    public final void d(byte[] bArr, int i) {
        yqw.K(0, i, bArr.length);
        c(bArr, i);
    }

    @Override // defpackage.zji
    public final void e(byte[] bArr) {
        bArr.getClass();
        c(bArr, bArr.length);
    }
}
