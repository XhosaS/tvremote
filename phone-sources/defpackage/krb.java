package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.play.movies.common.activity.LauncherActivity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krb {
    public static final krb a;
    private static final /* synthetic */ krb[] b;

    static {
        krb krbVar = new krb();
        a = krbVar;
        b = new krb[]{krbVar};
    }

    private krb() {
    }

    public static Intent a(Context context, Uri uri, ieg iegVar, int i) {
        return new Intent(context, (Class<?>) LauncherActivity.class).setData(uri).putExtra("authAccount", ksn.c(iegVar)).addFlags(i);
    }

    public static Uri.Builder b(String str, String str2, String str3, String str4) {
        Uri.Builder builderD = d("shows", str4);
        krf.c(str);
        builderD.appendQueryParameter("v", str);
        krf.c(str2);
        builderD.appendQueryParameter("se", str2);
        krf.c(str3);
        builderD.appendQueryParameter("sh", str3);
        return builderD;
    }

    public static Uri.Builder c(String str, String str2) {
        krf.c(str);
        return d("movies", str2).appendQueryParameter("v", str);
    }

    public static Uri.Builder d(String str, String str2) {
        return new Uri.Builder().scheme("http").authority("play.google.com").appendEncodedPath("movies").appendEncodedPath(str).appendQueryParameter("ref", m(str2));
    }

    public static void e(Uri.Builder builder) {
        builder.appendQueryParameter("pining_error_dialog", Boolean.toString(true));
    }

    public static Intent f(Context context, Uri uri, ksn ksnVar) {
        return a(context, uri, ieg.f(ksnVar), 268435456);
    }

    public static final Intent g(Context context, ksn ksnVar) {
        return f(context, d("watchnow", "notifications").appendQueryParameter("mdl", Boolean.toString(true)).build(), ksnVar);
    }

    public static final Intent h(Context context, ksn ksnVar, String str, String str2) {
        krf.c(str);
        krf.c(str2);
        return f(context, d("shows", "notifications").appendQueryParameter("se", str2).appendQueryParameter("sh", str).build(), ksnVar);
    }

    public static final Intent i(Context context, ksn ksnVar, String str) {
        krf.c(str);
        return f(context, d("shows", "notifications").appendQueryParameter("sh", str).build(), ksnVar);
    }

    public static final Intent j(Context context, ieg iegVar, String str, String str2, String str3, String str4, boolean z) {
        if (z) {
            return new Intent(context, (Class<?>) LauncherActivity.class).setData(new Uri.Builder().scheme("http").authority("play.google.com").appendEncodedPath("trailers").appendQueryParameter("v", str3).appendQueryParameter("pv", str4).appendQueryParameter("ref", m("remote_tracker")).build()).putExtra("authAccount", ksn.c(iegVar)).addFlags(268435456);
        }
        return TextUtils.isEmpty(str2) ? a(context, c(str3, "remote_tracker").appendQueryParameter("play", Boolean.toString(true)).build(), iegVar, 268435456) : a(context, b(str3, str2, str, "remote_tracker").appendQueryParameter("play", Boolean.toString(true)).build(), iegVar, 268435456);
    }

    public static final Intent k(Context context, ksn ksnVar, String str, String str2, String str3) {
        return f(context, b(str3, str2, str, "notifications").build(), ksnVar);
    }

    public static final Intent l(Context context, ksn ksnVar, String str) {
        return f(context, c(str, "notifications").build(), ksnVar);
    }

    private static String m(String str) {
        krf.c(str);
        return "videos:".concat(str);
    }

    public static krb[] values() {
        return (krb[]) b.clone();
    }
}
