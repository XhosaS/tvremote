package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llp extends llz {
    private final String a;
    private final int b;

    public llp(String str) {
        if (str == null) {
            throw new NullPointerException("Null screenName");
        }
        this.a = str;
        this.b = -1;
    }

    @Override // defpackage.llz
    public final int a() {
        return this.b;
    }

    @Override // defpackage.llz
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof llz) {
            llz llzVar = (llz) obj;
            if (this.a.equals(llzVar.b()) && this.b == llzVar.a()) {
                llzVar.c();
                llzVar.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * (-721379959)) ^ 1237;
    }

    @Override // defpackage.llz
    public final void c() {
    }

    @Override // defpackage.llz
    public final void d() {
    }
}
