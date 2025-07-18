package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fga implements eac {
    public final byte[] a;
    public final String b;
    public final String c;

    public fga(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.eac
    public final /* synthetic */ dze a() {
        return null;
    }

    @Override // defpackage.eac
    public final void b(eaa eaaVar) {
        String str = this.b;
        if (str != null) {
            eaaVar.a = str;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((fga) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, Integer.valueOf(this.a.length));
    }
}
