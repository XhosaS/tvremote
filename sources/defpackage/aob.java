package defpackage;

import android.text.TextUtils;
import j$.time.Instant;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aob {
    private static final cab e = cab.o(acm.STARTUP, acm.TELEDOCTOR);
    public final String a;
    public final aco b;
    public final anx c;
    public boolean d;
    private final byg f;
    private final cab g;
    private final Random h;
    private String i;

    public aob(String str, aco acoVar, adb adbVar, anx anxVar) {
        cab cabVar = e;
        this.d = true;
        bdq.k(!TextUtils.isEmpty(str), "Given String is empty or null");
        bdq.k(true, "Sampling rate should not exceed 1.0");
        this.a = str;
        acoVar.getClass();
        this.b = acoVar;
        this.f = byg.g(adbVar);
        this.c = anxVar;
        cabVar.getClass();
        this.g = cabVar;
        this.d = false;
        this.h = new Random();
    }

    public final boolean a(aod aodVar) {
        aor aorVar;
        long j;
        aoc aocVar = new aoc(aodVar);
        aocVar.g = this;
        aod aodVarA = aocVar.a();
        if (this.g.contains(aodVarA.a)) {
            String str = this.a;
            int i = 0;
            while (true) {
                if (i >= aodVarA.b().size()) {
                    aorVar = null;
                    break;
                }
                aorVar = (aor) aodVarA.b().get(i);
                if (aorVar.d.equals(str)) {
                    break;
                }
                i++;
            }
            if (aorVar == null) {
                j = 0;
            } else {
                aos aosVar = aorVar.e;
                if (aosVar == null) {
                    aosVar = aos.a;
                }
                j = aosVar.d;
            }
            if (j <= Instant.now().toEpochMilli()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133 A[Catch: all -> 0x01bd, TryCatch #10 {all -> 0x01bd, blocks: (B:46:0x012d, B:48:0x0133, B:50:0x0149), top: B:127:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162 A[PHI: r2
  0x0162: PHI (r2v6 aod) = (r2v5 aod), (r2v8 aod) binds: [B:47:0x0131, B:53:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a A[Catch: all -> 0x01bb, TryCatch #9 {all -> 0x01bb, blocks: (B:63:0x0163, B:68:0x0174, B:70:0x017a, B:71:0x017d, B:90:0x01c6, B:95:0x01d7, B:97:0x01dd, B:98:0x01e0, B:99:0x01f0), top: B:126:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dd A[Catch: all -> 0x01bb, TryCatch #9 {all -> 0x01bb, blocks: (B:63:0x0163, B:68:0x0174, B:70:0x017a, B:71:0x017d, B:90:0x01c6, B:95:0x01d7, B:97:0x01dd, B:98:0x01e0, B:99:0x01f0), top: B:126:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aoa b(defpackage.aod r19, defpackage.awy r20, defpackage.anx r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aob.b(aod, awy, anx):aoa");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final aod c(aod aodVar, anx anxVar, awy awyVar) {
        long millis;
        long epochMilli = Instant.now().toEpochMilli();
        aco acoVar = anxVar.a;
        int i = aodVar.a(acoVar).b;
        if (i == 5) {
            millis = TimeUnit.SECONDS.toMillis(anxVar.b);
        } else {
            millis = 3600000;
        }
        long j = millis + epochMilli;
        clo cloVarO = aor.a.o();
        String str = this.a;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        str.getClass();
        ((aor) cltVar).d = str;
        if (!cltVar.A()) {
            cloVarO.l();
        }
        ((aor) cloVarO.b).c = acoVar.a();
        clo cloVarO2 = aos.a.o();
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        clt cltVar2 = cloVarO2.b;
        aos aosVar = (aos) cltVar2;
        aosVar.e = sd.d(i);
        aosVar.b |= 4;
        if (!cltVar2.A()) {
            cloVarO2.l();
        }
        clt cltVar3 = cloVarO2.b;
        aos aosVar2 = (aos) cltVar3;
        aosVar2.b |= 1;
        aosVar2.c = epochMilli;
        if (!cltVar3.A()) {
            cloVarO2.l();
        }
        aos aosVar3 = (aos) cloVarO2.b;
        int i2 = 2;
        aosVar3.b |= 2;
        aosVar3.d = j;
        aos aosVar4 = (aos) cloVarO2.i();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        aor aorVar = (aor) cloVarO.b;
        aosVar4.getClass();
        aorVar.e = aosVar4;
        aorVar.b |= 1;
        aor aorVar2 = (aor) cloVarO.i();
        try {
            ((cgx) ((bgc) awyVar.b).b(new adz(aorVar2, i2), awyVar.a)).s();
            aoc aocVar = new aoc(aodVar);
            int i3 = bzs.d;
            bzo bzoVar = new bzo();
            bzoVar.h(aocVar.e);
            bzoVar.g(aorVar2);
            aocVar.e = bzoVar.f();
            return aocVar.a();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalArgumentException("Update of recent fix data failed", e2);
        }
    }
}
