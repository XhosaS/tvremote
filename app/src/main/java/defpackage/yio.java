package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yio extends abww implements abyr {
    public yio() {
        super(yip.a);
    }

    public final void a(yiu yiuVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        yip yipVar = (yip) this.b;
        yip yipVar2 = yip.a;
        yiuVar.getClass();
        abxs abxsVar = yipVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            yipVar.b = abxsVar.d(size + size);
        }
        yipVar.b.add(yiuVar);
    }
}
