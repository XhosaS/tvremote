package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phz extends abww implements abyr {
    public phz() {
        super(pia.a);
    }

    public final void a(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        pia piaVar = (pia) this.b;
        pia piaVar2 = pia.a;
        abxs abxsVar = piaVar.o;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            piaVar.o = abxsVar.d(size + size);
        }
        abus.m(iterable, piaVar.o);
    }
}
