package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jaq {
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;

    public jaq(Context context) {
        this.a = context;
        String string = context.getString(R.string.watchlisted_movie_free_channel_name);
        string.getClass();
        this.b = string;
        String string2 = context.getString(R.string.watchlisted_movie_free_channel_description);
        string2.getClass();
        this.c = string2;
        String string3 = context.getString(R.string.new_in_google_tv_channel_name);
        string3.getClass();
        this.d = string3;
        String string4 = context.getString(R.string.new_in_google_tv_channel_description);
        string4.getClass();
        this.e = string4;
        String string5 = context.getString(R.string.library_channel_name);
        string5.getClass();
        this.f = string5;
        String string6 = context.getString(R.string.library_channel_description);
        string6.getClass();
        this.g = string6;
        String string7 = context.getString(R.string.watch_reminders_channel_name);
        string7.getClass();
        this.h = string7;
        String string8 = context.getString(R.string.watch_reminders_channel_description);
        string8.getClass();
        this.i = string8;
        String string9 = context.getString(R.string.price_drop_channel_name);
        string9.getClass();
        this.j = string9;
        String string10 = context.getString(R.string.price_drop_channel_description);
        string10.getClass();
        this.k = string10;
        String string11 = context.getString(R.string.product_updates_channel_name);
        string11.getClass();
        this.l = string11;
        String string12 = context.getString(R.string.product_updates_channel_description);
        string12.getClass();
        this.m = string12;
        String string13 = context.getString(R.string.available_to_buy_or_rent_channel_name);
        string13.getClass();
        this.n = string13;
        String string14 = context.getString(R.string.available_to_buy_or_rent_channel_description);
        string14.getClass();
        this.o = string14;
        String string15 = context.getString(R.string.movie_and_show_recommendations_channel_name);
        string15.getClass();
        this.p = string15;
        String string16 = context.getString(R.string.movie_and_show_recommendations_channel_description);
        string16.getClass();
        this.q = string16;
        String string17 = context.getString(R.string.deals_channel_name);
        string17.getClass();
        this.r = string17;
        String string18 = context.getString(R.string.deals_channel_description);
        string18.getClass();
        this.s = string18;
        String string19 = context.getString(R.string.chime_updates_and_reminders_group_name);
        string19.getClass();
        this.t = string19;
        String string20 = context.getString(R.string.chime_watchlist_group_name);
        string20.getClass();
        this.u = string20;
        String string21 = context.getString(R.string.chime_recommendations_for_you_group_name);
        string21.getClass();
        this.v = string21;
    }

    private final void b(jao jaoVar) {
        NotificationChannel notificationChannel = new NotificationChannel(jaoVar.a, jaoVar.b, 3);
        notificationChannel.setDescription(jaoVar.c);
        notificationChannel.setGroup(jaoVar.d);
        Object systemService = this.a.getSystemService((Class<Object>) NotificationManager.class);
        systemService.getClass();
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    private final void c(jap japVar) {
        Object systemService = this.a.getSystemService((Class<Object>) NotificationManager.class);
        systemService.getClass();
        ((NotificationManager) systemService).createNotificationChannelGroup(new NotificationChannelGroup(japVar.a, japVar.b));
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 26) {
            krd.f("Android version is not O or higher. Skipping notification channel creation.");
            return;
        }
        c(new jap("chime_updates_and_reminders_group_id", this.t));
        c(new jap("chime_watchlist_group_id", this.u));
        c(new jap("chime_recommendations_for_you_group_id", this.v));
        b(new jao("LIBRARY", this.f, this.g, "chime_updates_and_reminders_group_id"));
        b(new jao("WATCH_REMINDERS", this.h, this.i, "chime_updates_and_reminders_group_id"));
        b(new jao("PRODUCT_UPDATES", this.l, this.m, "chime_updates_and_reminders_group_id"));
        b(new jao("AVAILABLE_TO_BUY_OR_RENT", this.n, this.o, "chime_watchlist_group_id"));
        b(new jao("PRICE_DROP", this.j, this.k, "chime_watchlist_group_id"));
        b(new jao("MOVIE_AND_SHOW_RECOMMENDATIONS", this.p, this.q, "chime_recommendations_for_you_group_id"));
        b(new jao("DEALS", this.r, this.s, "chime_recommendations_for_you_group_id"));
        b(new jao("WATCHLISTED_MOVIE_AVAILABLE_FOR_FREE", this.b, this.c, "chime_watchlist_group_id"));
        b(new jao("NEW_IN_GOOGLE_TV", this.d, this.e, "chime_recommendations_for_you_group_id"));
    }
}
