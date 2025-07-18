package defpackage;

import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thh {
    public final String a(tfu tfuVar) {
        Optional optionalOf;
        switch (tfuVar.ordinal()) {
            case 1:
                optionalOf = Optional.of(new tfs("AGSA_GOOGLE_APP", "AGSA_GOOGLE_APP_COUNTERS"));
                break;
            case 2:
                optionalOf = Optional.of(new tfs("AGSA_TRANSCRIPTION"));
                break;
            case 3:
                optionalOf = Optional.of(new tfs("AGSA_NIU"));
                break;
            case 4:
                optionalOf = Optional.of(new tfs("AGSA_ASSISTANT"));
                break;
            case 5:
            case 17:
            case 19:
            case 25:
            case 29:
            case 32:
            default:
                optionalOf = Optional.empty();
                break;
            case 6:
                optionalOf = Optional.of(new tfs("AGSA_LENS", "AGSA_LENS_COUNTERS"));
                break;
            case 7:
                optionalOf = Optional.of(new tfs("AGSA_SOUND_SEARCH"));
                break;
            case 8:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 20:
                optionalOf = Optional.of(new tfs("AGSA_ASSISTANT_AUTO"));
                break;
            case 9:
                optionalOf = Optional.of(new tfs("AGSA_PRONUNCIATION_LEARNING"));
                break;
            case 10:
                optionalOf = Optional.of(new tfs("AGSA_WEATHER"));
                break;
            case 11:
                optionalOf = Optional.of(new tfs("AGSA_FACEVIEWER"));
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                optionalOf = Optional.of(new tfs("AGSA_SCENEVIEWER"));
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                optionalOf = Optional.of(new tfs("AGSA_MORRIS"));
                break;
            case 15:
                optionalOf = Optional.of(new tfs("AGSA_LINGO_CAMERA"));
                break;
            case 16:
                optionalOf = Optional.of(new tfs("AGSA_HOTWORD_LIBRARY_ANDROID"));
                break;
            case 18:
                optionalOf = Optional.of(new tfs("AGSA_PODCASTS"));
                break;
            case 21:
                optionalOf = Optional.of(new tfs("AGSA_GELLER"));
                break;
            case 22:
            case 30:
            case 38:
                optionalOf = Optional.of(new tfs("AGSA_INFRASTRUCTURE", "AGSA_INFRASTRUCTURE_COUNTERS"));
                break;
            case 23:
                optionalOf = Optional.of(new tfs("AGSA_WEBGLIDE"));
                break;
            case 24:
                optionalOf = Optional.of(new tfs("AGSA_FEDORA"));
                break;
            case 26:
                optionalOf = Optional.of(new tfs("AGSA_APA"));
                break;
            case 27:
                optionalOf = Optional.of(new tfs("AGSA_ASSISTANT_TITAN_TNG"));
                break;
            case 28:
                optionalOf = Optional.of(new tfs("AGSA_APA"));
                break;
            case 31:
                optionalOf = Optional.of(new tfs("AGSA_PROACTIVE_ASSISTANT"));
                break;
            case 33:
                optionalOf = Optional.of(new tfs("AGSA_READ"));
                break;
            case 34:
                optionalOf = Optional.of(new tfs("AGSA_QUICK_PHRASES"));
                break;
            case 35:
                optionalOf = Optional.of(new tfs("AGSA_BISTO"));
                break;
            case 36:
                optionalOf = Optional.of(new tfs("AUDIO_LIBRARY_ANDROID"));
                break;
            case 37:
                optionalOf = Optional.of(new tfs("AGSA_INTERPRETER_MODE"));
                break;
            case 39:
                optionalOf = Optional.of(new tfs("AGSA_IN_APP_UPDATE_ANDROID"));
                break;
            case 40:
                optionalOf = Optional.of(new tfs("AGSA_TNG_FINANCE_WIDGET"));
                break;
            case 41:
                optionalOf = Optional.of(new tfs("AGSA_OMNI"));
                break;
            case 42:
                optionalOf = Optional.of(new tfs("ROBIN_ANDROID"));
                break;
            case 43:
                optionalOf = Optional.of(new tfs("AGSA_SEARCH_VIDEO_ANDROID"));
                break;
            case 44:
                optionalOf = Optional.of(new tfs("AGSA_XBLEND"));
                break;
            case 45:
                optionalOf = Optional.of(new tfs("AGSA_TNG_SPORTS_WIDGET"));
                break;
            case 46:
                optionalOf = Optional.of(new tfs("AGSA_MDD_ANDROID"));
                break;
            case 47:
                optionalOf = Optional.of(new tfs("AGSA_SEARCH_XR"));
                break;
            case 48:
                optionalOf = Optional.of(new tfs("AGSA_OMNI_XR"));
                break;
            case 49:
                optionalOf = Optional.of(new tfs("AGSA_SEAPORT_LIBRARY_ANDROID"));
                break;
            case 50:
                optionalOf = Optional.of(new tfs("AGSA_NETWORK_MONITORING_LIBRARY_SEARCH_ANDROID"));
                break;
            case 51:
                optionalOf = Optional.of(new tfs("AGSA_AIM_LIBRARY_ANDROID"));
                break;
        }
        tfs tfsVar = (tfs) optionalOf.orElse(null);
        String str = tfsVar != null ? (String) tfsVar.a.orElse(null) : null;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Attempted to get logging configuration for an unconfigured TNG App: " + tfuVar.name() + " ");
    }
}
