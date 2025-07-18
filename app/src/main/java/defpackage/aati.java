package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aati extends aatm {
    private final String a;

    public aati(String str) {
        if (str == null) {
            throw new NullPointerException("Null host");
        }
        this.a = str;
    }

    @Override // defpackage.aatm
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aatm) {
            aatm aatmVar = (aatm) obj;
            if (this.a.equals(aatmVar.a())) {
                aatmVar.c();
                aatmVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 443) * 1000003) ^ 443;
    }

    public final String toString() {
        return "QuicHint{host=" + this.a + ", port=443, alternatePort=443}";
    }

    @Override // defpackage.aatm
    public final void b() {
    }

    @Override // defpackage.aatm
    public final void c() {
    }
}
