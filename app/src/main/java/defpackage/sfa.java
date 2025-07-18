package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfa extends InputStream implements InputStreamRetargetInterface {
    private final zyd a;
    private rsk b;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private int d;

    public sfa(zyd zydVar) {
        this.a = zydVar;
    }

    private final void a() throws slk {
        if (this.b != null) {
            return;
        }
        try {
            yqt yqtVar = (yqt) this.a.get(30L, TimeUnit.SECONDS);
            if (!yqtVar.g()) {
                throw new slk("No AudioAccessor provided", new NoSuchElementException());
            }
            this.b = (rsk) yqtVar.c();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new slk("Initialization interrupted", e);
        } catch (CancellationException e2) {
            throw new slk("Initialization failed", e2);
        } catch (ExecutionException e3) {
            if (e3.getCause() != null) {
                throw new slk("Initialization failed", e3.getCause());
            }
            throw new slk("Initialization failed", e3);
        } catch (TimeoutException e4) {
            throw new slk("Initialization timed out", e4);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.set(true);
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        this.d += (int) j;
        return j;
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
    public final synchronized int read(byte[] bArr, int i, int i2) {
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.get()) {
            ((zdv) ((zdv) sfb.a.d()).q("com/google/android/libraries/search/audio/audiostream/AudioInputStreamProducer$AudioAccessorInputStream", "read", 79, "AudioInputStreamProducer.java")).u("#audio# read failed: stream closed.");
            return -1;
        }
        a();
        int iMin = Math.min(i2, bArr.length);
        int i3 = 0;
        while (true) {
            if (i3 >= iMin) {
                break;
            }
            int iA = this.b.a(bArr, this.d + i3, i + i3, iMin - i3);
            if (iA >= 0) {
                i3 += iA;
            } else if (i3 == 0) {
                i3 = -1;
            }
        }
        if (i3 < 0) {
            if (!atomicBoolean.get()) {
                ((zdv) ((zdv) sfb.a.d()).q("com/google/android/libraries/search/audio/audiostream/AudioInputStreamProducer$AudioAccessorInputStream", "read", 88, "AudioInputStreamProducer.java")).u("#audio# read failed: read EOF from AudioAccessor.");
                close();
            } else {
                ((zdv) ((zdv) sfb.a.b()).q("com/google/android/libraries/search/audio/audiostream/AudioInputStreamProducer$AudioAccessorInputStream", "read", 91, "AudioInputStreamProducer.java")).u("#audio# AudioAccessor reached EOF.");
            }
            return -1;
        }
        this.d += i3;
        return i3;
    }
}
