package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrs {
    public static final sss c = new sss(null);
    public final AtomicReference a = new AtomicReference();
    final AtomicReference b = new AtomicReference();

    rrs() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rrs a(ImmutableList immutableList) {
        rrs rrsVar;
        UnmodifiableIterator it = immutableList.iterator();
        do {
            rrsVar = null;
            if (!it.hasNext()) {
                break;
            }
            tqo tqoVar = (tqo) it.next();
            Object objD = tqoVar.d(c);
            tqm tqmVarA = objD == null ? tqoVar.c.containsKey(tqo.e) ? tqm.a(2) : tqm.a(3) : new tqm(1, objD);
            if (tqmVarA.b == 1) {
                rrsVar = (rrs) tqmVarA.a;
            }
        } while (rrsVar == null);
        return rrsVar;
    }
}
