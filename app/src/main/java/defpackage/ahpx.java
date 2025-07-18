package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpx extends abww implements abyr {
    public ahpx() {
        super(ahpy.a);
    }

    public final void a(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        ahpy ahpyVar = (ahpy) this.b;
        ahpy ahpyVar2 = ahpy.a;
        abxs abxsVar = ahpyVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            ahpyVar.c = abxsVar.d(size + size);
        }
        abus.m(iterable, ahpyVar.c);
    }

    public final void b(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        ahpy ahpyVar = (ahpy) this.b;
        ahpy ahpyVar2 = ahpy.a;
        abxs abxsVar = ahpyVar.d;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            ahpyVar.d = abxsVar.d(size + size);
        }
        abus.m(iterable, ahpyVar.d);
    }
}
