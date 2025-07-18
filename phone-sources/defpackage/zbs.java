package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbs {
    private final boolean a;
    private String[] b;
    private String[] c;
    private boolean d;

    public zbs(zbt zbtVar) {
        this.a = zbtVar.c;
        this.b = zbtVar.e;
        this.c = zbtVar.f;
        this.d = zbtVar.d;
    }

    public final zbt a() {
        return new zbt(this.a, this.d, this.b, this.c);
    }

    public final void b(String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.b = (String[]) strArr.clone();
    }

    @yfp
    public final void c() {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        this.d = true;
    }

    public final void d(String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.c = (String[]) strArr.clone();
    }

    public final void e(zbr... zbrVarArr) {
        zbrVarArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(zbrVarArr.length);
        for (zbr zbrVar : zbrVarArr) {
            arrayList.add(zbrVar.s);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void f(zcp... zcpVarArr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(zcpVarArr.length);
        for (zcp zcpVar : zcpVarArr) {
            arrayList.add(zcpVar.f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public zbs(boolean z) {
        this.a = z;
    }
}
