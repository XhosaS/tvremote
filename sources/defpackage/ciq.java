package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ciq extends cgx {
    private cir a;

    public ciq(cir cirVar) {
        this.a = cirVar;
    }

    @Override // defpackage.cgx
    protected final String a() {
        cir cirVar = this.a;
        if (cirVar == null) {
            return null;
        }
        cja[] cjaVarArr = cirVar.d;
        AtomicInteger atomicInteger = cirVar.c;
        return "inputCount=[" + cjaVarArr.length + "], remaining=[" + atomicInteger.get() + "]";
    }

    @Override // defpackage.cgx
    protected final void b() {
        this.a = null;
    }

    @Override // defpackage.cgx, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        cir cirVar = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        cirVar.getClass();
        cirVar.a = true;
        if (!z) {
            cirVar.b = false;
        }
        cirVar.a();
        return true;
    }
}
