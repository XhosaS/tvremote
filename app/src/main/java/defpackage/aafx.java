package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class aafx implements zzy {
    @Override // defpackage.zzy
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new aaga(this, inputStream, bArr);
    }

    @Override // defpackage.zzy
    public final OutputStream b(OutputStream outputStream, byte[] bArr) {
        return new aagb(this, outputStream, bArr);
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract aafy g();

    public abstract aafz h(byte[] bArr);
}
