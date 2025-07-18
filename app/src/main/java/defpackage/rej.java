package defpackage;

import com.google.common.collect.Lists;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rej {
    private static final yrl d = yrl.b(new ypz('/')).a();
    public static final rei a = new ref();
    public static final rei b = new reg();
    public static final rei c = new reh();

    public static List b(String str) {
        return Lists.c(d.g(str), new yqi() { // from class: ree
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return aagg.a((String) obj);
            }
        });
    }

    public static void c(rei reiVar, abyq abyqVar) {
        String strA = reiVar.a(abyqVar);
        String strB = reiVar.b(abyqVar);
        if (!strA.isEmpty() || strB.isEmpty()) {
            reiVar.c(abyqVar, null);
        } else {
            reiVar.c(abyqVar, aagg.a(strB));
        }
        reiVar.d(abyqVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zpv a(defpackage.zpv r6) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rej.a(zpv):zpv");
    }
}
