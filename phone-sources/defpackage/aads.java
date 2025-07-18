package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aads extends aabu implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    public final aabw d;

    protected aads(aabw aabwVar) {
        this.d = aabwVar;
    }

    @Override // defpackage.aabu
    public int a(long j, long j2) {
        return vxr.au(d(j, j2));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long jE = ((aabu) obj).e();
        long jE2 = e();
        if (jE2 == jE) {
            return 0;
        }
        return jE2 < jE ? -1 : 1;
    }

    @Override // defpackage.aabu
    public final aabw f() {
        return this.d;
    }

    @Override // defpackage.aabu
    public final boolean h() {
        return true;
    }

    public final String toString() {
        return "DurationField[" + this.d.m + "]";
    }
}
