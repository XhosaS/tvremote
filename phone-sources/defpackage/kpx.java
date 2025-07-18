package defpackage;

import android.content.BroadcastReceiver;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.play.movies.mobile.service.restart.GtvExperienceInitializer;
import com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kpx implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kpx(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.c;
        if (i == 0) {
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool.booleanValue();
            vtw vtwVar = (vtw) this.a;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            Object obj2 = this.b;
            wiu wiuVar = (wiu) vtwVar.b;
            wiu wiuVar2 = wiu.a;
            wiuVar.b = 2 | wiuVar.b;
            wiuVar.d = zBooleanValue;
            boolean zBooleanValue2 = bool.booleanValue();
            vtw vtwVar2 = (vtw) obj2;
            if (!vtwVar2.b.A()) {
                vtwVar2.u();
            }
            wiv wivVar = (wiv) vtwVar2.b;
            wiv wivVar2 = wiv.a;
            wivVar.b |= 1024;
            wivVar.j = zBooleanValue2;
            return;
        }
        if (i == 1) {
            Boolean bool2 = (Boolean) obj;
            boolean zBooleanValue3 = bool2.booleanValue();
            vtw vtwVar3 = (vtw) this.a;
            if (!vtwVar3.b.A()) {
                vtwVar3.u();
            }
            Object obj3 = this.b;
            wiu wiuVar3 = (wiu) vtwVar3.b;
            wiu wiuVar4 = wiu.a;
            wiuVar3.b = 1 | wiuVar3.b;
            wiuVar3.c = zBooleanValue3;
            boolean zBooleanValue4 = bool2.booleanValue();
            vtw vtwVar4 = (vtw) obj3;
            if (!vtwVar4.b.A()) {
                vtwVar4.u();
            }
            wiv wivVar3 = (wiv) vtwVar4.b;
            wiv wivVar4 = wiv.a;
            wivVar3.b |= 512;
            wivVar3.i = zBooleanValue4;
            return;
        }
        if (i != 2) {
            if (i != 3) {
                Object obj4 = this.a;
                ((tvk) ((tvk) ((tvk) TestingToolsBroadcastReceiver.a.f()).i((Throwable) obj)).j("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 215, "TestingToolsBroadcastReceiver.java")).v("Failed to perform action %s", this.b);
                TestingToolsBroadcastReceiver.b((BroadcastReceiver.PendingResult) obj4, -1);
                return;
            }
            if (!((Boolean) obj).booleanValue()) {
                krd.c("Failed to sync GTV flag");
                return;
            }
            Object obj5 = this.b;
            int i2 = kqc.i;
            rwl.b();
            kij kijVar = new kij(obj5, 14);
            Executor executor = ((GtvExperienceInitializer) obj5).f;
            if (executor == null) {
                yks.c("localExecutor");
                executor = null;
            }
            executor.execute(new lke(obj5, this.a, (Object) kijVar, 8, (byte[]) null));
            return;
        }
        Boolean bool3 = (Boolean) obj;
        boolean zBooleanValue5 = bool3.booleanValue();
        vtw vtwVar5 = (vtw) this.a;
        if (!vtwVar5.b.A()) {
            vtwVar5.u();
        }
        Object obj6 = this.b;
        wiu wiuVar5 = (wiu) vtwVar5.b;
        wiu wiuVar6 = wiu.a;
        wiuVar5.b |= 4;
        wiuVar5.e = zBooleanValue5;
        boolean zBooleanValue6 = bool3.booleanValue();
        vtw vtwVar6 = (vtw) obj6;
        if (!vtwVar6.b.A()) {
            vtwVar6.u();
        }
        wiv wivVar5 = (wiv) vtwVar6.b;
        wiv wivVar6 = wiv.a;
        wivVar5.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        wivVar5.k = zBooleanValue6;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ kpx(vtw vtwVar, vtw vtwVar2, int i) {
        this.c = i;
        this.a = vtwVar;
        this.b = vtwVar2;
    }
}
