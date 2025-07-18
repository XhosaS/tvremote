package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dkq extends FilterInputStream implements InputStreamRetargetInterface {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final ddx f;

    public dkq(InputStream inputStream, ddx ddxVar) {
        super(inputStream);
        this.d = -1;
        this.f = ddxVar;
        this.a = (byte[]) ddxVar.a(65536, byte[].class);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int c(java.io.InputStream r6, byte[] r7) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.d
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L53
            int r3 = r5.e
            int r3 = r3 - r0
            int r4 = r5.c
            if (r3 < r4) goto Le
            goto L53
        Le:
            if (r0 != 0) goto L32
            int r0 = r7.length
            if (r4 <= r0) goto L31
            int r2 = r5.b
            if (r2 != r0) goto L31
            ddx r2 = r5.f
            int r3 = r0 + r0
            if (r3 <= r4) goto L1e
            goto L1f
        L1e:
            r4 = r3
        L1f:
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.Object r3 = r2.a(r4, r3)
            byte[] r3 = (byte[]) r3
            java.lang.System.arraycopy(r7, r1, r3, r1, r0)
            r5.a = r3
            r2.c(r7)
            r7 = r3
            goto L39
        L31:
            r0 = r1
        L32:
            if (r0 <= 0) goto L39
            int r2 = r7.length
            int r2 = r2 - r0
            java.lang.System.arraycopy(r7, r0, r7, r1, r2)
        L39:
            int r0 = r5.e
            int r2 = r5.d
            int r0 = r0 - r2
            r5.e = r0
            r5.d = r1
            r5.b = r1
            int r1 = r7.length
            int r1 = r1 - r0
            int r6 = r6.read(r7, r0, r1)
            int r7 = r5.e
            if (r6 > 0) goto L4f
            goto L50
        L4f:
            int r7 = r7 + r6
        L50:
            r5.b = r7
            return r6
        L53:
            int r6 = r6.read(r7)
            if (r6 <= 0) goto L5f
            r5.d = r2
            r5.e = r1
            r5.b = r6
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkq.c(java.io.InputStream, byte[]):int");
    }

    private static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized void a() {
        this.c = this.a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.a == null || inputStream == null) {
            throw d();
        }
        return (this.b - this.e) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.a != null) {
            this.f.c(this.a);
            this.a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.a != null) {
            this.f.c(this.a);
            this.a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw d();
        }
        if (this.e < this.b || c(inputStream, bArr) != -1) {
            if (bArr != this.a && (bArr = this.a) == null) {
                throw d();
            }
            int i = this.b;
            int i2 = this.e;
            if (i - i2 > 0) {
                this.e = i2 + 1;
                return bArr[i2] & 255;
            }
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.d;
        if (i == -1) {
            throw new dkp("Mark has been invalidated, pos: " + this.e + " markLimit: " + this.c);
        }
        this.e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.a;
        if (bArr == null) {
            throw d();
        }
        InputStream inputStream = this.in;
        if (inputStream == null) {
            throw d();
        }
        int i = this.b;
        long j2 = this.e;
        if (i - r5 >= j) {
            this.e = (int) (j2 + j);
            return j;
        }
        long j3 = i;
        this.e = i;
        long j4 = j3 - j2;
        if (this.d == -1 || j > this.c) {
            long jSkip = inputStream.skip(j - j4);
            if (jSkip > 0) {
                this.d = -1;
            }
            return j4 + jSkip;
        }
        if (c(inputStream, bArr) == -1) {
            return j4;
        }
        int i2 = this.b;
        long j5 = this.e;
        if (i2 - r1 >= j - j4) {
            this.e = (int) ((j5 + j) - j4);
            return j;
        }
        long j6 = j4 + i2;
        this.e = i2;
        return j6 - j5;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0068 A[Catch: all -> 0x0084, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000a, B:11:0x000e, B:13:0x0014, B:16:0x0018, B:18:0x0022, B:25:0x0030, B:27:0x0035, B:29:0x0038, B:49:0x0068, B:32:0x003f, B:34:0x0045, B:36:0x0049, B:39:0x004e, B:40:0x0052, B:41:0x0053, B:44:0x005b, B:61:0x007a, B:62:0x007e, B:63:0x007f, B:64:0x0083), top: B:68:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0066 A[SYNTHETIC] */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.a     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L7f
            if (r8 != 0) goto La
            monitor-exit(r5)
            r6 = 0
            return r6
        La:
            java.io.InputStream r1 = r5.in     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L7a
            int r2 = r5.e     // Catch: java.lang.Throwable -> L84
            int r3 = r5.b     // Catch: java.lang.Throwable -> L84
            if (r2 >= r3) goto L2f
            int r3 = r3 - r2
            if (r3 < r8) goto L18
            r3 = r8
        L18:
            java.lang.System.arraycopy(r0, r2, r6, r7, r3)     // Catch: java.lang.Throwable -> L84
            int r2 = r5.e     // Catch: java.lang.Throwable -> L84
            int r2 = r2 + r3
            r5.e = r2     // Catch: java.lang.Throwable -> L84
            if (r3 == r8) goto L2d
            int r2 = r1.available()     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L29
            goto L2d
        L29:
            int r7 = r7 + r3
            int r2 = r8 - r3
            goto L30
        L2d:
            monitor-exit(r5)
            return r3
        L2f:
            r2 = r8
        L30:
            int r3 = r5.d     // Catch: java.lang.Throwable -> L84
            r4 = -1
            if (r3 != r4) goto L3f
            int r3 = r0.length     // Catch: java.lang.Throwable -> L84
            if (r2 < r3) goto L3f
            int r3 = r1.read(r6, r7, r2)     // Catch: java.lang.Throwable -> L84
            if (r3 != r4) goto L63
            goto L73
        L3f:
            int r3 = r5.c(r1, r0)     // Catch: java.lang.Throwable -> L84
            if (r3 == r4) goto L73
            byte[] r3 = r5.a     // Catch: java.lang.Throwable -> L84
            if (r0 == r3) goto L53
            byte[] r0 = r5.a     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L4e
            goto L53
        L4e:
            java.io.IOException r6 = d()     // Catch: java.lang.Throwable -> L84
            throw r6     // Catch: java.lang.Throwable -> L84
        L53:
            int r3 = r5.b     // Catch: java.lang.Throwable -> L84
            int r4 = r5.e     // Catch: java.lang.Throwable -> L84
            int r3 = r3 - r4
            if (r3 < r2) goto L5b
            r3 = r2
        L5b:
            java.lang.System.arraycopy(r0, r4, r6, r7, r3)     // Catch: java.lang.Throwable -> L84
            int r4 = r5.e     // Catch: java.lang.Throwable -> L84
            int r4 = r4 + r3
            r5.e = r4     // Catch: java.lang.Throwable -> L84
        L63:
            int r2 = r2 - r3
            if (r2 != 0) goto L68
            monitor-exit(r5)
            return r8
        L68:
            int r4 = r1.available()     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L71
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L71:
            int r7 = r7 + r3
            goto L30
        L73:
            if (r2 != r8) goto L77
            monitor-exit(r5)
            return r4
        L77:
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L7a:
            java.io.IOException r6 = d()     // Catch: java.lang.Throwable -> L84
            throw r6     // Catch: java.lang.Throwable -> L84
        L7f:
            java.io.IOException r6 = d()     // Catch: java.lang.Throwable -> L84
            throw r6     // Catch: java.lang.Throwable -> L84
        L84:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L84
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkq.read(byte[], int, int):int");
    }
}
