package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aqz {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final arn b;
    public volatile int c = 0;

    public aqz(arn arnVar, int i) {
        this.b = arnVar;
        this.a = i;
    }

    public final bto a() {
        ThreadLocal threadLocal = d;
        bto btoVar = (bto) threadLocal.get();
        if (btoVar == null) {
            btoVar = new bto();
            threadLocal.set(btoVar);
        }
        arn arnVar = this.b;
        int i = this.a;
        btp btpVar = arnVar.a;
        int iE = btpVar.e(6);
        if (iE != 0) {
            int iF = btpVar.f(iE) + (i * 4);
            btoVar.h(iF + btpVar.b.getInt(iF), btpVar.b);
        }
        return btoVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(a().c()));
        sb.append(", codepoints:");
        int iB = a().b();
        for (int i = 0; i < iB; i++) {
            sb.append(Integer.toHexString(a().a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
