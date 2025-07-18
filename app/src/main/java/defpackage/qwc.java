package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwc {
    public final aehf a;
    private final qtj b;

    public qwc(qtj qtjVar, aehf aehfVar) {
        this.b = qtjVar;
        this.a = aehfVar;
    }

    public final ahup a(qpi qpiVar) {
        ahuv ahuvVar = ahuv.a;
        ahup ahupVar = new ahup();
        if ((ahupVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahupVar.y();
        }
        ahuv ahuvVar2 = (ahuv) ahupVar.b;
        ahuvVar2.b |= 1;
        ahuvVar2.c = true;
        String strB = qpi.b(qpiVar);
        if (strB != null) {
            if ((ahupVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahupVar.y();
            }
            ahuv ahuvVar3 = (ahuv) ahupVar.b;
            ahuvVar3.b |= 4;
            ahuvVar3.e = strB;
        }
        try {
            ahuc ahucVar = ahuc.a;
            ahub ahubVar = new ahub();
            ahua ahuaVarA = this.b.a();
            if ((ahubVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahubVar.y();
            }
            ahuc ahucVar2 = (ahuc) ahubVar.b;
            ahuaVarA.getClass();
            ahucVar2.c = ahuaVarA;
            ahucVar2.b |= 1;
            if ((ahupVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahupVar.y();
            }
            ahuv ahuvVar4 = (ahuv) ahupVar.b;
            ahuc ahucVar3 = (ahuc) ahubVar.v();
            ahucVar3.getClass();
            ahuvVar4.d = ahucVar3;
            ahuvVar4.b |= 2;
            return ahupVar;
        } catch (RuntimeException e) {
            ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricFactory", "newCrash", 'V', "CrashMetricFactory.java")).u("Failed to get process stats.");
            return ahupVar;
        }
    }
}
