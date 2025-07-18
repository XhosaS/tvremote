package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ere {
    public boolean b;
    public String e;
    public String f;
    private final String g;
    private Uri i;
    private Uri j;
    private Boolean q;
    private final Map h = new HashMap();
    public long a = -9223372036854775807L;
    private long k = -9223372036854775807L;
    private long l = -9223372036854775807L;
    private long m = -9223372036854775807L;
    private List n = new ArrayList();
    public long c = -9223372036854775807L;
    private long o = -9223372036854775807L;
    public List d = new ArrayList();
    private List p = new ArrayList();

    public ere(String str) {
        this.g = str;
    }

    public final erf a() {
        Uri uri = this.j;
        if ((uri != null || this.i == null) && (uri == null || this.i != null)) {
            return null;
        }
        long j = this.a;
        if (j == -9223372036854775807L) {
            return null;
        }
        String str = this.g;
        Uri uri2 = this.i;
        long j2 = this.k;
        long j3 = this.l;
        long j4 = this.m;
        List list = this.n;
        boolean z = this.b;
        long j5 = this.c;
        long j6 = this.o;
        List list2 = this.d;
        List list3 = this.p;
        ArrayList arrayList = new ArrayList(this.h.values());
        Boolean bool = this.q;
        boolean z2 = true;
        if (bool != null && !bool.booleanValue()) {
            z2 = false;
        }
        String str2 = this.e;
        if (str2 == null) {
            str2 = "POINT";
        }
        String str3 = this.f;
        if (str3 == null) {
            str3 = "HIGHLIGHT";
        }
        return new erf(str, uri2, uri, j, j2, j3, j4, list, z, j5, j6, list2, list3, arrayList, z2, str2, str3);
    }

    public final void b(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.j;
        if (uri2 != null) {
            eci.a(uri2.equals(uri), "Can't change assetListUri from " + String.valueOf(this.j) + " to " + uri.toString());
        }
        this.j = uri;
    }

    public final void c(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.i;
        if (uri2 != null) {
            eci.a(uri2.equals(uri), "Can't change assetUri from " + String.valueOf(this.i) + " to " + uri.toString());
        }
        this.i = uri;
    }

    public final void d(List list) {
        if (list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            erd erdVar = (erd) list.get(i);
            String str = erdVar.a;
            Map map = this.h;
            erd erdVar2 = (erd) map.get(str);
            if (erdVar2 != null) {
                eci.a(erdVar2.equals(erdVar), "Can't change " + str + " from " + erdVar2.d + " " + erdVar2.c + " to " + erdVar.d + " " + erdVar.c);
            }
            map.put(str, erdVar);
        }
    }

    public final void e(Boolean bool) {
        if (bool == null) {
            return;
        }
        Boolean bool2 = this.q;
        if (bool2 != null) {
            eci.a(bool2.equals(bool), "Can't change contentMayVary from " + this.q + " to " + bool);
        }
        this.q = bool;
    }

    public final void f(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (!this.n.isEmpty()) {
            eci.a(this.n.equals(list), "Can't change cue from " + a.ac(this.n) + " to " + a.ac(list));
        }
        this.n = list;
    }

    public final void g(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.l;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            eci.a(j3 == j, a.cv(j2, j3, "Can't change durationUs from ", " to "));
        } else {
            j2 = j;
        }
        this.l = j2;
    }

    public final void h(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.k;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            eci.a(j3 == j, a.cv(j2, j3, "Can't change endDateUnixUs from ", " to "));
        } else {
            j2 = j;
        }
        this.k = j2;
    }

    public final void i(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.m;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            eci.a(j3 == j, a.cv(j2, j3, "Can't change plannedDurationUs from ", " to "));
        } else {
            j2 = j;
        }
        this.m = j2;
    }

    public final void j(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.o;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            eci.a(j3 == j, a.cv(j2, j3, "Can't change playoutLimitUs from ", " to "));
        } else {
            j2 = j;
        }
        this.o = j2;
    }

    public final void k(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (!this.p.isEmpty()) {
            eci.a(this.p.equals(list), "Can't change restrictions from " + a.ac(this.p) + " to " + a.ac(list));
        }
        this.p = list;
    }
}
