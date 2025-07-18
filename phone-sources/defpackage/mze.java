package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mze {
    public final boolean a;
    public final String b;

    public mze() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mze) {
            mze mzeVar = (mze) obj;
            if (this.a == mzeVar.a && this.b.equals(mzeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RentalExpiryViewModel{showRentalIcon=" + this.a + ", message=" + this.b + "}";
    }

    public mze(boolean z, String str) {
        this.a = z;
        this.b = str;
    }
}
