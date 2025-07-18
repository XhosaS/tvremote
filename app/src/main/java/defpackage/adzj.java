package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adzj implements abxh {
    public static final abxh a = new adzj();

    private adzj() {
    }

    @Override // defpackage.abxh
    public final boolean a(int i) {
        adzk adzkVar;
        switch (i) {
            case 0:
                adzkVar = adzk.SETUP_SKIP_NONE;
                break;
            case 1:
                adzkVar = adzk.SETUP_WIZARD_WRONG_CALLING_PACKAGE;
                break;
            case 2:
                adzkVar = adzk.SETUP_WIZARD_BACKWARD_DIRECTION;
                break;
            case 3:
                adzkVar = adzk.SETUP_WIZARD_FORWARD_DIRECTION_AGAIN;
                break;
            case 4:
                adzkVar = adzk.SETUP_WIZARD_NO_NETWORK_CONNECTION;
                break;
            case 5:
                adzkVar = adzk.SETUP_ALREADY_DONE;
                break;
            case 6:
                adzkVar = adzk.UNSUPPORTED_LOCALE;
                break;
            case 7:
                adzkVar = adzk.ERROR;
                break;
            case 8:
                adzkVar = adzk.SETUP_BLOCKED_BY_EXISTING_INSTANCE;
                break;
            default:
                adzkVar = null;
                break;
        }
        return adzkVar != null;
    }
}
