package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yxu extends yvi {
    private static final long serialVersionUID = 0;

    public yxu(int i) {
        super(i);
    }

    public static yxu k(Iterable iterable) {
        yxu yxuVar = new yxu(iterable instanceof zbp ? ((zbp) iterable).i().size() : 11);
        zag.i(yxuVar, iterable);
        return yxuVar;
    }

    @Override // defpackage.yvi
    public final zby d(int i) {
        return new zby(i);
    }
}
