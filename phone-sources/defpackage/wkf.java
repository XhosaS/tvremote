package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wkf implements vug {
    TYPE_UNSPECIFIED(0),
    TVM_ENTITY_PAGE_ACTION(350411639),
    TVM_ENTITY_MENU_ACTION(354969527),
    SEARCH_QUERY_ACTION(356574909),
    WATCH_ACTION_INVOKE_ACTION(363917300),
    PARENTAL_CONTROLS_ACTION(369754711),
    GENERIC_STREAM_PAGE_ACTION(372454989),
    GENERIC_STREAM_DIALOG_ACTION(392557649),
    MEDIA_PROVIDER_SELECTION_ACTION(374995289),
    DESTINATION_ACTION(381349078),
    OPEN_APP_ACTION(385036965),
    WEB_VIEW_ACTION(389536254),
    GENERIC_COMPONENT_PAGE_ACTION(403206638),
    SHARE_ITEM_ACTION(408689803),
    GENERIC_ALERT_DIALOG_ACTION(427857035),
    MY_EPISODES_ACTION(432579247),
    ADD_ACCOUNT_ACTION(525000000),
    PURCHASE_FLOW_ACTION(525000001),
    ADD_TO_WATCHLIST_ACTION(525000002),
    OPEN_LINK_ACTION(525000003);

    public final int u;

    wkf(int i) {
        this.u = i;
    }

    public static wkf b(int i) {
        switch (i) {
            case 0:
                return TYPE_UNSPECIFIED;
            case 350411639:
                return TVM_ENTITY_PAGE_ACTION;
            case 354969527:
                return TVM_ENTITY_MENU_ACTION;
            case 356574909:
                return SEARCH_QUERY_ACTION;
            case 363917300:
                return WATCH_ACTION_INVOKE_ACTION;
            case 369754711:
                return PARENTAL_CONTROLS_ACTION;
            case 372454989:
                return GENERIC_STREAM_PAGE_ACTION;
            case 374995289:
                return MEDIA_PROVIDER_SELECTION_ACTION;
            case 381349078:
                return DESTINATION_ACTION;
            case 385036965:
                return OPEN_APP_ACTION;
            case 389536254:
                return WEB_VIEW_ACTION;
            case 392557649:
                return GENERIC_STREAM_DIALOG_ACTION;
            case 403206638:
                return GENERIC_COMPONENT_PAGE_ACTION;
            case 408689803:
                return SHARE_ITEM_ACTION;
            case 427857035:
                return GENERIC_ALERT_DIALOG_ACTION;
            case 432579247:
                return MY_EPISODES_ACTION;
            case 525000000:
                return ADD_ACCOUNT_ACTION;
            case 525000001:
                return PURCHASE_FLOW_ACTION;
            case 525000002:
                return ADD_TO_WATCHLIST_ACTION;
            case 525000003:
                return OPEN_LINK_ACTION;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
