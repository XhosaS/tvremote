package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mai {
    public final String a;
    public final String[] b;
    public final boolean c;
    public final ksn d;

    public mai(ksn ksnVar, String str, String[] strArr, boolean z) {
        this.d = ksnVar;
        str.getClass();
        this.a = str;
        this.b = strArr;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mai maiVar = (mai) obj;
        if (this.c == maiVar.c && this.a.equals(maiVar.a) && Arrays.equals(this.b, maiVar.b)) {
            return this.d.equals(maiVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + Arrays.hashCode(this.b)) * 31) + (this.c ? 1 : 0)) * 31) + this.d.hashCode();
    }
}
