package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class chs implements chv {
    public abstract int a(int i);

    @Override // defpackage.chv
    public final int b(int i) {
        return a(i);
    }

    @Override // defpackage.chv
    public final int c(int i) {
        int iA = a(i);
        if (iA == -1 || a(iA) == -1) {
            return -1;
        }
        return iA;
    }

    public abstract int d(int i);

    @Override // defpackage.chv
    public final int e(int i) {
        int iD = d(i);
        if (iD == -1 || d(iD) == -1) {
            return -1;
        }
        return iD;
    }

    @Override // defpackage.chv
    public final int f(int i) {
        return d(i);
    }
}
