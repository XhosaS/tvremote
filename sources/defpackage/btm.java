package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btm {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/features/UserUtils");

    public static void a(Context context, Runnable runnable) {
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        if (!userManager.isUserUnlocked()) {
            cbt cbtVar = a;
            cch cchVarE = cbtVar.e();
            cck cckVar = btt.a;
            ((cbs) ((cbs) cchVarE.g(cckVar)).j("com/google/android/tv/remote/service/features/UserUtils", "runWhenUnlocked", 29, "UserUtils.java")).p("Waiting for user to unlock");
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            btl btlVar = new btl(atomicBoolean, runnable);
            context.registerReceiver(btlVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            if (!userManager.isUserUnlocked()) {
                return;
            }
            ((cbs) ((cbs) cbtVar.e().g(cckVar)).j("com/google/android/tv/remote/service/features/UserUtils", "runWhenUnlocked", 46, "UserUtils.java")).p("User is already unlocked");
            if (atomicBoolean.getAndSet(true)) {
                return;
            } else {
                context.unregisterReceiver(btlVar);
            }
        }
        runnable.run();
    }
}
