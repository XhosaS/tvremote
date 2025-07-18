package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isi implements isp {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/smarthome/executors/RemoteControlExecutor");
    private final gol b;
    private final Set c;

    public isi(Context context, gol golVar) {
        context.getClass();
        golVar.getClass();
        this.b = golVar;
        Set setSingleton = Collections.singleton("action.devices.commands.ClickRemoteControlButton");
        setSingleton.getClass();
        this.c = setSingleton;
    }

    @Override // defpackage.isp
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.isp
    public final boolean b(String str, abau abauVar) {
        if (!agvy.c("action.devices.commands.ClickRemoteControlButton", str)) {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/smarthome/executors/RemoteControlExecutor", "execute", 39, "RemoteControlExecutor.kt")).x("Received invalid remote control command: '%s'", str);
            return false;
        }
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/smarthome/executors/RemoteControlExecutor", "execute", 42, "RemoteControlExecutor.kt")).F("Received command: '%s' with params '%s'", str, abauVar);
        abar abarVarG = abauVar.g("button");
        if (abarVarG == null) {
            return false;
        }
        String strC = abarVarG.c();
        strC.getClass();
        Map map = irn.a;
        Map map2 = irn.a;
        if (!map2.containsKey(strC)) {
            ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/smarthome/executors/RemoteControlExecutor", "executeButton", 29, "RemoteControlExecutor.kt")).x("Received invalid button. '%s' can not be executed.", strC);
            return false;
        }
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/smarthome/executors/RemoteControlExecutor", "executeButton", 32, "RemoteControlExecutor.kt")).x("Executing a button command: '%s'", strC);
        Integer num = (Integer) map2.get(strC);
        if (num == null) {
            return true;
        }
        this.b.b(num.intValue());
        return true;
    }
}
