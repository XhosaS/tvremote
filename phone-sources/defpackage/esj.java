package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esj extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat f;
    public long g;
    public boolean h;
    public IllegalStateException i;
    public pku l;
    private MediaFormat m;
    private MediaCodec.CodecException n;
    private MediaCodec.CryptoException o;
    public final Object a = new Object();
    public final edh j = new edh((char[]) null);
    public final edh k = new edh((char[]) null);
    public final ArrayDeque d = new ArrayDeque();
    public final ArrayDeque e = new ArrayDeque();

    public esj(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    private final void d(MediaFormat mediaFormat) {
        this.k.t(-2);
        this.e.add(mediaFormat);
    }

    public final void a() {
        ArrayDeque arrayDeque = this.e;
        if (!arrayDeque.isEmpty()) {
            this.m = (MediaFormat) arrayDeque.getLast();
        }
        this.j.u();
        this.k.u();
        this.d.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.i;
        if (illegalStateException != null) {
            this.i = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.n;
        if (codecException != null) {
            this.n = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.o;
        if (cryptoException == null) {
            return;
        }
        this.o = null;
        throw cryptoException;
    }

    public final boolean c() {
        return this.g > 0 || this.h;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.o = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.n = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        pku pkuVar;
        synchronized (this.a) {
            this.j.t(i);
            pku pkuVar2 = this.l;
            if (pkuVar2 != null && (pkuVar = ((esv) pkuVar2.a).w) != null) {
                pkuVar.r();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        pku pkuVar;
        synchronized (this.a) {
            MediaFormat mediaFormat = this.m;
            if (mediaFormat != null) {
                d(mediaFormat);
                this.m = null;
            }
            this.k.t(i);
            this.d.add(bufferInfo);
            pku pkuVar2 = this.l;
            if (pkuVar2 != null && (pkuVar = ((esv) pkuVar2.a).w) != null) {
                pkuVar.r();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            d(mediaFormat);
            this.m = null;
        }
    }
}
