package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahef extends ahdq {
    private final ahar a;

    public ahef(ahar aharVar) {
        this.a = aharVar;
    }

    @Override // defpackage.ahdq
    public final void b(Throwable th) {
        Object obj = f().d.a;
        boolean z = ahbx.a;
        if (obj instanceof ahbc) {
            this.a.e(agpl.a(((ahbc) obj).b));
        } else {
            this.a.e(ahdw.b(obj));
        }
    }

    @Override // defpackage.ahdq
    public final boolean c() {
        return false;
    }
}
