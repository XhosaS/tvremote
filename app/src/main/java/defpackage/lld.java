package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lld extends abww implements abyr {
    public lld() {
        super(lle.a);
    }

    public final lkw a(int i) {
        return (lkw) ((lle) this.b).e.get(i);
    }

    public final void b(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        lle lleVar = (lle) this.b;
        lle lleVar2 = lle.a;
        abxs abxsVar = lleVar.D;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            lleVar.D = abxsVar.d(size + size);
        }
        abus.m(iterable, lleVar.D);
    }

    public final void c(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        lle lleVar = (lle) this.b;
        lle lleVar2 = lle.a;
        abxs abxsVar = lleVar.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            lleVar.e = abxsVar.d(size + size);
        }
        abus.m(iterable, lleVar.e);
    }

    public final void d(lkv lkvVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        lle lleVar = (lle) this.b;
        lkw lkwVar = (lkw) lkvVar.v();
        lle lleVar2 = lle.a;
        lkwVar.getClass();
        abxs abxsVar = lleVar.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            lleVar.e = abxsVar.d(size + size);
        }
        lleVar.e.add(lkwVar);
    }

    public final void e(llu lluVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        lle lleVar = (lle) this.b;
        lle lleVar2 = lle.a;
        lluVar.getClass();
        abxs abxsVar = lleVar.f;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            lleVar.f = abxsVar.d(size + size);
        }
        lleVar.f.add(lluVar);
    }

    public final void f(int i) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        lle lleVar = (lle) this.b;
        lle lleVar2 = lle.a;
        abxs abxsVar = lleVar.f;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            lleVar.f = abxsVar.d(size + size);
        }
        lleVar.f.remove(i);
    }

    public final void g(int i, lkv lkvVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        lle lleVar = (lle) this.b;
        lkw lkwVar = (lkw) lkvVar.v();
        lle lleVar2 = lle.a;
        lkwVar.getClass();
        abxs abxsVar = lleVar.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            lleVar.e = abxsVar.d(size + size);
        }
        lleVar.e.set(i, lkwVar);
    }

    public /* synthetic */ lld(byte[] bArr) {
        super(lle.a);
    }
}
