package defpackage;

import defpackage.dpe;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doz<T extends dpe> {
    public static final doz a = new doz(null);
    public final dqq b = new dqm();
    private boolean c;

    private doz() {
    }

    public static int g(int i) {
        dot.T(i);
        drg drgVar = drg.DOUBLE;
        drh drhVar = drh.INT;
        throw null;
    }

    public static void h(dot dotVar, int i, Object obj) {
        if (drg.GROUP != null) {
            throw null;
        }
        dotVar.x(i, 3);
        ((dqa) obj).r(dotVar);
        dotVar.x(i, 4);
    }

    private static boolean i(Map.Entry entry) {
        throw null;
    }

    public final int a(Map.Entry entry) {
        entry.getValue();
        throw null;
    }

    public final Iterator b() {
        return e() ? Collections.emptyIterator() : this.b.entrySet().iterator();
    }

    public final void c() {
        if (this.c) {
            return;
        }
        dqq dqqVar = this.b;
        int iA = dqqVar.a();
        for (int i = 0; i < iA; i++) {
            Map.Entry entryE = dqqVar.e(i);
            if (entryE.getValue() instanceof dpf) {
                ((dpf) entryE.getValue()).n();
            }
        }
        if (!dqqVar.c) {
            if (dqqVar.a() > 0) {
                throw null;
            }
            Iterator it = dqqVar.b().iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
        if (!dqqVar.c) {
            dqqVar.b = dqqVar.b.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(dqqVar.b);
            dqqVar.d = dqqVar.d.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(dqqVar.d);
            dqqVar.c = true;
        }
        this.c = true;
    }

    public final /* synthetic */ Object clone() {
        doz dozVar = new doz();
        dqq dqqVar = this.b;
        if (dqqVar.a() > 0) {
            Map.Entry entryE = dqqVar.e(0);
            entryE.getValue();
            throw null;
        }
        Iterator it = dqqVar.b().iterator();
        if (!it.hasNext()) {
            return dozVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue();
        throw null;
    }

    public final void d(Map.Entry entry) {
        entry.getValue();
        throw null;
    }

    final boolean e() {
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof doz) {
            return this.b.equals(((doz) obj).b);
        }
        return false;
    }

    public final boolean f() {
        dqq dqqVar = this.b;
        int iA = dqqVar.a();
        for (int i = 0; i < iA; i++) {
            if (!i(dqqVar.e(i))) {
                return false;
            }
        }
        Iterator it = dqqVar.b().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    private doz(byte[] bArr) {
        c();
        c();
    }
}
