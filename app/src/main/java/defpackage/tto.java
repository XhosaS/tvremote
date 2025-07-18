package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tto {
    public static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil");

    public static int a(Intent intent) {
        int intExtra = intent.getIntExtra("android.speech.extra.MAX_RESULTS", 1);
        if (intExtra > 0) {
            return intExtra;
        }
        ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedMaxResultsOrOne", 227, "IntentParsingUtil.java")).v("Unsupported EXTRA_MAX_RESULTS %d", intExtra);
        return 1;
    }

    public static Optional b(Intent intent) throws IOException {
        if (!adn.c() || !intent.hasExtra("android.speech.extra.AUDIO_SOURCE")) {
            if (!intent.hasExtra("com.google.recognition.extra.AUDIO_SOURCE")) {
                return Optional.empty();
            }
            tsb tsbVarD = tsc.d();
            Parcelable parcelableExtra = intent.getParcelableExtra("com.google.recognition.extra.AUDIO_SOURCE");
            if (parcelableExtra == null) {
                return Optional.empty();
            }
            if (parcelableExtra instanceof Uri) {
                ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", 249, "IntentParsingUtil.java")).u("Audio source is passed in format of URI");
                Uri uri = (Uri) parcelableExtra;
                if (yqs.a(uri, Uri.EMPTY)) {
                    return Optional.empty();
                }
                ((tsf) tsbVarD).a = Optional.of(uri);
            } else {
                if (!(parcelableExtra instanceof ParcelFileDescriptor)) {
                    ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", 265, "IntentParsingUtil.java")).u("Audio source is passed in wrong format. Formats accepted are URI And ParcelFileDescriptor.");
                    return Optional.empty();
                }
                ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", 256, "IntentParsingUtil.java")).u("Audio source is passed in format of ParcelFileDescriptor");
                try {
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcelableExtra;
                    try {
                        ((tsf) tsbVarD).b = Optional.of(parcelFileDescriptor.dup());
                        parcelFileDescriptor.close();
                    } finally {
                    }
                } catch (IOException e) {
                    ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", (char) 261, "IntentParsingUtil.java")).u("Failed to dup the ParcelFileDescriptor.");
                    return Optional.empty();
                }
            }
            int intExtra = intent.getIntExtra("com.google.recognition.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
            if (intExtra <= 0 || intExtra > 2) {
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", 276, "IntentParsingUtil.java")).v("EXTRA_AUDIO_SOURCE_CHANNEL_COUNT must be 1 or 2; passed value is %d", intExtra);
                return Optional.empty();
            }
            tsbVarD.d(intExtra);
            int intExtra2 = intent.getIntExtra("com.google.recognition.extra.AUDIO_SOURCE_SAMPLING_RATE", 16000);
            if (intExtra2 <= 0) {
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getAudioSourceParams", 288, "IntentParsingUtil.java")).u("Invalid value passed to EXTRA_AUDIO_SOURCE_SAMPLING_RATE; ignoring audio source");
                return Optional.empty();
            }
            tsbVarD.g(intExtra2);
            tsbVarD.f(!intent.getBooleanExtra("com.google.recognition.extra.EXTRA_AUDIO_SOURCE_NON_MIC", false));
            return Optional.of(tsbVarD.c());
        }
        tsb tsbVarD2 = tsc.d();
        Parcelable parcelableExtra2 = intent.getParcelableExtra("android.speech.extra.AUDIO_SOURCE");
        if (!(parcelableExtra2 instanceof ParcelFileDescriptor)) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPublicAudioSourceParams", 308, "IntentParsingUtil.java")).u("No valid audio source passed to EXTRA_AUDIO_SOURCE; ignoring audio source");
            return Optional.empty();
        }
        try {
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) parcelableExtra2;
            try {
                ((tsf) tsbVarD2).b = Optional.of(parcelFileDescriptor2.dup());
                if (parcelFileDescriptor2 != null) {
                    parcelFileDescriptor2.close();
                }
                int intExtra3 = intent.getIntExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
                if (intExtra3 <= 0 || intExtra3 > 2) {
                    ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPublicAudioSourceParams", 325, "IntentParsingUtil.java")).v("EXTRA_AUDIO_SOURCE_CHANNEL_COUNT must be 1 or 2; passed value is %d; ignoring audio source", intExtra3);
                    return Optional.empty();
                }
                tsbVarD2.d(intExtra3);
                int intExtra4 = intent.getIntExtra("android.speech.extra.AUDIO_SOURCE_ENCODING", 2);
                if (intExtra4 <= 0) {
                    ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPublicAudioSourceParams", 338, "IntentParsingUtil.java")).u("Invalid value passed to EXTRA_AUDIO_SOURCE_ENCODING; value must come from AudioFormat; ignoring audio source");
                    return Optional.empty();
                }
                tsbVarD2.e(intExtra4);
                int intExtra5 = intent.getIntExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", 16000);
                if (intExtra5 <= 0) {
                    ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPublicAudioSourceParams", 350, "IntentParsingUtil.java")).u("Invalid value passed to EXTRA_AUDIO_SOURCE_SAMPLING_RATE; ignoring audio source");
                    return Optional.empty();
                }
                tsbVarD2.g(intExtra5);
                tsbVarD2.f(!intent.getBooleanExtra("com.google.recognition.extra.EXTRA_AUDIO_SOURCE_NON_MIC", false));
                return Optional.of(tsbVarD2.c());
            } finally {
            }
        } catch (IOException e2) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e2)).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPublicAudioSourceParams", (char) 316, "IntentParsingUtil.java")).u("Failed to dup the ParcelFileDescriptor.");
            return Optional.empty();
        }
    }

    public static Optional c(Intent intent, String str, String str2) {
        ArrayList<String> stringArrayListExtra;
        if (!intent.getBooleanExtra(str, false) && d(intent).isEmpty()) {
            return Optional.empty();
        }
        if (!j(intent)) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getLangIdConfig", 550, "IntentParsingUtil.java")).u("Language detection can't be enabled when EXTRA_PREFER_OFFLINE is false");
            return Optional.empty();
        }
        adod adodVar = adod.a;
        adoc adocVar = new adoc();
        if ((adocVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adocVar.y();
        }
        adod adodVar2 = (adod) adocVar.b;
        adodVar2.b |= 1;
        adodVar2.c = true;
        if (intent.hasExtra(str2) && (stringArrayListExtra = intent.getStringArrayListExtra(str2)) != null && !stringArrayListExtra.isEmpty()) {
            if ((adocVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adocVar.y();
            }
            adod adodVar3 = (adod) adocVar.b;
            abxs abxsVar = adodVar3.d;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                adodVar3.d = abxsVar.d(size + size);
            }
            abus.m(stringArrayListExtra, adodVar3.d);
        }
        return Optional.of((adod) adocVar.v());
    }

    public static Optional d(Intent intent) {
        return (adn.d() && intent.hasExtra("android.speech.extra.ENABLE_LANGUAGE_SWITCH")) ? k(intent, "android.speech.extra.ENABLE_LANGUAGE_SWITCH", "android.speech.extra.LANGUAGE_SWITCH_ALLOWED_LANGUAGES") : k(intent, "android.speech.extras.ENABLE_MULTILANG", "android.speech.extras.MULTILANG_ALLOWED_LANGUAGES");
    }

    public static Optional e(Intent intent) {
        String stringExtra = intent.getStringExtra("android.speech.extra.GET_AUDIO_FORMAT");
        String str = tqh.AMR.e;
        if (str.equals(stringExtra)) {
            return Optional.of(adis.AMR);
        }
        String str2 = tqh.AMRWB.e;
        if (str2.equals(stringExtra)) {
            return Optional.of(adis.AMR_WB);
        }
        if (stringExtra != null) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedAudioEncoding", 101, "IntentParsingUtil.java")).I("The audio format is not supported [requested=%s supported=[%s, %s]]", stringExtra, str, str2);
        }
        return Optional.empty();
    }

    public static String f(Activity activity) {
        String creatorPackage;
        Intent intent = activity.getIntent();
        if (activity.getCallingPackage() != null) {
            creatorPackage = activity.getCallingPackage();
        } else {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("android.speech.extra.RESULTS_PENDINGINTENT");
            creatorPackage = pendingIntent != null ? pendingIntent.getCreatorPackage() : "";
        }
        if ("android".equals(creatorPackage) && intent.hasExtra("calling_package")) {
            creatorPackage = intent.getStringExtra("calling_package");
        }
        return yqv.b(creatorPackage);
    }

    public static String g(Intent intent) {
        return !intent.hasExtra("android.speech.extra.LANGUAGE_MODEL") ? "" : yqv.b(intent.getStringExtra("android.speech.extra.LANGUAGE_MODEL"));
    }

    public static String h(Intent intent) {
        String stringExtra = intent.getStringExtra("android.speech.extra.LANGUAGE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        zdy zdyVar = a;
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedLanguageOrSystemDefault", 133, "IntentParsingUtil.java")).u("#getRequestedLanguageOrSystemDefault");
        if (!yqv.c(stringExtra)) {
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedLanguageOrSystemDefault", 140, "IntentParsingUtil.java")).x("Using language specified in RecognizerIntent: %s", stringExtra);
            return l(Locale.forLanguageTag(stringExtra));
        }
        String strL = l(Locale.forLanguageTag(Locale.getDefault().toLanguageTag()));
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getRequestedLanguageOrSystemDefault", 137, "IntentParsingUtil.java")).x("Using Locale.getDefault() for recognition: %s", strL);
        return strL;
    }

    public static String i(Intent intent) {
        if (!adn.c() || !intent.hasExtra("android.speech.extra.SEGMENTED_SESSION")) {
            return null;
        }
        String stringExtra = intent.getStringExtra("android.speech.extra.SEGMENTED_SESSION");
        if (stringExtra != null && (stringExtra.equals("android.speech.extra.AUDIO_SOURCE") || stringExtra.equals("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS") || stringExtra.equals("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS"))) {
            return stringExtra;
        }
        ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getSegmentedSessionType", 482, "IntentParsingUtil.java")).u("Wrong value passed to EXTRA_SEGMENTED_SESSION; ignoring it");
        return "";
    }

    public static boolean j(Intent intent) {
        return intent.getBooleanExtra("android.speech.extra.PREFER_OFFLINE", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static j$.util.Optional k(android.content.Intent r16, java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tto.k(android.content.Intent, java.lang.String, java.lang.String):j$.util.Optional");
    }

    private static String l(Locale locale) {
        StringBuilder sb = new StringBuilder();
        if (locale.getLanguage().isEmpty()) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getSystemValidLocale", 161, "IntentParsingUtil.java")).x("Language code is invalid or empty: %s. Use default en-US locale.", locale.getLanguage());
            return "en-US";
        }
        if (locale.getLanguage().equals("in")) {
            sb.append("id");
        } else if (locale.getLanguage().equals("iw")) {
            sb.append("he");
        } else if (locale.getLanguage().equals("ji")) {
            sb.append("yi");
        } else {
            sb.append(locale.getLanguage());
        }
        if (!locale.getScript().isEmpty()) {
            sb.append("-");
            sb.append(locale.getScript());
        }
        if (!locale.getCountry().isEmpty()) {
            sb.append("-");
            sb.append(locale.getCountry());
            return sb.toString();
        }
        if (locale.getLanguage().equals("sw")) {
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getSystemValidLocale", 185, "IntentParsingUtil.java")).x("Special locale sw used: %s.", "Kiswahili (Kenya)");
            return sb.toString();
        }
        if (locale.getLanguage().equals("ar")) {
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getSystemValidLocale", 189, "IntentParsingUtil.java")).x("Special locale ar-x-gulf used: %s.", "Arabic (Gulf)");
            return "ar-x-gulf";
        }
        ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getSystemValidLocale", 193, "IntentParsingUtil.java")).x("Country code is invalid or empty: %s. Use default en-US locale.", locale.getCountry());
        return "en-US";
    }
}
