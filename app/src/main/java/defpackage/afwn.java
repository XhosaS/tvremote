package defpackage;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface afwn extends Closeable {
    void b();

    void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean d();

    int f();

    int g();

    afwn h(int i);

    void j(ByteBuffer byteBuffer);

    void k(OutputStream outputStream, int i);

    void l(byte[] bArr, int i, int i2);

    void m(int i);
}
