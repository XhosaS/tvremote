package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mad {
    public final kyq a;
    public int b;
    public long c;
    public final long d;

    public mad(kyq kyqVar, int i, long j, long j2) {
        this.a = kyqVar;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final void a() {
        this.b++;
    }

    public final boolean b(lfn lfnVar) {
        if (lfnVar.ad() == -1 || this.b < lfnVar.ad()) {
            return lfnVar.aQ() == -1 || this.d + lfnVar.aQ() >= System.currentTimeMillis();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mad)) {
            return false;
        }
        mad madVar = (mad) obj;
        return this.a.equals(madVar.a) && this.b == madVar.b && this.d == madVar.d && this.c == madVar.c;
    }

    public final int hashCode() {
        kyq kyqVar = this.a;
        int iHashCode = (((kyqVar.a.hashCode() * 31) + kyqVar.b.hashCode()) * 31) + this.b;
        return (((iHashCode * 31) + ((int) this.c)) * 31) + ((int) this.d);
    }
}
