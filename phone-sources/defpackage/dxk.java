package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxk implements dwx {
    private final dwi[] a;

    public dxk(dwi... dwiVarArr) {
        dwiVarArr.getClass();
        this.a = dwiVarArr;
    }

    @Override // defpackage.dwx
    public final /* synthetic */ dwt a(Class cls) {
        return dvz.d();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yjv] */
    @Override // defpackage.dwx
    public final dwt b(Class cls, dxj dxjVar) {
        dwi dwiVar;
        dwi[] dwiVarArr = this.a;
        int length = dwiVarArr.length;
        ymh ymhVarQ = wef.q(cls);
        dwi[] dwiVarArr2 = (dwi[]) Arrays.copyOf(dwiVarArr, length);
        dwiVarArr2.getClass();
        int i = 0;
        while (true) {
            if (i >= dwiVarArr2.length) {
                dwiVar = null;
                break;
            }
            dwiVar = dwiVarArr2[i];
            if (yks.e(dwiVar.a, ymhVarQ)) {
                break;
            }
            i++;
        }
        dwt dwtVar = dwiVar != null ? (dwt) dwiVar.b.a(dxjVar) : null;
        if (dwtVar != null) {
            return dwtVar;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(String.valueOf(dhf.g(ymhVarQ))));
    }

    @Override // defpackage.dwx
    public final /* synthetic */ dwt c(ymh ymhVar, dxj dxjVar) {
        return dvz.c(this, ymhVar, dxjVar);
    }
}
