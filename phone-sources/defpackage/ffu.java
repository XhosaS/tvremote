package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffu implements eac {
    private static final dze f;
    private static final dze g;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int h;

    static {
        dzd dzdVar = new dzd();
        dzdVar.d("application/id3");
        f = new dze(dzdVar);
        dzd dzdVar2 = new dzd();
        dzdVar2.d("application/x-scte35");
        g = new dze(dzdVar2);
    }

    public ffu(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // defpackage.eac
    public final dze a() {
        String str = this.a;
        int iHashCode = str.hashCode();
        if (iHashCode == -1468477611) {
            if (str.equals("urn:scte:scte35:2014:bin")) {
                return g;
            }
            return null;
        }
        if (iHashCode != -795945609) {
            if (iHashCode != 1303648457 || !str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                return null;
            }
        } else if (!str.equals("https://aomedia.org/emsg/ID3")) {
            return null;
        }
        return f;
    }

    @Override // defpackage.eac
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ffu ffuVar = (ffu) obj;
            if (this.c == ffuVar.c && this.d == ffuVar.d && Objects.equals(this.a, ffuVar.a) && Objects.equals(this.b, ffuVar.b) && Arrays.equals(this.e, ffuVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.c;
        long j2 = this.d;
        int iHashCode3 = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.e);
        this.h = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // defpackage.eac
    public final /* synthetic */ void b(eaa eaaVar) {
    }
}
