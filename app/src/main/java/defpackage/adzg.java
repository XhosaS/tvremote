package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adzg implements abxh {
    public static final abxh a = new adzg();

    private adzg() {
    }

    @Override // defpackage.abxh
    public final boolean a(int i) {
        adzh adzhVar;
        switch (i) {
            case 0:
                adzhVar = adzh.LATENCY_SETUP_UNKNOWN;
                break;
            case 1:
                adzhVar = adzh.LATENCY_SETUP_FIRST_SCREEN;
                break;
            case 2:
                adzhVar = adzh.AUTH_CHECK;
                break;
            case 3:
                adzhVar = adzh.FETCH_EXISTING_SETTINGS;
                break;
            case 4:
                adzhVar = adzh.PROCESS_EXISTING_SETTINGS;
                break;
            case 5:
                adzhVar = adzh.LOAD_EXPERIMENTS_CONFIG;
                break;
            case 6:
                adzhVar = adzh.LOAD_EXPERIMENTS_CONFIG_TIMEOUT;
                break;
            case 7:
                adzhVar = adzh.PROCESS_ASSISTANT_SUPPORTED_BIT;
                break;
            case 8:
                adzhVar = adzh.HOMEGRAPH_LOAD_LATENCY;
                break;
            default:
                adzhVar = null;
                break;
        }
        return adzhVar != null;
    }
}
