package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaga extends FilterInputStream implements InputStreamRetargetInterface {
    private final ByteBuffer a;
    private final ByteBuffer b;
    private final int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final byte[] h;
    private int i;
    private final aafy j;
    private final int k;
    private final int l;

    public aaga(aafx aafxVar, InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.j = aafxVar.g();
        this.c = aafxVar.e();
        this.h = Arrays.copyOf(bArr, bArr.length);
        int iD = aafxVar.d();
        this.k = iD;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iD + 1);
        this.a = byteBufferAllocate;
        byteBufferAllocate.limit(0);
        this.l = iD - aafxVar.c();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(aafxVar.f() + 16);
        this.b = byteBufferAllocate2;
        byteBufferAllocate2.limit(0);
        this.d = false;
        this.e = false;
        this.f = false;
        this.i = 0;
        this.g = false;
    }

    private final void a() throws IOException {
        byte b;
        while (!this.e) {
            ByteBuffer byteBuffer = this.a;
            if (byteBuffer.remaining() <= 0) {
                break;
            }
            int i = this.in.read(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            if (i > 0) {
                byteBuffer.position(byteBuffer.position() + i);
            } else if (i == -1) {
                this.e = true;
            } else if (i == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
        }
        if (this.e) {
            b = 0;
        } else {
            ByteBuffer byteBuffer2 = this.a;
            b = byteBuffer2.get(byteBuffer2.position() - 1);
            byteBuffer2.position(byteBuffer2.position() - 1);
        }
        ByteBuffer byteBuffer3 = this.a;
        byteBuffer3.flip();
        ByteBuffer byteBuffer4 = this.b;
        byteBuffer4.clear();
        try {
            this.j.a(byteBuffer3, this.i, this.e, byteBuffer4);
            this.i++;
            this.b.flip();
            ByteBuffer byteBuffer5 = this.a;
            byteBuffer5.clear();
            if (this.e) {
                return;
            }
            byteBuffer5.clear();
            byteBuffer5.limit(this.k + 1);
            byteBuffer5.put(b);
        } catch (GeneralSecurityException e) {
            c();
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.i + " endOfCiphertext:" + this.e, e);
        }
    }

    private final void b() throws IOException {
        if (this.d) {
            c();
            throw new IOException("Decryption failed.");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.c);
        while (byteBufferAllocate.remaining() > 0) {
            int i = this.in.read(byteBufferAllocate.array(), byteBufferAllocate.position(), byteBufferAllocate.remaining());
            if (i == -1) {
                c();
                throw new IOException("Ciphertext is too short");
            }
            if (i == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
            byteBufferAllocate.position(byteBufferAllocate.position() + i);
        }
        byteBufferAllocate.flip();
        try {
            this.j.b(byteBufferAllocate, this.h);
            this.d = true;
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    private final void c() {
        this.g = true;
        this.b.limit(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return this.b.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == 1) {
            return bArr[0] & 255;
        }
        if (i == -1) {
            return -1;
        }
        throw new IOException("Reading failed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int i;
        if (j <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(this.k, j);
        byte[] bArr = new byte[iMin];
        long j2 = j;
        while (j2 > 0 && (i = read(bArr, 0, (int) Math.min(iMin, j2))) > 0) {
            j2 -= i;
        }
        return j - j2;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder("StreamingAeadDecryptingStream\nsegmentNr:");
        sb.append(this.i);
        sb.append("\nciphertextSegmentSize:");
        sb.append(this.k);
        sb.append("\nheaderRead:");
        sb.append(this.d);
        sb.append("\nendOfCiphertext:");
        sb.append(this.e);
        sb.append("\nendOfPlaintext:");
        sb.append(this.f);
        sb.append("\ndecryptionErrorOccured:");
        sb.append(this.g);
        sb.append("\nciphertextSgement position:");
        ByteBuffer byteBuffer = this.a;
        sb.append(byteBuffer.position());
        sb.append(" limit:");
        sb.append(byteBuffer.limit());
        sb.append("\nplaintextSegment position:");
        ByteBuffer byteBuffer2 = this.b;
        sb.append(byteBuffer2.position());
        sb.append(" limit:");
        sb.append(byteBuffer2.limit());
        return sb.toString();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (this.g) {
            throw new IOException("Decryption failed.");
        }
        if (!this.d) {
            b();
            ByteBuffer byteBuffer = this.a;
            byteBuffer.clear();
            byteBuffer.limit(this.l + 1);
        }
        if (this.f) {
            return -1;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            ByteBuffer byteBuffer2 = this.b;
            if (byteBuffer2.remaining() == 0) {
                if (this.e) {
                    this.f = true;
                    break;
                }
                a();
            }
            int iMin = Math.min(byteBuffer2.remaining(), i2 - i3);
            byteBuffer2.get(bArr, i3 + i, iMin);
            i3 += iMin;
        }
        if (i3 == 0 && this.f) {
            return -1;
        }
        return i3;
    }
}
