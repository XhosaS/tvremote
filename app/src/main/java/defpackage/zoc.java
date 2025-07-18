package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zoc implements abxh {
    static final abxh a = new zoc();

    private zoc() {
    }

    @Override // defpackage.abxh
    public final boolean a(int i) {
        zod zodVar;
        switch (i) {
            case 0:
                zodVar = zod.CLIENT_ACCOUNT_STATE_UNKNOWN;
                break;
            case 1:
                zodVar = zod.CLIENT_ACCOUNT_STATE_NONE;
                break;
            case 2:
                zodVar = zod.CLIENT_ACCOUNT_STATE_GAIA;
                break;
            case 3:
                zodVar = zod.CLIENT_ACCOUNT_STATE_GAIA_NO_NAME;
                break;
            case 4:
                zodVar = zod.CLIENT_ACCOUNT_STATE_PSEUDONYMOUS;
                break;
            case 5:
                zodVar = zod.CLIENT_ACCOUNT_STATE_PSEUDONYMOUS_NO_ZWIEBACK;
                break;
            case 6:
                zodVar = zod.CLIENT_ACCOUNT_STATE_DEIDENTIFIED;
                break;
            case 7:
                zodVar = zod.CLIENT_ACCOUNT_STATE_UNEXPECTED_ACCOUNT_TYPE;
                break;
            case 8:
                zodVar = zod.CLIENT_ACCOUNT_STATE_ERROR;
                break;
            default:
                zodVar = null;
                break;
        }
        return zodVar != null;
    }
}
