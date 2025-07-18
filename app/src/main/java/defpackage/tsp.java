package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tsp implements abxk {
    @Override // defpackage.abxk
    public final /* bridge */ /* synthetic */ Object a(int i) {
        tsw tswVar;
        switch (i) {
            case 0:
                tswVar = tsw.PRIVILEGED_FEATURE_UNSPECIFIED;
                break;
            case 1:
                tswVar = tsw.PRIVILEGED_FEATURE_S3_DIARIZATION;
                break;
            case 2:
                tswVar = tsw.PRIVILEGED_FEATURE_PER_APP_CONCURRENCY;
                break;
            case 3:
                tswVar = tsw.PRIVILEGED_FEATURE_AICORE_ALWAYS_FALLBACK;
                break;
            case 4:
                tswVar = tsw.PRIVILEGED_FEATURE_TRANSLATION;
                break;
            case 5:
                tswVar = tsw.PRIVILEGED_FEATURE_CONVERSATION;
                break;
            case 6:
                tswVar = tsw.PRIVILEGED_FEATURE_AICORE_INTERNAL_DEBUG_LOGGING;
                break;
            default:
                tswVar = null;
                break;
        }
        return tswVar == null ? tsw.UNRECOGNIZED : tswVar;
    }
}
