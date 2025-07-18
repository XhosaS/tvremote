package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfs extends nez {
    private boolean a;
    private boolean c;

    @Override // defpackage.nez
    public final void a(ekl eklVar) {
        this.c = true;
        StringBuilder sbE = this.b.e(eklVar.a);
        sbE.deleteCharAt(sbE.length() - 1);
        this.b.f("user_intent", sbE.toString());
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("user_intent");
    }

    @Override // defpackage.nez
    public final void u(ekl eklVar, boolean z) {
        if (this.a || !z) {
            return;
        }
        this.a = true;
        if (this.c) {
            return;
        }
        this.b.f("cat", "prefetch");
    }
}
