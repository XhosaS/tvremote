package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edu {
    public static void a(efi efiVar, Map map, dtd dtdVar) {
        boolean z = ebc.a;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                efiVar.a((String) entry.getKey(), entry.getValue());
            }
        }
        efiVar.d = (ohv) dtdVar.b;
    }
}
