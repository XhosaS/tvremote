package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhj {
    private static final tvn a = tvn.n("GnpSdk");
    private static volatile qhk b = null;

    /* JADX WARN: Multi-variable type inference failed */
    public static qhk a(Context context) {
        qhk qhkVarA;
        if (b == null) {
            Object applicationContext = context.getApplicationContext();
            if (applicationContext instanceof ifm) {
                qhkVarA = ((ifm) applicationContext).a();
            } else {
                try {
                    qhkVarA = (qhk) sis.e(context, qhk.class);
                } catch (IllegalStateException e) {
                    ((tvk) ((tvk) a.l().i(e)).j("com/google/android/libraries/notifications/platform/inject/Gnp", "getComponent", 63, "Gnp.java")).s("Couldn't fetch GnpComponent entry point (relevant for Hilt/Tiktok integrations)");
                    try {
                        qhkVarA = ((qhl) sis.e(context, qhl.class)).a();
                    } catch (IllegalStateException e2) {
                        ((tvk) ((tvk) a.l().i(e2)).j("com/google/android/libraries/notifications/platform/inject/Gnp", "getComponent", 74, "Gnp.java")).s("Couldn't fetch GnpComponentSupplier entry point (relevant for custom integrations)");
                        throw new IllegalStateException("Unable to get GnpComponent from host app: ".concat(String.valueOf(context.getPackageName())));
                    }
                }
            }
            b = qhkVarA;
        }
        b.x().a(context);
        return b;
    }
}
