package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum kyt {
    TEMPORARY("TEMPORARY007", R.string.default_notification_channel_label, R.string.default_notification_channel_description, false, null),
    LIBRARY("01_LIBRARY", R.string.library_notification_channel_label, R.string.library_notification_channel_description, true, kyu.UPDATES_AND_REMINDERS),
    WATCH_REMINDERS("02_WATCH_REMINDERS", R.string.watch_reminders_notification_channel_label, R.string.watch_reminders_notification_channel_description, true, kyu.UPDATES_AND_REMINDERS),
    PRODUCT_UPDATES("03_PRODUCT_UPDATES", R.string.product_updates_notification_channel_label, R.string.product_updates_notification_channel_description, false, kyu.UPDATES_AND_REMINDERS),
    AVAILABLE_TO_BUY_OR_RENT("01_AVAILABLE_TO_BUY_OR_RENT", R.string.available_to_buy_or_rent_notification_channel_label, R.string.available_to_buy_or_rent_notification_channel_description, false, kyu.WACTHLIST),
    PRICE_DROP("02_PRICE_DROP", R.string.price_drop_notification_channel_label, R.string.price_drop_notification_channel_description, false, kyu.WACTHLIST),
    AVAILABLE_TO_WATCH_FREE("03_AVAILABLE_TO_WATCH_FREE", R.string.available_to_watch_free_notification_channel_label, R.string.available_to_watch_free_notification_channel_description, true, kyu.WACTHLIST),
    NEW_TO_YOUR_SERVICES("01_NEW_TO_YOUR_SERVICES", R.string.new_to_your_service_notification_channel_label, R.string.new_to_your_service_notification_channel_description, false, kyu.RECOMMENDATIONS_FOR_YOU),
    MOVIE_AND_SHOW_RECOMMENDATIONS("02_MOVIE_AND_SHOW_RECOMMENDATIONS", R.string.movies_and_show_recommendations_notification_channel_label, R.string.movies_and_show_recommendations_notification_channel_description, false, kyu.RECOMMENDATIONS_FOR_YOU),
    DEALS_FOR_YOU("03_DEALS_FOR_YOU", R.string.deals_for_you_notification_channel_label, R.string.deals_for_you_notification_channel_description, false, kyu.RECOMMENDATIONS_FOR_YOU);

    public final String k;
    public final int l;
    public final int m;
    public final boolean n;
    public final kyu o;

    kyt(String str, int i, int i2, boolean z, kyu kyuVar) {
        this.k = str;
        this.l = i;
        this.m = i2;
        this.n = z;
        this.o = kyuVar;
    }
}
