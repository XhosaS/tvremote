package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eql implements Iterable, eqw, eqs {
    final SortedMap a;
    final Map b;

    public eql() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    public final int b() {
        return this.a.size();
    }

    public final int c() {
        SortedMap sortedMap = this.a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.eqw
    public final eqw cK(String str, epp eppVar, List list) {
        String str2;
        String str3;
        eql eqlVar;
        double d;
        double dC;
        String strI;
        eqp eqpVar;
        double dC2;
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str)) {
            str2 = "toString";
            str3 = "filter";
            eqlVar = this;
        } else {
            str3 = "filter";
            if (!"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
                return eqq.a(this, new era(str), eppVar, list);
            }
            eqlVar = this;
            str2 = "toString";
        }
        switch (str.hashCode()) {
            case -1776922004:
                String str4 = str2;
                if (str.equals(str4)) {
                    epq.g(str4, 0, list);
                    return new era(eqlVar.j(","));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    eqw eqwVarD = eqlVar.d();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            eqw eqwVarA = eppVar.b.a(eppVar, (eqw) it.next());
                            if (eqwVarA instanceof eqn) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            eql eqlVar2 = (eql) eqwVarD;
                            int iC = eqlVar2.c();
                            if (eqwVarA instanceof eql) {
                                eql eqlVar3 = (eql) eqwVarA;
                                Iterator itK = eqlVar3.k();
                                while (itK.hasNext()) {
                                    Integer num = (Integer) itK.next();
                                    eqlVar2.p(num.intValue() + iC, eqlVar3.e(num.intValue()));
                                }
                            } else {
                                eqlVar2.p(iC, eqwVarA);
                            }
                        }
                    }
                    return eqwVarD;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                String str5 = str3;
                if (str.equals(str5)) {
                    epq.g(str5, 1, list);
                    eqw eqwVarA2 = eppVar.b.a(eppVar, (eqw) list.get(0));
                    if (!(eqwVarA2 instanceof eqv)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (eqlVar.b() == 0) {
                        return new eql();
                    }
                    eqw eqwVarD2 = eqlVar.d();
                    eql eqlVarA = eri.a(eqlVar, eppVar, (eqv) eqwVarA2, null, true);
                    eql eqlVar4 = new eql();
                    Iterator itK2 = eqlVarA.k();
                    while (itK2.hasNext()) {
                        eqlVar4.p(eqlVar4.c(), ((eql) eqwVarD2).e(((Integer) itK2.next()).intValue()));
                    }
                    return eqlVar4;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals("reduce")) {
                    return eri.b(eqlVar, eppVar, list, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals("splice")) {
                    if (list.isEmpty()) {
                        return new eql();
                    }
                    eqw eqwVar = (eqw) list.get(0);
                    ere ereVar = eppVar.b;
                    int iA = (int) epq.a(ereVar.a(eppVar, eqwVar).h().doubleValue());
                    if (iA < 0) {
                        iA = Math.max(0, iA + eqlVar.c());
                    } else if (iA > eqlVar.c()) {
                        iA = eqlVar.c();
                    }
                    int iC2 = eqlVar.c();
                    eql eqlVar5 = new eql();
                    if (list.size() > 1) {
                        int iMax = Math.max(0, (int) epq.a(ereVar.a(eppVar, (eqw) list.get(1)).h().doubleValue()));
                        if (iMax > 0) {
                            for (int i = iA; i < Math.min(iC2, iA + iMax); i++) {
                                eqlVar5.p(eqlVar5.c(), eqlVar.e(iA));
                                eqlVar.o(iA);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i2 = 2; i2 < list.size(); i2++) {
                                eqw eqwVarA3 = ereVar.a(eppVar, (eqw) list.get(i2));
                                if (eqwVarA3 instanceof eqn) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                int i3 = (iA + i2) - 2;
                                if (i3 < 0) {
                                    throw new IllegalArgumentException(a.b(i3, "Invalid value index: "));
                                }
                                if (i3 >= eqlVar.c()) {
                                    eqlVar.p(i3, eqwVarA3);
                                } else {
                                    SortedMap sortedMap = eqlVar.a;
                                    for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i3; iIntValue--) {
                                        Integer numValueOf = Integer.valueOf(iIntValue);
                                        eqw eqwVar2 = (eqw) sortedMap.get(numValueOf);
                                        if (eqwVar2 != null) {
                                            eqlVar.p(iIntValue + 1, eqwVar2);
                                            sortedMap.remove(numValueOf);
                                        }
                                    }
                                    eqlVar.p(i3, eqwVarA3);
                                }
                            }
                        }
                    } else {
                        while (iA < iC2) {
                            eqlVar5.p(eqlVar5.c(), eqlVar.e(iA));
                            eqlVar.p(iA, null);
                            iA++;
                        }
                    }
                    return eqlVar5;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                if (str.equals("forEach")) {
                    epq.g("forEach", 1, list);
                    eqw eqwVarA4 = eppVar.b.a(eppVar, (eqw) list.get(0));
                    if (!(eqwVarA4 instanceof eqv)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (eqlVar.b() == 0) {
                        return eqw.f;
                    }
                    eri.a(eqlVar, eppVar, (eqv) eqwVarA4, null, null);
                    return eqw.f;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    epq.i("lastIndexOf", 2, list);
                    eqw eqwVarA5 = eqw.f;
                    if (!list.isEmpty()) {
                        eqwVarA5 = eppVar.b.a(eppVar, (eqw) list.get(0));
                    }
                    int iC3 = eqlVar.c() - 1;
                    if (list.size() > 1) {
                        eqw eqwVarA6 = eppVar.b.a(eppVar, (eqw) list.get(1));
                        dC = Double.isNaN(eqwVarA6.h().doubleValue()) ? eqlVar.c() - 1 : epq.a(eqwVarA6.h().doubleValue());
                        d = 0.0d;
                        if (dC < 0.0d) {
                            dC += eqlVar.c();
                        }
                    } else {
                        d = 0.0d;
                        dC = iC3;
                    }
                    if (dC < d) {
                        return new eqo(Double.valueOf(-1.0d));
                    }
                    for (int iMin = (int) Math.min(eqlVar.c(), dC); iMin >= 0; iMin--) {
                        if (eqlVar.r(iMin) && epq.k(eqlVar.e(iMin), eqwVarA5)) {
                            return new eqo(Double.valueOf(iMin));
                        }
                    }
                    return new eqo(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals("unshift")) {
                    if (!list.isEmpty()) {
                        eql eqlVar6 = new eql();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            eqw eqwVarA7 = eppVar.b.a(eppVar, (eqw) it2.next());
                            if (eqwVarA7 instanceof eqn) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            eqlVar6.p(eqlVar6.c(), eqwVarA7);
                        }
                        int iC4 = eqlVar6.c();
                        Iterator itK3 = eqlVar.k();
                        while (itK3.hasNext()) {
                            Integer num2 = (Integer) itK3.next();
                            eqlVar6.p(num2.intValue() + iC4, eqlVar.e(num2.intValue()));
                        }
                        eqlVar.n();
                        Iterator itK4 = eqlVar6.k();
                        while (itK4.hasNext()) {
                            Integer num3 = (Integer) itK4.next();
                            eqlVar.p(num3.intValue(), eqlVar6.e(num3.intValue()));
                        }
                    }
                    return new eqo(Double.valueOf(eqlVar.c()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    epq.g("map", 1, list);
                    eqw eqwVarA8 = eppVar.b.a(eppVar, (eqw) list.get(0));
                    if (eqwVarA8 instanceof eqv) {
                        return eqlVar.c() == 0 ? new eql() : eri.a(eqlVar, eppVar, (eqv) eqwVarA8, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    epq.g("pop", 0, list);
                    int iC5 = eqlVar.c();
                    if (iC5 == 0) {
                        return eqw.f;
                    }
                    int i4 = iC5 - 1;
                    eqw eqwVarE = eqlVar.e(i4);
                    eqlVar.o(i4);
                    return eqwVarE;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    epq.i("join", 1, list);
                    if (eqlVar.c() == 0) {
                        return eqw.m;
                    }
                    if (list.isEmpty()) {
                        strI = ",";
                    } else {
                        eqw eqwVarA9 = eppVar.b.a(eppVar, (eqw) list.get(0));
                        strI = ((eqwVarA9 instanceof equ) || (eqwVarA9 instanceof erb)) ? "" : eqwVarA9.i();
                    }
                    return new era(eqlVar.j(strI));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals("push")) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            eqlVar.p(eqlVar.c(), eppVar.b.a(eppVar, (eqw) it3.next()));
                        }
                    }
                    return new eqo(Double.valueOf(eqlVar.c()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    epq.g("some", 1, list);
                    eqw eqwVarA10 = eppVar.b.a(eppVar, (eqw) list.get(0));
                    if (!(eqwVarA10 instanceof eqp)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (eqlVar.c() == 0) {
                        return eqw.l;
                    }
                    eqp eqpVar2 = (eqp) eqwVarA10;
                    Iterator itK5 = eqlVar.k();
                    while (itK5.hasNext()) {
                        int iIntValue2 = ((Integer) itK5.next()).intValue();
                        if (eqlVar.r(iIntValue2) && eqpVar2.a(eppVar, Arrays.asList(eqlVar.e(iIntValue2), new eqo(Double.valueOf(iIntValue2)), eqlVar)).g().booleanValue()) {
                            return eqw.k;
                        }
                    }
                    return eqw.l;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals("sort")) {
                    epq.i("sort", 1, list);
                    if (eqlVar.c() >= 2) {
                        List listM = eqlVar.m();
                        if (list.isEmpty()) {
                            eqpVar = null;
                        } else {
                            eqw eqwVarA11 = eppVar.b.a(eppVar, (eqw) list.get(0));
                            if (!(eqwVarA11 instanceof eqp)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            eqpVar = (eqp) eqwVarA11;
                        }
                        Collections.sort(listM, new erh(eqpVar, eppVar));
                        eqlVar.n();
                        Iterator it4 = listM.iterator();
                        int i5 = 0;
                        while (it4.hasNext()) {
                            eqlVar.p(i5, (eqw) it4.next());
                            i5++;
                        }
                    }
                    return eqlVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    epq.g("every", 1, list);
                    eqw eqwVarA12 = eppVar.b.a(eppVar, (eqw) list.get(0));
                    if (eqwVarA12 instanceof eqv) {
                        return eqlVar.c() == 0 ? eqw.k : eri.a(eqlVar, eppVar, (eqv) eqwVarA12, false, true).c() != eqlVar.c() ? eqw.l : eqw.k;
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    epq.g("shift", 0, list);
                    if (eqlVar.c() == 0) {
                        return eqw.f;
                    }
                    eqw eqwVarE2 = eqlVar.e(0);
                    eqlVar.o(0);
                    return eqwVarE2;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    epq.i("slice", 2, list);
                    if (list.isEmpty()) {
                        return eqlVar.d();
                    }
                    double dC3 = eqlVar.c();
                    eqw eqwVar3 = (eqw) list.get(0);
                    ere ereVar2 = eppVar.b;
                    double dA = epq.a(ereVar2.a(eppVar, eqwVar3).h().doubleValue());
                    double dMax = dA < 0.0d ? Math.max(dA + dC3, 0.0d) : Math.min(dA, dC3);
                    if (list.size() == 2) {
                        double dA2 = epq.a(ereVar2.a(eppVar, (eqw) list.get(1)).h().doubleValue());
                        dC3 = dA2 < 0.0d ? Math.max(dC3 + dA2, 0.0d) : Math.min(dC3, dA2);
                    }
                    eql eqlVar7 = new eql();
                    for (int i6 = (int) dMax; i6 < dC3; i6++) {
                        eqlVar7.p(eqlVar7.c(), eqlVar.e(i6));
                    }
                    return eqlVar7;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return eri.b(eqlVar, eppVar, list, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    epq.g("reverse", 0, list);
                    int iC6 = eqlVar.c();
                    if (iC6 != 0) {
                        for (int i7 = 0; i7 < iC6 / 2; i7++) {
                            if (eqlVar.r(i7)) {
                                eqw eqwVarE3 = eqlVar.e(i7);
                                eqlVar.p(i7, null);
                                int i8 = (iC6 - 1) - i7;
                                if (eqlVar.r(i8)) {
                                    eqlVar.p(i7, eqlVar.e(i8));
                                }
                                eqlVar.p(i8, eqwVarE3);
                            }
                        }
                    }
                    return eqlVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    epq.i("indexOf", 2, list);
                    eqw eqwVarA13 = eqw.f;
                    if (!list.isEmpty()) {
                        eqwVarA13 = eppVar.b.a(eppVar, (eqw) list.get(0));
                    }
                    if (list.size() > 1) {
                        double dA3 = epq.a(eppVar.b.a(eppVar, (eqw) list.get(1)).h().doubleValue());
                        if (dA3 >= eqlVar.c()) {
                            return new eqo(Double.valueOf(-1.0d));
                        }
                        dC2 = dA3 < 0.0d ? eqlVar.c() + dA3 : dA3;
                    } else {
                        dC2 = 0.0d;
                    }
                    Iterator itK6 = eqlVar.k();
                    while (itK6.hasNext()) {
                        int iIntValue3 = ((Integer) itK6.next()).intValue();
                        double d2 = iIntValue3;
                        if (d2 >= dC2 && epq.k(eqlVar.e(iIntValue3), eqwVarA13)) {
                            return new eqo(Double.valueOf(d2));
                        }
                    }
                    return new eqo(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // defpackage.eqw
    public final eqw d() {
        eql eqlVar = new eql();
        for (Map.Entry entry : this.a.entrySet()) {
            if (entry.getValue() instanceof eqs) {
                eqlVar.a.put((Integer) entry.getKey(), (eqw) entry.getValue());
            } else {
                eqlVar.a.put((Integer) entry.getKey(), ((eqw) entry.getValue()).d());
            }
        }
        return eqlVar;
    }

    public final eqw e(int i) {
        eqw eqwVar;
        if (i < c()) {
            return (!r(i) || (eqwVar = (eqw) this.a.get(Integer.valueOf(i))) == null) ? f : eqwVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eql)) {
            return false;
        }
        eql eqlVar = (eql) obj;
        if (c() != eqlVar.c()) {
            return false;
        }
        SortedMap sortedMap = this.a;
        if (sortedMap.isEmpty()) {
            return eqlVar.a.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!e(iIntValue).equals(eqlVar.e(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.eqs
    public final eqw f(String str) {
        eqw eqwVar;
        return "length".equals(str) ? new eqo(Double.valueOf(c())) : (!s(str) || (eqwVar = (eqw) this.b.get(str)) == null) ? f : eqwVar;
    }

    @Override // defpackage.eqw
    public final Boolean g() {
        return true;
    }

    @Override // defpackage.eqw
    public final Double h() {
        SortedMap sortedMap = this.a;
        return sortedMap.size() == 1 ? e(0).h() : sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.eqw
    public final String i() {
        return j(",");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new eqk(this);
    }

    public final String j(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= c()) {
                    break;
                }
                eqw eqwVarE = e(i);
                sb.append(str2);
                if (!(eqwVarE instanceof erb) && !(eqwVarE instanceof equ)) {
                    sb.append(eqwVarE.i());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator k() {
        return this.a.keySet().iterator();
    }

    @Override // defpackage.eqw
    public final Iterator l() {
        return new eqj(this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    public final List m() {
        ArrayList arrayList = new ArrayList(c());
        for (int i = 0; i < c(); i++) {
            arrayList.add(e(i));
        }
        return arrayList;
    }

    public final void n() {
        this.a.clear();
    }

    public final void o(int i) {
        SortedMap sortedMap = this.a;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (sortedMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            sortedMap.put(numValueOf, eqw.f);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            eqw eqwVar = (eqw) sortedMap.get(numValueOf2);
            if (eqwVar != null) {
                sortedMap.put(Integer.valueOf(i - 1), eqwVar);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    public final void p(int i, eqw eqwVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.b(i, "Out of bounds index: "));
        }
        if (eqwVar == null) {
            this.a.remove(Integer.valueOf(i));
        } else {
            this.a.put(Integer.valueOf(i), eqwVar);
        }
    }

    @Override // defpackage.eqs
    public final void q(String str, eqw eqwVar) {
        if (eqwVar == null) {
            this.b.remove(str);
        } else {
            this.b.put(str, eqwVar);
        }
    }

    public final boolean r(int i) {
        if (i >= 0) {
            SortedMap sortedMap = this.a;
            if (i <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i));
            }
        }
        throw new IndexOutOfBoundsException(a.b(i, "Out of bounds index: "));
    }

    @Override // defpackage.eqs
    public final boolean s(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    public final String toString() {
        return j(",");
    }

    public eql(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                p(i, (eqw) list.get(i));
            }
        }
    }
}
