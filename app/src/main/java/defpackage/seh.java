package defpackage;

import android.content.Context;
import android.media.AudioRecord;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seh implements sdp {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiosource/impl/AudioEmulatedAudioSource");
    private final ruo b;
    private final Context c;
    private final sey d;
    private final aehf e;
    private yqt f = ypv.a;
    private final ses g;

    public seh(ruo ruoVar, Context context, sey seyVar, aehf aehfVar) {
        sdw sdwVar = sdw.SOURCE_EMPTY;
        sdwVar.getClass();
        this.g = new ses(sdwVar);
        this.b = ruoVar;
        this.c = context;
        this.d = seyVar;
        this.e = aehfVar;
    }

    @Override // defpackage.sdp
    public final synchronized rxd a() {
        this.g.d();
        if (this.f.g()) {
            ((AudioRecord) this.f.c()).release();
            return skj.g();
        }
        ((zdv) ((zdv) a.d().o(zfi.a, "ALT.EmuAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioEmulatedAudioSource", "closeAudioSource", 92, "AudioEmulatedAudioSource.java")).u("#audio# closeAudioSource failed: no audio record.");
        return skj.f(106);
    }

    @Override // defpackage.sdp
    public final sds b() {
        return this.g;
    }

    @Override // defpackage.sdp
    public final synchronized yqt c() {
        yqt yqtVarI;
        zeo zeoVarB = a.b();
        zer zerVar = zfi.a;
        ((zdv) ((zdv) zeoVarB.o(zerVar, "ALT.EmuAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioEmulatedAudioSource", "openAudioSource", 63, "AudioEmulatedAudioSource.java")).x("#audio# open audio source(%s)", szx.a(this));
        try {
            Context context = this.c;
            int i = this.b.d;
            ((zdv) ((zdv) slw.a.b().o(zerVar, "EmulatedMicFactory")).q("com/google/android/libraries/search/audio/extensions/apps/emulatormicrophone/EmulatedUriAudioRecordFactory", "createEmulatedAudioRecord", 25, "EmulatedUriAudioRecordFactory.java")).u("#audio# createEmulatedAudioRecord");
            yqtVarI = yqt.i(new slv(i, context));
        } catch (IllegalArgumentException e) {
            ((zdv) ((zdv) ((zdv) a.d().o(zfi.a, "ALT.EmuAudioSource")).p(e)).q("com/google/android/libraries/search/audio/audiosource/impl/AudioEmulatedAudioSource", "createAudioRecord", (char) 137, "AudioEmulatedAudioSource.java")).u("#audio# createAudioRecord failed: error creating audio record.");
            yqtVarI = ypv.a;
        }
        this.f = yqtVarI;
        if (!yqtVarI.g()) {
            this.g.d();
            return ypv.a;
        }
        Object objC = this.f.c();
        this.g.c(((AudioRecord) objC).getAudioSessionId());
        return yqt.i(this.d.a((AudioRecord) objC, sec.a, ypv.a, sdw.SOURCE_EMPTY));
    }
}
