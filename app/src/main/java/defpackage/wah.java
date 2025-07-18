package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wah {
    public static final wah a;
    public final yyr b;
    private final yyr c;

    static {
        zcp zcpVar = zcp.b;
        a = new wah(zcpVar, zcpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wah(Set set, Set set2) {
        yyn yynVar = new yyn(4);
        zdm zdmVarListIterator = ((yxy) set2).f().listIterator(0);
        while (zdmVarListIterator.hasNext()) {
            ((vzt) zdmVarListIterator.next()).a(yynVar);
        }
        this.c = yynVar.a(true);
        yyn yynVar2 = new yyn(4);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((vzt) it.next()).a(yynVar2);
        }
        this.b = yynVar2.a(true);
    }

    public final wag a(String str) {
        wag wagVar = (wag) this.c.get(str);
        return wagVar != null ? wagVar : (wag) this.b.get(str);
    }
}
