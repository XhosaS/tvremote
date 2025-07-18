package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aams {
    private static aams c;
    public Boolean a = null;
    public Boolean b = null;

    private aams() {
    }

    public static synchronized aams a() {
        if (c == null) {
            c = new aams();
        }
        return c;
    }

    final boolean b(Context context) {
        if (this.a == null) {
            this.a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.a.booleanValue();
    }
}
