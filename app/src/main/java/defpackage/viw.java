package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class viw {
    private final Context a;
    private final String b = "com.google.android.katniss.TIKTOK_ACCOUNTS_MULTIPROCESS_BROADCAST";

    public viw(Context context) {
        this.a = context;
    }

    final void a() {
        Intent intent = new Intent("com.google.apps.tiktok.account.data.tiktok_account_data_source_changed");
        Context context = this.a;
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent, this.b);
    }
}
