package defpackage;

import android.content.Context;
import android.content.Intent;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzi {
    public final Context c;
    public final tru d;
    public static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser");
    private static final Duration e = Duration.ofMinutes(5);
    public static final Duration b = Duration.ofSeconds(5);
    private static final Duration f = Duration.ofSeconds(10);

    public tzi(Context context, tru truVar) {
        this.c = context;
        this.d = truVar;
    }

    public static Duration a(Intent intent) {
        Duration durationOfMillis = Duration.ofMillis(intent.getIntExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", 0));
        Duration duration = f;
        if (durationOfMillis.compareTo(duration) <= 0) {
            return durationOfMillis;
        }
        ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getInputCompleteSilenceLength", 373, "RecognitionServiceIntentParser.java")).w("EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH is too high (max is %d), capped to max seconds", duration.toSeconds());
        return duration;
    }

    public static Duration b(Intent intent) {
        Duration durationOfMillis = Duration.ofMillis(intent.getIntExtra("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS", 0));
        if (durationOfMillis.compareTo(e) <= 0) {
            return durationOfMillis;
        }
        ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceIntentParser", "getMinSpeechLength", 359, "RecognitionServiceIntentParser.java")).u("EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS is too high, ignored");
        return Duration.ZERO;
    }

    public static String c(String str, String str2) {
        int length = str.length() - str2.length();
        return (length >= 0 && str.regionMatches(length, str2, 0, str2.length())) ? str.substring(0, length) : str;
    }
}
