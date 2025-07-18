package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achv extends abww implements abyr {
    public achv() {
        super(achw.a);
    }

    public final void a(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        achw achwVar = (achw) this.b;
        achw achwVar2 = achw.a;
        abxs abxsVar = achwVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            achwVar.c = abxsVar.d(size + size);
        }
        abus.m(iterable, achwVar.c);
    }
}
