package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afdv {
    public static final rjy a;
    public static final rjx b;
    public static volatile String c;
    private static final rkq d;

    static {
        rkw rkwVar = new rkw(new yqi() { // from class: afdu
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = afdv.c;
                if (str != null) {
                    return str;
                }
                synchronized (afdv.class) {
                    strC = afdv.c;
                    if (strC == null) {
                        strC = rff.c(context, "com.google.android.libraries.search.rendering.xuikit.device");
                        afdv.c = strC;
                    }
                }
                return strC;
            }
        });
        rkwVar.b = yzq.o(yzq.u("ANDROID_GSA", "ANDROID_GSA_HIGH_PRIORITY_EVENTS", "AGSA_LEGACY", "AGSA_GOOGLE_APP", "AGSA_NIU", "AGSA_ASSISTANT", "AGSA_LENS", "AGSA_SOUND_SEARCH", "AGSA_ASSISTANT_AUTO", "AGSA_PRONUNCIATION_LEARNING", "AGSA_WEATHER", "AGSA_FACEVIEWER", "AGSA_SCENEVIEWER", "AGSA_MORRIS", "AGSA_LINGO_CAMERA", "AGSA_HOTWORD_LIBRARY", "AGSA_PODCASTS", "AGSA_WEBGLIDE", "AGSA_FEDORA", "AGSA_KAHANI", "AGSA_APA", "AGSA_ASSISTANT_TITAN_TNG", "AGSA_PROACTIVE_ASSISTANT", "AGSA_READ", "AGSA_QUICK_PHRASES", "AGSA_BISTO", "AGSA_INTERPRETER_MODE", "AGSA_INFRASTRUCTURE", "AGSA_TRANSCRIPTION", "AGSA_ASSISTANT_INTERACTOR", "AGSA_RESTRICTED", "AGSA_XBLEND", "AGSA_OMNI", "AGSA_IN_APP_UPDATE_ANDROID", "AGSA_TNG_FINANCE_WIDGET", "ROBIN_ANDROID", "ROBIN_ANDROID_PSEUDO", "AGSA_SEARCH_VIDEO_ANDROID", "AUDIO_LIBRARY_ANDROID", "FEDASS_LOGS", "AGSA_TNG_SPORTS_WIDGET", "AGSA_MDD_ANDROID", "AGSA_SEARCH_XR", "AGSA_HOTWORD_LIBRARY_ANDROID", "AGSA_OMNI_XR", "AGSA_SEAPORT_LIBRARY_ANDROID", "AGSA_GELLER", "AGSA_NETWORK_MONITORING_LIBRARY_SEARCH_ANDROID", "AGSA_AIM_LIBRARY_ANDROID", "ANDROID_GSA_COUNTERS", "AGSA_GOOGLE_APP_COUNTERS", "AGSA_LENS_COUNTERS", "AGSA_INFRASTRUCTURE_COUNTERS", "FEDASS_COUNTERS", "CRONET_GMM", "GMM_PRIMES", "GMM_COUNTERS", "ANDROID_GSA_ANDROID_PRIMES", "CLIENT_LOGGING_PROD", "CRONET_ANDROID_GSA", "SEARCHLITE", "SEARCHLITE_ANDROID_PRIMES", "SILK_NATIVE", "XUIKIT", "XUIKIT_COUNTERS", "STREAMZ_XUIKIT_CLIENT_ERRORS"));
        rkq rkqVarB = rkwVar.b();
        d = rkqVarB;
        rjm rjmVar = new rjm("com.google.android.libraries.search.rendering.xuikit.device", rkqVarB);
        a = rjmVar;
        b = rjmVar.c("__phenotype_server_token", "");
        c = null;
    }

    private afdv() {
    }
}
