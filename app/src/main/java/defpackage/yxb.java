package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yxb extends yxd {
    @Override // defpackage.yxd
    public final int a() {
        return 0;
    }

    @Override // defpackage.yxd
    public final yxd b(Comparable comparable, Comparable comparable2) {
        int iCompareTo = comparable.compareTo(comparable2);
        return iCompareTo < 0 ? yxd.c : iCompareTo > 0 ? yxd.d : yxd.b;
    }
}
