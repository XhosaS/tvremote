package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwb {
    public static dxc a(dru druVar, ohv ohvVar, dxc dxcVar) {
        return b(ohvVar, druVar.j(), dxcVar, druVar.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dxc b(ohv ohvVar, String str, dxc dxcVar, dzh dzhVar) {
        Map mapB;
        if (str == null) {
            dxcVar.d();
            return null;
        }
        dxcVar.b("log_tag", str);
        if (dzhVar != null && (mapB = ohvVar.b(dzhVar)) != null) {
            for (Map.Entry entry : mapB.entrySet()) {
                dxcVar.b((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return dxcVar;
    }
}
