package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tko {
    public final tks a(acxn acxnVar) {
        acxnVar.getClass();
        if (acxnVar.d == 0) {
            throw new IllegalArgumentException("LoggingNode nodeId must be set to a non-zero value");
        }
        acxt acxtVar = acxnVar.c;
        if (acxtVar == null) {
            acxtVar = acxt.a;
        }
        acxtVar.getClass();
        if (tkt.b(acxtVar) != null && tkt.a(acxtVar) != null) {
            addu adduVarB = tkt.b(acxtVar);
            adduVarB.getClass();
            return new tkp(acxnVar, adduVarB);
        }
        if (tkt.b(acxtVar) != null) {
            addu adduVarB2 = tkt.b(acxtVar);
            adduVarB2.getClass();
            return new tkn(adduVarB2, acxnVar);
        }
        if (tkt.a(acxtVar) == null) {
            return new tkq(acxnVar);
        }
        adcp adcpVarA = tkt.a(acxtVar);
        adcpVarA.getClass();
        return new tkr(adcpVarA, acxnVar);
    }

    public final List b(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(agqq.i(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tks.b.a((acxn) it.next()));
        }
        return arrayList;
    }
}
