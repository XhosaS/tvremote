package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkv extends abww implements abyr {
    public lkv() {
        super(lkw.a);
    }

    public final lla a(int i) {
        return (lla) ((lkw) this.b).c.get(i);
    }

    public final void b(lkz lkzVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        lkw lkwVar = (lkw) this.b;
        lla llaVar = (lla) lkzVar.v();
        lkw lkwVar2 = lkw.a;
        llaVar.getClass();
        abxs abxsVar = lkwVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            lkwVar.c = abxsVar.d(size + size);
        }
        lkwVar.c.add(llaVar);
    }

    public final void c(lla llaVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        lkw lkwVar = (lkw) this.b;
        lkw lkwVar2 = lkw.a;
        llaVar.getClass();
        abxs abxsVar = lkwVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            lkwVar.c = abxsVar.d(size + size);
        }
        lkwVar.c.add(llaVar);
    }

    public final void d(int i) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        lkw lkwVar = (lkw) this.b;
        lkw lkwVar2 = lkw.a;
        abxs abxsVar = lkwVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            lkwVar.c = abxsVar.d(size + size);
        }
        lkwVar.c.remove(i);
    }

    public final void e(int i, lkz lkzVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        lkw lkwVar = (lkw) this.b;
        lla llaVar = (lla) lkzVar.v();
        lkw lkwVar2 = lkw.a;
        llaVar.getClass();
        abxs abxsVar = lkwVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            lkwVar.c = abxsVar.d(size + size);
        }
        lkwVar.c.set(i, llaVar);
    }

    public final void f(int i, lla llaVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        lkw lkwVar = (lkw) this.b;
        lkw lkwVar2 = lkw.a;
        llaVar.getClass();
        abxs abxsVar = lkwVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            lkwVar.c = abxsVar.d(size + size);
        }
        lkwVar.c.set(i, llaVar);
    }

    public /* synthetic */ lkv(byte[] bArr) {
        super(lkw.a);
    }
}
