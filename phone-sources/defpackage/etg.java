package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etg implements esp {
    private final MediaCodec a;
    private final ghc b;

    public etg(MediaCodec mediaCodec, ghc ghcVar) {
        this.a = mediaCodec;
        this.b = ghcVar;
        if (Build.VERSION.SDK_INT < 35 || ghcVar == null) {
            return;
        }
        ghcVar.e(mediaCodec);
    }

    @Override // defpackage.esp
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.esp
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.esp
    public final MediaFormat c() {
        return this.a.getOutputFormat();
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
        this.a.flush();
    }

    @Override // defpackage.esp
    public final void i() {
        ghc ghcVar;
        ghc ghcVar2;
        try {
            if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                this.a.stop();
            }
            if (Build.VERSION.SDK_INT >= 35 && (ghcVar2 = this.b) != null) {
                ghcVar2.f(this.a);
            }
            this.a.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (ghcVar = this.b) != null) {
                ghcVar.f(this.a);
            }
            this.a.release();
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
        this.a.setParameters(bundle);
    }

    @Override // defpackage.esp
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.esp
    public final void n(fbj fbjVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new etf(fbjVar, 0), handler);
    }

    @Override // defpackage.esp
    public final void o(int i, int i2, long j, int i3) throws MediaCodec.CryptoException {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.esp
    public final void p(int i, ehg ehgVar, long j, int i2) throws MediaCodec.CryptoException {
        this.a.queueSecureInputBuffer(i, 0, ehgVar.i, j, i2);
    }

    @Override // defpackage.esp
    public final void q(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.esp
    public final /* synthetic */ void r(pku pkuVar) {
    }
}
