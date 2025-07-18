package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acda extends abww implements abyr {
    public acda() {
        super(acdb.a);
    }

    public final void a(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        acdb acdbVar = (acdb) this.b;
        acdb acdbVar2 = acdb.a;
        abxs abxsVar = acdbVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            acdbVar.b = abxsVar.d(size + size);
        }
        abus.m(iterable, acdbVar.b);
    }
}
