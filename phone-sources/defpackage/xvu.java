package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvu extends xuk {
    private static final xvs b = new xvq(1);
    private static final xvs c = new xvq(0);
    private static final xvs d = new xvq(2);
    private static final xvs e = new xvq(3);
    private static final xvt f = new xvr();
    public int a;
    private final Deque g;
    private Deque h;
    private boolean i;

    public xvu() {
        new ArrayDeque(2);
        this.g = new ArrayDeque();
    }

    private final int m(xvt xvtVar, int i, Object obj, int i2) {
        a(i);
        Deque deque = this.g;
        if (!deque.isEmpty()) {
            p();
        }
        while (i > 0 && !deque.isEmpty()) {
            yaf yafVar = (yaf) deque.peek();
            int iMin = Math.min(i, yafVar.f());
            i2 = xvtVar.a(yafVar, iMin, obj, i2);
            i -= iMin;
            this.a -= iMin;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int n(xvs xvsVar, int i, Object obj, int i2) {
        try {
            return m(xvsVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void o() {
        if (!this.i) {
            ((yaf) this.g.remove()).close();
            return;
        }
        Deque deque = this.h;
        Deque deque2 = this.g;
        deque.add((yaf) deque2.remove());
        yaf yafVar = (yaf) deque2.peek();
        if (yafVar != null) {
            yafVar.b();
        }
    }

    private final void p() {
        if (((yaf) this.g.peek()).f() == 0) {
            o();
        }
    }

    @Override // defpackage.xuk, defpackage.yaf
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            ((yaf) this.h.remove()).close();
        }
        this.i = true;
        yaf yafVar = (yaf) this.g.peek();
        if (yafVar != null) {
            yafVar.b();
        }
    }

    @Override // defpackage.xuk, defpackage.yaf
    public final void c() {
        if (!this.i) {
            throw new InvalidMarkException();
        }
        Deque deque = this.g;
        yaf yafVar = (yaf) deque.peek();
        if (yafVar != null) {
            int iF = yafVar.f();
            yafVar.c();
            this.a += yafVar.f() - iF;
        }
        while (true) {
            yaf yafVar2 = (yaf) this.h.pollLast();
            if (yafVar2 == null) {
                return;
            }
            yafVar2.c();
            deque.addFirst(yafVar2);
            this.a += yafVar2.f();
        }
    }

    @Override // defpackage.xuk, defpackage.yaf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Deque deque = this.g;
            if (deque.isEmpty()) {
                break;
            } else {
                ((yaf) deque.remove()).close();
            }
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                ((yaf) this.h.remove()).close();
            }
        }
    }

    @Override // defpackage.xuk, defpackage.yaf
    public final boolean d() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            if (!((yaf) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.yaf
    public final int e() {
        return n(b, 1, null, 0);
    }

    @Override // defpackage.yaf
    public final int f() {
        return this.a;
    }

    @Override // defpackage.yaf
    public final yaf g(int i) {
        yaf yafVarG;
        int i2;
        yaf yafVarG2;
        if (i <= 0) {
            return yaj.a;
        }
        a(i);
        this.a -= i;
        yaf yafVar = null;
        xvu xvuVar = null;
        while (true) {
            Deque deque = this.g;
            yaf yafVar2 = (yaf) deque.peek();
            int iF = yafVar2.f();
            if (iF > i) {
                yafVarG2 = yafVar2.g(i);
                i2 = 0;
            } else {
                if (this.i) {
                    yafVarG = yafVar2.g(iF);
                    o();
                } else {
                    yafVarG = (yaf) deque.poll();
                }
                yaf yafVar3 = yafVarG;
                i2 = i - iF;
                yafVarG2 = yafVar3;
            }
            if (yafVar == null) {
                yafVar = yafVarG2;
            } else {
                if (xvuVar == null) {
                    xvuVar = new xvu(i2 != 0 ? Math.min(deque.size() + 2, 16) : 2);
                    xvuVar.h(yafVar);
                    yafVar = xvuVar;
                }
                xvuVar.h(yafVarG2);
            }
            if (i2 <= 0) {
                return yafVar;
            }
            i = i2;
        }
    }

    public final void h(yaf yafVar) {
        boolean z = this.i && this.g.isEmpty();
        if (yafVar instanceof xvu) {
            xvu xvuVar = (xvu) yafVar;
            while (true) {
                Deque deque = xvuVar.g;
                if (deque.isEmpty()) {
                    break;
                } else {
                    this.g.add((yaf) deque.remove());
                }
            }
            this.a += xvuVar.a;
            xvuVar.a = 0;
            xvuVar.close();
        } else {
            this.g.add(yafVar);
            this.a += yafVar.f();
        }
        if (z) {
            ((yaf) this.g.peek()).b();
        }
    }

    @Override // defpackage.yaf
    public final void i(ByteBuffer byteBuffer) {
        n(e, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.yaf
    public final void j(OutputStream outputStream, int i) {
        m(f, i, outputStream, 0);
    }

    @Override // defpackage.yaf
    public final void k(byte[] bArr, int i, int i2) {
        n(d, i2, bArr, i);
    }

    @Override // defpackage.yaf
    public final void l(int i) {
        n(c, i, null, 0);
    }

    public xvu(int i) {
        new ArrayDeque(2);
        this.g = new ArrayDeque(i);
    }
}
