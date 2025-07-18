package defpackage;

import android.accounts.Account;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uey {
    private final ujk a;

    public uey(ujk ujkVar) {
        this.a = ujkVar;
    }

    public final zyd a(final int i) {
        return zuz.h(this.a.c(), new zvi() { // from class: uex
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws ufn {
                acij acijVar = (acij) obj;
                abyl abylVar = acijVar.d;
                int i2 = i;
                Integer numValueOf = Integer.valueOf(i2);
                acig acigVar = abylVar.containsKey(numValueOf) ? (acig) abylVar.get(numValueOf) : null;
                Account account = acigVar != null ? new Account(acigVar.c, acigVar.d) : null;
                if (account != null) {
                    return zxn.h(account);
                }
                acij acijVar2 = acij.a;
                if (acijVar == acijVar2 || (acijVar2 != null && acijVar.getClass() == acijVar2.getClass() && abza.a.a(acijVar.getClass()).k(acijVar, acijVar2))) {
                    throw new ufn();
                }
                int i3 = acijVar.c;
                if (i2 == i3) {
                    throw new ufn();
                }
                if (i2 < 0) {
                    throw new ufn();
                }
                if (i2 > 100) {
                    throw new ufn();
                }
                if (i2 > i3) {
                    throw new ufn();
                }
                throw new ufn();
            }
        }, zwk.a);
    }

    public final zyd b(final Account account) {
        final AtomicInteger atomicInteger = new AtomicInteger();
        yqi yqiVar = new yqi() { // from class: uev
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                Integer numValueOf;
                acij acijVar = (acij) obj;
                acii aciiVar = new acii();
                aciiVar.B(acijVar);
                Account account2 = account;
                String str = account2.name;
                String str2 = account2.type;
                Iterator it = DesugarCollections.unmodifiableMap(acijVar.d).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        numValueOf = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    numValueOf = (Integer) entry.getKey();
                    numValueOf.intValue();
                    acig acigVar = (acig) entry.getValue();
                    if (acigVar.c.equals(str) && acigVar.d.equals(str2)) {
                        break;
                    }
                }
                if (numValueOf == null) {
                    int i = acijVar.c;
                    numValueOf = Integer.valueOf(i);
                    acig acigVar2 = acig.a;
                    acif acifVar = new acif();
                    String str3 = account2.name;
                    if ((acifVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acifVar.y();
                    }
                    acig acigVar3 = (acig) acifVar.b;
                    str3.getClass();
                    acigVar3.b |= 1;
                    acigVar3.c = str3;
                    String str4 = account2.type;
                    if ((acifVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acifVar.y();
                    }
                    acig acigVar4 = (acig) acifVar.b;
                    str4.getClass();
                    acigVar4.b |= 2;
                    acigVar4.d = str4;
                    acig acigVar5 = (acig) acifVar.v();
                    numValueOf.getClass();
                    int i2 = i + 1;
                    if ((aciiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        aciiVar.y();
                    }
                    acij acijVar2 = (acij) aciiVar.b;
                    acijVar2.b |= 1;
                    acijVar2.c = i2;
                    numValueOf.getClass();
                    acigVar5.getClass();
                    if ((aciiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        aciiVar.y();
                    }
                    acij acijVar3 = (acij) aciiVar.b;
                    abyl abylVar = acijVar3.d;
                    if (!abylVar.b) {
                        acijVar3.d = abylVar.a();
                    }
                    acijVar3.d.put(Integer.valueOf(i), acigVar5);
                }
                atomicInteger.set(numValueOf.intValue());
                return (acij) aciiVar.v();
            }
        };
        ujk ujkVar = this.a;
        zwk zwkVar = zwk.a;
        return zuz.g(ujkVar.a(yqiVar, zwkVar), new yqi() { // from class: uew
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return Integer.valueOf(atomicInteger.get());
            }
        }, zwkVar);
    }
}
