package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eyk implements ezf {
    private final dze[] a;
    private final long[] b;
    protected final eba c;
    protected final int d;
    protected final int[] e;
    private int f;

    public eyk(eba ebaVar, int... iArr) {
        this(ebaVar, iArr, null);
    }

    @Override // defpackage.ezi
    public final int e(dze dzeVar) {
        for (int i = 0; i < this.d; i++) {
            if (this.a[i] == dzeVar) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eyk eykVar = (eyk) obj;
            if (this.c.equals(eykVar.c) && Arrays.equals(this.e, eykVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ezi
    public final dze f(int i) {
        return this.a[i];
    }

    @Override // defpackage.ezf
    public final dze g() {
        return this.a[a()];
    }

    @Override // defpackage.ezi
    public final eba h() {
        return this.c;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (System.identityHashCode(this.c) * 31) + Arrays.hashCode(this.e);
        this.f = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // defpackage.ezf
    public int i(long j, List list) {
        return list.size();
    }

    @Override // defpackage.ezi
    public final int q(int i) {
        return this.e[i];
    }

    @Override // defpackage.ezf
    public final int r() {
        return this.e[a()];
    }

    @Override // defpackage.ezi
    public final int s(int i) {
        for (int i2 = 0; i2 < this.d; i2++) {
            if (this.e[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.ezi
    public final int t() {
        return this.e.length;
    }

    @Override // defpackage.ezf
    public final boolean u(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zV = v(i, jElapsedRealtime);
        int i2 = 0;
        while (true) {
            if (i2 < this.d) {
                if (zV) {
                    break;
                }
                zV = (i2 == i || v(i2, jElapsedRealtime)) ? false : true;
                i2++;
            } else if (!zV) {
                return false;
            }
        }
        long[] jArr = this.b;
        jArr[i] = Math.max(jArr[i], edt.aw(jElapsedRealtime, j));
        return true;
    }

    @Override // defpackage.ezf
    public final boolean v(int i, long j) {
        return this.b[i] > j;
    }

    public eyk(eba ebaVar, int[] iArr, byte[] bArr) {
        int length = iArr.length;
        int i = 0;
        a.ab(length > 0);
        ebaVar.getClass();
        this.c = ebaVar;
        this.d = length;
        this.a = new dze[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.a[i2] = ebaVar.c(iArr[i2]);
        }
        Arrays.sort(this.a, new ade(13));
        this.e = new int[this.d];
        while (true) {
            int i3 = this.d;
            if (i >= i3) {
                this.b = new long[i3];
                return;
            } else {
                this.e[i] = ebaVar.a(this.a[i]);
                i++;
            }
        }
    }

    @Override // defpackage.ezf
    public void l() {
    }

    @Override // defpackage.ezf
    public void m() {
    }

    @Override // defpackage.ezf
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.ezf
    public void n(float f) {
    }
}
