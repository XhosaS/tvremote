package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trd extends trb {
    public final int a;
    public final int b;

    public trd(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    @Override // defpackage.trb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.trb
    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trb) {
            trb trbVar = (trb) obj;
            if (this.b == trbVar.d() && this.a == trbVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        return "AppflowStatus{errorType=" + Integer.toString(this.b - 1) + ", errorCode=" + this.a + "}";
    }
}
