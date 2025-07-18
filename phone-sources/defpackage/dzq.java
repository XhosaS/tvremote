package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzq {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public static final String d = edt.Z(3);
    static final String e = edt.Z(4);
    public static final String f = edt.Z(5);
    public static final String g = edt.Z(6);
    public static final String h = edt.Z(7);
    public final UUID i;
    public final Uri j;
    public final ImmutableMap k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final ImmutableList o;
    public final byte[] p;

    public dzq(dzp dzpVar) {
        boolean z = true;
        if (dzpVar.f && dzpVar.b == null) {
            z = false;
        }
        a.ab(z);
        UUID uuid = dzpVar.a;
        uuid.getClass();
        this.i = uuid;
        this.j = dzpVar.b;
        this.k = dzpVar.c;
        this.l = dzpVar.d;
        this.n = dzpVar.f;
        this.m = dzpVar.e;
        this.o = dzpVar.g;
        byte[] bArr = dzpVar.h;
        this.p = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final byte[] a() {
        byte[] bArr = this.p;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzq)) {
            return false;
        }
        dzq dzqVar = (dzq) obj;
        return this.i.equals(dzqVar.i) && Objects.equals(this.j, dzqVar.j) && Objects.equals(this.k, dzqVar.k) && this.l == dzqVar.l && this.n == dzqVar.n && this.m == dzqVar.m && this.o.equals(dzqVar.o) && Arrays.equals(this.p, dzqVar.p);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        Uri uri = this.j;
        return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.k.hashCode()) * 31) + (this.l ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + this.o.hashCode()) * 31) + Arrays.hashCode(this.p);
    }
}
