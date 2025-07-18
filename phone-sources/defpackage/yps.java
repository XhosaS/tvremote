package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yps implements Runnable, Comparable, ypm, yxv {
    public volatile Object _heap;
    private int a = -1;
    public long b;

    public yps(long j) {
        this.b = j;
    }

    @Override // defpackage.yxv
    public final int b() {
        return this.a;
    }

    @Override // defpackage.yxv
    public final yxu c() {
        Object obj = this._heap;
        if (obj instanceof yxu) {
            return (yxu) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.b - ((yps) obj).b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    @Override // defpackage.yxv
    public final void d(yxu yxuVar) {
        if (this._heap == ypv.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = yxuVar;
    }

    @Override // defpackage.yxv
    public final void e(int i) {
        this.a = i;
    }

    @Override // defpackage.ypm
    public final void eD() {
        synchronized (this) {
            Object obj = this._heap;
            yxo yxoVar = ypv.a;
            if (obj == yxoVar) {
                return;
            }
            ypt yptVar = obj instanceof ypt ? (ypt) obj : null;
            if (yptVar != null) {
                synchronized (yptVar) {
                    if (c() != null) {
                        int iB = b();
                        boolean z = yoy.a;
                        yptVar.d(iB);
                    }
                }
            }
            this._heap = yxoVar;
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.b + "]";
    }
}
