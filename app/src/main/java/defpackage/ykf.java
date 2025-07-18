package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykf {
    public final ykb a;

    public ykf(ykb ykbVar) {
        this.a = ykbVar;
    }

    public final /* synthetic */ ykc a() {
        abxd abxdVarV = this.a.v();
        abxdVarV.getClass();
        return (ykc) abxdVarV;
    }

    public final /* synthetic */ acaw b() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((ykc) this.a.b).c);
        listUnmodifiableList.getClass();
        return new acaw(listUnmodifiableList);
    }

    public final /* synthetic */ void c(acaw acawVar, yju yjuVar) {
        acawVar.getClass();
        ykb ykbVar = this.a;
        if ((ykbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ykbVar.y();
        }
        ykc ykcVar = (ykc) ykbVar.b;
        ykc ykcVar2 = ykc.a;
        abxs abxsVar = ykcVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            ykcVar.c = abxsVar.d(size + size);
        }
        ykcVar.c.add(yjuVar);
    }
}
