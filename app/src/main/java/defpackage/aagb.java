package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aagb extends FilterOutputStream {
    final ByteBuffer a;
    final ByteBuffer b;
    boolean c;
    private final aafz d;
    private final int e;

    public aagb(aafx aafxVar, OutputStream outputStream, byte[] bArr) throws IOException {
        super(outputStream);
        aafz aafzVarH = aafxVar.h(bArr);
        this.d = aafzVarH;
        int iF = aafxVar.f();
        this.e = iF;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iF);
        this.a = byteBufferAllocate;
        this.b = ByteBuffer.allocate(aafxVar.d());
        byteBufferAllocate.limit(iF - aafxVar.c());
        ByteBuffer byteBufferA = aafzVarH.a();
        byte[] bArr2 = new byte[byteBufferA.remaining()];
        byteBufferA.get(bArr2);
        this.out.write(bArr2);
        this.c = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            try {
                ByteBuffer byteBuffer = this.a;
                byteBuffer.flip();
                ByteBuffer byteBuffer2 = this.b;
                byteBuffer2.clear();
                this.d.c(byteBuffer, byteBuffer2);
                ByteBuffer byteBuffer3 = this.b;
                byteBuffer3.flip();
                this.out.write(byteBuffer3.array(), byteBuffer3.position(), byteBuffer3.remaining());
                this.c = false;
                super.close();
            } catch (GeneralSecurityException e) {
                ByteBuffer byteBuffer4 = this.a;
                ByteBuffer byteBuffer5 = this.b;
                throw new IOException("ptBuffer.remaining():" + byteBuffer4.remaining() + " ctBuffer.remaining():" + byteBuffer5.remaining(), e);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (!this.c) {
            throw new IOException("Trying to write to closed stream");
        }
        while (true) {
            ByteBuffer byteBuffer = this.a;
            if (i2 > byteBuffer.remaining()) {
                int iRemaining = byteBuffer.remaining();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, iRemaining);
                i += iRemaining;
                i2 -= iRemaining;
                try {
                    byteBuffer.flip();
                    ByteBuffer byteBuffer2 = this.b;
                    byteBuffer2.clear();
                    this.d.b(byteBuffer, byteBufferWrap, byteBuffer2);
                    byteBuffer2.flip();
                    this.out.write(byteBuffer2.array(), byteBuffer2.position(), byteBuffer2.remaining());
                    byteBuffer.clear();
                    byteBuffer.limit(this.e);
                } catch (GeneralSecurityException e) {
                    throw new IOException(e);
                }
            } else {
                this.a.put(bArr, i, i2);
            }
        }
    }
}
