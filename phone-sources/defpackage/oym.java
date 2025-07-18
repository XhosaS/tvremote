package defpackage;

import com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class oym implements Callable {
    private final /* synthetic */ int a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        if (i == 0) {
            tvn tvnVar = TestingToolsBroadcastReceiver.a;
            return true;
        }
        if (i != 1) {
            return null;
        }
        ((tvk) ((tvk) TestingToolsBroadcastReceiver.a.e()).j("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "clearCounters", 696, "TestingToolsBroadcastReceiver.java")).s("Cleared all counters");
        return null;
    }
}
