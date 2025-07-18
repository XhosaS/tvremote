package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmu extends eyj {
    private final idb f;
    private final idb g;
    private final long h;
    private final int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    public lmu(eba ebaVar, int[] iArr, ezm ezmVar, ImmutableList immutableList, idb idbVar, idb idbVar2, long j, long j2, long j3, long j4, float f, int i) {
        super(ebaVar, iArr, ezmVar, j, j2, j3, f, immutableList);
        this.f = idbVar;
        this.g = idbVar2;
        this.h = edt.y(j4);
        this.i = i;
    }

    private final void x() {
        boolean z = this.j;
        boolean z2 = ((krl) this.f).a;
        this.j = z2;
        boolean z3 = this.k;
        boolean z4 = false;
        if (z && !z2) {
            z4 = true;
        }
        this.k = z3 | z4;
        this.l = ((krl) this.g).a;
    }

    @Override // defpackage.eyj, defpackage.ezf
    public final int b() {
        if (this.j) {
            return 4;
        }
        return ((eyj) this).b;
    }

    @Override // defpackage.eyj, defpackage.ezf
    public final void c(long j, long j2, long j3, List list, exy[] exyVarArr) {
        x();
        super.c(j, j2, j3, list, exyVarArr);
        this.m = true;
    }

    @Override // defpackage.eyj, defpackage.eyk, defpackage.ezf
    public final int i(long j, List list) {
        x();
        int i = super.i(j, list);
        this.k = false;
        return i;
    }

    @Override // defpackage.eyj
    protected final long j() {
        return this.k ? this.h : ((eyj) this).a;
    }

    @Override // defpackage.eyj, defpackage.eyk, defpackage.ezf
    public final void m() {
        super.m();
        this.k = false;
    }

    @Override // defpackage.eyj
    protected final boolean o(dze dzeVar, int i, long j) {
        if (this.j) {
            j /= 128;
        }
        if (this.m || dzeVar.ag <= this.i) {
            return (this.l || dzeVar.ag < 720) && super.o(dzeVar, i, j);
        }
        return false;
    }

    @Override // defpackage.eyj
    protected final boolean p(long j, List list) {
        if (this.j) {
            return false;
        }
        return this.k || super.p(j, list);
    }
}
