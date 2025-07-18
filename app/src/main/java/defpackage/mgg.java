package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mgg extends mgk {
    private final int a;
    private final long b;
    private final String c;
    private final String d;

    public mgg(int i, long j, String str, String str2) {
        this.a = i;
        this.b = j;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.mgk
    public final int a() {
        return this.a;
    }

    @Override // defpackage.mgk
    public final long b() {
        return this.b;
    }

    @Override // defpackage.mgk
    public final String c() {
        return this.c;
    }

    @Override // defpackage.mgk
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgk) {
            mgk mgkVar = (mgk) obj;
            if (this.a == mgkVar.a() && this.b == mgkVar.b() && this.c.equals(mgkVar.c()) && this.d.equals(mgkVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        int i = (int) (j ^ (j >>> 32));
        return ((((i ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ThreadIdentifier{tid=" + this.a + ", id=" + this.b + ", name=" + this.c + ", threadPoolName=" + this.d + "}";
    }
}
