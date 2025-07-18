package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgq implements Comparable {
    public final File a;
    public final long b;
    public final long c;
    public boolean d;

    public sgq(File file) {
        this.a = file;
        this.b = file.lastModified();
        this.c = file.length();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        sgq sgqVar = (sgq) obj;
        if (this.d) {
            if (!sgqVar.d) {
                return 1;
            }
            long j = this.b;
            long j2 = sgqVar.b;
            if (j < j2) {
                return -1;
            }
            return j > j2 ? 1 : 0;
        }
        if (sgqVar.d) {
            return -1;
        }
        long j3 = sgqVar.c;
        long j4 = this.c;
        if (j3 < j4) {
            return -1;
        }
        return j3 <= j4 ? 0 : 1;
    }
}
