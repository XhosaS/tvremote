package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnc extends gnd {
    private final Object a;
    private final String b;

    public gnc(Object obj, String str) {
        Collection collectionP;
        this.a = obj;
        this.b = str;
        gng gngVar = new gng(str + " value: " + obj);
        StackTraceElement[] stackTrace = gngVar.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int iJ = ykn.j(length + (-2), 0);
        if (iJ < 0) {
            throw new IllegalArgumentException(a.cd(iJ, "Requested element count ", " is less than zero."));
        }
        if (iJ == 0) {
            collectionP = yhb.a;
        } else if (iJ >= length) {
            collectionP = yfm.aX(stackTrace);
        } else if (iJ == 1) {
            collectionP = yfm.p(stackTrace[length - 1]);
        } else {
            ArrayList arrayList = new ArrayList(iJ);
            for (int i = length - iJ; i < length; i++) {
                arrayList.add(stackTrace[i]);
            }
            collectionP = arrayList;
        }
        gngVar.setStackTrace((StackTraceElement[]) collectionP.toArray(new StackTraceElement[0]));
    }

    @Override // defpackage.gnd
    public final Object b() {
        return null;
    }

    @Override // defpackage.gnd
    public final gnd a(String str, yjv yjvVar) {
        return this;
    }
}
