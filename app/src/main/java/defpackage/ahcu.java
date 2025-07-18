package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahcu implements Runnable, Comparable, ahcn, ahmr {
    public volatile Object _heap;
    private int a = -1;
    public long b;

    public ahcu(long j) {
        this.b = j;
    }

    @Override // defpackage.ahmr
    public final int b() {
        return this.a;
    }

    @Override // defpackage.ahmr
    public final ahmq c() {
        Object obj = this._heap;
        if (obj instanceof ahmq) {
            return (ahmq) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.b - ((ahcu) obj).b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    @Override // defpackage.ahmr
    public final void d(ahmq ahmqVar) {
        if (this._heap == ahcy.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = ahmqVar;
    }

    @Override // defpackage.ahmr
    public final void e(int i) {
        this.a = i;
    }

    @Override // defpackage.ahcn
    public final void fn() {
        synchronized (this) {
            Object obj = this._heap;
            ahmg ahmgVar = ahcy.a;
            if (obj == ahmgVar) {
                return;
            }
            ahcv ahcvVar = obj instanceof ahcv ? (ahcv) obj : null;
            if (ahcvVar != null) {
                synchronized (ahcvVar) {
                    if (c() != null) {
                        int iB = b();
                        boolean z = ahbx.a;
                        ahcvVar.b(iB);
                    }
                }
            }
            this._heap = ahmgVar;
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.b + "]";
    }
}
