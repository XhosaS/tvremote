package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class oyn implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ oyn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            Object obj2 = this.a;
            tvn tvnVar = TestingToolsBroadcastReceiver.a;
            TestingToolsBroadcastReceiver.b((BroadcastReceiver.PendingResult) obj2, true != ((Boolean) obj).booleanValue() ? -1 : 0);
            return;
        }
        if (i == 1) {
            Intent intent = (Intent) obj;
            intent.addFlags(268435456);
            ((Context) this.a).startActivity(intent);
            System.exit(0);
            return;
        }
        if (i == 2) {
            oyz oyzVar = (oyz) this.a;
            ((qoj) oyzVar.f.b()).l(oyzVar.c, "OK");
            return;
        }
        if (i == 3) {
            ((tvk) ((tvk) ((tvk) oyz.a.g()).i((Throwable) obj)).j("com/google/android/libraries/internal/growth/growthkit/internal/events/impl/EventsHelperImpl", "addVisualElementEventToStore", 202, "EventsHelperImpl.java")).s("Failed to log visual element event.");
            oyz oyzVar2 = (oyz) this.a;
            ((qoj) oyzVar2.f.b()).l(oyzVar2.c, "ERROR");
        } else if (i == 4) {
            piq piqVar = (piq) this.a;
            ((qoj) piqVar.b.b()).k(piqVar.c, "OK");
        } else {
            if (i != 5) {
                ((tlx) this.a).a((tms) obj);
                return;
            }
            ((tvk) ((tvk) ((tvk) piq.a.f()).i((Throwable) obj)).j("com/google/android/libraries/internal/growth/growthkit/lifecycle/impl/GrowthKitStartupImpl", "start", 64, "GrowthKitStartupImpl.java")).s("GrowthKit failed to start.");
            piq piqVar2 = (piq) this.a;
            ((qoj) piqVar2.b.b()).k(piqVar2.c, "ERROR");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
