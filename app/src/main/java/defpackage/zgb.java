package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgb extends zge {
    private final Map a;
    private final Map b;
    private final zgd c;
    private final zgc d;

    public zgb(zga zgaVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(zgaVar.c);
        map2.putAll(zgaVar.d);
        this.c = zgaVar.e;
        this.d = zgaVar.f;
    }

    @Override // defpackage.zge
    protected final void a(zer zerVar, Object obj, Object obj2) {
        zgd zgdVar = (zgd) this.a.get(zerVar);
        if (zgdVar != null) {
            zgdVar.a(zerVar, obj, obj2);
        } else {
            this.c.a(zerVar, obj, obj2);
        }
    }

    @Override // defpackage.zge
    protected final void b(zer zerVar, Iterator it, Object obj) {
        zgc zgcVar = (zgc) this.b.get(zerVar);
        if (zgcVar != null) {
            zgcVar.a(zerVar, it, obj);
            return;
        }
        zgc zgcVar2 = this.d;
        if (zgcVar2 != null && !this.a.containsKey(zerVar)) {
            zgcVar2.a(zerVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(zerVar, it.next(), obj);
            }
        }
    }
}
