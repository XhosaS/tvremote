package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caq {
    public static final caq a = new caq();
    public final cnh b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public final int j;

    public caq(caq caqVar) {
        caqVar.getClass();
        this.c = caqVar.c;
        this.d = caqVar.d;
        this.b = caqVar.b;
        this.j = caqVar.j;
        this.e = caqVar.e;
        this.f = caqVar.f;
        this.i = caqVar.i;
        this.g = caqVar.g;
        this.h = caqVar.h;
    }

    public final boolean a() {
        return !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && agvy.c(getClass(), obj.getClass())) {
            caq caqVar = (caq) obj;
            if (this.c == caqVar.c && this.d == caqVar.d && this.e == caqVar.e && this.f == caqVar.f && this.g == caqVar.g && this.h == caqVar.h) {
                if (agvy.c(this.b.b, caqVar.b.b) && this.j == caqVar.j) {
                    return agvy.c(this.i, caqVar.i);
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.h;
        long j2 = this.g;
        int iHashCode = (((((((((((((this.j * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.i.hashCode();
        Object obj = this.b.b;
        return (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ((Object) cby.a(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public caq() {
        agrf agrfVar = agrf.a;
        this.b = new cnh(null);
        this.j = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = agrfVar;
    }

    public caq(cnh cnhVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        cnhVar.getClass();
        if (i == 0) {
            throw null;
        }
        this.b = cnhVar;
        this.j = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = set;
    }
}
