package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wry {
    public final wrs a;
    public final agow b;
    private final agow c;

    public wry(wrs wrsVar, agow agowVar, agow agowVar2) {
        this.a = wrsVar;
        this.c = agowVar;
        this.b = agowVar2;
    }

    public final zyd a(final zyd zydVar, zvi zviVar) {
        Set set = (Set) this.c.a();
        yzo yzoVarI = yzq.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            yzoVarI.c(new wrw(zviVar, (wsa) it.next()));
        }
        return this.a.a(new zvh() { // from class: wru
            @Override // defpackage.zvh
            public final zyd a() {
                return zydVar;
            }
        }, yzoVarI.f());
    }
}
