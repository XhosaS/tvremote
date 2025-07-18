package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wge {
    public final zwv a;
    private final aehf b;
    private final rfr c;
    private final Map d;

    public wge(Context context, aehf aehfVar, rfr rfrVar, vhb vhbVar, Map map) {
        context.getClass();
        aehfVar.getClass();
        rfrVar.getClass();
        vhbVar.getClass();
        this.b = aehfVar;
        this.c = rfrVar;
        this.d = map;
        this.a = new zwv();
    }

    public final zyd a(rgs rgsVar, abvo abvoVar, String str, String str2) {
        String str3;
        if (abvoVar != null) {
            rfr rfrVar = this.c;
            Set set = (Set) this.d.get(rff.b(str2));
            if (set == null) {
                set = agrf.a;
            }
            str3 = str2;
            ((rjw) rfrVar.c).a(abvoVar, set, str, str3, true, true);
        } else {
            str3 = str2;
        }
        return ((wcu) this.b.a()).a(str3, rgsVar);
    }
}
