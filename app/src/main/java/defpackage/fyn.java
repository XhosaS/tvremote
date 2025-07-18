package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyn extends agtu implements agvb {
    final /* synthetic */ fyp a;
    final /* synthetic */ RemoteMessage b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(fyp fypVar, RemoteMessage remoteMessage, agsw agswVar) {
        super(2, agswVar);
        this.a = fypVar;
        this.b = remoteMessage;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fyn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        RemoteMessage remoteMessage = this.b;
        if (remoteMessage.b == null) {
            Bundle bundle = remoteMessage.a;
            we weVar = new we();
            for (String str : bundle.keySet()) {
                Object obj2 = bundle.get(str);
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        weVar.put(str, str2);
                    }
                }
            }
            remoteMessage.b = weVar;
        }
        fyp fypVar = this.a;
        Map map = remoteMessage.b;
        map.getClass();
        if (fypVar.a(map, "request") && fypVar.a(map, "hgs_device_ids") && fypVar.a(map, "request_id")) {
            if (fypVar.h.a((String) map.get("request"))) {
                ((zdv) fyp.a.b().q("com/google/android/apps/tvsearch/fcm/KatnissFcmServicePeer", "maybeHandleSmartHomeIntent", 119, "KatnissFcmServicePeer.kt")).u("Successfully handled smart home intent.");
            } else {
                ((zdv) fyp.a.b().q("com/google/android/apps/tvsearch/fcm/KatnissFcmServicePeer", "maybeHandleSmartHomeIntent", 122, "KatnissFcmServicePeer.kt")).u("Failed to handle smart home intent.");
            }
        } else if (((Boolean) fypVar.g.a()).booleanValue()) {
            ffp ffpVar = fypVar.e;
            Intent intent = new Intent();
            intent.putExtras(remoteMessage.a);
            ffpVar.n(intent);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fyn(this.a, this.b, agswVar);
    }
}
