package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsn extends abww implements abyr {
    public tsn() {
        super(tso.a);
    }

    public final void a(tun tunVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        tso tsoVar = (tso) this.b;
        tso tsoVar2 = tso.a;
        tunVar.getClass();
        abxs abxsVar = tsoVar.g;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            tsoVar.g = abxsVar.d(size + size);
        }
        tsoVar.g.add(tunVar);
    }
}
