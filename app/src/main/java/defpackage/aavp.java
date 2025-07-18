package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aavp extends afep {
    public final afep a;
    boolean b = false;
    final /* synthetic */ aavt c;

    public aavp(aavt aavtVar, afep afepVar) {
        this.c = aavtVar;
        this.a = afepVar;
    }

    @Override // defpackage.afep
    public final void a(final Status status, final afih afihVar) {
        this.c.a.execute(new Runnable() { // from class: aavm
            @Override // java.lang.Runnable
            public final void run() {
                Status status2 = status;
                afih afihVar2 = afihVar;
                aavp aavpVar = this.a;
                if (aavpVar.b) {
                    return;
                }
                try {
                    aavpVar.a.a(status2, afihVar2);
                } finally {
                    aavpVar.b = true;
                    aavpVar.c.h.a = zwk.a;
                }
            }
        });
    }

    @Override // defpackage.afep
    public final void b(final afih afihVar) {
        this.c.a.execute(new Runnable() { // from class: aavl
            @Override // java.lang.Runnable
            public final void run() {
                aavp aavpVar = this.a;
                if (aavpVar.b) {
                    return;
                }
                aavpVar.a.b(afihVar);
            }
        });
    }

    @Override // defpackage.afep
    public final void c(final Object obj) {
        this.c.a.execute(new Runnable() { // from class: aavn
            @Override // java.lang.Runnable
            public final void run() {
                aavp aavpVar = this.a;
                if (aavpVar.b) {
                    return;
                }
                aavpVar.a.c(obj);
            }
        });
    }

    @Override // defpackage.afep
    public final void d() {
        this.c.a.execute(new Runnable() { // from class: aavo
            @Override // java.lang.Runnable
            public final void run() {
                aavp aavpVar = this.a;
                if (aavpVar.b) {
                    return;
                }
                aavpVar.a.d();
            }
        });
    }
}
