package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwy implements lxy {
    public final String a;
    public final String b;
    private final String c;

    public lwy(String str, String str2, String str3) {
        this.c = str;
        krf.c(str2);
        this.a = str2;
        this.b = str3;
    }

    @Override // defpackage.lxy
    public final String a() {
        return this.c;
    }

    @Override // defpackage.lxy
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lwy lwyVar = (lwy) obj;
            if (this.a.equals(lwyVar.a)) {
                String str = this.b;
                if (str == null ? lwyVar.b == null : str.equals(lwyVar.b)) {
                    return this.c.equals(lwyVar.c);
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c.hashCode();
    }
}
