package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgo extends qgn {
    public final String a;
    public final String b;

    public qgo(String str) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = str;
        this.b = "OneGoogle";
    }

    @Override // defpackage.qgn
    public final String a() {
        return this.b;
    }

    @Override // defpackage.qgn
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qgn) {
            qgn qgnVar = (qgn) obj;
            if (this.a.equals(qgnVar.b())) {
                qgnVar.c();
                qgnVar.d();
                if (this.b.equals(qgnVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 583896283) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ApplicationId{packageName=" + this.a + ", attributionTag=null, moduleName=null, instanceId=" + this.b + "}";
    }

    @Override // defpackage.qgn
    public final void c() {
    }

    @Override // defpackage.qgn
    public final void d() {
    }
}
