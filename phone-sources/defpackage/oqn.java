package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import j$.time.Instant;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqn {
    public static final ImmutableSet a = ImmutableSet.of(ngj.STARTUP, ngj.TELEDOCTOR);
    public final String b;
    public final ngl c;
    public final tst d;
    public final oqk e;
    public boolean f;
    private final ImmutableSet g;
    private final Random h;
    private String i;

    public oqn(String str, ngl nglVar, ngy ngyVar, oqk oqkVar, ImmutableSet immutableSet) {
        this.f = true;
        sij.x(!TextUtils.isEmpty(str), "Given String is empty or null");
        sij.x(true, "Sampling rate should not exceed 1.0");
        this.b = str;
        nglVar.getClass();
        this.c = nglVar;
        this.d = tst.h(ngyVar);
        this.e = oqkVar;
        immutableSet.getClass();
        this.g = immutableSet;
        this.f = false;
        this.h = new Random();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(oqp oqpVar) {
        orc orcVar;
        long j;
        oqo oqoVar = new oqo(oqpVar);
        oqoVar.g = this;
        oqp oqpVarA = oqoVar.a();
        if (this.g.contains(oqpVarA.a)) {
            String str = this.b;
            int i = 0;
            while (true) {
                if (i >= oqpVarA.b().size()) {
                    orcVar = null;
                    break;
                }
                orcVar = (orc) oqpVarA.b().get(i);
                if (orcVar.d.equals(str)) {
                    break;
                }
                i++;
            }
            if (orcVar == null) {
                j = 0;
            } else {
                ord ordVar = orcVar.e;
                if (ordVar == null) {
                    ordVar = ord.a;
                }
                j = ordVar.d;
            }
            if (j <= Instant.now().toEpochMilli()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d A[Catch: all -> 0x01b7, TryCatch #3 {all -> 0x01b7, blocks: (B:46:0x0127, B:48:0x012d, B:50:0x0143), top: B:117:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c A[PHI: r2
  0x015c: PHI (r2v6 oqp) = (r2v5 oqp), (r2v8 oqp) binds: [B:47:0x012b, B:53:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174 A[Catch: all -> 0x01b5, TryCatch #1 {all -> 0x01b5, blocks: (B:63:0x015d, B:68:0x016e, B:70:0x0174, B:71:0x0177, B:90:0x01c0, B:95:0x01d1, B:97:0x01d7, B:98:0x01da, B:99:0x01ea), top: B:114:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d7 A[Catch: all -> 0x01b5, TryCatch #1 {all -> 0x01b5, blocks: (B:63:0x015d, B:68:0x016e, B:70:0x0174, B:71:0x0177, B:90:0x01c0, B:95:0x01d1, B:97:0x01d7, B:98:0x01da, B:99:0x01ea), top: B:114:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.oqm b(defpackage.oqp r19, defpackage.oxe r20, defpackage.oqk r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqn.b(oqp, oxe, oqk):oqm");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final oqp c(oqp oqpVar, oqk oqkVar, oxe oxeVar) {
        long millis;
        long epochMilli = Instant.now().toEpochMilli();
        ngl nglVar = oqkVar.a;
        int i = oqpVar.a(nglVar).b;
        if (i == 5) {
            millis = TimeUnit.SECONDS.toMillis(oqkVar.b);
        } else {
            millis = 3600000;
        }
        long j = millis + epochMilli;
        vtw vtwVarM = orc.a.m();
        String str = this.b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        str.getClass();
        ((orc) vucVar).d = str;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((orc) vtwVarM.b).c = nglVar.a();
        vtw vtwVarM2 = ord.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ord ordVar = (ord) vtwVarM2.b;
        ordVar.e = a.aJ(i);
        ordVar.b |= 4;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar2 = vtwVarM2.b;
        ord ordVar2 = (ord) vucVar2;
        ordVar2.b |= 1;
        ordVar2.c = epochMilli;
        if (!vucVar2.A()) {
            vtwVarM2.u();
        }
        ord ordVar3 = (ord) vtwVarM2.b;
        ordVar3.b |= 2;
        ordVar3.d = j;
        ord ordVar4 = (ord) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        orc orcVar = (orc) vtwVarM.b;
        ordVar4.getClass();
        orcVar.e = ordVar4;
        orcVar.b |= 1;
        orc orcVar2 = (orc) vtwVarM.r();
        try {
            ((ufb) ((smc) oxeVar.a).b(new nbe(orcVar2, 13), oxeVar.b)).s();
            oqo oqoVar = new oqo(oqpVar);
            ImmutableList.Builder builder = ImmutableList.builder();
            builder.addAll((Iterable) oqoVar.e);
            builder.add((ImmutableList.Builder) orcVar2);
            oqoVar.e = builder.build();
            return oqoVar.a();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalArgumentException("Update of recent fix data failed", e);
        }
    }
}
