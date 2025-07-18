package defpackage;

import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rgg {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public rgg(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final rgg a() {
        return new rgg(this.a, this.b, this.c, this.d, this.e, true, this.g);
    }

    public final rgg b() {
        Uri uri = this.b;
        if (uri == null) {
            Log.w("PhenotypeFlag", "Setting enableAutoSubpackage on SharedPrefs-backed flags");
        }
        return new rgg(this.a, uri, this.c, this.d, this.e, this.f, true);
    }

    public final rgg c() {
        String str = this.c;
        if (str.isEmpty()) {
            return new rgg(this.a, this.b, str, this.d, true, this.f, this.g);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final rgi d(String str, double d) {
        Double dValueOf = Double.valueOf(d);
        AtomicInteger atomicInteger = rgi.b;
        return new rgb(this, str, dValueOf);
    }

    public final rgi e(String str, long j) {
        Long lValueOf = Long.valueOf(j);
        AtomicInteger atomicInteger = rgi.b;
        return new rfz(this, str, lValueOf);
    }

    public final rgi f(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        AtomicInteger atomicInteger = rgi.b;
        return new rga(this, str, boolValueOf);
    }

    public rgg(Uri uri) {
        this(null, uri, "", "", false, false, false);
    }

    public rgg(String str) {
        this(str, null, "", "", false, false, false);
    }
}
