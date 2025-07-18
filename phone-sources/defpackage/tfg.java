package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfg {
    public static final ulp c = new ulp("ReviewService", (byte[]) null);
    public tfs a;
    public final String b;

    public tfg(Context context) {
        this.b = context.getPackageName();
        if (tfu.a(context)) {
            this.a = new tfs(context, c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new tfd(0));
        }
    }
}
