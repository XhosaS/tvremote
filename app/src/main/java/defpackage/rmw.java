package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmw {
    public static final rgl a = new rgl();
    private static Boolean e = null;
    public final rfr b;
    public final Uri c;
    public final String d;
    private final String f;
    private final boolean g;

    public rmw(rfr rfrVar, String str, String str2, boolean z) {
        this.b = rfrVar;
        this.d = str;
        this.f = str2;
        this.g = z;
        Context context = rfrVar.d;
        int i = uem.b;
        uel uelVar = new uel(context);
        uem.b("phenotype");
        uelVar.c = "phenotype";
        uelVar.b(str2 + "/" + str + ".pb");
        if (z) {
            int i2 = mhv.a;
            uem.a("directboot-files");
            uelVar.b = "directboot-files";
        }
        this.c = uelVar.a();
    }

    static rmy b(rgu rguVar) {
        rmy rmyVar = rmy.a;
        rmx rmxVar = new rmx();
        if (rguVar == null) {
            return (rmy) rmxVar.v();
        }
        for (rgx rgxVar : rguVar.f) {
            rna rnaVar = rna.a;
            rmz rmzVar = new rmz();
            String str = rgxVar.e;
            if ((rmzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rmzVar.y();
            }
            rna rnaVar2 = (rna) rmzVar.b;
            str.getClass();
            rnaVar2.b |= 1;
            rnaVar2.e = str;
            int i = rgxVar.c;
            int iA = rgw.a(i);
            if (iA == 0) {
                throw null;
            }
            int i2 = iA - 1;
            if (i2 == 0) {
                long jLongValue = i == 1 ? ((Long) rgxVar.d).longValue() : 0L;
                if ((rmzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rmzVar.y();
                }
                rna rnaVar3 = (rna) rmzVar.b;
                rnaVar3.c = 2;
                rnaVar3.d = Long.valueOf(jLongValue);
            } else if (i2 == 1) {
                boolean zBooleanValue = i == 2 ? ((Boolean) rgxVar.d).booleanValue() : false;
                if ((rmzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rmzVar.y();
                }
                rna rnaVar4 = (rna) rmzVar.b;
                rnaVar4.c = 3;
                rnaVar4.d = Boolean.valueOf(zBooleanValue);
            } else if (i2 == 2) {
                double dDoubleValue = i == 3 ? ((Double) rgxVar.d).doubleValue() : 0.0d;
                if ((rmzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rmzVar.y();
                }
                rna rnaVar5 = (rna) rmzVar.b;
                rnaVar5.c = 4;
                rnaVar5.d = Double.valueOf(dDoubleValue);
            } else if (i2 == 3) {
                String str2 = i == 4 ? (String) rgxVar.d : "";
                if ((rmzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rmzVar.y();
                }
                rna rnaVar6 = (rna) rmzVar.b;
                str2.getClass();
                rnaVar6.c = 5;
                rnaVar6.d = str2;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("No known flag type");
                }
                abvo abvoVar = i == 5 ? (abvo) rgxVar.d : abvo.b;
                if ((rmzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rmzVar.y();
                }
                rna rnaVar7 = (rna) rmzVar.b;
                abvoVar.getClass();
                rnaVar7.c = 6;
                rnaVar7.d = abvoVar;
            }
            rna rnaVar8 = (rna) rmzVar.v();
            if ((rmxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rmxVar.y();
            }
            rmy rmyVar2 = (rmy) rmxVar.b;
            rnaVar8.getClass();
            abxs abxsVar = rmyVar2.g;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                rmyVar2.g = abxsVar.d(size + size);
            }
            rmyVar2.g.add(rnaVar8);
        }
        String str3 = rguVar.e;
        if ((rmxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rmxVar.y();
        }
        rmy rmyVar3 = (rmy) rmxVar.b;
        str3.getClass();
        rmyVar3.b = 4 | rmyVar3.b;
        rmyVar3.e = str3;
        String str4 = rguVar.c;
        if ((rmxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rmxVar.y();
        }
        rmy rmyVar4 = (rmy) rmxVar.b;
        str4.getClass();
        rmyVar4.b = 1 | rmyVar4.b;
        rmyVar4.c = str4;
        long j = rguVar.i;
        if ((rmxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rmxVar.y();
        }
        rmy rmyVar5 = (rmy) rmxVar.b;
        rmyVar5.b |= 8;
        rmyVar5.f = j;
        if ((rguVar.b & 2) != 0) {
            abvo abvoVar2 = rguVar.d;
            if ((rmxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rmxVar.y();
            }
            rmy rmyVar6 = (rmy) rmxVar.b;
            abvoVar2.getClass();
            rmyVar6.b |= 2;
            rmyVar6.d = abvoVar2;
        }
        return (rmy) rmxVar.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.rmv a() {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmw.a():rmv");
    }

    final zyd c(String str) {
        rfr rfrVar = this.b;
        return zuz.g(rfrVar.b().c(this.d, str), new yqi() { // from class: rmq
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return rmw.b((rgu) obj);
            }
        }, rfrVar.e());
    }

    public final zyd d(final rmy rmyVar) {
        return zxn.k(new Callable() { // from class: rmr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ufd ufdVar = new ufd();
                rmw rmwVar = this.a;
                rmy rmyVar2 = rmyVar;
                try {
                    ueg uegVarC = rmwVar.b.c();
                    Uri uri = rmwVar.c;
                    uhm uhmVar = new uhm(rmyVar2);
                    uhmVar.a = new ufd[]{ufdVar};
                    return null;
                } catch (IOException | RuntimeException e2) {
                    rmw.a.a(Level.WARNING, rmwVar.b.e(), e2, "Failed to update snapshot for %s flags may be stale.", rmwVar.d);
                    return null;
                }
            }
        }, this.b.e());
    }

    final boolean e() {
        rni rniVar = this.b.f;
        boolean z = this.g;
        aags aagsVar = aags.FILE;
        if (z) {
            rhu rhuVarB = rniVar.b();
            return rhuVarB.e && new abxl(rhuVarB.i, rhu.a).contains(aagsVar);
        }
        rhr rhrVarA = rniVar.a();
        return rhrVarA.e && new abxl(rhrVarA.j, rhr.a).contains(aagsVar);
    }
}
