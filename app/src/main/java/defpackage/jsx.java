package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsx extends juz {
    public final int a;
    public final int b;
    public final boolean c;
    private final String d;

    public jsx(int i, String str, int i2, boolean z) {
        this.a = i;
        this.d = str;
        this.b = i2;
        this.c = z;
    }

    @Override // defpackage.juz
    public final int a() {
        return this.b;
    }

    @Override // defpackage.juz
    public final int b() {
        return this.a;
    }

    @Override // defpackage.juz
    public final String c() {
        return this.d;
    }

    @Override // defpackage.juz
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof juz) {
            juz juzVar = (juz) obj;
            if (this.a == juzVar.b() && this.d.equals(juzVar.c()) && this.b == juzVar.a() && this.c == juzVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ErrorDetails{internalErrorCode=" + this.a + ", errorMessage=" + this.d + ", httpStatusCode=" + this.b + ", retryableAsIs=" + this.c + "}";
    }
}
