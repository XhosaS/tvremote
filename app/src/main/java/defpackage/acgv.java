package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgv extends abww implements abyr {
    public acgv() {
        super(acgw.a);
    }

    public final void a(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        acgw acgwVar = (acgw) this.b;
        acgw acgwVar2 = acgw.a;
        abxs abxsVar = acgwVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            acgwVar.b = abxsVar.d(size + size);
        }
        abus.m(iterable, acgwVar.b);
    }

    public final void b(acgt acgtVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        acgw acgwVar = (acgw) this.b;
        acgw acgwVar2 = acgw.a;
        acgtVar.getClass();
        abxs abxsVar = acgwVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            acgwVar.b = abxsVar.d(size + size);
        }
        acgwVar.b.add(acgtVar);
    }
}
