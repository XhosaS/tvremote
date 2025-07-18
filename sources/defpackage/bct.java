package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bct {
    private final AtomicReferenceArray a;
    private final awy b;

    public bct(awy awyVar, int i) {
        this.b = awyVar;
        this.a = new AtomicReferenceArray(i);
    }

    public final bcl a(int i, String str, long j) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        bcl bclVar = (bcl) atomicReferenceArray.get(i);
        if (bclVar != null) {
            return bclVar;
        }
        bcl bclVarE = this.b.e(str, j);
        if (tj.i(atomicReferenceArray, i, bclVarE)) {
            return bclVarE;
        }
        bcl bclVar2 = (bcl) atomicReferenceArray.get(i);
        bclVar2.getClass();
        return bclVar2;
    }

    public final bcl b(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        bcl bclVar = (bcl) atomicReferenceArray.get(i);
        if (bclVar != null) {
            return bclVar;
        }
        bcl bclVarF = this.b.f(str, z);
        if (tj.i(atomicReferenceArray, i, bclVarF)) {
            return bclVarF;
        }
        bcl bclVar2 = (bcl) atomicReferenceArray.get(i);
        bclVar2.getClass();
        return bclVar2;
    }

    public final bcl c(int i, String str, bcb bcbVar, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        bcl bclVar = (bcl) atomicReferenceArray.get(i);
        if (bclVar != null) {
            return bclVar;
        }
        bcl bclVarG = this.b.g(str, bcbVar, str2);
        if (tj.i(atomicReferenceArray, i, bclVarG)) {
            return bclVarG;
        }
        bcl bclVar2 = (bcl) atomicReferenceArray.get(i);
        bclVar2.getClass();
        return bclVar2;
    }
}
