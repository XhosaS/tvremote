package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cmm {
    protected volatile cmz a;
    public volatile ckv b;
    private volatile boolean c;

    public final ckv a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = ckv.b;
            } else {
                this.b = this.a.d();
            }
            return this.b;
        }
    }

    public final cmz b(cmz cmzVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = cmzVar;
                        this.b = ckv.b;
                    } catch (cmh unused) {
                        this.c = true;
                        this.a = cmzVar;
                        this.b = ckv.b;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmm)) {
            return false;
        }
        cmm cmmVar = (cmm) obj;
        cmz cmzVar = this.a;
        cmz cmzVar2 = cmmVar.a;
        return (cmzVar == null && cmzVar2 == null) ? a().equals(cmmVar.a()) : (cmzVar == null || cmzVar2 == null) ? cmzVar != null ? cmzVar.equals(cmmVar.b(cmzVar.k())) : b(cmzVar2.k()).equals(cmzVar2) : cmzVar.equals(cmzVar2);
    }

    public int hashCode() {
        return 1;
    }
}
