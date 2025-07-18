package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqi extends eyk {
    private int a;

    public eqi(eba ebaVar, int[] iArr) {
        super(ebaVar, iArr);
        this.a = e(ebaVar.c(iArr[0]));
    }

    @Override // defpackage.ezf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ezf
    public final int b() {
        return 0;
    }

    @Override // defpackage.ezf
    public final void c(long j, long j2, long j3, List list, exy[] exyVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (v(this.a, jElapsedRealtime)) {
            int i = this.d;
            do {
                i--;
                if (i < 0) {
                    throw new IllegalStateException();
                }
            } while (v(i, jElapsedRealtime));
            this.a = i;
        }
    }

    @Override // defpackage.ezf
    public final void d() {
    }
}
