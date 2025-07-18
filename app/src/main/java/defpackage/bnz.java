package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnz extends agtu implements agvb {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ boa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnz(boa boaVar, agsw agswVar) {
        super(2, agswVar);
        this.c = boaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bnz) c((bng) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        bng bngVar;
        Object objC;
        bls[] blsVarArr;
        bls blsVar;
        agtg agtgVar = agtg.a;
        int i = this.a;
        if (i == 0) {
            agpl.b(obj);
            bngVar = (bng) this.b;
            this.b = bngVar;
            this.a = 1;
            objC = bngVar.c();
            if (objC == agtgVar) {
                return agtgVar;
            }
        } else {
            if (i != 1) {
                agpl.b(obj);
                return agpu.a;
            }
            bngVar = (bng) this.b;
            agpl.b(obj);
            objC = obj;
        }
        if (!((Boolean) objC).booleanValue()) {
            boa boaVar = this.c;
            blt bltVar = boaVar.d;
            ReentrantLock reentrantLock = bltVar.a;
            reentrantLock.lock();
            try {
                if (bltVar.d) {
                    boolean z = false;
                    bltVar.d = false;
                    long[] jArr = bltVar.b;
                    int length = jArr.length;
                    blsVarArr = new bls[length];
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 < length) {
                        boolean z3 = jArr[i2] > 0 ? true : z;
                        boolean[] zArr = bltVar.c;
                        if (z3 != zArr[i2]) {
                            zArr[i2] = z3;
                            blsVar = z3 ? bls.b : bls.c;
                            z2 = true;
                        } else {
                            blsVar = bls.a;
                        }
                        blsVarArr[i2] = blsVar;
                        i2++;
                        z = false;
                    }
                    if (true != z2) {
                        blsVarArr = null;
                    }
                } else {
                    reentrantLock.unlock();
                    blsVarArr = null;
                }
                if (blsVarArr != null) {
                    bnf bnfVar = bnf.b;
                    bny bnyVar = new bny(blsVarArr, boaVar, bngVar, null);
                    this.b = null;
                    this.a = 2;
                    if (bngVar.b(bnfVar, bnyVar, this) == agtgVar) {
                        return agtgVar;
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bnz bnzVar = new bnz(this.c, agswVar);
        bnzVar.b = obj;
        return bnzVar;
    }
}
