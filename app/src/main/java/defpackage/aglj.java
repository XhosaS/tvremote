package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aglj implements agfr {
    private final AtomicReference a;

    public aglj(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.agfr
    public final void m(agfs agfsVar) {
        agli agliVar;
        AtomicReference atomicReference;
        agle[] agleVarArr;
        agle[] agleVarArr2;
        loop0: while (true) {
            AtomicReference atomicReference2 = this.a;
            agliVar = (agli) atomicReference2.get();
            if (agliVar != null) {
                break;
            }
            agli agliVar2 = new agli(new aglk());
            while (!atomicReference2.compareAndSet(null, agliVar2)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            }
            agliVar = agliVar2;
            break loop0;
        }
        agle agleVar = new agle(agliVar, agfsVar);
        agfsVar.d(agleVar);
        do {
            atomicReference = agliVar.e;
            agleVarArr = (agle[]) atomicReference.get();
            if (agleVarArr == agli.b) {
                break;
            }
            int length = agleVarArr.length;
            agleVarArr2 = new agle[length + 1];
            System.arraycopy(agleVarArr, 0, agleVarArr2, 0, length);
            agleVarArr2[length] = agleVar;
        } while (!aglh.a(atomicReference, agleVarArr, agleVarArr2));
        if (agleVar.d) {
            agliVar.e(agleVar);
        } else {
            agliVar.c.b(agleVar);
        }
    }
}
