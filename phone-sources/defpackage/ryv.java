package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryv {
    private final AtomicReferenceArray a;
    private final rzy b;

    public ryv(rzy rzyVar, int i) {
        this.b = rzyVar;
        this.a = new AtomicReferenceArray(i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ryq] */
    public final ryn a(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        ryn rynVar = (ryn) atomicReferenceArray.get(i);
        if (rynVar != null) {
            return rynVar;
        }
        rzy rzyVar = this.b;
        rya ryaVar = new rya((String) rzyVar.a, str, rzyVar.b);
        if (rrx.I(atomicReferenceArray, i, ryaVar)) {
            return ryaVar;
        }
        ryn rynVar2 = (ryn) atomicReferenceArray.get(i);
        rynVar2.getClass();
        return rynVar2;
    }

    public final ryn b(int i, String str, double d) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        ryn rynVar = (ryn) atomicReferenceArray.get(i);
        if (rynVar != null) {
            return rynVar;
        }
        ryn rynVarA = this.b.a(str, -1.0d);
        if (rrx.I(atomicReferenceArray, i, rynVarA)) {
            return rynVarA;
        }
        ryn rynVar2 = (ryn) atomicReferenceArray.get(i);
        rynVar2.getClass();
        return rynVar2;
    }

    public final ryn c(int i, String str, long j) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        ryn rynVar = (ryn) atomicReferenceArray.get(i);
        if (rynVar != null) {
            return rynVar;
        }
        ryn rynVarB = this.b.b(str, j);
        if (rrx.I(atomicReferenceArray, i, rynVarB)) {
            return rynVarB;
        }
        ryn rynVar2 = (ryn) atomicReferenceArray.get(i);
        rynVar2.getClass();
        return rynVar2;
    }

    public final ryn d(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        ryn rynVar = (ryn) atomicReferenceArray.get(i);
        if (rynVar != null) {
            return rynVar;
        }
        ryn rynVarC = this.b.c(str, str2);
        if (rrx.I(atomicReferenceArray, i, rynVarC)) {
            return rynVarC;
        }
        ryn rynVar2 = (ryn) atomicReferenceArray.get(i);
        rynVar2.getClass();
        return rynVar2;
    }

    public final ryn e(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        ryn rynVar = (ryn) atomicReferenceArray.get(i);
        if (rynVar != null) {
            return rynVar;
        }
        ryn rynVarD = this.b.d(str, z);
        if (rrx.I(atomicReferenceArray, i, rynVarD)) {
            return rynVarD;
        }
        ryn rynVar2 = (ryn) atomicReferenceArray.get(i);
        rynVar2.getClass();
        return rynVar2;
    }

    public final ryn f(int i, String str, rxz rxzVar, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        ryn rynVar = (ryn) atomicReferenceArray.get(i);
        if (rynVar != null) {
            return rynVar;
        }
        ryn rynVarE = this.b.e(str, rxzVar, str2);
        if (rrx.I(atomicReferenceArray, i, rynVarE)) {
            return rynVarE;
        }
        ryn rynVar2 = (ryn) atomicReferenceArray.get(i);
        rynVar2.getClass();
        return rynVar2;
    }
}
