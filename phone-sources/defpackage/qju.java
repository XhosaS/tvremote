package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qju {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public qju(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qju)) {
            return false;
        }
        qju qjuVar = (qju) obj;
        return this.a == qjuVar.a && this.b == qjuVar.b && this.c == qjuVar.c;
    }

    public final int hashCode() {
        return (((a.q(this.a) * 31) + a.q(this.b)) * 31) + a.q(this.c);
    }

    public final String toString() {
        return "DeliveryAddressCreationConfig(withRegistrationId=" + this.a + ", withFetchOnlyId=" + this.b + ", withAndroidId=" + this.c + ")";
    }

    public qju() {
        this(false, false, false);
    }
}
