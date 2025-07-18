package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffw implements eac {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public ffw(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static ffw d(edi ediVar) {
        int iE = ediVar.e();
        String strI = eae.i(ediVar.z(ediVar.e(), StandardCharsets.US_ASCII));
        String strY = ediVar.y(ediVar.e());
        int iE2 = ediVar.e();
        int iE3 = ediVar.e();
        int iE4 = ediVar.e();
        int iE5 = ediVar.e();
        int iE6 = ediVar.e();
        byte[] bArr = new byte[iE6];
        ediVar.F(bArr, 0, iE6);
        return new ffw(iE, strI, strY, iE2, iE3, iE4, iE5, bArr);
    }

    @Override // defpackage.eac
    public final /* synthetic */ dze a() {
        return null;
    }

    @Override // defpackage.eac
    public final void b(eaa eaaVar) {
        eaaVar.a(this.h, this.a);
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
            ffw ffwVar = (ffw) obj;
            if (this.a == ffwVar.a && this.b.equals(ffwVar.b) && this.c.equals(ffwVar.c) && this.d == ffwVar.d && this.e == ffwVar.e && this.f == ffwVar.f && this.g == ffwVar.g && Arrays.equals(this.h, ffwVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + Arrays.hashCode(this.h);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
