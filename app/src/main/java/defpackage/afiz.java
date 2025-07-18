package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class afiz extends afeq {
    @Override // defpackage.afeq
    public void b(String str, Throwable th) {
        f().b(str, th);
    }

    @Override // defpackage.afeq
    public void c() {
        f().c();
    }

    @Override // defpackage.afeq
    public void d(int i) {
        f().d(i);
    }

    protected abstract afeq f();

    @Override // defpackage.afeq
    public final boolean k() {
        return f().k();
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("delegate", f());
        return yqqVarB.toString();
    }
}
