package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzc extends bze {
    @Override // defpackage.bze
    public final int a() {
        return 0;
    }

    @Override // defpackage.bze
    public final bze b(Comparable comparable, Comparable comparable2) {
        int iCompareTo = comparable.compareTo(comparable2);
        return iCompareTo < 0 ? bze.c : iCompareTo > 0 ? bze.d : bze.b;
    }
}
