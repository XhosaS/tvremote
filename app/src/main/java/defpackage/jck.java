package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.service.voice.AlwaysOnHotwordDetector;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
class jck extends AlwaysOnHotwordDetector.Callback {
    final /* synthetic */ jcv a;

    public jck(jcv jcvVar) {
        this.a = jcvVar;
    }

    public final void onAvailabilityChanged(int i) {
        Intent intentCreateEnrollIntent;
        zdy zdyVar = jcv.a;
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$2", "onAvailabilityChanged", 360, "DspManager.java")).v("AlwaysOnHotwordDetector:onAvailabilityChanged %d", i);
        jcv jcvVar = this.a;
        jcvVar.r = i;
        if (i == -2) {
            ((zdv) ((zdv) jcv.a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "handleDspHotwordAvailabilityChange", 1023, "DspManager.java")).u("KEYPHRASE_HARDWARE_UNAVAILABLE - init libassistant without dsp if needed");
            jcvVar.s = false;
            jcvVar.o.b(false, jcvVar.l);
            return;
        }
        if (i == -1) {
            ((zdv) ((zdv) jcv.a.d()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "handleDspHotwordAvailabilityChange", 1029, "DspManager.java")).x("KEYPHRASE_UNSUPPORTED - do nothing for locale %s", jcvVar.v);
            jcvVar.t = false;
            jcvVar.s = true;
            jcvVar.o.b(true, jcvVar.l);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                ((zdv) ((zdv) jcv.a.c()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "handleDspHotwordAvailabilityChange", 1069, "DspManager.java")).v("Unexpected DSP availability type, availability:%d", i);
                return;
            }
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "handleDspHotwordAvailabilityChange", 1061, "DspManager.java")).u("KEYPHRASE_ENROLLED - init libassistant with dsp if needed");
            jcvVar.t = false;
            jcvVar.s = true;
            jcvVar.o.b(true, jcvVar.l);
            jcvVar.k();
            return;
        }
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "handleDspHotwordAvailabilityChange", 1036, "DspManager.java")).u("KEYPHRASE_UNENROLLED - fire enrollment intent for allowed locale");
        jcvVar.t = false;
        if (jcd.a(jcvVar.v)) {
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "handleDspHotwordAvailabilityChange", 1040, "DspManager.java")).x("locale %s is denied, do nothing", jcvVar.v);
            return;
        }
        if (jcvVar.A) {
            if (Build.VERSION.SDK_INT >= 34) {
                ((zdv) ((zdv) jcv.a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "handleDspHotwordAvailabilityChange", 1044, "DspManager.java")).u("Destroying AOHD");
                jcvVar.q.destroy();
            }
            jcvVar.A = false;
            jcvVar.q = jcvVar.o.a(jcvVar.w, jcvVar.v, jcvVar.H);
            return;
        }
        try {
            intentCreateEnrollIntent = jcvVar.q.createEnrollIntent();
        } catch (IllegalStateException e) {
            ((zdv) ((zdv) ((zdv) jcv.a.d()).p(e)).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "fireEnrollIntent", (char) 1157, "DspManager.java")).u("Error calling #createEnrollIntent.");
        }
        if (intentCreateEnrollIntent != null) {
            intentCreateEnrollIntent.addFlags(268435456);
            jcvVar.o.d(intentCreateEnrollIntent);
        } else {
            ((zdv) ((zdv) zdyVar.d()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "fireEnrollIntent", 1148, "DspManager.java")).u("Unable to send enrollment intent");
            jcvVar.t = false;
            jcvVar.s = true;
            jcvVar.o.b(true, jcvVar.l);
        }
    }

    public final void onDetected(AlwaysOnHotwordDetector.EventPayload eventPayload) {
        zdy zdyVar = jcv.a;
        this.a.t = false;
        byte[] triggerAudio = eventPayload.getTriggerAudio();
        int iIntValue = -1;
        try {
            Integer num = (Integer) eventPayload.getClass().getMethod("getCaptureSession", null).invoke(eventPayload, null);
            if (num != null) {
                iIntValue = num.intValue();
            }
        } catch (Exception e) {
            ((zdv) ((zdv) ((zdv) jcv.a.c()).p(e)).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "getCaptureSession", (char) 915, "DspManager.java")).u("Failed to get captureSession");
        }
        if (triggerAudio == null && iIntValue < 0) {
            ((zdv) ((zdv) jcv.a.d()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$2", "onDetected", 309, "DspManager.java")).u("No trigger audio present");
            this.a.k();
            return;
        }
        jcv jcvVar = this.a;
        jct jctVar = jcvVar.p;
        jctVar.removeMessages(3);
        if (!jcvVar.l) {
            jcvVar.o.c(iIntValue);
            feq.g(jctVar, 3, jcv.c);
            return;
        }
        PowerManager.WakeLock wakeLock = jcvVar.F;
        Duration duration = jcv.c;
        wakeLock.acquire(duration.toMillis());
        zdy zdyVar2 = jcv.a;
        ((zdv) ((zdv) zdyVar2.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$2", "onDetected", 320, "DspManager.java")).x("LowPowerHotword: Dsp hotword get triggered. Ignore it? %b", Boolean.valueOf(jcvVar.C));
        if (!jcvVar.C) {
            jcvVar.o.c(iIntValue);
            feq.g(jctVar, 3, duration);
        }
        ((zdv) ((zdv) zdyVar2.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$2", "onDetected", 331, "DspManager.java")).u("LowPowerHotword: Re-start Dsp detection after DSP detected hotword.");
        jcvVar.k();
    }

    public final void onError() {
        zdv zdvVar = (zdv) ((zdv) jcv.a.c()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$2", "onError", 343, "DspManager.java");
        jcv jcvVar = this.a;
        zdvVar.v("AlwaysOnHotwordDetector:onError, availability: %d", jcvVar.r);
        if (jcvVar.r == 2) {
            jcvVar.t = false;
            feq.g(jcvVar.p, 2, jcv.b);
        }
    }

    public final void onRecognitionPaused() {
        zdy zdyVar = jcv.a;
    }

    public final void onRecognitionResumed() {
        zdy zdyVar = jcv.a;
    }
}
