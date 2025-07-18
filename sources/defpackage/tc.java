package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tc {
    public final ArrayList a = new ArrayList();
    public final tg b;
    public int c;
    public boolean d;

    public tc(tg tgVar, List list) {
        d(list);
        d(list);
        if (!tgVar.b.contains(this)) {
            tgVar.b.add(this);
            nt ntVar = tgVar.c;
            nt ntVar2 = tgVar.d;
            b(this);
            int i = tgVar.e;
            b(this);
        }
        this.b = tgVar;
    }

    public static /* synthetic */ void b(tc tcVar) {
        ArrayList arrayList = tcVar.a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        throw null;
    }

    private static final void d(List list) {
        if (list.size() <= 0) {
            return;
        }
        throw null;
    }

    public final int a() {
        return this.a.size();
    }

    public final void c() {
    }
}
