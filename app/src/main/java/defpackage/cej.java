package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cej implements ceh {
    private final ceh b;
    private final Object c = new Object();

    public cej(ceh cehVar) {
        this.b = cehVar;
    }

    @Override // defpackage.ceh
    public final cee a(ckp ckpVar) {
        cee ceeVarA;
        synchronized (this.c) {
            ceeVarA = this.b.a(ckpVar);
        }
        return ceeVarA;
    }

    @Override // defpackage.ceh
    public final cee b(ckp ckpVar) {
        cee ceeVarB;
        synchronized (this.c) {
            ceeVarB = this.b.b(ckpVar);
        }
        return ceeVarB;
    }

    @Override // defpackage.ceh
    public final /* synthetic */ cee c(cld cldVar) {
        return cef.a(this, cldVar);
    }

    @Override // defpackage.ceh
    public final List d(String str) {
        List listD;
        str.getClass();
        synchronized (this.c) {
            listD = this.b.d(str);
        }
        return listD;
    }

    @Override // defpackage.ceh
    public final boolean e(ckp ckpVar) {
        boolean zE;
        synchronized (this.c) {
            zE = this.b.e(ckpVar);
        }
        return zE;
    }
}
