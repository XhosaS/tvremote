package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rif extends rig {
    private volatile boolean a;
    private Object b;

    public rif(String str, rkq rkqVar, riz rizVar, String str2) {
        super(str, rkqVar, rizVar);
        this.b = str2;
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
