package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qen {
    public static uje a(Context context, zyg zygVar, final qbv qbvVar, pvx pvxVar, yqt yqtVar) {
        ulj uljVarD = ulm.d(context, zygVar);
        uljVarD.c = qer.d("gms_icing_mdd_groups", yqtVar);
        uljVarD.b();
        uljVarD.e = new qek(pvxVar);
        uljVarD.e(new ulk() { // from class: qel
            @Override // defpackage.ulk
            public final MessageLite b(ull ullVar, MessageLite messageLite) {
                abyy abwxVar;
                piu piuVar = piu.a;
                pir pirVar = new pir();
                zdl it = ullVar.a().entrySet().iterator();
                qbv qbvVar2 = qbvVar;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    try {
                        String str = (String) entry.getValue();
                        str.getClass();
                        try {
                            pia piaVar = pia.a;
                            abyy abyyVar = pia.b;
                            if (abyyVar == null) {
                                synchronized (pia.class) {
                                    abwxVar = pia.b;
                                    if (abwxVar == null) {
                                        abwxVar = new abwx(pia.a);
                                        pia.b = abwxVar;
                                    }
                                }
                                abyyVar = abwxVar;
                            }
                            pirVar.a((String) entry.getKey(), (pia) qer.b(str, abyyVar));
                        } catch (abxv e) {
                            qce.c("SharedPreferences file groups metadata had unexpected format: %s", e);
                            qbvVar2.k(1084);
                        }
                    } catch (ClassCastException | NullPointerException e2) {
                        qce.c("SharedPreferences file groups metadata key wasn't a string: %s", e2);
                        qbvVar2.k(1083);
                    }
                }
                return (piu) pirVar.v();
            }
        });
        return uljVarD.a();
    }

    public static uje b(Context context, zyg zygVar, final qbv qbvVar, pvx pvxVar, yqt yqtVar) {
        ulj uljVarD = ulm.d(context, zygVar);
        uljVarD.c = qer.d("gms_icing_mdd_shared_files", yqtVar);
        uljVarD.b();
        uljVarD.e = new qek(pvxVar);
        uljVarD.e(new ulk() { // from class: qem
            @Override // defpackage.ulk
            public final MessageLite b(ull ullVar, MessageLite messageLite) {
                abyy abwxVar;
                pjm pjmVar = pjm.a;
                pjk pjkVar = new pjk();
                zdl it = ullVar.a().entrySet().iterator();
                qbv qbvVar2 = qbvVar;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    try {
                        String str = (String) entry.getValue();
                        str.getClass();
                        try {
                            pjj pjjVar = pjj.a;
                            abyy abyyVar = pjj.b;
                            if (abyyVar == null) {
                                synchronized (pjj.class) {
                                    abwxVar = pjj.b;
                                    if (abwxVar == null) {
                                        abwxVar = new abwx(pjj.a);
                                        pjj.b = abwxVar;
                                    }
                                }
                                abyyVar = abwxVar;
                            }
                            pjkVar.a((String) entry.getKey(), (pjj) qer.b(str, abyyVar));
                        } catch (abxv e) {
                            qce.c("SharedPreferences shared files metadata had unexpected format: %s", e);
                            qbvVar2.k(1084);
                        }
                    } catch (ClassCastException | NullPointerException e2) {
                        qce.c("SharedPreferences shared files metadata key wasn't a string: %s", e2);
                        qbvVar2.k(1083);
                    }
                }
                return (pjm) pjkVar.v();
            }
        });
        return uljVarD.a();
    }
}
