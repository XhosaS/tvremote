package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaqd {
    public final Map a = new we();
    private final Executor b;

    public aaqd(Executor executor) {
        this.b = executor;
    }

    public final synchronized lvf a(final String str, aapk aapkVar) {
        Map map = this.a;
        lvf lvfVar = (lvf) map.get(str);
        if (lvfVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: ".concat(String.valueOf(str)));
            }
            return lvfVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: ".concat(String.valueOf(str)));
        }
        final FirebaseMessaging firebaseMessaging = aapkVar.a;
        final String str2 = aapkVar.b;
        final aaqi aaqiVar = aapkVar.c;
        aapq aapqVar = firebaseMessaging.e;
        lvf lvfVarB = aapqVar.a(aapqVar.b(aapu.e(aapqVar.a), "*", new Bundle())).c(firebaseMessaging.g, new lve() { // from class: aapd
            @Override // defpackage.lve
            public final lvf a(Object obj) {
                FirebaseMessaging firebaseMessaging2 = firebaseMessaging;
                String str3 = (String) obj;
                FirebaseMessaging.b(firebaseMessaging2.d).c(firebaseMessaging2.d(), str2, str3, firebaseMessaging2.h.c());
                aaqi aaqiVar2 = aaqiVar;
                if (aaqiVar2 == null || !str3.equals(aaqiVar2.b)) {
                    firebaseMessaging2.g(str3);
                }
                return lvq.c(str3);
            }
        }).b(this.b, new luj() { // from class: aaqc
            @Override // defpackage.luj
            public final Object a(lvf lvfVar2) {
                aaqd aaqdVar = this.a;
                String str3 = str;
                synchronized (aaqdVar) {
                    aaqdVar.a.remove(str3);
                }
                return lvfVar2;
            }
        });
        map.put(str, lvfVarB);
        return lvfVarB;
    }
}
