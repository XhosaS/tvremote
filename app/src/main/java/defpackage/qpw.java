package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpw extends abww implements abyr {
    public qpw() {
        super(qqh.a);
    }

    public final void a(qpx qpxVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        qqh qqhVar = (qqh) this.b;
        qpy qpyVar = (qpy) qpxVar.v();
        qqh qqhVar2 = qqh.a;
        qpyVar.getClass();
        abxs abxsVar = qqhVar.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            qqhVar.e = abxsVar.d(size + size);
        }
        qqhVar.e.add(qpyVar);
    }
}
