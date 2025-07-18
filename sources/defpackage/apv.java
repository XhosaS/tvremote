package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apv extends cgx {
    Object a;

    public apv(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.cgx
    public final String a() {
        Object obj = this.a;
        return obj == null ? "" : obj.toString();
    }

    @Override // defpackage.cgx
    protected final void b() {
        this.a = null;
    }

    @Override // defpackage.cgx
    public final boolean c(Object obj) {
        return super.c(obj);
    }

    @Override // defpackage.cgx
    public final boolean d(Throwable th) {
        return super.d(th);
    }
}
