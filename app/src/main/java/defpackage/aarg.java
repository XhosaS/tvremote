package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aarg extends aark {
    private final String a;
    private final String b;

    public aarg(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // defpackage.aark
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aark
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aark) {
            aark aarkVar = (aark) obj;
            if (this.a.equals(aarkVar.a()) && this.b.equals(aarkVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
