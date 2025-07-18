package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vie {
    public final Executor a;
    private final agow b;

    public vie(agow agowVar, Executor executor) {
        this.a = executor;
        this.b = agowVar;
    }

    public final yyr a() {
        Set<vhs> set = (Set) this.b.a();
        yyn yynVar = new yyn(4);
        for (vhs vhsVar : set) {
            yqw.B(true ^ vhsVar.b().isEmpty(), "AccountProvider's account type cannot be an empty string.");
            yynVar.c(vhsVar.b(), vhsVar.a());
        }
        return yynVar.a(true);
    }
}
