package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class log {
    public static final Uri a = Uri.parse("http://play.google.com/store/");

    public static Uri a(String str, ieg iegVar, Uri.Builder builder) {
        if (iegVar.m()) {
            builder.appendQueryParameter("paffiliateid", ((ksp) iegVar.g()).a);
        }
        return builder.appendQueryParameter("pcampaignid", str).build();
    }
}
