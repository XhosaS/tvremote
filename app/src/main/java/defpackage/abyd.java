package defpackage;

import java.util.List;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyd {
    public final List a(Object obj, long j) {
        Unsafe unsafe = acah.a.a;
        abxs abxsVar = (abxs) unsafe.getObject(obj, j);
        if (abxsVar.c()) {
            return abxsVar;
        }
        int size = abxsVar.size();
        abxs abxsVarD = abxsVar.d(size == 0 ? 10 : size + size);
        unsafe.putObject(obj, j, abxsVarD);
        return abxsVarD;
    }
}
