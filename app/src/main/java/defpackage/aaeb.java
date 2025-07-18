package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaeb extends aaes {
    public final Integer a;
    public final Integer b;
    public final aaea c;
    public final Integer d;

    public aaeb(Integer num, Integer num2, aaea aaeaVar, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = aaeaVar;
        this.d = num3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aaeb)) {
            return false;
        }
        aaeb aaebVar = (aaeb) obj;
        return aaebVar.a.intValue() == this.a.intValue() && aaebVar.b.intValue() == this.b.intValue() && aaebVar.c == this.c && aaebVar.d.intValue() == this.d.intValue();
    }

    public final int hashCode() {
        return Objects.hash(aaeb.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        return "AesGcmHkdfStreaming Parameters (IKM size: " + this.a + ", " + this.b + "-byte AES GCM key, " + this.c.d + " for HKDF " + this.d + "-byte ciphertexts)";
    }
}
