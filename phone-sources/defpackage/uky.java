package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class uky implements unj {
    private final /* synthetic */ int a;

    @Override // defpackage.unj
    public final Object a() {
        int i = this.a;
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return Collections.EMPTY_SET;
        }
        if (i == 2) {
            StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
            builderDetectNetwork.detectResourceMismatches();
            if (Build.VERSION.SDK_INT >= 26) {
                builderDetectNetwork.detectUnbufferedIo();
            }
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(4, new ule("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())));
        }
        if (i == 3) {
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ule("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
        }
        if (i == 4) {
            return ExecutorsRegistrar.a(Executors.newCachedThreadPool(new ule("Firebase Blocking", 11, null)));
        }
        if (i == 5) {
            return Executors.newSingleThreadScheduledExecutor(new ule("Firebase Scheduler", 0, null));
        }
        unj unjVar = FirebaseMessaging.a;
        return null;
    }
}
