package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class roi {
    public static void a(Map map) {
        for (Map.Entry entry : ((yyr) map).entrySet()) {
            wvx wvxVarF = wzg.f((String) entry.getKey(), wwb.a, true);
            try {
                ((rog) ((agow) entry.getValue()).a()).a();
                wvxVarF.close();
            } catch (Throwable th) {
                try {
                    wvxVarF.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
