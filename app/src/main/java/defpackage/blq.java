package defpackage;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blq extends bkz {
    final /* synthetic */ MultiInstanceInvalidationService a;

    public blq(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // defpackage.bla
    public final int a(bkx bkxVar, String str) {
        bkxVar.getClass();
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
        synchronized (remoteCallbackList) {
            int i2 = multiInstanceInvalidationService.a + 1;
            multiInstanceInvalidationService.a = i2;
            Integer numValueOf = Integer.valueOf(i2);
            if (remoteCallbackList.register(bkxVar, numValueOf)) {
                multiInstanceInvalidationService.b.put(numValueOf, str);
                i = i2;
            } else {
                multiInstanceInvalidationService.a--;
            }
        }
        return i;
    }

    @Override // defpackage.bla
    public final void b(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
        synchronized (remoteCallbackList) {
            Map map = multiInstanceInvalidationService.b;
            String str = (String) map.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                try {
                    Object broadcastCookie = remoteCallbackList.getBroadcastCookie(i2);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) map.get(num);
                    if (i != iIntValue && agvy.c(str, str2)) {
                        try {
                            ((bkx) remoteCallbackList.getBroadcastItem(i2)).a(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.c.finishBroadcast();
                }
            }
        }
    }

    @Override // defpackage.bla
    public final void c(bkx bkxVar, int i) {
        bkxVar.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
        synchronized (remoteCallbackList) {
            remoteCallbackList.unregister(bkxVar);
        }
    }
}
