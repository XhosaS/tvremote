package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahit {
    public static final ahmg a = new ahmg("NO_VALUE");

    public static final Object a(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final ahgr c(ahip ahipVar, agte agteVar, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? ahipVar : new ahjn(ahipVar, agteVar, i, i2);
    }
}
