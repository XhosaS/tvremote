package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xzk extends OutputStream {
    final /* synthetic */ xzm a;

    public xzk(xzm xzmVar) {
        this.a = xzmVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.d(bArr, i, i2);
    }
}
