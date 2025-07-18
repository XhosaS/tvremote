package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yft extends abww implements abyr {
    public yft() {
        super(ygb.a);
    }

    public final void a(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        ygb ygbVar = (ygb) this.b;
        ygb ygbVar2 = ygb.a;
        abxs abxsVar = ygbVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            ygbVar.c = abxsVar.d(size + size);
        }
        abus.m(iterable, ygbVar.c);
    }
}
