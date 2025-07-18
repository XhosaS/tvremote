package defpackage;

import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.ext.vp9.VpxDecoder;
import com.google.android.exoplayer2.ext.vp9.VpxLibrary;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nei extends faz {
    private final int g;
    private VpxDecoder h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nei(Handler handler, fcf fcfVar) {
        super(handler, fcfVar);
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        this.g = iAvailableProcessors;
    }

    @Override // defpackage.ekc, defpackage.eke
    public final String U() {
        return "LibvpxVideoRenderer";
    }

    @Override // defpackage.faz
    protected final /* bridge */ /* synthetic */ ehh W(dze dzeVar, CryptoConfig cryptoConfig) {
        Trace.beginSection("createVpxDecoder");
        int i = dzeVar.Z;
        if (i == -1) {
            i = 786432;
        }
        VpxDecoder vpxDecoder = new VpxDecoder(i, cryptoConfig, this.g);
        this.h = vpxDecoder;
        Trace.endSection();
        return vpxDecoder;
    }

    @Override // defpackage.faz
    protected final ehx X(String str, dze dzeVar, dze dzeVar2) {
        return new ehx(str, dzeVar, dzeVar2, 3, 0);
    }

    @Override // defpackage.faz
    protected final void ac(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws nej {
        VpxDecoder vpxDecoder = this.h;
        if (vpxDecoder == null) {
            throw new nej("Failed to render output buffer to surface: decoder is not initialized.");
        }
        if (vpxDecoder.vpxRenderFrame(vpxDecoder.a, surface, videoDecoderOutputBuffer) == -1) {
            throw new nej("Buffer render failed.");
        }
        videoDecoderOutputBuffer.release();
    }

    @Override // defpackage.faz
    protected final void ad(int i) {
        VpxDecoder vpxDecoder = this.h;
        if (vpxDecoder != null) {
            vpxDecoder.b = i;
        }
    }

    @Override // defpackage.eke
    public final int cJ(dze dzeVar) {
        if (!VpxLibrary.a() || !"video/x-vnd.on2.vp9".equalsIgnoreCase(dzeVar.Y)) {
            return clw.F(0);
        }
        int i = dzeVar.az;
        return (i == 0 || (i != 1 && i == VpxLibrary.b)) ? clw.G(4, 16, 0) : clw.F(2);
    }
}
