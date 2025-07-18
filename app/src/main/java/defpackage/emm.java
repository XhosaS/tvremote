package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class emm {
    public final emn a;
    public final els b;
    public final Object c;
    private final Set d = new HashSet();

    public emm(emn emnVar, els elsVar, Object obj) {
        this.a = emnVar;
        this.b = elsVar;
        this.c = obj;
    }

    public final elr a() {
        elv elvVarK = this.b.a.k();
        if (elvVarK != null) {
            return (elr) elvVarK.a;
        }
        return null;
    }

    public final void b(long j, boolean z) {
        if (!this.d.add(Long.valueOf(j))) {
            throw new IllegalStateException("Cannot acquire the same reference more than once.");
        }
        if (z) {
            this.b.a.p(j);
        }
    }

    public final void c() {
        Set set = this.d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((Long) it.next()).longValue();
        }
        set.clear();
    }

    public final boolean d(long j) {
        return this.d.contains(Long.valueOf(j));
    }

    public final void e(long j) {
        if (!this.d.remove(Long.valueOf(j))) {
            throw new IllegalStateException("Trying to release a reference that wasn't acquired.");
        }
    }
}
