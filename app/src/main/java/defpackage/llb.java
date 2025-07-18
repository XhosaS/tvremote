package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llb extends abww implements abyr {
    public llb() {
        super(llc.a);
    }

    public final void a(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        llc llcVar = (llc) this.b;
        llc llcVar2 = llc.a;
        abxs abxsVar = llcVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            llcVar.c = abxsVar.d(size + size);
        }
        abus.m(iterable, llcVar.c);
    }

    public final void b(lld lldVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        llc llcVar = (llc) this.b;
        lle lleVar = (lle) lldVar.v();
        llc llcVar2 = llc.a;
        lleVar.getClass();
        abxs abxsVar = llcVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            llcVar.c = abxsVar.d(size + size);
        }
        llcVar.c.add(lleVar);
    }

    public final void c(int i, lld lldVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        llc llcVar = (llc) this.b;
        lle lleVar = (lle) lldVar.v();
        llc llcVar2 = llc.a;
        lleVar.getClass();
        abxs abxsVar = llcVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            llcVar.c = abxsVar.d(size + size);
        }
        llcVar.c.set(i, lleVar);
    }

    public /* synthetic */ llb(byte[] bArr) {
        super(llc.a);
    }
}
