package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rvu {
    BLUETOOTH_AUDIO_ROUTE,
    BUILTIN_AUDIO_ROUTE,
    DSP_AUDIO_ROUTE,
    BISTO_AUDIO_ROUTE,
    HANDOVER_ROUTE,
    SODA_ROUTE,
    CAR_AUDIO_ROUTE,
    GACS_AUDIO_ROUTE,
    AUDIOROUTE_NOT_SET;

    public static rvu a(int i) {
        switch (i) {
            case 0:
                return AUDIOROUTE_NOT_SET;
            case 1:
                return BLUETOOTH_AUDIO_ROUTE;
            case 2:
                return BUILTIN_AUDIO_ROUTE;
            case 3:
                return DSP_AUDIO_ROUTE;
            case 4:
                return BISTO_AUDIO_ROUTE;
            case 5:
                return HANDOVER_ROUTE;
            case 6:
                return SODA_ROUTE;
            case 7:
                return CAR_AUDIO_ROUTE;
            case 8:
                return GACS_AUDIO_ROUTE;
            default:
                return null;
        }
    }
}
