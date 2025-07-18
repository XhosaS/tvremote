package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrs {
    private static final int[] h = new int[0];
    private static final String[] i = new String[0];
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final int[] e;
    public final String[] f;
    public final qrr g;

    public qrs(String str, String str2, int i2, long j, int[] iArr, String[] strArr, qrr qrrVar) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.a = j;
        this.e = iArr;
        this.f = strArr;
        this.g = qrrVar;
    }

    public static boolean a(Object obj) {
        return obj == null || (obj instanceof qsj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrs)) {
            return false;
        }
        qrs qrsVar = (qrs) obj;
        return Objects.equals(this.b, qrsVar.b) && Objects.equals(this.c, qrsVar.c) && this.d == qrsVar.d && this.a == qrsVar.a && Arrays.equals(this.e, qrsVar.e) && Arrays.equals(this.f, qrsVar.f) && Objects.equals(this.g, qrsVar.g);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, Integer.valueOf(this.d), Long.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.g);
    }

    public qrs(String str, String str2, int i2, long j, qrr qrrVar) {
        this(str, str2, i2, j, h, i, qrrVar);
    }
}
