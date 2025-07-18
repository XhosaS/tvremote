package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
class kjr implements Handler.Callback {
    final /* synthetic */ kjs a;

    public kjr(kjs kjsVar) {
        this.a = kjsVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap map = this.a.c;
            synchronized (map) {
                kjo kjoVar = (kjo) message.obj;
                kjq kjqVar = (kjq) map.get(kjoVar);
                if (kjqVar != null && kjqVar.c()) {
                    if (kjqVar.c) {
                        kjs kjsVar = kjqVar.g;
                        kjsVar.e.removeMessages(1, kjqVar.e);
                        kjsVar.f.b(kjsVar.d, kjqVar);
                        kjqVar.c = false;
                        kjqVar.b = 2;
                    }
                    map.remove(kjoVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        HashMap map2 = this.a.c;
        synchronized (map2) {
            kjo kjoVar2 = (kjo) message.obj;
            kjq kjqVar2 = (kjq) map2.get(kjoVar2);
            if (kjqVar2 != null && kjqVar2.b == 3) {
                Log.e("GmsClientSupervisor", a.p(kjoVar2, "Timeout waiting for ServiceConnection callback "), new Exception());
                ComponentName componentName = kjqVar2.f;
                if (componentName == null) {
                    componentName = kjoVar2.c;
                }
                if (componentName == null) {
                    String str = kjoVar2.b;
                    kkk.k(str);
                    componentName = new ComponentName(str, "unknown");
                }
                kjqVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
