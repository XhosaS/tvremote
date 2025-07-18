package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wrg {
    FEATURED_CAROUSEL_CHANNEL_LAYOUT,
    CONTINUE_WATCHING_CHANNEL_LAYOUT,
    BANNER_CHANNEL_LAYOUT,
    TVM_CHANNEL_LAYOUT,
    APP_ROW_CHANNEL_LAYOUT,
    HIGHLIGHTS_ARTICLE_CHANNEL_LAYOUT,
    RELATED_ARTICLE_CHANNEL_LAYOUT,
    BROWSE_CHANNEL_LAYOUT,
    PEOPLE_ROW_CHANNEL_LAYOUT,
    ENTRY_MODULE_LAYOUT,
    RATING_ROW_CHANNEL_LAYOUT,
    REVIEW_CHANNEL_LAYOUT,
    NEWS_CHANNEL_LAYOUT,
    IMMERSIVE_CHANNEL_LAYOUT,
    LIVE_ON_NOW_CHANNEL_LAYOUT,
    TVM_ENTITY_DESCRIPTION_LAYOUT,
    CHANNELLAYOUT_NOT_SET;

    public static wrg a(int i) {
        if (i == 0) {
            return CHANNELLAYOUT_NOT_SET;
        }
        switch (i) {
            case 3:
                return FEATURED_CAROUSEL_CHANNEL_LAYOUT;
            case 4:
                return CONTINUE_WATCHING_CHANNEL_LAYOUT;
            case 5:
                return BANNER_CHANNEL_LAYOUT;
            case 6:
                return TVM_CHANNEL_LAYOUT;
            case 7:
                return APP_ROW_CHANNEL_LAYOUT;
            case 8:
                return HIGHLIGHTS_ARTICLE_CHANNEL_LAYOUT;
            case 9:
                return RELATED_ARTICLE_CHANNEL_LAYOUT;
            case 10:
                return BROWSE_CHANNEL_LAYOUT;
            case 11:
                return PEOPLE_ROW_CHANNEL_LAYOUT;
            case 12:
                return ENTRY_MODULE_LAYOUT;
            case 13:
                return RATING_ROW_CHANNEL_LAYOUT;
            case 14:
                return REVIEW_CHANNEL_LAYOUT;
            case 15:
                return NEWS_CHANNEL_LAYOUT;
            case 16:
                return IMMERSIVE_CHANNEL_LAYOUT;
            case 17:
                return LIVE_ON_NOW_CHANNEL_LAYOUT;
            case 18:
                return TVM_ENTITY_DESCRIPTION_LAYOUT;
            default:
                return null;
        }
    }
}
