package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgb extends fgi {
    public final String a;
    public final String b;
    public final int c;
    public final byte[] d;

    public fgb(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = bArr;
    }

    @Override // defpackage.fgi, defpackage.eac
    public final void b(eaa eaaVar) {
        eaaVar.a(this.d, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgb fgbVar = (fgb) obj;
            if (this.c == fgbVar.c && Objects.equals(this.a, fgbVar.a) && Objects.equals(this.b, fgbVar.b) && Arrays.equals(this.d, fgbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.c;
        String str2 = this.b;
        return ((((((i + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.d);
    }

    @Override // defpackage.fgi
    public final String toString() {
        return this.f + ": mimeType=" + this.a + ", description=" + this.b;
    }
}
