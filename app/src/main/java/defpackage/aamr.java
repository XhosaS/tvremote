package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aamr {
    public final Map a = new we();
    private final Executor b;

    public aamr(Executor executor) {
        this.b = executor;
    }

    final synchronized lvf a(String str, String str2, aamf aamfVar) {
        int iB;
        final Pair pair = new Pair(str, str2);
        Map map = this.a;
        lvf lvfVar = (lvf) map.get(pair);
        if (lvfVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Joining ongoing request for: ".concat(pair.toString()));
            }
            return lvfVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Making new request for: ".concat(pair.toString()));
        }
        final FirebaseInstanceId firebaseInstanceId = aamfVar.a;
        String str3 = aamfVar.b;
        final String str4 = aamfVar.c;
        final String str5 = aamfVar.d;
        final aamt aamtVar = aamfVar.e;
        Bundle bundle = new Bundle();
        bundle.putString("scope", str5);
        bundle.putString("sender", str4);
        bundle.putString("subtype", str4);
        bundle.putString("appid", str3);
        aamj aamjVar = firebaseInstanceId.f;
        aahf aahfVar = aamjVar.a;
        aahfVar.d();
        bundle.putString("gmp_app_id", aahfVar.e.b);
        aaml aamlVar = aamjVar.b;
        bundle.putString("gmsv", Integer.toString(aamlVar.a()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", aamlVar.c());
        bundle.putString("app_ver_name", aamlVar.d());
        bundle.putString("firebase-app-name-hash", aamjVar.a());
        try {
            String strC = ((aanl) lvq.d(aamjVar.f.k())).c();
            if (TextUtils.isEmpty(strC)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strC);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.1");
        aalx aalxVar = (aalx) aamjVar.e.a();
        aaro aaroVar = (aaro) aamjVar.d.a();
        if (aalxVar != null && aaroVar != null && (iB = aalxVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(iB - 1));
            bundle.putString("Firebase-Client", aaroVar.a());
        }
        lvf lvfVarC = aamjVar.c.b(bundle).a(aamb.a, new luj() { // from class: aami
            @Override // defpackage.luj
            public final Object a(lvf lvfVar2) throws IOException {
                Bundle bundle2 = (Bundle) lvfVar2.f(IOException.class);
                if (bundle2 == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle2.getString("registration_id");
                if (string != null) {
                    return string;
                }
                String string2 = bundle2.getString("unregistered");
                if (string2 != null) {
                    return string2;
                }
                String string3 = bundle2.getString("error");
                if ("RST".equals(string3)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseInstanceId", "Unexpected response: ".concat(bundle2.toString()), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        }).c(firebaseInstanceId.c, new lve() { // from class: aamg
            @Override // defpackage.lve
            public final lvf a(Object obj) {
                String str6 = (String) obj;
                aamu aamuVar = FirebaseInstanceId.a;
                FirebaseInstanceId firebaseInstanceId2 = firebaseInstanceId;
                aamuVar.c(firebaseInstanceId2.d(), str4, str5, str6, firebaseInstanceId2.e.c());
                return lvq.c(new aamk(str6));
            }
        });
        lvfVarC.n(new aamd(), new lva() { // from class: aamh
            @Override // defpackage.lva
            public final void d(Object obj) {
                String str6 = ((aamk) obj).a;
                aamt aamtVar2 = aamtVar;
                if (aamtVar2 == null || !str6.equals(aamtVar2.b)) {
                    Iterator it = firebaseInstanceId.i.iterator();
                    while (it.hasNext()) {
                        ((aape) it.next()).a.g(str6);
                    }
                }
            }
        });
        lvf lvfVarB = lvfVarC.b(this.b, new luj() { // from class: aamq
            @Override // defpackage.luj
            public final Object a(lvf lvfVar2) {
                aamr aamrVar = this.a;
                Pair pair2 = pair;
                synchronized (aamrVar) {
                    aamrVar.a.remove(pair2);
                }
                return lvfVar2;
            }
        });
        map.put(pair, lvfVarB);
        return lvfVarB;
    }
}
