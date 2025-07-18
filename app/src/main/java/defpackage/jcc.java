package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.service.voice.AlwaysOnHotwordDetector;
import android.service.voice.VoiceInteractionService;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jcc implements jcs {
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/voice/dsp/DspCallback");
    public final jdt a;
    public VoiceInteractionService b;
    private final Context d;
    private final PackageManager e;
    private boolean f = false;
    private boolean g;

    public jcc(jdt jdtVar, Context context, PackageManager packageManager) {
        this.a = jdtVar;
        this.d = context;
        this.e = packageManager;
    }

    @Override // defpackage.jcs
    public final AlwaysOnHotwordDetector a(String str, String str2, AlwaysOnHotwordDetector.Callback callback) {
        if (str2 == null) {
            ((zdv) ((zdv) c.c()).q("com/google/android/apps/tvsearch/voice/dsp/DspCallback", "createAlwaysOnHotwordDetector", 54, "DspCallback.java")).u("Locale can't be null when creating AlwaysOnHotwordDetector");
            return null;
        }
        VoiceInteractionService voiceInteractionService = this.b;
        if (voiceInteractionService != null) {
            return voiceInteractionService.createAlwaysOnHotwordDetector(str, Locale.forLanguageTag(str2), callback);
        }
        throw new IllegalStateException("KVIS must be ready before calling createAlwaysOnHotwordDetector");
    }

    @Override // defpackage.jcs
    public final void b(boolean z, boolean z2) {
        if (!this.f) {
            vqi.d("com/google/android/apps/tvsearch/voice/dsp/DspCallback", "configureLibAssistant", 82, this.a.e(z, z2), "Failed to initialize Assistant", new Object[0]);
            this.f = true;
            this.g = z;
        } else if (this.g != z) {
            ((zdv) ((zdv) c.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspCallback", "configureLibAssistant", 88, "DspCallback.java")).u("dspSupportedDevice bit changed, need to restart libAssistant.");
            this.g = z;
            this.a.w(z);
        }
    }

    @Override // defpackage.jcs
    public final void c(int i) {
        this.a.G(i);
    }

    @Override // defpackage.jcs
    public final void d(Intent intent) {
        zdy zdyVar = c;
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspCallback", "fireHotwordEnrollmentIntent", 101, "DspCallback.java")).u("Firing Enroll Intent");
        try {
            PackageManager packageManager = this.e;
            if (!packageManager.queryBroadcastReceivers(intent, 65536).isEmpty()) {
                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspCallback", "fireHotwordEnrollmentIntent", 110, "DspCallback.java")).x("Firing broadcastreceiver Intent: %s", intent);
                this.d.sendBroadcast(intent);
            } else if (!packageManager.queryIntentServices(intent, 65536).isEmpty()) {
                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspCallback", "fireHotwordEnrollmentIntent", 113, "DspCallback.java")).x("Firing foreground service Intent: %s", intent);
                this.d.startForegroundService(intent);
            } else {
                if (packageManager.queryIntentActivities(intent, 65536).isEmpty()) {
                    ((zdv) ((zdv) zdyVar.c()).q("com/google/android/apps/tvsearch/voice/dsp/DspCallback", "fireHotwordEnrollmentIntent", 127, "DspCallback.java")).u("failed to determine type of enrollment application");
                    return;
                }
                intent.addFlags(268435456);
                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspCallback", "fireHotwordEnrollmentIntent", 121, "DspCallback.java")).u("Firing activity Intent");
                wyo.l(this.d, intent);
            }
        } catch (SecurityException e) {
            ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/apps/tvsearch/voice/dsp/DspCallback", "fireHotwordEnrollmentIntent", (char) 130, "DspCallback.java")).u("Failed to fire enrollment intent");
        }
    }

    @Override // defpackage.jcs
    public final void e() {
        ((zdv) ((zdv) c.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspCallback", "startSoftwareHotwordWhileDspRunning", 155, "DspCallback.java")).u("startSoftwareHotwordWhileDspRunning");
        this.a.F(true);
    }

    @Override // defpackage.jcs
    public final void f() {
        ((zdv) ((zdv) c.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspCallback", "stopSoftwareHotwordWhileDspRunning", 161, "DspCallback.java")).u("stopSoftwareHotwordWhileDspRunning");
        this.a.L(true);
    }
}
