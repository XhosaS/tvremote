package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qiw {
    private static uiz a;

    public static synchronized uiz a(Context context, ntp ntpVar, qei qeiVar) {
        String str;
        uiz uizVarC;
        if (a == null) {
            uje ujeVar = new uje();
            ujeVar.e = "chime-sdk";
            ujeVar.b("AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los");
            ujeVar.c("1:747654520220:android:0000000000000000");
            ujeVar.d = qeiVar.b;
            ujf ujfVarA = ujeVar.a();
            Object obj = ntpVar.a;
            if (((tst) obj).g()) {
                ((qrg) ((tst) obj).c()).a();
            }
            try {
                uizVarC = uiz.c(context, ujfVarA, "CHIME_ANDROID_SDK");
            } catch (IllegalStateException unused) {
                Object obj2 = uiz.a;
                synchronized (obj2) {
                    Map map = uiz.b;
                    uiz uizVar = (uiz) map.get("CHIME_ANDROID_SDK");
                    if (uizVar == null) {
                        ArrayList arrayList = new ArrayList();
                        synchronized (obj2) {
                            Iterator it = map.values().iterator();
                            while (it.hasNext()) {
                                arrayList.add(((uiz) it.next()).f());
                            }
                            Collections.sort(arrayList);
                            if (arrayList.isEmpty()) {
                                str = "";
                            } else {
                                str = "Available app names: " + TextUtils.join(", ", arrayList);
                            }
                            throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", "CHIME_ANDROID_SDK", str));
                        }
                    }
                    ((ums) uizVar.f.a()).c();
                    uizVarC = uizVar;
                }
            }
            a = uizVarC;
        }
        return a;
    }
}
