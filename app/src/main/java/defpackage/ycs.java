package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ycs implements abxh {
    static final abxh a = new ycs();

    private ycs() {
    }

    @Override // defpackage.abxh
    public final boolean a(int i) {
        yct yctVar;
        switch (i) {
            case 0:
                yctVar = yct.ENTRY_POINT_UNKNOWN;
                break;
            case 1:
                yctVar = yct.ASSISTANT_SETUP;
                break;
            case 2:
                yctVar = yct.FROM_ASSISTANT_BUTTON;
                break;
            case 3:
                yctVar = yct.SETTINGS;
                break;
            case 4:
                yctVar = yct.SUGGESTION_CHIP;
                break;
            case 5:
                yctVar = yct.PUNT_CARD;
                break;
            case 6:
                yctVar = yct.VOICE_QUERY;
                break;
            case 7:
                yctVar = yct.KEYBOARD_SEARCH;
                break;
            case 8:
                yctVar = yct.ASSISTANT_SETUP_START_FROM_DSC;
                break;
            default:
                yctVar = null;
                break;
        }
        return yctVar != null;
    }
}
