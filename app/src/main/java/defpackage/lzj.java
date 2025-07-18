package defpackage;

import android.os.RemoteException;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class lzj implements zxe {
    final /* synthetic */ lzo a;

    public lzj(lzo lzoVar) {
        this.a = lzoVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        try {
            this.a.e("", 3);
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) lzl.a.d()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$7", "onFailure", (char) 711, "AssistantSettingsServicePeer.java")).u("Error sending error back to client");
        }
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return;
        }
        lzo lzoVar = this.a;
        yin yinVar = ((ymc) optional.get()).g;
        if (yinVar == null) {
            yinVar = yin.a;
        }
        Iterator it = yinVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            yie yieVar = (yie) it.next();
            if (yieVar.d) {
                str = yieVar.c;
                break;
            }
        }
        try {
            if (str != null) {
                lzoVar.e(str, 0);
            } else {
                lzoVar.e("", 4);
            }
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) lzl.a.d()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "findCurrentDeviceId", (char) 740, "AssistantSettingsServicePeer.java")).u("Error sending result back to client");
        }
    }
}
