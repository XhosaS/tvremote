package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxk extends zum {
    private zxl a;

    public zxk(zxl zxlVar) {
        this.a = zxlVar;
    }

    @Override // defpackage.zum
    protected final String a() {
        zxl zxlVar = this.a;
        if (zxlVar == null) {
            return null;
        }
        zyd[] zydVarArr = zxlVar.d;
        AtomicInteger atomicInteger = zxlVar.c;
        return "inputCount=[" + zydVarArr.length + "], remaining=[" + atomicInteger.get() + "]";
    }

    @Override // defpackage.zum
    protected final void b() {
        this.a = null;
    }

    @Override // defpackage.zum, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zxl zxlVar = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        zxlVar.getClass();
        zxlVar.a = true;
        if (!z) {
            zxlVar.b = false;
        }
        zxlVar.a();
        return true;
    }
}
