package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aads extends aaes {
    public final Integer a;
    public final Integer b;
    public final aadr c;
    public final aadr d;
    public final Integer e;
    public final Integer f;

    public aads(Integer num, Integer num2, aadr aadrVar, aadr aadrVar2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = aadrVar;
        this.d = aadrVar2;
        this.e = num3;
        this.f = num4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aads)) {
            return false;
        }
        aads aadsVar = (aads) obj;
        return aadsVar.a.intValue() == this.a.intValue() && aadsVar.b.intValue() == this.b.intValue() && aadsVar.c == this.c && aadsVar.d == this.d && aadsVar.e.intValue() == this.e.intValue() && aadsVar.f.intValue() == this.f.intValue();
    }

    public final int hashCode() {
        return Objects.hash(aads.class, this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesCtrHmacStreaming Parameters (IKM size: ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append("-byte AES key, ");
        String str = this.c.d;
        sb.append(str);
        sb.append(" for HKDF, ");
        sb.append(str);
        sb.append(" for HMAC, ");
        sb.append(this.e);
        sb.append("-byte tags, ");
        sb.append(this.f);
        sb.append("-byte ciphertexts)");
        return sb.toString();
    }
}
