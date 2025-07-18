package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sax implements tae, sba, scd {
    private static final zdy c = zdy.h("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer");
    int a;
    public final AtomicInteger b;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final Lock e;
    private final Condition f;
    private final byte[] g;
    private final String h;
    private int i;
    private boolean j;
    private final List k;
    private final smw l;

    public sax(int i, List list, smw smwVar) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.e = reentrantLock;
        this.f = reentrantLock.newCondition();
        this.i = 0;
        this.a = 0;
        this.b = new AtomicInteger(0);
        this.g = new byte[i];
        this.k = list;
        this.l = smwVar;
        String strA = szx.a(this);
        this.h = strA;
        smwVar.d(strA);
    }

    private final int i() {
        return ((this.g.length * this.a) + this.i) - 1;
    }

    @Override // defpackage.rsk
    public final /* synthetic */ int a(byte[] bArr, int i, int i2, int i3) {
        return saz.a(this, bArr, i, i2, i3);
    }

    @Override // defpackage.tac
    public final int b() {
        return this.b.get();
    }

    @Override // defpackage.sba
    public final int c(byte[] bArr, int i, int i2, int i3, int i4) {
        Lock lock = this.e;
        lock.lock();
        int iMin = -1;
        int i5 = -1;
        while (true) {
            try {
                try {
                    f(i);
                    i5 = i();
                    if (i5 >= -1) {
                        if (i >= i4) {
                            break;
                        }
                        if (i > i5) {
                            if (this.j) {
                                break;
                            }
                            this.f.await();
                            f(i);
                            i5 = i();
                        }
                        if (i <= i5) {
                            iMin = Math.min(Math.min(i3, (i5 - i) + 1), bArr.length - i2);
                            byte[] bArr2 = this.g;
                            int length = bArr2.length;
                            int i6 = i % length;
                            int i7 = length - i6;
                            if (i7 >= iMin) {
                                System.arraycopy(bArr2, i6, bArr, i2, iMin);
                            } else {
                                System.arraycopy(bArr2, i6, bArr, i2, i7);
                                System.arraycopy(bArr2, 0, bArr, i2 + i7, iMin - i7);
                            }
                        }
                    } else {
                        if (this.d.compareAndSet(false, true)) {
                            this.l.c(this.h, i() + 1);
                        }
                        throw new slm("Total audio bytes captured exceeded max limit. Buffer: ".concat(String.valueOf(this.h)));
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    smw smwVar = this.l;
                    String str = this.h;
                    smwVar.b(str, i5 + 1);
                    ((zdv) ((zdv) c.d().o(zfi.a, "ALT.BytesAccessorBuffer")).q("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer", "copyFromBuffer", 208, "AudioAccessorAudioBuffer.java")).x("#audio# copyFromBuffer interrupted: exception in wait. Buffer: %s", str);
                    throw new sll(a.j(str, "Reading from Audio Accessor interrupted. Buffer: "), e);
                }
            } catch (Throwable th) {
                this.e.unlock();
                throw th;
            }
        }
        lock.unlock();
        return iMin;
    }

    @Override // defpackage.scd
    public final List d() {
        return sci.b(this.k);
    }

    @Override // defpackage.scd
    public final /* synthetic */ void e(List list) {
        list.getClass();
    }

    final void f(int i) {
        this.e.lock();
        try {
            int i2 = this.a;
            if (i < (i2 > 0 ? (this.g.length * (i2 - 1)) + this.i : 0)) {
                if (this.d.compareAndSet(false, true)) {
                    this.l.e(this.h, i() + 1);
                }
                throw new slm();
            }
        } finally {
            this.e.unlock();
        }
    }

    @Override // defpackage.tac
    public final void g() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((sch) it.next()).b();
        }
        Lock lock = this.e;
        lock.lock();
        try {
            if (this.j) {
                this.f.signalAll();
            } else {
                this.j = true;
                int i = i() + 1;
                zdv zdvVar = (zdv) ((zdv) c.b().o(zfi.a, "ALT.BytesAccessorBuffer")).q("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer", "markBufferClosed", 115, "AudioAccessorAudioBuffer.java");
                String str = this.h;
                zdvVar.D("#audio# mark buffer(%s) closed, available bytes(%d)", str, i);
                this.l.a(str, i);
                this.f.signalAll();
                lock = this.e;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f.signalAll();
            this.e.unlock();
            throw th;
        }
    }

    @Override // defpackage.tae
    public final /* synthetic */ void h(sdx sdxVar, byte[] bArr) {
        boolean z;
        int i = sdxVar.a;
        if (i < 0) {
            ((zdv) ((zdv) ((zdv) c.d().o(zfi.a, "ALT.BytesAccessorBuffer")).N()).q("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer", "writeToBuffer", 128, "AudioAccessorAudioBuffer.java")).u("#audio# skipping an error write request");
            return;
        }
        Iterator it = this.k.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                int iC = ((sch) it.next()).c(bArr, i);
                if (z || iC == 3) {
                    z = true;
                }
            }
        }
        if (z) {
            ((zdv) ((zdv) ((zdv) c.b().o(zfi.a, "ALT.BytesAccessorBuffer")).N()).q("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer", "writeToBuffer", 140, "AudioAccessorAudioBuffer.java")).u("#audio# silencing audio due to skip requested...");
            bArr = new byte[i];
        }
        Lock lock = this.e;
        lock.lock();
        try {
            if (this.j) {
                lock.unlock();
                return;
            }
            byte[] bArr2 = this.g;
            int length = bArr2.length;
            yqw.B(length >= i, "Read size cannot be larger than the size of the buffer");
            int i2 = this.i;
            int i3 = length - i2;
            if (i3 > i) {
                System.arraycopy(bArr, 0, bArr2, i2, i);
            } else {
                System.arraycopy(bArr, 0, bArr2, i2, i3);
                System.arraycopy(bArr, i3, bArr2, 0, i - i3);
                zer zerVar = zfi.a;
                this.a++;
            }
            this.i = (this.i + i) % length;
            this.b.set(i() + 1);
            zer zerVar2 = zfi.a;
            TimeUnit.SECONDS.getClass();
            this.f.signalAll();
        } finally {
            this.e.unlock();
        }
    }
}
