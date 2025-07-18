package defpackage;

import com.google.audio.hearing.common.OggOpusEncoder;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqp extends InputStream implements InputStreamRetargetInterface {
    public static final zdy a = zdy.h("com/google/android/libraries/speech/encoding/OggOpusInputStream");
    public static boolean b = false;
    private final InputStream c;
    private long f;
    private final OggOpusEncoder g;
    private final yow h;
    private final yov i;
    private boolean e = false;
    private final int d = 2048;

    public tqp(InputStream inputStream, int i, int i2, int i3) {
        yov yovVar;
        this.c = inputStream;
        if (!b) {
            a();
        }
        OggOpusEncoder oggOpusEncoder = new OggOpusEncoder();
        this.g = oggOpusEncoder;
        if (oggOpusEncoder.a != 0) {
            oggOpusEncoder.a();
        }
        oggOpusEncoder.a = oggOpusEncoder.init(i3, i2, i, true);
        yow yowVar = new yow(i2 * 8);
        this.h = yowVar;
        synchronized (yowVar.e) {
            yovVar = new yov(yowVar);
            yowVar.e.add(yovVar);
        }
        this.i = yovVar;
    }

    private static void a() {
        ((zdv) ((zdv) a.d()).q("com/google/android/libraries/speech/encoding/OggOpusInputStream", "checkNativeOggOpusInstall", 63, "OggOpusInputStream.java")).u("Native lib ogg_opus_encoder has not been explicitly loaded! Relying on System.loadLibrary() is unsafe on Android: attempts to use encoder may crash. Please call #initNativeOggOpusLib in the process before instantiating OggOpusInputStream.");
        try {
            System.loadLibrary("ogg_opus_encoder");
        } catch (UnsatisfiedLinkError e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/speech/encoding/OggOpusInputStream", "checkNativeOggOpusInstall", 'G', "OggOpusInputStream.java")).u("Implicit load of libogg_opus_encoder.so failed and OggOpusInputStream will crash! Please call #maybeInitNativeOggOpusLib() before instantiating OggOpusInputStream.");
        }
    }

    private final void b(byte[] bArr) {
        yow yowVar = this.h;
        int length = bArr.length;
        if (yowVar.b(bArr, length)) {
            return;
        }
        ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/encoding/OggOpusInputStream", "enqueueEncodedBytes", 103, "OggOpusInputStream.java")).v("OggOpus-encoded bytes are not being read quickly enough! Up to %s encoded bytes may be discarded.", length);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
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
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[this.d]);
        if (!this.e) {
            try {
                int i3 = this.c.read(byteBufferWrap.array());
                if (i3 == -1) {
                    this.e = true;
                    b(this.g.a());
                } else {
                    this.f += i3;
                    OggOpusEncoder oggOpusEncoder = this.g;
                    b(oggOpusEncoder.processAudioBytes(oggOpusEncoder.a, byteBufferWrap.array(), 0, byteBufferWrap.array().length));
                }
            } catch (IOException e) {
                b(this.g.a());
                throw e;
            }
        }
        yov yovVar = this.i;
        int iMin = Math.min(i2, yovVar.a());
        if (this.e && iMin == 0) {
            return -1;
        }
        yow yowVar = yovVar.a;
        long j = yowVar.d - yovVar.c;
        int i4 = yowVar.c;
        long j2 = i4;
        if (j > j2) {
            long j3 = j - iMin;
            yovVar.b((int) (j3 % j2));
            yovVar.c += j3;
            ((zdv) ((zdv) yow.a.c()).q("com/google/audio/hearing/common/CircularByteBuffer", "internalRead", 204, "CircularByteBuffer.java")).u("We lost data before this read!");
        }
        if (iMin == 0) {
            yovVar.b(iMin);
            yovVar.c += iMin;
        } else if (iMin >= 0 && iMin <= yovVar.a()) {
            int i5 = yovVar.b;
            int i6 = (i5 + iMin) % i4;
            if (i5 < i6) {
                System.arraycopy(yowVar.b, i5, bArr, i, i6 - i5);
            } else {
                byte[] bArr2 = yowVar.b;
                System.arraycopy(bArr2, i5, bArr, i, i4 - i5);
                int i7 = yovVar.b;
                System.arraycopy(bArr2, 0, bArr, (i + i4) - i7, iMin - (i4 - i7));
            }
            yovVar.b(iMin);
            yovVar.c += iMin;
        }
        return iMin;
    }
}
