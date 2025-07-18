package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rjd extends rje {
    private volatile boolean a;
    private Object b;

    public rjd(String str, String str2, rkq rkqVar, riz rizVar, String str3) {
        super(str, str2, rkqVar, rizVar);
        this.b = str3;
        this.a = true;
    }

    @Override // defpackage.rhz
    public final Object f() {
        if (this.a) {
            synchronized (this) {
                if (this.a) {
                    Object objJ = j((String) this.b);
                    objJ.getClass();
                    this.b = objJ;
                    this.a = false;
                }
            }
        }
        return this.b;
    }
}
