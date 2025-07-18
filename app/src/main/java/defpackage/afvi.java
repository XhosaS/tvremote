package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afvi extends OutputStream {
    final /* synthetic */ afvk a;

    public afvi(afvk afvkVar) {
        this.a = afvkVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a.c(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.c(bArr, i, i2);
    }
}
