package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egn {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public egt e;

    public egn(int i, String str, egt egtVar) {
        this.a = i;
        this.b = str;
        this.e = egtVar;
    }

    public final egx a(long j, long j2) {
        String str = this.b;
        egx egxVar = new egx(str, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        egx egxVar2 = (egx) treeSet.floor(egxVar);
        if (egxVar2 != null) {
            if (egxVar2.b + egxVar2.c > j) {
                return egxVar2;
            }
        }
        egx egxVar3 = (egx) treeSet.ceiling(egxVar);
        if (egxVar3 != null) {
            long jMin = egxVar3.b - j;
            if (j2 != -1) {
                jMin = Math.min(jMin, j2);
            }
            j2 = jMin;
        }
        return new egx(str, j, j2, -9223372036854775807L, null);
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            fhk fhkVar = (fhk) arrayList.get(i);
            long j3 = fhkVar.a;
            if (j3 == -1) {
                if (j >= fhkVar.b) {
                    return true;
                }
            } else if (j2 != -1) {
                long j4 = fhkVar.b;
                if (j4 <= j && j + j2 <= j4 + j3) {
                    return true;
                }
            } else {
                continue;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            egn egnVar = (egn) obj;
            if (this.a == egnVar.a && this.b.equals(egnVar.b) && this.c.equals(egnVar.c) && this.e.equals(egnVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
    }
}
