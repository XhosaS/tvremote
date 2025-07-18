package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class qad implements qsx {
    private static final tvn c = tvn.n("GnpSdk");
    public qnr a;
    public Map b;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r2 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0188, code lost:
    
        if (r13.a(r12, r2, r3, r0) != r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0199, code lost:
    
        if (r13.b(r12, r2, r4, r0) != r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object h(defpackage.qad r12, android.os.Bundle r13, defpackage.yih r14) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qad.h(qad, android.os.Bundle, yih):java.lang.Object");
    }

    protected static final pyc j() {
        pyb pybVarC = pyc.c();
        pybVarC.c = new IllegalStateException("chimeAccount should not be null.");
        pybVarC.b(false);
        return pybVarC.a();
    }

    @Override // defpackage.qsx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // defpackage.qsx
    public final /* synthetic */ psy b(Bundle bundle) {
        return qtl.d(this, bundle);
    }

    @Override // defpackage.qsx
    public final Object c(Bundle bundle, yih yihVar) {
        return h(this, bundle, yihVar);
    }

    @Override // defpackage.qsx
    public final /* synthetic */ boolean e() {
        return false;
    }

    public abstract Object f(Bundle bundle, vme vmeVar, qen qenVar, yih yihVar);

    protected abstract String g();

    public final Map i() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        yks.c("callbacksMap");
        return null;
    }
}
