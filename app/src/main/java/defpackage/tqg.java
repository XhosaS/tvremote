package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqg extends InputStream implements InputStreamRetargetInterface {
    private static final zdy a = zdy.h("com/google/android/libraries/speech/encoding/AudioEncoderInputStream");
    private final InputStream b;
    private final int d;
    private final int e;
    private final String f;
    private final int g;
    private final ByteBuffer h;
    private final ByteBuffer i;
    private MediaCodec j;
    private ByteBuffer[] k;
    private ByteBuffer[] l;
    private boolean n;
    private boolean o;
    private int m = -1;
    private boolean p = false;
    private final int c = 2048;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167 A[Catch: IOException | IllegalArgumentException -> 0x016b, IOException -> 0x016d, TRY_LEAVE, TryCatch #5 {IOException | IllegalArgumentException -> 0x016b, blocks: (B:42:0x0148, B:52:0x0167, B:50:0x0161, B:45:0x0152, B:48:0x015b, B:49:0x0160), top: B:68:0x0148, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tqg(java.io.InputStream r17, java.lang.String r18, int r19, int r20, int r21) throws defpackage.tqq {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqg.<init>(java.io.InputStream, java.lang.String, int, int, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void a(boolean z) throws tqq {
        int i;
        MediaCodec mediaCodec = this.j;
        if (mediaCodec == null) {
            throw new tqq();
        }
        if (z) {
            b(mediaCodec);
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = this.j.dequeueOutputBuffer(bufferInfo, 10000L);
        if (iDequeueOutputBuffer == -2) {
            MediaFormat outputFormat = this.j.getOutputFormat();
            yqw.L(this.d == outputFormat.getInteger("sample-rate"));
            yqw.L(this.e == outputFormat.getInteger("channel-count"));
            yqw.L(this.f.equals(outputFormat.getString("mime")));
            iDequeueOutputBuffer = this.j.dequeueOutputBuffer(bufferInfo, 10000L);
        }
        yqw.L(iDequeueOutputBuffer != -2);
        int i2 = 4;
        if ((bufferInfo.flags & 4) != 0) {
            int i3 = bufferInfo.size;
            this.o = true;
        }
        if (iDequeueOutputBuffer == -1) {
            return;
        }
        if (iDequeueOutputBuffer == -3) {
            this.l = this.j.getOutputBuffers();
            return;
        }
        if (iDequeueOutputBuffer != -1) {
            if ((bufferInfo.flags & 2) != 0) {
                this.m = iDequeueOutputBuffer;
                MediaCodec mediaCodec2 = this.j;
                if (mediaCodec2 != null) {
                    b(mediaCodec2);
                    return;
                }
                return;
            }
            int i4 = bufferInfo.offset;
            int i5 = bufferInfo.size;
            this.m = iDequeueOutputBuffer;
            int i6 = this.g;
            if (e(i6)) {
                ByteBuffer byteBuffer = this.i;
                byteBuffer.clear();
                int i7 = this.d;
                int i8 = this.e;
                yqw.L(byteBuffer.remaining() >= 7);
                switch (i7) {
                    case 7350:
                        i = 12;
                        break;
                    case 8000:
                        i = 11;
                        break;
                    case 11025:
                        i = 10;
                        break;
                    case 12000:
                        i = 9;
                        break;
                    case 16000:
                        i = 8;
                        break;
                    case 22050:
                        i = 7;
                        break;
                    case 24000:
                        i = 6;
                        break;
                    case 32000:
                        i = 5;
                        break;
                    case 44100:
                        i = 4;
                        break;
                    case 48000:
                        i = 3;
                        break;
                    case 64000:
                        i = 2;
                        break;
                    case 88200:
                        i = 1;
                        break;
                    case 96000:
                        i = 0;
                        break;
                    default:
                        throw new IllegalArgumentException(a.b(i7, "Invalid sample rate: "));
                }
                long jA = tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(0L, 12, 4095), 1, 0), 2, 0), 1, 1), 2, 0), 4, i), 1, 0);
                switch (i8) {
                    case 1:
                        i2 = 1;
                        long jA2 = tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(jA, 3, i2), 1, 0), 1, 0), 1, 0), 1, 0), 13, i5 + 7), 11, 2047), 2, 0);
                        byteBuffer.put((byte) ((jA2 >>> 48) & 255));
                        byteBuffer.put((byte) ((jA2 >>> 40) & 255));
                        byteBuffer.put((byte) ((jA2 >>> 32) & 255));
                        byteBuffer.put((byte) ((jA2 >>> 24) & 255));
                        byteBuffer.put((byte) ((jA2 >>> 16) & 255));
                        byteBuffer.put((byte) ((jA2 >>> 8) & 255));
                        byteBuffer.put((byte) jA2);
                        byteBuffer.flip();
                        break;
                    case 2:
                        i2 = 2;
                        long jA22 = tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(jA, 3, i2), 1, 0), 1, 0), 1, 0), 1, 0), 13, i5 + 7), 11, 2047), 2, 0);
                        byteBuffer.put((byte) ((jA22 >>> 48) & 255));
                        byteBuffer.put((byte) ((jA22 >>> 40) & 255));
                        byteBuffer.put((byte) ((jA22 >>> 32) & 255));
                        byteBuffer.put((byte) ((jA22 >>> 24) & 255));
                        byteBuffer.put((byte) ((jA22 >>> 16) & 255));
                        byteBuffer.put((byte) ((jA22 >>> 8) & 255));
                        byteBuffer.put((byte) jA22);
                        byteBuffer.flip();
                        break;
                    case 3:
                        i2 = 3;
                        long jA222 = tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(jA, 3, i2), 1, 0), 1, 0), 1, 0), 1, 0), 13, i5 + 7), 11, 2047), 2, 0);
                        byteBuffer.put((byte) ((jA222 >>> 48) & 255));
                        byteBuffer.put((byte) ((jA222 >>> 40) & 255));
                        byteBuffer.put((byte) ((jA222 >>> 32) & 255));
                        byteBuffer.put((byte) ((jA222 >>> 24) & 255));
                        byteBuffer.put((byte) ((jA222 >>> 16) & 255));
                        byteBuffer.put((byte) ((jA222 >>> 8) & 255));
                        byteBuffer.put((byte) jA222);
                        byteBuffer.flip();
                        break;
                    case 4:
                        long jA2222 = tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(jA, 3, i2), 1, 0), 1, 0), 1, 0), 1, 0), 13, i5 + 7), 11, 2047), 2, 0);
                        byteBuffer.put((byte) ((jA2222 >>> 48) & 255));
                        byteBuffer.put((byte) ((jA2222 >>> 40) & 255));
                        byteBuffer.put((byte) ((jA2222 >>> 32) & 255));
                        byteBuffer.put((byte) ((jA2222 >>> 24) & 255));
                        byteBuffer.put((byte) ((jA2222 >>> 16) & 255));
                        byteBuffer.put((byte) ((jA2222 >>> 8) & 255));
                        byteBuffer.put((byte) jA2222);
                        byteBuffer.flip();
                        break;
                    case 5:
                        i2 = 5;
                        long jA22222 = tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(jA, 3, i2), 1, 0), 1, 0), 1, 0), 1, 0), 13, i5 + 7), 11, 2047), 2, 0);
                        byteBuffer.put((byte) ((jA22222 >>> 48) & 255));
                        byteBuffer.put((byte) ((jA22222 >>> 40) & 255));
                        byteBuffer.put((byte) ((jA22222 >>> 32) & 255));
                        byteBuffer.put((byte) ((jA22222 >>> 24) & 255));
                        byteBuffer.put((byte) ((jA22222 >>> 16) & 255));
                        byteBuffer.put((byte) ((jA22222 >>> 8) & 255));
                        byteBuffer.put((byte) jA22222);
                        byteBuffer.flip();
                        break;
                    case 6:
                        i2 = 6;
                        long jA222222 = tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(jA, 3, i2), 1, 0), 1, 0), 1, 0), 1, 0), 13, i5 + 7), 11, 2047), 2, 0);
                        byteBuffer.put((byte) ((jA222222 >>> 48) & 255));
                        byteBuffer.put((byte) ((jA222222 >>> 40) & 255));
                        byteBuffer.put((byte) ((jA222222 >>> 32) & 255));
                        byteBuffer.put((byte) ((jA222222 >>> 24) & 255));
                        byteBuffer.put((byte) ((jA222222 >>> 16) & 255));
                        byteBuffer.put((byte) ((jA222222 >>> 8) & 255));
                        byteBuffer.put((byte) jA222222);
                        byteBuffer.flip();
                        break;
                    case 7:
                    default:
                        throw new IllegalArgumentException(a.b(i8, "Invalid channel count: "));
                    case 8:
                        i2 = 7;
                        long jA2222222 = tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(tqe.a(jA, 3, i2), 1, 0), 1, 0), 1, 0), 1, 0), 13, i5 + 7), 11, 2047), 2, 0);
                        byteBuffer.put((byte) ((jA2222222 >>> 48) & 255));
                        byteBuffer.put((byte) ((jA2222222 >>> 40) & 255));
                        byteBuffer.put((byte) ((jA2222222 >>> 32) & 255));
                        byteBuffer.put((byte) ((jA2222222 >>> 24) & 255));
                        byteBuffer.put((byte) ((jA2222222 >>> 16) & 255));
                        byteBuffer.put((byte) ((jA2222222 >>> 8) & 255));
                        byteBuffer.put((byte) jA2222222);
                        byteBuffer.flip();
                        break;
                }
            } else if (i6 == 3) {
                ByteBuffer byteBuffer2 = this.i;
                byteBuffer2.clear();
                if (!this.p) {
                    this.p = true;
                    int i9 = this.d;
                    int i10 = this.e;
                    byteBuffer2.put("OpusHead".getBytes());
                    byteBuffer2.put((byte) 1);
                    byteBuffer2.put((byte) (i10 & 255));
                    byteBuffer2.putShort((short) 80);
                    byteBuffer2.putInt((int) (i9 & 4294967295L));
                    byteBuffer2.putShort((short) 0);
                    byteBuffer2.put((byte) 0);
                }
                if (i5 > 223) {
                    byteBuffer2.put((byte) ((i5 & 31) + 223));
                    byteBuffer2.put((byte) ((i5 >> 5) - 7));
                } else {
                    byteBuffer2.put((byte) i5);
                }
                byteBuffer2.flip();
            }
            ByteBuffer byteBuffer3 = this.l[iDequeueOutputBuffer];
            byteBuffer3.clear();
            byteBuffer3.position(i4);
            byteBuffer3.limit(i4 + i5);
        }
    }

    private final void b(MediaCodec mediaCodec) {
        int i = this.m;
        if (i >= 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.m = -1;
        }
    }

    private final synchronized void c(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        try {
            this.j = mediaCodec;
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.j.start();
            this.k = this.j.getInputBuffers();
            this.l = this.j.getOutputBuffers();
        } catch (Exception e) {
            throw new IllegalArgumentException("Could not create codec", e);
        }
    }

    private final void d(String str, MediaFormat mediaFormat) throws tqq {
        try {
            c(MediaCodec.createEncoderByType(str), mediaFormat);
        } catch (IOException e) {
            throw new tqq(e);
        }
    }

    private static boolean e(int i) {
        return i == 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        zko.a(this.b);
        MediaCodec mediaCodec = this.j;
        if (mediaCodec == null) {
            ((zdv) ((zdv) a.d()).q("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "close", 196, "AudioEncoderInputStream.java")).u("close() called when codec is already closed");
            return;
        }
        try {
            mediaCodec.stop();
            this.j.release();
        } catch (IllegalStateException e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "close", (char) 203, "AudioEncoderInputStream.java")).u("MediaCodec has already been stopped or released.");
        }
        this.j = null;
    }

    public final synchronized void finalize() {
        if (this.j != null) {
            close();
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "finalize", 433, "AudioEncoderInputStream.java")).u("No one closed");
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws tqq {
        int i3;
        int i4;
        int iMin = 0;
        boolean z = this.n && !this.h.hasRemaining();
        while (!z && !this.n && ((i4 = this.m) == -1 || !this.l[i4].hasRemaining())) {
            MediaCodec mediaCodec = this.j;
            if (mediaCodec != null) {
                b(mediaCodec);
                synchronized (this) {
                    int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
                    if (iDequeueInputBuffer != -1) {
                        ByteBuffer byteBuffer = this.k[iDequeueInputBuffer];
                        byteBuffer.clear();
                        byteBuffer.position(0);
                        yqw.L(byteBuffer.hasRemaining());
                        while (true) {
                            int iPosition = byteBuffer.position();
                            int i5 = this.c;
                            if (iPosition >= i5 || !byteBuffer.hasRemaining() || this.n) {
                                break;
                            }
                            ByteBuffer byteBuffer2 = this.h;
                            if (byteBuffer2.hasRemaining()) {
                                int iC = ztm.c(byteBuffer2.remaining(), byteBuffer.remaining(), i5 - byteBuffer.position());
                                byteBuffer.put(byteBuffer2.array(), byteBuffer2.position(), iC);
                                byteBuffer2.position(byteBuffer2.position() + iC);
                            } else {
                                int i6 = this.b.read(byteBuffer2.array());
                                if (i6 == -1) {
                                    break;
                                }
                                byteBuffer2.position(0);
                                byteBuffer2.limit(i6);
                            }
                        }
                        if (byteBuffer.position() > 0) {
                            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, byteBuffer.position(), 0L, 0);
                        } else {
                            this.n = true;
                            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        }
                    }
                }
                a(false);
            } else {
                throw new tqq();
            }
        }
        if (this.n && ((i3 = this.m) == -1 || !this.l[i3].hasRemaining())) {
            if (this.o) {
                return -1;
            }
            a(true);
            int i7 = this.m;
            if (i7 == -1 || !this.l[i7].hasRemaining()) {
                return 0;
            }
        }
        ByteBuffer byteBuffer3 = this.i;
        if (byteBuffer3.hasRemaining()) {
            iMin = Math.min(i2, byteBuffer3.remaining());
            byteBuffer3.get(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
        ByteBuffer byteBuffer4 = this.l[this.m];
        yqw.L(byteBuffer4.hasRemaining());
        int iMin2 = Math.min(i2, byteBuffer4.remaining());
        byteBuffer4.get(bArr, i, iMin2);
        return iMin2 + iMin;
    }
}
