package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahnm extends ahnr implements ahni {
    public final agzy a;

    public ahnm(boolean z) {
        super(z ? 1 : 0);
        this.a = new agzy(z ? null : ahnn.a, agzz.a);
    }

    @Override // defpackage.ahni
    public final boolean a() {
        return Math.max(this.d.c, 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r0.i(defpackage.agpu.a);
        r15 = r2;
     */
    @Override // defpackage.ahni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahnm.b(agsw):java.lang.Object");
    }

    @Override // defpackage.ahni
    public final boolean c() {
        while (true) {
            agzw agzwVar = this.d;
            int i = agzwVar.c;
            if (i > 1) {
                super.e();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (agzwVar.a(1, 0)) {
                    boolean z = ahbx.a;
                    this.a.c(null);
                    return true;
                }
            }
        }
    }

    @Override // defpackage.ahni
    public final void d() {
        while (a()) {
            agzy agzyVar = this.a;
            Object obj = agzyVar.a;
            ahmg ahmgVar = ahnn.a;
            if (obj != ahmgVar && agzyVar.d(obj, ahmgVar)) {
                f();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + Integer.toHexString(System.identityHashCode(this)) + "[isLocked=" + a() + ",owner=" + this.a.a + "]";
    }
}
