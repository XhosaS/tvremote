package com.google.android.exoplayer2.ext.vp9;

import android.view.Surface;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import defpackage.edt;
import defpackage.ehf;
import defpackage.ehg;
import defpackage.ehi;
import defpackage.ehk;
import defpackage.ehm;
import defpackage.eho;
import defpackage.nef;
import defpackage.nej;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VpxDecoder extends eho<ehk, VideoDecoderOutputBuffer, nej> {
    public final long a;
    public volatile int b;
    private final CryptoConfig c;
    private ByteBuffer d;

    public VpxDecoder(int i, CryptoConfig cryptoConfig, int i2) throws nej {
        super(new ehk[4], new VideoDecoderOutputBuffer[4]);
        if (!VpxLibrary.a()) {
            throw new nej("Failed to load decoder native libraries.");
        }
        this.c = cryptoConfig;
        if (cryptoConfig != null && !VpxLibrary.vpxIsSecureDecodeSupported()) {
            throw new nej("Vpx decoder does not support secure decode.");
        }
        long jVpxInit = vpxInit(false, false, i2);
        this.a = jVpxInit;
        if (jVpxInit == 0) {
            throw new nej("Failed to initialize decoder");
        }
        p(i);
    }

    private native long vpxClose(long j);

    private native long vpxDecode(long j, ByteBuffer byteBuffer, int i);

    private native int vpxGetErrorCode(long j);

    private native String vpxGetErrorMessage(long j);

    private native int vpxGetFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxInit(boolean z, boolean z2, int i);

    private native int vpxReleaseFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxSecureDecode(long j, ByteBuffer byteBuffer, int i, CryptoConfig cryptoConfig, int i2, byte[] bArr, byte[] bArr2, int i3, int[] iArr, int[] iArr2);

    @Override // defpackage.ehh
    public final String c() {
        return "libvpx".concat(String.valueOf(VpxLibrary.a() ? VpxLibrary.vpxGetVersion() : null));
    }

    @Override // defpackage.eho, defpackage.ehh
    public final void f() throws InterruptedException {
        super.f();
        this.d = null;
        vpxClose(this.a);
    }

    @Override // defpackage.eho
    protected final /* synthetic */ ehi h(Throwable th) {
        return new nej("Unexpected decode error", th);
    }

    @Override // defpackage.eho
    protected final /* bridge */ /* synthetic */ ehi i(ehk ehkVar, ehm ehmVar, boolean z) {
        VpxDecoder vpxDecoder;
        long jVpxDecode;
        ByteBuffer byteBuffer;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ehmVar;
        if (z && (byteBuffer = this.d) != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = ehkVar.c;
        String str = edt.a;
        int iLimit = byteBuffer2.limit();
        ehg ehgVar = ehkVar.b;
        if (ehkVar.c()) {
            long j = this.a;
            CryptoConfig cryptoConfig = this.c;
            int i = ehgVar.c;
            byte[] bArr = ehgVar.b;
            bArr.getClass();
            byte[] bArr2 = ehgVar.a;
            bArr2.getClass();
            vpxDecoder = this;
            jVpxDecode = vpxDecoder.vpxSecureDecode(j, byteBuffer2, iLimit, cryptoConfig, i, bArr, bArr2, ehgVar.f, ehgVar.d, ehgVar.e);
        } else {
            vpxDecoder = this;
            jVpxDecode = vpxDecode(vpxDecoder.a, byteBuffer2, iLimit);
        }
        if (jVpxDecode != 0) {
            if (jVpxDecode != -2) {
                return new nej("Decode error: ".concat(String.valueOf(vpxGetErrorMessage(vpxDecoder.a))));
            }
            long j2 = vpxDecoder.a;
            String strValueOf = String.valueOf(vpxGetErrorMessage(j2));
            vpxGetErrorCode(j2);
            String strConcat = "Drm error: ".concat(strValueOf);
            return new nej(strConcat, new ehf(strConcat));
        }
        if (ehkVar.hasSupplementalData()) {
            ByteBuffer byteBuffer3 = ehkVar.f;
            byteBuffer3.getClass();
            int iRemaining = byteBuffer3.remaining();
            if (iRemaining > 0) {
                ByteBuffer byteBuffer4 = vpxDecoder.d;
                if (byteBuffer4 == null || byteBuffer4.capacity() < iRemaining) {
                    vpxDecoder.d = ByteBuffer.allocate(iRemaining);
                } else {
                    vpxDecoder.d.clear();
                }
                vpxDecoder.d.put(byteBuffer3);
                vpxDecoder.d.flip();
            }
        }
        if (!r(ehkVar.e)) {
            videoDecoderOutputBuffer.shouldBeSkipped = true;
            return null;
        }
        videoDecoderOutputBuffer.init(ehkVar.e, vpxDecoder.b, vpxDecoder.d);
        int iVpxGetFrame = vpxGetFrame(vpxDecoder.a, videoDecoderOutputBuffer);
        if (iVpxGetFrame == 1) {
            videoDecoderOutputBuffer.shouldBeSkipped = true;
        } else if (iVpxGetFrame == -1) {
            return new nej("Buffer initialization failed.");
        }
        videoDecoderOutputBuffer.format = ehkVar.a;
        return null;
    }

    @Override // defpackage.eho
    protected final ehk j() {
        return new ehk(2);
    }

    @Override // defpackage.eho
    protected final /* bridge */ /* synthetic */ ehm l() {
        return new VideoDecoderOutputBuffer(new nef(this, 2));
    }

    public final void s(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (this.b == 1 && !videoDecoderOutputBuffer.shouldBeSkipped) {
            vpxReleaseFrame(this.a, videoDecoderOutputBuffer);
        }
        super.o(videoDecoderOutputBuffer);
    }

    public native int vpxRenderFrame(long j, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);
}
