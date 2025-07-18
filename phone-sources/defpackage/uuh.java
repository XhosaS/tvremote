package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uuh {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public uuh() {
        throw null;
    }

    public static uug a() {
        uug uugVar = new uug();
        uugVar.b(false);
        uugVar.c(false);
        uugVar.d(false);
        return uugVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uuh) {
            uuh uuhVar = (uuh) obj;
            if (this.a == uuhVar.a && this.b == uuhVar.b && this.c == uuhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "EncoderOptions{enableCelLogsiteMetadata=" + this.a + ", enableSafeFormatArgs=" + this.b + ", includeSuppressedExceptions=" + this.c + "}";
    }

    public uuh(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
