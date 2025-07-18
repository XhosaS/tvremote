package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bce extends bcf {
    private volatile boolean d;
    private Object e;

    public bce(String str, String str2, bco bcoVar, bcb bcbVar, String str3) {
        super(str, str2, bcoVar, bcbVar);
        this.e = str3;
        this.d = true;
    }

    @Override // defpackage.bbw
    public final Object e() {
        if (this.d) {
            synchronized (this) {
                if (this.d) {
                    Object objAN = aN((String) this.e);
                    objAN.getClass();
                    this.e = objAN;
                    this.d = false;
                }
            }
        }
        return this.e;
    }
}
