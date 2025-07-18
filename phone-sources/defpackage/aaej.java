package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaej {
    public final aafh a;
    public final aaff b;
    public final aabk c;
    public final aabs d;

    public aaej(aafh aafhVar, aaff aaffVar) {
        this.a = aafhVar;
        this.b = aaffVar;
        this.c = null;
        this.d = null;
    }

    public final String a(aacg aacgVar) {
        StringBuilder sb = new StringBuilder(d().b());
        try {
            Map map = aabp.a;
            long jA = aacgVar.a();
            aabk aabkVarB = aacgVar.b();
            if (aabkVarB == null) {
                aabkVarB = aadl.P();
            }
            aafh aafhVarD = d();
            aabk aabkVarB2 = b(aabkVarB);
            aabs aabsVarZ = aabkVarB2.z();
            int iA = aabsVarZ.a(jA);
            long j = iA;
            long j2 = jA + j;
            if ((jA ^ j2) >= 0 || (j ^ jA) < 0) {
                jA = j2;
            } else {
                aabsVarZ = aabs.b;
                iA = 0;
            }
            aafhVarD.e(sb, jA, aabkVarB2.a(), iA, aabsVarZ, null);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public final aabk b(aabk aabkVar) {
        aabk aabkVar2 = this.c;
        aabk aabkVarC = aabp.c(aabkVar);
        if (aabkVar2 == null) {
            aabkVar2 = aabkVarC;
        }
        aabs aabsVar = this.d;
        return aabsVar != null ? aabkVar2.b(aabsVar) : aabkVar2;
    }

    public final aaej c() {
        aabs aabsVar = this.d;
        aabs aabsVar2 = aabs.b;
        return aabsVar == aabsVar2 ? this : new aaej(this.a, this.b, this.c, aabsVar2);
    }

    public final aafh d() {
        aafh aafhVar = this.a;
        if (aafhVar != null) {
            return aafhVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    public final aafg e() {
        return aafg.b(this.b);
    }

    public aaej(aafh aafhVar, aaff aaffVar, aabk aabkVar, aabs aabsVar) {
        this.a = aafhVar;
        this.b = aaffVar;
        this.c = aabkVar;
        this.d = aabsVar;
    }
}
