package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sej implements sdp {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource");
    private final ParcelFileDescriptor b;
    private yqt c = ypv.a;

    public sej(ParcelFileDescriptor parcelFileDescriptor) {
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.sdp
    public final synchronized rxd a() {
        zdy zdyVar = a;
        ((zdv) ((zdv) zdyVar.b().o(zfi.a, "ALT.PFDAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource", "closeAudioSource", 61, "AudioPfdAudioSource.java")).x("#audio# close audio source(%s)", szx.a(this));
        if (!this.c.g()) {
            ((zdv) ((zdv) zdyVar.d().o(zfi.a, "ALT.PFDAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource", "closeAudioSource", 75, "AudioPfdAudioSource.java")).x("#audio# close audio source(%s) failed: no audio stream", szx.a(this));
            return skj.f(120);
        }
        try {
            ((sew) this.c.c()).b();
            return skj.g();
        } catch (IOException e) {
            ((zdv) ((zdv) ((zdv) a.d().o(zfi.a, "ALT.PFDAudioSource")).p(e)).q("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource", "closeAudioSource", 67, "AudioPfdAudioSource.java")).x("#audio# close audio source(%s) failed: error closing audio stream", szx.a(this));
            return skj.f(203);
        }
    }

    @Override // defpackage.sdp
    public final sds b() {
        return sds.a.a(sdw.SOURCE_PFD);
    }

    @Override // defpackage.sdp
    public final synchronized yqt c() {
        yqt yqtVarI;
        zdy zdyVar = a;
        zeo zeoVarB = zdyVar.b();
        zer zerVar = zfi.a;
        ((zdv) ((zdv) zeoVarB.o(zerVar, "ALT.PFDAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource", "openAudioSource", 45, "AudioPfdAudioSource.java")).x("#audio# open audio source(%s)", szx.a(this));
        ((zdv) ((zdv) zdyVar.b().o(zerVar, "ALT.PFDAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource", "createAudioPfdStream", 89, "AudioPfdAudioSource.java")).u("#audio# createAudioPfdStream returning AudioPfdStream");
        yqtVarI = yqt.i(new sew(this.b));
        this.c = yqtVarI;
        return yqtVarI.g() ? yqt.i(this.c.c()) : ypv.a;
    }
}
