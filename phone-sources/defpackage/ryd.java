package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryd extends rye {
    private volatile boolean d;
    private Object e;

    public ryd(String str, String str2, ryq ryqVar, rxz rxzVar, String str3) {
        super(str, str2, ryqVar, rxzVar);
        this.e = str3;
        this.d = true;
    }

    @Override // defpackage.rxu
    public final Object d() {
        if (this.d) {
            synchronized (this) {
                if (this.d) {
                    Object objEu = eu((String) this.e);
                    objEu.getClass();
                    this.e = objEu;
                    this.d = false;
                }
            }
        }
        return this.e;
    }
}
