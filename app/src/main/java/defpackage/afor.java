package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afor extends afmx {
    public int b;
    private final Deque g;
    private Deque h;
    private boolean i;
    private static final afop c = new afok();
    private static final afop d = new afol();
    public static final afop a = new afom();
    private static final afop e = new afon();
    private static final afoq f = new afoo();

    public afor() {
        new ArrayDeque(2);
        this.g = new ArrayDeque();
    }

    private final int n(afoq afoqVar, int i, Object obj, int i2) {
        a(i);
        Deque deque = this.g;
        if (!deque.isEmpty()) {
            p();
        }
        while (i > 0 && !deque.isEmpty()) {
            afwn afwnVar = (afwn) deque.peek();
            int iMin = Math.min(i, afwnVar.g());
            i2 = afoqVar.a(afwnVar, iMin, obj, i2);
            i -= iMin;
            this.b -= iMin;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final void o() {
        if (!this.i) {
            ((afwn) this.g.remove()).close();
            return;
        }
        Deque deque = this.h;
        Deque deque2 = this.g;
        deque.add((afwn) deque2.remove());
        afwn afwnVar = (afwn) deque2.peek();
        if (afwnVar != null) {
            afwnVar.b();
        }
    }

    private final void p() {
        if (((afwn) this.g.peek()).g() == 0) {
            o();
        }
    }

    @Override // defpackage.afmx, defpackage.afwn
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            ((afwn) this.h.remove()).close();
        }
        this.i = true;
        afwn afwnVar = (afwn) this.g.peek();
        if (afwnVar != null) {
            afwnVar.b();
        }
    }

    @Override // defpackage.afmx, defpackage.afwn
    public final void c() {
        if (!this.i) {
            throw new InvalidMarkException();
        }
        Deque deque = this.g;
        afwn afwnVar = (afwn) deque.peek();
        if (afwnVar != null) {
            int iG = afwnVar.g();
            afwnVar.c();
            this.b += afwnVar.g() - iG;
        }
        while (true) {
            afwn afwnVar2 = (afwn) this.h.pollLast();
            if (afwnVar2 == null) {
                return;
            }
            afwnVar2.c();
            deque.addFirst(afwnVar2);
            this.b += afwnVar2.g();
        }
    }

    @Override // defpackage.afmx, defpackage.afwn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Deque deque = this.g;
            if (deque.isEmpty()) {
                break;
            } else {
                ((afwn) deque.remove()).close();
            }
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                ((afwn) this.h.remove()).close();
            }
        }
    }

    @Override // defpackage.afmx, defpackage.afwn
    public final boolean d() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            if (!((afwn) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    public final int e(afop afopVar, int i, Object obj, int i2) {
        try {
            return n(afopVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.afwn
    public final int f() {
        return e(c, 1, null, 0);
    }

    @Override // defpackage.afwn
    public final int g() {
        return this.b;
    }

    @Override // defpackage.afwn
    public final afwn h(int i) {
        afwn afwnVarH;
        int i2;
        afwn afwnVarH2;
        if (i <= 0) {
            return afwr.a;
        }
        a(i);
        this.b -= i;
        afwn afwnVar = null;
        afor aforVar = null;
        while (true) {
            Deque deque = this.g;
            afwn afwnVar2 = (afwn) deque.peek();
            int iG = afwnVar2.g();
            if (iG > i) {
                afwnVarH2 = afwnVar2.h(i);
                i2 = 0;
            } else {
                if (this.i) {
                    afwnVarH = afwnVar2.h(iG);
                    o();
                } else {
                    afwnVarH = (afwn) deque.poll();
                }
                afwn afwnVar3 = afwnVarH;
                i2 = i - iG;
                afwnVarH2 = afwnVar3;
            }
            if (afwnVar == null) {
                afwnVar = afwnVarH2;
            } else {
                if (aforVar == null) {
                    aforVar = new afor(i2 != 0 ? Math.min(deque.size() + 2, 16) : 2);
                    aforVar.i(afwnVar);
                    afwnVar = aforVar;
                }
                aforVar.i(afwnVarH2);
            }
            if (i2 <= 0) {
                return afwnVar;
            }
            i = i2;
        }
    }

    public final void i(afwn afwnVar) {
        boolean z = this.i && this.g.isEmpty();
        if (afwnVar instanceof afor) {
            afor aforVar = (afor) afwnVar;
            while (true) {
                Deque deque = aforVar.g;
                if (deque.isEmpty()) {
                    break;
                } else {
                    this.g.add((afwn) deque.remove());
                }
            }
            this.b += aforVar.b;
            aforVar.b = 0;
            aforVar.close();
        } else {
            this.g.add(afwnVar);
            this.b += afwnVar.g();
        }
        if (z) {
            ((afwn) this.g.peek()).b();
        }
    }

    @Override // defpackage.afwn
    public final void j(ByteBuffer byteBuffer) {
        e(e, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.afwn
    public final void k(OutputStream outputStream, int i) {
        n(f, i, outputStream, 0);
    }

    @Override // defpackage.afwn
    public final void l(byte[] bArr, int i, int i2) {
        e(a, i2, bArr, i);
    }

    @Override // defpackage.afwn
    public final void m(int i) {
        e(d, i, null, 0);
    }

    public afor(int i) {
        new ArrayDeque(2);
        this.g = new ArrayDeque(i);
    }
}
