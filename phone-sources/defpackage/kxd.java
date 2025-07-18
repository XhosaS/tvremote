package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxd {
    public static final Uri a = Uri.parse("content://com.google.android.videos.bitmap");

    public static Uri a(Uri uri, String str, String str2) {
        return a.buildUpon().appendEncodedPath(str2).appendQueryParameter("uri", uri.toString()).appendQueryParameter("id", str).build();
    }

    public static Uri b(String str) {
        return a(Uri.EMPTY, str, "poster");
    }

    public static Uri c(Uri uri, String str) {
        return a(uri, str, "poster");
    }

    public static Uri d(String str) {
        return a(Uri.EMPTY, str, "screenshot");
    }

    public static Uri e(String str) {
        return a(Uri.EMPTY, str, "showbanner");
    }

    public static Uri f(String str) {
        return a(Uri.EMPTY, str, "showposter");
    }
}
