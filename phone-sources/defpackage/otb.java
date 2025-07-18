package defpackage;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otb {
    public static boolean a = true;
    private static boolean b = false;

    public static synchronized void a(Context context) {
        if (b) {
            return;
        }
        context.getApplicationContext().registerReceiver(new otc(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
        b = true;
    }
}
