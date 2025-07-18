package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yiz extends yiv implements ykp {
    private final int a;

    public yiz(int i, yih yihVar) {
        super(yihVar);
        this.a = i;
    }

    @Override // defpackage.ykp
    public final int ca() {
        return this.a;
    }

    @Override // defpackage.yit
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        int i = ylg.a;
        String strA = ykr.a(this);
        strA.getClass();
        return strA;
    }
}
