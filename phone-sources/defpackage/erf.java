package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erf {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final long k;
    public final ImmutableList l;
    public final ImmutableList m;
    public final ImmutableList n;
    public final boolean o;
    public final String p;
    public final String q;

    public erf(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, List list, boolean z, long j5, long j6, List list2, List list3, List list4, boolean z2, String str2, String str3) {
        boolean z3 = false;
        if ((uri == null || uri2 == null) && (uri != null || uri2 != null)) {
            z3 = true;
        }
        a.H(z3);
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = ImmutableList.copyOf((Collection) list2);
        this.m = ImmutableList.copyOf((Collection) list3);
        this.n = ImmutableList.sortedCopyOf(new ade(11), list4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erf)) {
            return false;
        }
        erf erfVar = (erf) obj;
        return this.d == erfVar.d && this.e == erfVar.e && this.f == erfVar.f && this.g == erfVar.g && this.i == erfVar.i && this.j == erfVar.j && this.k == erfVar.k && this.o == erfVar.o && Objects.equals(this.a, erfVar.a) && Objects.equals(this.b, erfVar.b) && Objects.equals(this.c, erfVar.c) && Objects.equals(this.h, erfVar.h) && Objects.equals(this.l, erfVar.l) && Objects.equals(this.m, erfVar.m) && Objects.equals(this.n, erfVar.n) && Objects.equals(this.p, erfVar.p) && Objects.equals(this.q, erfVar.q);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q);
    }
}
