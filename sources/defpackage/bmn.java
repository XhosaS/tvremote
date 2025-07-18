package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmn extends bta {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/AppLinkFeature");
    public static final Uri b = Uri.parse("market://details");
    public final Context c;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;

    public bmn(Context context) {
        this.c = context;
    }

    public static Intent a(Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(335544320);
        if (str != null) {
            intent.setPackage(str);
        }
        return intent;
    }

    @Override // defpackage.bta
    protected final /* synthetic */ btc b(bug bugVar) {
        return new bmm(this);
    }

    @Override // defpackage.bta
    public final void c(bxj bxjVar) {
        bxjVar.c("App Link: %d requests received, %d intents launched, %d Play Store redirects, %d activity launch failures%n", Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g));
    }
}
