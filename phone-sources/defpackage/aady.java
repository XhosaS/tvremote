package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aady extends aabu implements Serializable {
    public static final aabu a = new aady();
    private static final long serialVersionUID = 2656707858124633367L;

    private aady() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.aabu
    public final int a(long j, long j2) {
        return vxr.au(vxr.ax(j, j2));
    }

    @Override // defpackage.aabu
    public final long b(long j, int i) {
        return vxr.av(j, i);
    }

    @Override // defpackage.aabu
    public final long c(long j, long j2) {
        return vxr.av(j, j2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long jE = ((aabu) obj).e();
        if (jE == 1) {
            return 0;
        }
        return jE > 1 ? -1 : 1;
    }

    @Override // defpackage.aabu
    public final long d(long j, long j2) {
        return vxr.ax(j, j2);
    }

    @Override // defpackage.aabu
    public final long e() {
        return 1L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aady)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.aabu
    public final aabw f() {
        return aabw.l;
    }

    @Override // defpackage.aabu
    public final boolean g() {
        return true;
    }

    @Override // defpackage.aabu
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
