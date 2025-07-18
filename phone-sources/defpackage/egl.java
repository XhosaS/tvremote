package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public class egl implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public egl(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    public final boolean a() {
        return !this.d;
    }

    public final boolean b() {
        return this.c == -1;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        egl eglVar = (egl) obj;
        String str = eglVar.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(str);
        }
        long j = this.b - eglVar.b;
        if (j == 0) {
            return 0;
        }
        return j >= 0 ? 1 : -1;
    }

    public final String toString() {
        return "[" + this.b + ", " + this.c + "]";
    }
}
