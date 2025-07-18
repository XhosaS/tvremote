package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgl {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public bgl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bgl) {
            bgl bglVar = (bgl) obj;
            if (this.a == bglVar.a && this.b == bglVar.b && ((str = this.c) != null ? str.equals(bglVar.c) : bglVar.c == null) && this.d.equals(bglVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        return (((str == null ? 0 : str.hashCode()) ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "AudioDevice{id=" + this.a + ", deviceType=" + this.b + ", address=" + this.c + ", description=" + this.d + "}";
    }

    public bgl(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.d = str2;
    }
}
