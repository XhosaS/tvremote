package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wgs {
    public static boolean a(Intent intent, Context context) {
        return intent.getPackage() != null && intent.getPackage().equals(context.getPackageName());
    }
}
