package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rlc {
    private final rjy a;
    private final AtomicReferenceArray b;

    public rlc(rjy rjyVar, int i) {
        this.a = rjyVar;
        this.b = new AtomicReferenceArray(i);
    }

    public final rjx a(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.b;
        rjx rjxVar = (rjx) atomicReferenceArray.get(i);
        if (rjxVar != null) {
            return rjxVar;
        }
        rjx rjxVarA = this.a.a(str, false);
        if (rlb.a(atomicReferenceArray, i, rjxVarA)) {
            return rjxVarA;
        }
        rjx rjxVar2 = (rjx) atomicReferenceArray.get(i);
        rjxVar2.getClass();
        return rjxVar2;
    }

    public final rjx b(int i, String str, long j) {
        AtomicReferenceArray atomicReferenceArray = this.b;
        rjx rjxVar = (rjx) atomicReferenceArray.get(i);
        if (rjxVar != null) {
            return rjxVar;
        }
        rjx rjxVarB = this.a.b(str, j);
        if (rlb.a(atomicReferenceArray, i, rjxVarB)) {
            return rjxVarB;
        }
        rjx rjxVar2 = (rjx) atomicReferenceArray.get(i);
        rjxVar2.getClass();
        return rjxVar2;
    }

    public final rjx c(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.b;
        rjx rjxVar = (rjx) atomicReferenceArray.get(i);
        if (rjxVar != null) {
            return rjxVar;
        }
        rjx rjxVarC = this.a.c(str, str2);
        if (rlb.a(atomicReferenceArray, i, rjxVarC)) {
            return rjxVarC;
        }
        rjx rjxVar2 = (rjx) atomicReferenceArray.get(i);
        rjxVar2.getClass();
        return rjxVar2;
    }

    public final rjx d(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.b;
        rjx rjxVar = (rjx) atomicReferenceArray.get(i);
        if (rjxVar != null) {
            return rjxVar;
        }
        rjx rjxVarD = this.a.d(str, z);
        if (rlb.a(atomicReferenceArray, i, rjxVarD)) {
            return rjxVarD;
        }
        rjx rjxVar2 = (rjx) atomicReferenceArray.get(i);
        rjxVar2.getClass();
        return rjxVar2;
    }

    public final rjx e(int i, String str, riz rizVar, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.b;
        rjx rjxVar = (rjx) atomicReferenceArray.get(i);
        if (rjxVar != null) {
            return rjxVar;
        }
        rjx rjxVarE = this.a.e(str, rizVar, str2);
        if (rlb.a(atomicReferenceArray, i, rjxVarE)) {
            return rjxVarE;
        }
        rjx rjxVar2 = (rjx) atomicReferenceArray.get(i);
        rjxVar2.getClass();
        return rjxVar2;
    }
}
