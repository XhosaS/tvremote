package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class his {
    private static boolean a = false;

    static synchronized boolean a(Context context) {
        try {
            a = xnw.a.get().a(context);
        } catch (Exception e) {
            hiy.e("RuntimeFlags", "Fail to get the runtime flags: ".concat(e.toString()));
        }
        return a;
    }
}
