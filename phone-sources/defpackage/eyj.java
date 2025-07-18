package defpackage;

import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eyj extends eyk {
    public final long a;
    public int b;
    private final ezm f;
    private final long g;
    private final long h;
    private final float i;
    private final ImmutableList j;
    private float k;
    private int l;
    private long m;
    private exw n;

    protected eyj(eba ebaVar, int[] iArr, ezm ezmVar, long j, long j2, long j3, float f, List list) {
        super(ebaVar, iArr, null);
        if (j3 < j) {
            edb.e("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.f = ezmVar;
        this.g = j * 1000;
        this.h = j2 * 1000;
        this.a = j3 * 1000;
        this.i = f;
        this.j = ImmutableList.copyOf((Collection) list);
        this.k = 1.0f;
        this.b = 0;
        this.m = -9223372036854775807L;
    }

    public static void k(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) list.get(i);
            if (builder != null) {
                builder.add((ImmutableList.Builder) new eyh(j, jArr[i]));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int x(long j, long j2) {
        float f;
        ezm ezmVar = this.f;
        float fA = ezmVar.a();
        long jB = ezmVar.b();
        float fMax = (long) (fA * this.i);
        if (jB == -9223372036854775807L || j2 == -9223372036854775807L) {
            f = this.k;
        } else {
            f = j2;
            fMax *= Math.max((f / this.k) - jB, 0.0f);
        }
        long j3 = (long) (fMax / f);
        ImmutableList immutableList = this.j;
        if (!immutableList.isEmpty()) {
            int i = 1;
            while (i < immutableList.size() - 1 && ((eyh) immutableList.get(i)).a < j3) {
                i++;
            }
            eyh eyhVar = (eyh) immutableList.get(i - 1);
            eyh eyhVar2 = (eyh) immutableList.get(i);
            long j4 = eyhVar2.a - eyhVar.a;
            j3 = ((long) (((j3 - r3) / j4) * (eyhVar2.b - r1))) + eyhVar.b;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.d; i3++) {
            if (j == Long.MIN_VALUE || !v(i3, j)) {
                dze dzeVarF = f(i3);
                if (o(dzeVarF, dzeVarF.T, j3)) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    private static final long y(List list) {
        if (!list.isEmpty()) {
            exw exwVar = (exw) Iterables.getLast(list);
            long j = exwVar.v;
            if (j != -9223372036854775807L) {
                long j2 = exwVar.w;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.ezf
    public final int a() {
        return this.l;
    }

    @Override // defpackage.ezf
    public int b() {
        return this.b;
    }

    @Override // defpackage.ezf
    public void c(long j, long j2, long j3, List list, exy[] exyVarArr) {
        long jY;
        long jMin;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.l;
        int length = exyVarArr.length;
        int i2 = 0;
        if (i >= length || !exyVarArr[i].d()) {
            while (true) {
                if (i2 >= length) {
                    jY = y(list);
                    break;
                }
                exy exyVar = exyVarArr[i2];
                if (exyVar.d()) {
                    jY = exyVar.a() - exyVar.b();
                    break;
                }
                i2++;
            }
        } else {
            exy exyVar2 = exyVarArr[this.l];
            jY = exyVar2.a() - exyVar2.b();
        }
        int i3 = this.b;
        if (i3 == 0) {
            this.b = 1;
            this.l = x(jElapsedRealtime, jY);
            return;
        }
        int i4 = this.l;
        int iE = list.isEmpty() ? -1 : e(((exw) Iterables.getLast(list)).s);
        if (iE != -1) {
            i3 = ((exw) Iterables.getLast(list)).t;
            i4 = iE;
        }
        int iX = x(jElapsedRealtime, jY);
        if (iX != i4 && !v(i4, jElapsedRealtime)) {
            dze dzeVarF = f(i4);
            dze dzeVarF2 = f(iX);
            if (j3 == -9223372036854775807L) {
                jMin = this.g;
            } else {
                if (jY != -9223372036854775807L) {
                    j3 -= jY;
                }
                jMin = Math.min((long) (j3 * 0.75f), this.g);
            }
            int i5 = dzeVarF2.T;
            int i6 = dzeVarF.T;
            if ((i5 > i6 && j2 < jMin) || (i5 < i6 && j2 >= this.h)) {
                iX = i4;
            }
        }
        if (iX != i4) {
            i3 = 3;
        }
        this.b = i3;
        this.l = iX;
    }

    @Override // defpackage.eyk, defpackage.ezf
    public int i(long j, List list) {
        int i;
        int i2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!p(jElapsedRealtime, list)) {
            return list.size();
        }
        this.m = jElapsedRealtime;
        this.n = list.isEmpty() ? null : (exw) Iterables.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jX = edt.x(((exw) list.get(size - 1)).v - j, this.k);
        long j2 = j();
        if (jX >= j2) {
            dze dzeVarF = f(x(jElapsedRealtime, y(list)));
            for (int i3 = 0; i3 < size; i3++) {
                exw exwVar = (exw) list.get(i3);
                dze dzeVar = exwVar.s;
                if (edt.x(exwVar.v - j, this.k) >= j2 && dzeVar.T < dzeVarF.T && (i = dzeVar.ag) != -1 && i <= 719 && (i2 = dzeVar.af) != -1 && i2 <= 1279 && i < dzeVarF.ag) {
                    return i3;
                }
            }
        }
        return size;
    }

    protected long j() {
        return this.a;
    }

    @Override // defpackage.eyk, defpackage.ezf
    public final void l() {
        this.n = null;
    }

    @Override // defpackage.eyk, defpackage.ezf
    public void m() {
        this.m = -9223372036854775807L;
        this.n = null;
    }

    @Override // defpackage.eyk, defpackage.ezf
    public final void n(float f) {
        this.k = f;
    }

    protected boolean o(dze dzeVar, int i, long j) {
        return ((long) i) <= j;
    }

    protected boolean p(long j, List list) {
        long j2 = this.m;
        if (j2 == -9223372036854775807L || j - j2 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((exw) Iterables.getLast(list)).equals(this.n)) ? false : true;
    }

    @Override // defpackage.ezf
    public final void d() {
    }
}
