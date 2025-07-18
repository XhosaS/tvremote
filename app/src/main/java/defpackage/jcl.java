package defpackage;

import android.media.AudioManager$AudioPlaybackCallback;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jcl extends AudioManager$AudioPlaybackCallback {
    final /* synthetic */ jcv a;

    public jcl(jcv jcvVar) {
        this.a = jcvVar;
    }

    public final void onPlaybackConfigChanged(List list) {
        boolean zL = jcv.l(list);
        zdy zdyVar = jcv.a;
        zdv zdvVar = (zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$3", "onPlaybackConfigChanged", 452, "DspManager.java");
        Boolean boolValueOf = Boolean.valueOf(zL);
        zdvVar.x("Playback state changed to: %b", boolValueOf);
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "onPlaybackStateChange", 492, "DspManager.java")).x("Playback state changed to: %b", boolValueOf);
        jcv jcvVar = this.a;
        jcvVar.z = zL;
        if (jcvVar.o == null) {
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "onPlaybackStateChange", 495, "DspManager.java")).u("DspManager not initialized yet.");
        } else {
            jcvVar.h();
        }
    }
}
