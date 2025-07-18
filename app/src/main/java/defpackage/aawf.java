package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawf extends afep {
    public final afep a;
    private final wyt b = wyt.b();

    public aawf(afep afepVar) {
        this.a = afepVar;
    }

    private final void e(Runnable runnable) {
        if (wum.t()) {
            runnable.run();
        } else {
            wyt.d(this.b, runnable).run();
        }
    }

    @Override // defpackage.afep
    public final void a(final Status status, final afih afihVar) {
        e(new Runnable() { // from class: aawd
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a(status, afihVar);
            }
        });
    }

    @Override // defpackage.afep
    public final void b(final afih afihVar) {
        e(new Runnable() { // from class: aawb
            @Override // java.lang.Runnable
            public final void run() {
                aavv aavvVar = (aavv) this.a.a;
                aavvVar.d = afihVar;
                aavvVar.g();
            }
        });
    }

    @Override // defpackage.afep
    public final void c(final Object obj) {
        e(new Runnable() { // from class: aawe
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.c(obj);
            }
        });
    }

    @Override // defpackage.afep
    public final void d() {
        final afep afepVar = this.a;
        e(new Runnable() { // from class: aawc
            @Override // java.lang.Runnable
            public final void run() {
                ((afgc) afepVar).g.d();
            }
        });
    }
}
