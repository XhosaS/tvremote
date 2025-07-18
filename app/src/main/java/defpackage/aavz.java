package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavz extends afga {
    private final AtomicReference a;

    public aavz(afeq afeqVar) {
        super(afeqVar);
        this.a = new AtomicReference(aavy.b(1));
    }

    @Override // defpackage.afgb, defpackage.afeq
    public final void a(afep afepVar, afih afihVar) {
        AtomicReference atomicReference;
        aavy aavyVar;
        int i;
        do {
            atomicReference = this.a;
            aavyVar = (aavy) atomicReference.get();
            i = aavyVar.b;
        } while (!aavx.a(atomicReference, aavyVar, i == 1 ? aavy.b(2) : aavyVar));
        if (i == 1) {
            this.c.a(afepVar, afihVar);
        } else if (i == 4) {
            afepVar.a(aavyVar.a, new afih());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            this.c.b("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // defpackage.afiz, defpackage.afeq
    public final void b(String str, Throwable th) {
        AtomicReference atomicReference;
        aavy aavyVar;
        int i;
        Status statusC = Status.b;
        if (str != null) {
            statusC = statusC.withDescription(str);
        }
        if (th != null) {
            statusC = statusC.c(th);
        }
        do {
            atomicReference = this.a;
            aavyVar = (aavy) atomicReference.get();
            i = aavyVar.b;
        } while (!aavx.a(atomicReference, aavyVar, i == 4 ? aavyVar : i == 1 ? aavy.a(4, statusC) : aavy.a(5, statusC)));
        this.c.b(str, th);
    }

    @Override // defpackage.afiz, defpackage.afeq
    public final void c() {
        AtomicReference atomicReference;
        aavy aavyVar;
        do {
            atomicReference = this.a;
            aavyVar = (aavy) atomicReference.get();
            if (aavyVar.b != 2) {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!aavx.a(atomicReference, aavyVar, aavy.b(3)));
        this.c.c();
    }

    @Override // defpackage.afiz, defpackage.afeq
    public final void d(int i) {
        int i2 = ((aavy) this.a.get()).b;
        if (i2 == 1 || i2 == 4) {
            throw new IllegalStateException("Not started");
        }
        yqw.B(i >= 0, "Number requested must be non-negative");
        this.c.d(i);
    }

    @Override // defpackage.afgb, defpackage.afeq
    public final void e(Object obj) {
        obj.getClass();
        int i = ((aavy) this.a.get()).b;
        if (i == 2) {
            this.c.e(obj);
        } else if (i != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }
}
