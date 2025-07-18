package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bts extends bko implements bte, clx, cad {
    public Object a;
    public Object b;
    public PointerInputEventHandler c;
    public bsr d = btm.a;
    public final bfz e;
    public final Object f;
    public long g;
    private yqe h;
    private final bfz i;
    private bsr j;

    public bts(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.c = pointerInputEventHandler;
        bfz bfzVar = new bfz(new btq[16], 0);
        this.e = bfzVar;
        this.f = bfzVar;
        this.i = new bfz(new btq[16], 0);
        this.g = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:6:0x000d, B:13:0x001a, B:14:0x001f, B:15:0x0020, B:18:0x002d, B:19:0x0037, B:21:0x0040), top: B:31:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void r(defpackage.bsr r5, defpackage.bss r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f
            monitor-enter(r0)
            bfz r1 = r4.i     // Catch: java.lang.Throwable -> L57
            bfz r2 = r4.e     // Catch: java.lang.Throwable -> L57
            int r3 = r1.b     // Catch: java.lang.Throwable -> L57
            r1.p(r3, r2)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)
            int r0 = r6.ordinal()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L37
            r1 = 1
            if (r0 == r1) goto L20
            r1 = 2
            if (r0 != r1) goto L1a
            goto L37
        L1a:
            yfu r5 = new yfu     // Catch: java.lang.Throwable -> L50
            r5.<init>()     // Catch: java.lang.Throwable -> L50
            throw r5     // Catch: java.lang.Throwable -> L50
        L20:
            bfz r0 = r4.i     // Catch: java.lang.Throwable -> L50
            int r1 = r0.b     // Catch: java.lang.Throwable -> L50
            int r1 = r1 + (-1)
            java.lang.Object[] r0 = r0.a     // Catch: java.lang.Throwable -> L50
            int r2 = r0.length     // Catch: java.lang.Throwable -> L50
            if (r1 >= r2) goto L4a
        L2b:
            if (r1 < 0) goto L4a
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L50
            btq r2 = (defpackage.btq) r2     // Catch: java.lang.Throwable -> L50
            r2.t(r5, r6)     // Catch: java.lang.Throwable -> L50
            int r1 = r1 + (-1)
            goto L2b
        L37:
            bfz r0 = r4.i     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r1 = r0.a     // Catch: java.lang.Throwable -> L50
            int r0 = r0.b     // Catch: java.lang.Throwable -> L50
            r2 = 0
        L3e:
            if (r2 >= r0) goto L4a
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L50
            btq r3 = (defpackage.btq) r3     // Catch: java.lang.Throwable -> L50
            r3.t(r5, r6)     // Catch: java.lang.Throwable -> L50
            int r2 = r2 + 1
            goto L3e
        L4a:
            bfz r5 = r4.i
            r5.h()
            return
        L50:
            r5 = move-exception
            bfz r6 = r4.i
            r6.h()
            throw r5
        L57:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bts.r(bsr, bss):void");
    }

    @Override // defpackage.clx
    public final float a() {
        return fh.I(this).p.a();
    }

    @Override // defpackage.cmd
    public final float b() {
        return fh.I(this).p.b();
    }

    @Override // defpackage.cad
    public final void bV() {
        bsr bsrVar = this.j;
        if (bsrVar == null) {
            return;
        }
        List list = bsrVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((bsz) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bsz bszVar = (bsz) list.get(i2);
                    long j = bszVar.a;
                    long j2 = bszVar.c;
                    long j3 = bszVar.b;
                    float f = bszVar.e;
                    boolean z = bszVar.d;
                    arrayList.add(new bsz(j, j3, j2, false, f, j3, j2, z, z, bszVar.i, 0L));
                }
                bsr bsrVar2 = new bsr(arrayList);
                this.d = bsrVar2;
                r(bsrVar2, bss.a);
                r(bsrVar2, bss.b);
                r(bsrVar2, bss.c);
                this.j = null;
                return;
            }
        }
    }

    @Override // defpackage.cad
    public final /* synthetic */ long cf() {
        return cai.a;
    }

    @Override // defpackage.bko
    public final void cg() {
        q();
    }

    @Override // defpackage.bko
    public final void ch() {
        q();
    }

    @Override // defpackage.cmd
    public final /* synthetic */ float cn(long j) {
        return cme.e(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float co(float f) {
        return cme.g(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cp(int i) {
        return cme.h(this, i);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cq(long j) {
        return cme.i(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cr(float f) {
        return cme.j(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ int cu(float f) {
        return cme.k(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cv(long j) {
        return cme.l(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cw(long j) {
        return cme.m(this, j);
    }

    @Override // defpackage.cmd
    public final /* synthetic */ long cx(float f) {
        return cme.f(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cy(float f) {
        return cme.n(this, f);
    }

    @Override // defpackage.cad
    public final void m(bsr bsrVar, bss bssVar, long j) {
        this.g = j;
        if (bssVar == bss.a) {
            this.d = bsrVar;
        }
        int i = 0;
        if (this.h == null) {
            this.h = ykr.q(F(), null, 4, new btr(this, (yih) null, 0), 1);
        }
        r(bsrVar, bssVar);
        List list = bsrVar.a;
        int size = list.size();
        while (true) {
            if (i >= size) {
                bsrVar = null;
                break;
            } else if (!bny.F((bsz) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.j = bsrVar;
    }

    @Override // defpackage.cad
    public final void n() {
        q();
    }

    @Override // defpackage.bte
    public final cds o() {
        return fh.I(this).r;
    }

    @Override // defpackage.bte
    public final Object p(yjz yjzVar, yih yihVar) {
        yof yofVar = new yof(wcq.S(yihVar), 1);
        yofVar.v();
        btq btqVar = new btq(this, yofVar);
        synchronized (this.f) {
            this.e.o(btqVar);
            new yin(wcq.S(wcq.R(yjzVar, btqVar, btqVar)), yio.a).resumeWith(ygi.a);
        }
        yofVar.b(new brj(btqVar, 8));
        return yofVar.i();
    }

    public final void q() {
        yqe yqeVar = this.h;
        if (yqeVar != null) {
            yqeVar.t(new btd());
            this.h = null;
        }
    }

    @Override // defpackage.cad
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.cad
    public final /* synthetic */ void y() {
    }
}
