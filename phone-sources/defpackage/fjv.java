package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fjv implements fiy {
    private final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public long c;
    private final ArrayDeque d;
    private fjt e;
    private long f;
    private long g;

    public fjv() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new fjt());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new fju(new nef(this, 1)));
        }
        this.d = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    private final void l(fjt fjtVar) {
        fjtVar.clear();
        this.a.add(fjtVar);
    }

    @Override // defpackage.ehh
    public final /* bridge */ /* synthetic */ Object a() {
        a.ab(this.e == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        fjt fjtVar = (fjt) arrayDeque.pollFirst();
        this.e = fjtVar;
        return fjtVar;
    }

    @Override // defpackage.ehh
    public void d() {
        this.f = 0L;
        this.c = 0L;
        while (true) {
            ArrayDeque arrayDeque = this.d;
            if (arrayDeque.isEmpty()) {
                break;
            }
            fjt fjtVar = (fjt) arrayDeque.poll();
            String str = edt.a;
            l(fjtVar);
        }
        fjt fjtVar2 = this.e;
        if (fjtVar2 != null) {
            l(fjtVar2);
            this.e = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    @Override // defpackage.ehh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void e(java.lang.Object r7) {
        /*
            r6 = this;
            fjt r0 = r6.e
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            defpackage.a.H(r0)
            fjt r7 = (defpackage.fjt) r7
            boolean r0 = r7.isEndOfStream()
            if (r0 != 0) goto L2d
            long r0 = r7.e
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2d
            long r2 = r6.g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r6.l(r7)
            goto L3b
        L2d:
            long r0 = r6.f
            r2 = 1
            long r2 = r2 + r0
            r6.f = r2
            r7.h = r0
            java.util.ArrayDeque r0 = r6.d
            r0.add(r7)
        L3b:
            r7 = 0
            r6.e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjv.e(java.lang.Object):void");
    }

    @Override // defpackage.ehh
    public final void g(long j) {
        this.g = j;
    }

    protected abstract fix h();

    @Override // defpackage.ehh
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public fjd b() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.d;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            fjt fjtVar = (fjt) arrayDeque2.peek();
            String str = edt.a;
            if (fjtVar.e > this.c) {
                return null;
            }
            fjt fjtVar2 = (fjt) arrayDeque2.poll();
            if (fjtVar2.isEndOfStream()) {
                fjd fjdVar = (fjd) arrayDeque.pollFirst();
                fjdVar.addFlag(4);
                l(fjtVar2);
                return fjdVar;
            }
            j(fjtVar2);
            if (k()) {
                fix fixVarH = h();
                fjd fjdVar2 = (fjd) arrayDeque.pollFirst();
                fjdVar2.d(fjtVar2.e, fixVarH, Long.MAX_VALUE);
                l(fjtVar2);
                return fjdVar2;
            }
            l(fjtVar2);
        }
    }

    protected abstract void j(fjc fjcVar);

    protected abstract boolean k();

    @Override // defpackage.fiy
    public final void s(long j) {
        this.c = j;
    }

    @Override // defpackage.ehh
    public void f() {
    }
}
