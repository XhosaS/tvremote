package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accf extends abww implements abyr {
    public accf() {
        super(accg.a);
    }

    public final void a(acce acceVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        accg accgVar = (accg) this.b;
        accg accgVar2 = accg.a;
        acceVar.getClass();
        abxs abxsVar = accgVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            accgVar.c = abxsVar.d(size + size);
        }
        accgVar.c.add(acceVar);
    }
}
