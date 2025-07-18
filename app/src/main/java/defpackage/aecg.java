package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aecg implements abxh {
    static final abxh a = new aecg();

    private aecg() {
    }

    @Override // defpackage.abxh
    public final boolean a(int i) {
        aech aechVar;
        switch (i) {
            case 0:
                aechVar = aech.NOT_SET;
                break;
            case 1:
                aechVar = aech.CPS_APP_PROCESS_GLOBAL_PROVIDER;
                break;
            case 2:
                aechVar = aech.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER;
                break;
            case 3:
                aechVar = aech.LOGGER_OVERRIDE_PROVIDER;
                break;
            case 4:
                aechVar = aech.LOGGER_DEFERRING_PROVIDER;
                break;
            case 5:
                aechVar = aech.EVENT_OVERRIDE;
                break;
            case 6:
                aechVar = aech.EVENT_DEFERRING;
                break;
            case 7:
                aechVar = aech.LOG_SOURCE_MAPPED;
                break;
            case 8:
                aechVar = aech.SERVER_INFRASTRUCTURE;
                break;
            case 9:
                aechVar = aech.LOG_REQUEST_SETTER_WEB;
                break;
            case 10:
                aechVar = aech.PRIVACY_CONTEXT_RESOLVER;
                break;
            default:
                aechVar = null;
                break;
        }
        return aechVar != null;
    }
}
