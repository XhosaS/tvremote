package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anw implements yjk {
    private final /* synthetic */ int f;
    public static final anw e = new anw(5);
    public static final anw d = new anw(3);
    public static final anw c = new anw(2);
    public static final anw b = new anw(1);
    public static final anw a = new anw(0);

    public anw(int i) {
        this.f = i;
    }

    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        int i = this.f;
        if (i == 0) {
            return new bnq(bnq.a);
        }
        if (i == 1) {
            return new bnq(bny.i(1308617531));
        }
        if (i == 2) {
            return new bnq(bnq.a);
        }
        if (i != 4) {
            return null;
        }
        return new vqu[3];
    }
}
