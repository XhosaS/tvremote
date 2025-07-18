package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffz implements eac {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public ffz(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        a.H(z2);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    @Override // defpackage.eac
    public final /* synthetic */ dze a() {
        return null;
    }

    @Override // defpackage.eac
    public final void b(eaa eaaVar) {
        String str = this.c;
        if (str != null) {
            eaaVar.F = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            eaaVar.D = str2;
        }
    }

    @Override // defpackage.eac
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ffz ffzVar = (ffz) obj;
            if (this.a == ffzVar.a && Objects.equals(this.b, ffzVar.b) && Objects.equals(this.c, ffzVar.c) && Objects.equals(this.d, ffzVar.d) && this.e == ffzVar.e && this.f == ffzVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.a;
        String str2 = this.c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = ((i + 527) * 31) + iHashCode;
        String str3 = this.d;
        return (((((((i2 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }
}
