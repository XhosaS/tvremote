package defpackage;

import android.os.Handler;
import android.os.Trace;
import androidx.media3.decoder.CryptoConfig;
import com.google.android.exoplayer2.ext.opus.OpusDecoder;
import com.google.android.exoplayer2.ext.opus.OpusLibrary;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nee extends eme {
    public nee() {
        super(null, null, new ebu[0]);
    }

    @Override // defpackage.ekc, defpackage.eke
    public final String U() {
        return "LibopusAudioRenderer";
    }

    @Override // defpackage.eme
    protected final int W(dze dzeVar) {
        int i = dzeVar.az;
        ecv ecvVar = OpusLibrary.a;
        boolean z = i == 0 || (i != 1 && i == OpusLibrary.b);
        if (!OpusLibrary.a() || !"audio/opus".equalsIgnoreCase(dzeVar.Y)) {
            return 0;
        }
        if (((eme) this).h.B(edt.O(2, dzeVar.aq, dzeVar.ar))) {
            return !z ? 2 : 4;
        }
        return 1;
    }

    @Override // defpackage.eme
    protected final /* bridge */ /* synthetic */ dze X(ehh ehhVar) {
        OpusDecoder opusDecoder = (OpusDecoder) ehhVar;
        return edt.O(true != opusDecoder.a ? 2 : 4, opusDecoder.b, 48000);
    }

    @Override // defpackage.eme
    protected final /* bridge */ /* synthetic */ ehh Y(dze dzeVar, CryptoConfig cryptoConfig) {
        Trace.beginSection("createOpusDecoder");
        int iA = ((eme) this).h.a(edt.O(4, dzeVar.aq, dzeVar.ar));
        int i = dzeVar.Z;
        if (i == -1) {
            i = 5760;
        }
        OpusDecoder opusDecoder = new OpusDecoder(i, dzeVar.ab, cryptoConfig, iA == 2);
        Trace.endSection();
        return opusDecoder;
    }

    @Override // defpackage.eme
    protected final /* bridge */ /* synthetic */ int[] Z(ehh ehhVar) {
        return fki.K(((OpusDecoder) ehhVar).b);
    }

    public nee(Handler handler, els elsVar, ebu... ebuVarArr) {
        super(handler, elsVar, ebuVarArr);
    }
}
