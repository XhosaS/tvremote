package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aflp implements afzk {
    private final afli a;
    private final aflv b;
    private final afeh c;

    public aflp(afli afliVar, aflv aflvVar, afeh afehVar) {
        this.a = afliVar;
        this.b = aflvVar;
        this.c = afehVar;
    }

    @Override // defpackage.afzk
    public final afzw a() {
        return this.b.e;
    }

    @Override // defpackage.afzk
    public final void b(Status status, afih afihVar) {
        try {
            aflv aflvVar = this.b;
            synchronized (aflvVar) {
                if (aflvVar.a == null) {
                    yqw.L(aflvVar.b == null);
                    aflvVar.a = status;
                    aflvVar.b = afihVar;
                    aflvVar.f = true;
                    aflvVar.g = true;
                    aflvVar.c();
                }
            }
            afli afliVar = this.a;
            synchronized (afliVar) {
                afliVar.d();
            }
        } catch (StatusException e) {
            afli afliVar2 = this.a;
            synchronized (afliVar2) {
                Status status2 = e.a;
                afliVar2.f(status2, status2, false);
            }
        }
    }

    @Override // defpackage.afzx
    public final void c() {
        throw null;
    }

    @Override // defpackage.afzx
    public final void e(int i) {
        throw null;
    }

    @Override // defpackage.afzx
    public final void f(affa affaVar) {
        throw null;
    }

    @Override // defpackage.afzk
    public final void g(afzl afzlVar) {
        afli afliVar = this.a;
        synchronized (afliVar) {
            afliVar.i(this.b, afzlVar);
        }
    }

    @Override // defpackage.afzx
    public final void h(InputStream inputStream) {
        throw null;
    }

    @Override // defpackage.afzx
    public final boolean i() {
        throw null;
    }

    @Override // defpackage.afzk
    public final void j() {
    }

    public final String toString() {
        aflv aflvVar = this.b;
        return "MultiMessageServerStream[" + this.a.toString() + "/" + aflvVar.toString() + "]";
    }

    @Override // defpackage.afzx
    public final void d() {
    }
}
