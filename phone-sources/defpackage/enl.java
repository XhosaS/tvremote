package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enl {
    public final ezy a;
    public final int b;
    public final ees c;
    public final long d;
    public final enn e;
    public final enj[] f;
    public ezf g;
    public enr h;
    public int i;
    public IOException j;
    public boolean k;
    public final iom l;
    private final int[] m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [fjg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [fjg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [fjg, java.lang.Object] */
    public enl(hin hinVar, ezy ezyVar, enr enrVar, iom iomVar, int i, int[] iArr, ezf ezfVar, int i2, ees eesVar, long j, boolean z, List list, enn ennVar) {
        enj[] enjVarArr;
        enz enzVar;
        dze dzeVar;
        fdp fhwVar;
        exo exoVar;
        this.a = ezyVar;
        this.h = enrVar;
        this.l = iomVar;
        this.m = iArr;
        this.g = ezfVar;
        this.b = i2;
        this.c = eesVar;
        this.i = i;
        this.d = j;
        enn ennVar2 = ennVar;
        this.e = ennVar2;
        long jC = enrVar.c(i);
        ArrayList arrayListC = c();
        this.f = new enj[ezfVar.t()];
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.f.length) {
            enz enzVar2 = (enz) arrayListC.get(ezfVar.q(i4));
            enq enqVarC = iomVar.C(enzVar2.f);
            enj[] enjVarArr2 = this.f;
            enq enqVar = enqVarC == null ? (enq) enzVar2.f.get(i3) : enqVarC;
            dze dzeVar2 = enzVar2.e;
            String str = dzeVar2.X;
            if (!eae.o(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    enzVar = enzVar2;
                    dzeVar = dzeVar2;
                    enjVarArr = enjVarArr2;
                    fhwVar = new fhb(hinVar.b, true != hinVar.a ? 3 : 1);
                } else if (Objects.equals(str, "image/jpeg")) {
                    enzVar = enzVar2;
                    dzeVar = dzeVar2;
                    enjVarArr = enjVarArr2;
                    fhwVar = new fez(1, 2);
                } else if (Objects.equals(str, "image/png")) {
                    fhwVar = new fez(3, (char[]) null);
                } else {
                    int i5 = true != z ? 0 : 4;
                    i5 = hinVar.a ? i5 : i5 | 32;
                    int i6 = fhw.b;
                    enjVarArr = enjVarArr2;
                    enzVar = enzVar2;
                    dzeVar = dzeVar2;
                    fhwVar = new fhw(hinVar.b, i5, null, list, ennVar2);
                }
                exoVar = new exo(fhwVar, i2, dzeVar);
                long j2 = jC;
                int i7 = i4;
                enjVarArr[i7] = new enj(j2, enzVar, enqVar, exoVar, 0L, enzVar.k());
                i4 = i7 + 1;
                ennVar2 = ennVar;
                jC = j2;
                i3 = 0;
            } else if (hinVar.a) {
                fhwVar = new fjb(hinVar.b.b(dzeVar2), dzeVar2);
            } else {
                enzVar = enzVar2;
                enjVarArr = enjVarArr2;
                exoVar = null;
                long j22 = jC;
                int i72 = i4;
                enjVarArr[i72] = new enj(j22, enzVar, enqVar, exoVar, 0L, enzVar.k());
                i4 = i72 + 1;
                ennVar2 = ennVar;
                jC = j22;
                i3 = 0;
            }
            enzVar = enzVar2;
            dzeVar = dzeVar2;
            enjVarArr = enjVarArr2;
            exoVar = new exo(fhwVar, i2, dzeVar);
            long j222 = jC;
            int i722 = i4;
            enjVarArr[i722] = new enj(j222, enzVar, enqVar, exoVar, 0L, enzVar.k());
            i4 = i722 + 1;
            ennVar2 = ennVar;
            jC = j222;
            i3 = 0;
        }
    }

    public static final long d(enj enjVar, exw exwVar, long j, long j2, long j3) {
        return exwVar != null ? exwVar.m() : edt.t(enjVar.f(j), j2, j3);
    }

    public final long a(long j) {
        enr enrVar = this.h;
        long j2 = enrVar.a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - edt.y(j2 + enrVar.f(this.i).a);
    }

    public final enj b(int i) {
        enj[] enjVarArr = this.f;
        enj enjVar = enjVarArr[i];
        enz enzVar = enjVar.a;
        enq enqVarC = this.l.C(enzVar.f);
        if (enqVarC == null || enqVarC.equals(enjVar.b)) {
            return enjVar;
        }
        enj enjVar2 = new enj(enjVar.d, enzVar, enqVarC, enjVar.f, enjVar.e, enjVar.c);
        enjVarArr[i] = enjVar2;
        return enjVar2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final ArrayList c() {
        ?? r0 = this.h.f(this.i).b;
        ArrayList arrayList = new ArrayList();
        for (int i : this.m) {
            arrayList.addAll(((enp) r0.get(i)).c);
        }
        return arrayList;
    }
}
