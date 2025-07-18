package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arv {
    private static final int[] h = new int[0];
    private static final String[] i = new String[0];
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final int[] e;
    public final String[] f;
    public final aru g;

    public arv(String str, String str2, int i2, long j, int[] iArr, String[] strArr, aru aruVar) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.a = j;
        this.e = iArr;
        this.f = strArr;
        this.g = aruVar;
    }

    public static boolean a(Object obj) {
        return obj == null || (obj instanceof ash);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arv)) {
            return false;
        }
        arv arvVar = (arv) obj;
        return Objects.equals(this.b, arvVar.b) && Objects.equals(this.c, arvVar.c) && this.d == arvVar.d && this.a == arvVar.a && Arrays.equals(this.e, arvVar.e) && Arrays.equals(this.f, arvVar.f) && Objects.equals(this.g, arvVar.g);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, Integer.valueOf(this.d), Long.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.g);
    }

    public arv(String str, String str2, int i2, long j, aru aruVar) {
        this(str, str2, i2, j, h, i, aruVar);
    }
}
