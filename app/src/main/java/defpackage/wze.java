package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wze {
    private static final zdy a = zdy.h("com/google/apps/tiktok/tracing/TraceThreadContextElementKt");

    public static final Object a(agte agteVar, agsw agswVar) {
        agte agteVarFr = agswVar.fr();
        wzb wzbVar = wzc.a;
        if (agteVarFr.get(wzbVar) != null || agteVar.get(wzbVar) != null) {
            return agpu.a;
        }
        IllegalStateException illegalStateException = new IllegalStateException("TikTok coroutine tracing methods should only be called in a TikTok CoroutineContext: go/tiktok/dev/concurrent/coroutines/tracing#trace-propagation");
        if (c()) {
            throw illegalStateException;
        }
        boolean z = wum.a;
        ((zdv) ((zdv) a.c()).p(illegalStateException).q("com/google/apps/tiktok/tracing/TraceThreadContextElementKt", "checkContextHasTraceElement", 87, "TraceThreadContextElement.kt")).u("Missing trace context element");
        return agpu.a;
    }

    public static final void b(ahbt ahbtVar) {
        if (ahbtVar.fs().get(wzc.a) != null) {
            return;
        }
        if (agvy.c(ahbtVar.getClass().getName(), "androidx.compose.runtime.RememberedCoroutineScope") && ((Boolean) ahbtVar.fs().fold(false, new agvb() { // from class: wzd
            @Override // defpackage.agvb
            public final Object a(Object obj, Object obj2) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                agtc agtcVar = (agtc) obj2;
                agtcVar.getClass();
                String name = agtcVar.getClass().getName();
                name.getClass();
                return Boolean.valueOf(zBooleanValue | name.startsWith("androidx.compose.ui.test.AndroidComposeUiTestEnvironment"));
            }
        })).booleanValue()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("TikTok coroutine tracing methods should only be called in a TikTok CoroutineContext: go/tiktok/dev/concurrent/coroutines/tracing#trace-propagation");
        if (c()) {
            throw illegalStateException;
        }
        boolean z = wum.a;
        ((zdv) ((zdv) a.c()).p(illegalStateException).q("com/google/apps/tiktok/tracing/TraceThreadContextElementKt", "checkHasTraceElement", 62, "TraceThreadContextElement.kt")).u("Missing trace context element");
    }

    private static final boolean c() {
        if (agvy.c(Build.FINGERPRINT, "robolectric")) {
            return true;
        }
        if (agvy.c(Build.HARDWARE, "ranchu")) {
            String str = Build.FINGERPRINT;
            str.getClass();
            if (str.endsWith("test-keys")) {
                return true;
            }
        }
        return false;
    }
}
