package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum jlv implements abxf {
    INVOCATION_TYPE_UNSPECIFIED(0),
    INVOCATION_TYPE_NOT_INVOKED(1),
    INVOCATION_TYPE_HOTWORD(2),
    INVOCATION_TYPE_INTENT(3),
    INVOCATION_TYPE_TEXT_SEARCH(4),
    INVOCATION_TYPE_CLIENT_INPUT_INTENT(5),
    INVOCATION_TYPE_SUGGESTION_INTENT(6),
    INVOCATION_TYPE_ESCAPE_HATCH_REISSUE_QUERY(7),
    INVOCATION_TYPE_UI_CLICK_CLIENT_INPUT_INTENT(8),
    INVOCATION_TYPE_DEVICE_LINK_TOKEN_REQUEST(9);

    public final int k;

    jlv(int i) {
        this.k = i;
    }

    public static jlv b(int i) {
        switch (i) {
            case 0:
                return INVOCATION_TYPE_UNSPECIFIED;
            case 1:
                return INVOCATION_TYPE_NOT_INVOKED;
            case 2:
                return INVOCATION_TYPE_HOTWORD;
            case 3:
                return INVOCATION_TYPE_INTENT;
            case 4:
                return INVOCATION_TYPE_TEXT_SEARCH;
            case 5:
                return INVOCATION_TYPE_CLIENT_INPUT_INTENT;
            case 6:
                return INVOCATION_TYPE_SUGGESTION_INTENT;
            case 7:
                return INVOCATION_TYPE_ESCAPE_HATCH_REISSUE_QUERY;
            case 8:
                return INVOCATION_TYPE_UI_CLICK_CLIENT_INPUT_INTENT;
            case 9:
                return INVOCATION_TYPE_DEVICE_LINK_TOKEN_REQUEST;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
