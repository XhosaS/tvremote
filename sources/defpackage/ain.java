package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ain implements Handler.Callback {
    final /* synthetic */ ail a;

    public ain(ail ailVar) {
        this.a = ailVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap map = this.a.c;
            synchronized (map) {
                aik aikVar = (aik) message.obj;
                aim aimVar = (aim) map.get(aikVar);
                if (aimVar != null && aimVar.b()) {
                    if (aimVar.c) {
                        ail ailVar = aimVar.g;
                        ailVar.e.removeMessages(1, aimVar.e);
                        ajo.a(ailVar.d, aimVar);
                        aimVar.c = false;
                        aimVar.b = 2;
                    }
                    map.remove(aikVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        HashMap map2 = this.a.c;
        synchronized (map2) {
            aik aikVar2 = (aik) message.obj;
            aim aimVar2 = (aim) map2.get(aikVar2);
            if (aimVar2 != null && aimVar2.b == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(aikVar2), new Exception());
                ComponentName componentName = aimVar2.f;
                if (componentName == null) {
                    componentName = null;
                }
                if (componentName == null) {
                    componentName = new ComponentName(aikVar2.b, "unknown");
                }
                aimVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
