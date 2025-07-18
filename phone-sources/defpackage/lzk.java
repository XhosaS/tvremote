package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzk extends mfh {
    public final int a;

    public lzk(int i) {
        super(a.cf(i, "Status: "));
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((lzk) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "CencLicenseException [" + this.a + "]";
    }
}
