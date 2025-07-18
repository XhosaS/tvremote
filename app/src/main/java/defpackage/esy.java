package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esy {
    public static final Uri a;
    public static final Uri b;
    public static final yyk c;
    public static final yyk d;
    private static final Uri e;

    static {
        Uri uri = Uri.parse(String.format("content://%s/", "com.google.android.apps.tv.launcherx.live.data.contentprovider.LiveTvContentProvider"));
        e = uri;
        a = uri.buildUpon().appendPath("queryProviders").build();
        b = uri.buildUpon().appendPath("queryTunerChannels").build();
        c = yyk.q("providerKey", "providerType", "packageName");
        d = yyk.t("channelId", "mid", "channelNumber", "channelName", "deeplink", "tifInputId", "networkAffiliationMid");
    }
}
