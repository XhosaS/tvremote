package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyb {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/fcm/FcmRegistrationImpl");
    public final fxv b;
    private final ahbt c;

    public fyb(ahbt ahbtVar, fxv fxvVar) {
        ahbtVar.getClass();
        this.c = ahbtVar;
        this.b = fxvVar;
    }

    public final void a(Context context) {
        ahal.e(this.c, null, 0, new fya(this, context, null), 3).w(new agux() { // from class: fxz
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException)) {
                    ((zdv) ((zdv) fyb.a.d()).p(th).q("com/google/android/apps/tvsearch/fcm/FcmRegistrationImpl", "register$lambda$0", 31, "FcmRegistrationImpl.kt")).u("Failed to register FCM.");
                }
                return agpu.a;
            }
        });
    }
}
