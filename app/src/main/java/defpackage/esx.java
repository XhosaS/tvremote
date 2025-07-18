package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esx {
    public static final Uri a;
    public static final yyk b;
    private static final Uri c;

    static {
        Uri uri = Uri.parse(String.format("content://%s/", "com.google.android.apps.tv.launcherx.config.contentprovider.LauncherXKatnissConfigContentProvider"));
        c = uri;
        a = uri.buildUpon().appendPath("path_query").build();
        b = yyk.p("config_data", "assistant_launcher_capabilities");
    }
}
