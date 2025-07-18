package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esf implements esp {
    public final MediaCodec a;
    public final esj b;
    public final esq c;
    public int d = 0;
    public final ghc e;
    private boolean f;

    public esf(MediaCodec mediaCodec, HandlerThread handlerThread, esq esqVar, ghc ghcVar) {
        this.a = mediaCodec;
        this.b = new esj(handlerThread);
        this.c = esqVar;
        this.e = ghcVar;
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.esp
    public final int a() {
        this.c.c();
        esj esjVar = this.b;
        synchronized (esjVar.a) {
            esjVar.b();
            int iS = -1;
            if (esjVar.c()) {
                return -1;
            }
            edh edhVar = esjVar.j;
            if (!edhVar.v()) {
                iS = edhVar.s();
            }
            return iS;
        }
    }

    @Override // defpackage.esp
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        this.c.c();
        esj esjVar = this.b;
        synchronized (esjVar.a) {
            esjVar.b();
            if (esjVar.c()) {
                return -1;
            }
            edh edhVar = esjVar.k;
            if (edhVar.v()) {
                return -1;
            }
            int iS = edhVar.s();
            if (iS >= 0) {
                eci.e(esjVar.f);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) esjVar.d.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iS == -2) {
                esjVar.f = (MediaFormat) esjVar.e.remove();
                iS = -2;
            }
            return iS;
        }
    }

    @Override // defpackage.esp
    public final MediaFormat c() {
        MediaFormat mediaFormat;
        esj esjVar = this.b;
        synchronized (esjVar.a) {
            mediaFormat = esjVar.f;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.esp
    public final ByteBuffer e(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.esp
    public final ByteBuffer f(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.esp
    public final void g() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.esp
    public final void h() {
        this.c.b();
        this.a.flush();
        esj esjVar = this.b;
        synchronized (esjVar.a) {
            esjVar.g++;
            Handler handler = esjVar.c;
            String str = edt.a;
            handler.post(new emy(esjVar, 7));
        }
        this.a.start();
    }

    @Override // defpackage.esp
    public final void i() {
        ghc ghcVar;
        ghc ghcVar2;
        try {
            try {
                if (this.d == 1) {
                    esq esqVar = this.c;
                    if (((esi) esqVar).g) {
                        ((esi) esqVar).b();
                        ((esi) esqVar).d.quit();
                    }
                    ((esi) esqVar).g = false;
                    esj esjVar = this.b;
                    synchronized (esjVar.a) {
                        esjVar.h = true;
                        esjVar.b.quit();
                        esjVar.a();
                    }
                }
                this.d = 2;
            } finally {
                if (!this.f) {
                    if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                        this.a.stop();
                    }
                    if (Build.VERSION.SDK_INT >= 35 && (ghcVar = this.e) != null) {
                        ghcVar.f(this.a);
                    }
                    this.a.release();
                    this.f = true;
                }
            }
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (ghcVar2 = this.e) != null) {
                ghcVar2.f(this.a);
            }
            this.a.release();
            this.f = true;
            throw th;
        }
    }

    @Override // defpackage.esp
    public final void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.esp
    public final void k(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.esp
    public final void l(Bundle bundle) {
        esi esiVar = (esi) this.c;
        esiVar.c();
        Handler handler = esiVar.e;
        String str = edt.a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.esp
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.esp
    public final void n(fbj fbjVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new etf(fbjVar, 1), handler);
    }

    @Override // defpackage.esp
    public final void o(int i, int i2, long j, int i3) {
        esi esiVar = (esi) this.c;
        esiVar.c();
        esh eshVarA = esi.a();
        eshVarA.a(i, i2, j, i3);
        Handler handler = esiVar.e;
        String str = edt.a;
        handler.obtainMessage(1, eshVarA).sendToTarget();
    }

    @Override // defpackage.esp
    public final void p(int i, ehg ehgVar, long j, int i2) {
        esi esiVar = (esi) this.c;
        esiVar.c();
        esh eshVarA = esi.a();
        eshVarA.a(i, 0, j, i2);
        MediaCodec.CryptoInfo cryptoInfo = eshVarA.d;
        cryptoInfo.numSubSamples = ehgVar.f;
        cryptoInfo.numBytesOfClearData = esi.e(ehgVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = esi.e(ehgVar.e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrD = esi.d(ehgVar.b, cryptoInfo.key);
        bArrD.getClass();
        cryptoInfo.key = bArrD;
        byte[] bArrD2 = esi.d(ehgVar.a, cryptoInfo.iv);
        bArrD2.getClass();
        cryptoInfo.iv = bArrD2;
        cryptoInfo.mode = ehgVar.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(ehgVar.g, ehgVar.h));
        Handler handler = esiVar.e;
        String str = edt.a;
        handler.obtainMessage(2, eshVarA).sendToTarget();
    }

    @Override // defpackage.esp
    public final void q(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.esp
    public final void r(pku pkuVar) {
        esj esjVar = this.b;
        synchronized (esjVar.a) {
            esjVar.l = pkuVar;
        }
    }
}
