package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gou {
    public static final gou a = new gou(0, 15);
    public final gvm b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public final int j;

    public gou(gou gouVar) {
        gouVar.getClass();
        this.c = gouVar.c;
        this.d = gouVar.d;
        this.b = gouVar.b;
        this.j = gouVar.j;
        this.e = gouVar.e;
        this.f = gouVar.f;
        this.i = gouVar.i;
        this.g = gouVar.g;
        this.h = gouVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.b;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !yks.e(getClass(), obj.getClass())) {
            return false;
        }
        gou gouVar = (gou) obj;
        if (this.c == gouVar.c && this.d == gouVar.d && this.e == gouVar.e && this.f == gouVar.f && this.g == gouVar.g && this.h == gouVar.h && yks.e(a(), gouVar.a()) && this.j == gouVar.j) {
            return yks.e(this.i, gouVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.j;
        a.bw(i);
        int i2 = ((((i * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        long j = this.h;
        long j2 = this.g;
        int iHashCode = ((((((((i2 + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.i.hashCode();
        NetworkRequest networkRequestA = a();
        return (iHashCode * 31) + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ((Object) fki.aW(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public /* synthetic */ gou(int i, int i2) {
        i = 1 == (i2 & 1) ? 1 : i;
        byte[] bArr = null;
        if (i == 0) {
            throw null;
        }
        yhd yhdVar = yhd.a;
        this.b = new gvm(bArr);
        this.j = i;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = yhdVar;
    }

    public gou(gvm gvmVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        gvmVar.getClass();
        if (i == 0) {
            throw null;
        }
        this.b = gvmVar;
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
