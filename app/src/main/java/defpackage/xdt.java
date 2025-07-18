package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdt {
    public final xdv a;

    public xdt(xdv xdvVar) {
        this.a = xdvVar;
    }

    public final /* synthetic */ acaw a() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((xdz) this.a.b).c);
        listUnmodifiableList.getClass();
        return new acaw(listUnmodifiableList);
    }

    public final /* synthetic */ void b(acaw acawVar, Iterable iterable) {
        acawVar.getClass();
        iterable.getClass();
        xdv xdvVar = this.a;
        if ((xdvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xdvVar.y();
        }
        xdz xdzVar = (xdz) xdvVar.b;
        xdz xdzVar2 = xdz.a;
        abxs abxsVar = xdzVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            xdzVar.c = abxsVar.d(size + size);
        }
        abus.m(iterable, xdzVar.c);
    }
}
