package defpackage;

import android.content.Intent;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evy implements wlk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/app/displayutils/DisplayBroadcastReceiver");
    private final ewc b;

    public evy(ewc ewcVar) {
        ewcVar.getClass();
        this.b = ewcVar;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        Set setA;
        intent.getClass();
        ((zdv) a.b().q("com/google/android/apps/tvsearch/app/displayutils/DisplayBroadcastReceiver", "onReceive", 17, "DisplayBroadcastReceiver.kt")).x("onReceive: %s", intent.getAction());
        if (!agvy.c(intent.getAction(), "android.intent.action.SCREEN_OFF")) {
            agvy.c(intent.getAction(), "android.intent.action.DREAMING_STARTED");
        }
        Set set = this.b.a;
        synchronized (set) {
            setA = agqq.A(set);
        }
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            ((ewb) it.next()).a(intent);
        }
        return zxy.a;
    }
}
