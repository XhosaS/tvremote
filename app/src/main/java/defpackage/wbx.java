package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wbx implements wap {
    private final wcu a;
    private final rfr b;
    private final Map c;
    private final String d;

    public wbx(wcu wcuVar, rfr rfrVar, Map map, String str) {
        wcuVar.getClass();
        rfrVar.getClass();
        this.a = wcuVar;
        this.b = rfrVar;
        this.c = map;
        this.d = str;
    }

    private final zyd c(rgs rgsVar) {
        return this.a.a(this.d, rgsVar);
    }

    private final void d(abvo abvoVar) {
        if (abvoVar != null) {
            rfr rfrVar = this.b;
            Map map = this.c;
            String str = this.d;
            Set set = (Set) map.get(rff.b(str));
            if (set == null) {
                set = agrf.a;
            }
            ((rjw) rfrVar.c).a(abvoVar, set, "", str, false, true);
        }
    }

    @Override // defpackage.wap
    public final zyd a(String str, abvo abvoVar, rgs rgsVar) {
        if (!agvy.c(str, "")) {
            throw new IllegalStateException("DEVICE tier packages may only commit with LOGGED_OUT_USER");
        }
        d(abvoVar);
        return c(rgsVar);
    }

    @Override // defpackage.wap
    public final zyd b(abvo abvoVar, rgs rgsVar) {
        d(abvoVar);
        return c(rgsVar);
    }
}
