package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adts extends abwy implements abxa {
    public adts() {
        super(adtt.a);
    }

    public final void a(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        adtt adttVar = (adtt) this.b;
        adtt adttVar2 = adtt.a;
        abxs abxsVar = adttVar.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            adttVar.e = abxsVar.d(size + size);
        }
        abus.m(iterable, adttVar.e);
    }
}
