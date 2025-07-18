package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmq extends abww implements abyr {
    public zmq() {
        super(zmr.a);
    }

    public final void a(zmp zmpVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        zmr zmrVar = (zmr) this.b;
        zmr zmrVar2 = zmr.a;
        zmpVar.getClass();
        abxs abxsVar = zmrVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            zmrVar.b = abxsVar.d(size + size);
        }
        zmrVar.b.add(zmpVar);
    }
}
