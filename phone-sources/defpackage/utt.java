package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utt extends xqv {
    private final AtomicReference a;

    public utt(xqb xqbVar) {
        super(xqbVar);
        this.a = new AtomicReference(zuw.d(1));
    }

    @Override // defpackage.xqw, defpackage.xqb
    public final void a(wbb wbbVar, xsm xsmVar) {
        AtomicReference atomicReference;
        zuw zuwVar;
        int i;
        do {
            atomicReference = this.a;
            zuwVar = (zuw) atomicReference.get();
            i = zuwVar.a;
        } while (!a.t(atomicReference, zuwVar, i == 1 ? zuw.d(2) : zuwVar));
        if (i == 1) {
            this.b.a(wbbVar, xsmVar);
        } else if (i == 4) {
            wbbVar.a((xtk) zuwVar.b, new xsm());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            this.b.c("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // defpackage.xtb, defpackage.xqb
    public final void c(String str, Throwable th) {
        AtomicReference atomicReference;
        zuw zuwVar;
        int i;
        xtk xtkVarD = xtk.c;
        if (str != null) {
            xtkVarD = xtkVarD.e(str);
        }
        if (th != null) {
            xtkVarD = xtkVarD.d(th);
        }
        do {
            atomicReference = this.a;
            zuwVar = (zuw) atomicReference.get();
            i = zuwVar.a;
        } while (!a.t(atomicReference, zuwVar, i == 4 ? zuwVar : i == 1 ? zuw.c(4, xtkVarD) : zuw.c(5, xtkVarD)));
        this.b.c(str, th);
    }

    @Override // defpackage.xtb, defpackage.xqb
    public final void d() {
        AtomicReference atomicReference;
        zuw zuwVar;
        do {
            atomicReference = this.a;
            zuwVar = (zuw) atomicReference.get();
            if (zuwVar.a != 2) {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!a.t(atomicReference, zuwVar, zuw.d(3)));
        this.b.d();
    }

    @Override // defpackage.xtb, defpackage.xqb
    public final void e(int i) {
        int i2 = ((zuw) this.a.get()).a;
        if (i2 == 1 || i2 == 4) {
            throw new IllegalStateException("Not started");
        }
        sij.o(i >= 0, "Number requested must be non-negative");
        this.b.e(i);
    }

    @Override // defpackage.xqw, defpackage.xqb
    public final void f(Object obj) {
        obj.getClass();
        int i = ((zuw) this.a.get()).a;
        if (i == 2) {
            this.b.f(obj);
        } else if (i != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }
}
