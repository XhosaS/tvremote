package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbu {
    private static final AtomicReference c = new AtomicReference("");
    private static final zdy d = zdy.h("com/google/android/libraries/assistant/soda/SodaJniLoader");
    public static final yyk a = yyk.u("google_speech_jni", "google_speech_with_aec_jni", "google_speech_sbg_tts_jni", "google_speech_sbg_wear_tts_jni", "google_speech_sbg_jni", "google_speech_sbg_wear_jni", "soda_dev_jni", "soda_jni", "soda_jni_init_google", "soda_jni_wearos", "soda_jni_wearos_init_google", "soda_with_benchmark_jni", "soda_euphonia_jni", "soda_langid_jni", "soda_jni_waveform_aec", "dps_soda_pixel_s_jni", "dps_soda_jni", "dps_soda_dev_jni", "soda_aicore_jni");
    public static final yyk b = yyk.p("soda_jni_no_terse", "soda_jni_no_terse_init_google");

    public static void a(Context context) {
        if (c(context) || d(context)) {
            return;
        }
        ((zdv) ((zdv) d.c()).q("com/google/android/libraries/assistant/soda/SodaJniLoader", "loadNativeLibrary", 90, "SodaJniLoader.java")).u("Unable to load any SODA native library");
    }

    private static void b(String str, String str2) {
        String str3 = (String) c.getAndSet(str2);
        if (str3.isEmpty() || str3.equals(str2)) {
            ((zdv) ((zdv) d.b()).q("com/google/android/libraries/assistant/soda/SodaJniLoader", "checkLoadedLibrary", 138, "SodaJniLoader.java")).F("Loaded SODA %s native library: %s", str, str2);
        } else {
            ((zdv) ((zdv) d.c()).q("com/google/android/libraries/assistant/soda/SodaJniLoader", "checkLoadedLibrary", 140, "SodaJniLoader.java")).F("Different native libraries are loaded for the same process. Previously loaded: %s, currently loaded: %s. This may cause unexpected results. See go/odr-violations.", str3, str2);
        }
    }

    private static boolean c(Context context) {
        String str = (String) c.get();
        if (!str.isEmpty() && a.contains(str)) {
            ((zdv) ((zdv) d.b()).q("com/google/android/libraries/assistant/soda/SodaJniLoader", "attemptToLoadFullNativeLibrary", 97, "SodaJniLoader.java")).x("Loaded SODA Full native library: %s previously; skipping new attempt.", str);
            return true;
        }
        yyk yykVar = a;
        int i = ((zcg) yykVar).d;
        for (int i2 = 0; i2 < i; i2++) {
            String str2 = (String) yykVar.get(i2);
            try {
                eol.a(context, str2);
                b("Full", str2);
                return true;
            } catch (eok | UnsatisfiedLinkError unused) {
            }
        }
        return false;
    }

    private static boolean d(Context context) {
        String str = (String) c.get();
        if (!str.isEmpty() && b.contains(str)) {
            ((zdv) ((zdv) d.b()).q("com/google/android/libraries/assistant/soda/SodaJniLoader", "attemptToLoadHotwordNativeLibrary", 117, "SodaJniLoader.java")).x("Loaded SODA Hotword native library: %s previously; skipping new attempt.", str);
            return true;
        }
        yyk yykVar = b;
        int i = ((zcg) yykVar).d;
        for (int i2 = 0; i2 < i; i2++) {
            String str2 = (String) yykVar.get(i2);
            try {
                eol.a(context, str2);
                b("Hotword", str2);
                return true;
            } catch (eok | UnsatisfiedLinkError unused) {
            }
        }
        return false;
    }
}
