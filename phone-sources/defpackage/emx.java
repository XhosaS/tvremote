package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emx implements evx, ewy, exr {
    public static final /* synthetic */ int i = 0;
    private static final Pattern j = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern k = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private final iom A;
    final int a;
    public final eno b;
    public evw c;
    public enr f;
    public int g;
    public List h;
    private final emu l;
    private final efy m;
    private final epd n;
    private final long o;
    private final ezy p;
    private final exi q;
    private final emw[] r;
    private long v;
    private final ezp w;
    private final eph x;
    private final eph y;
    private final sew z;
    private boolean u = true;
    public exs[] d = new exs[0];
    public enm[] e = new enm[0];
    private final IdentityHashMap s = new IdentityHashMap();
    private ewz t = cme.u();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public emx(int i2, enr enrVar, iom iomVar, int i3, emu emuVar, efy efyVar, epd epdVar, eph ephVar, sew sewVar, eph ephVar2, long j2, ezy ezyVar, ezp ezpVar, pku pkuVar) throws NumberFormatException {
        int i4;
        int i5;
        List list;
        int i6;
        int[][] iArr;
        boolean[] zArr;
        dze[][] dzeVarArr;
        dze[] dzeVarArrV;
        boolean z;
        enu enuVarS;
        int i7;
        int i8;
        HashMap map;
        Integer num;
        this.a = i2;
        this.f = enrVar;
        this.A = iomVar;
        this.g = i3;
        this.l = emuVar;
        this.m = efyVar;
        this.n = epdVar;
        this.y = ephVar;
        this.z = sewVar;
        this.x = ephVar2;
        this.o = j2;
        this.p = ezyVar;
        this.w = ezpVar;
        boolean z2 = true;
        this.b = new eno(enrVar, pkuVar, ezpVar);
        int i9 = 0;
        gsf gsfVarF = enrVar.f(i3);
        this.h = gsfVarF.c;
        ?? r1 = gsfVarF.b;
        List list2 = this.h;
        int size = r1.size();
        HashMap mapNewHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            Long lValueOf = Long.valueOf(((enp) r1.get(i10)).a);
            Integer numValueOf = Integer.valueOf(i10);
            mapNewHashMapWithExpectedSize.put(lValueOf, numValueOf);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(numValueOf);
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        int i11 = 0;
        while (i11 < size) {
            enp enpVar = (enp) r1.get(i11);
            enu enuVarT = t(enpVar.e);
            enuVarT = enuVarT == null ? t(enpVar.f) : enuVarT;
            int iIntValue = (enuVarT == null || (num = (Integer) mapNewHashMapWithExpectedSize.get(Long.valueOf(Long.parseLong(enuVarT.b)))) == null) ? i11 : num.intValue();
            if (iIntValue != i11 || (enuVarS = s(enpVar.f, "urn:mpeg:dash:adaptation-set-switching:2016")) == null) {
                z = z2;
            } else {
                String[] strArrAt = edt.at(enuVarS.b, ",");
                int length = strArrAt.length;
                z = z2;
                int i12 = i9;
                while (i12 < length) {
                    Integer num2 = (Integer) mapNewHashMapWithExpectedSize.get(Long.valueOf(Long.parseLong(strArrAt[i12])));
                    if (num2 != null) {
                        enp enpVar2 = (enp) r1.get(num2.intValue());
                        i7 = i12;
                        i8 = size;
                        if (enpVar.b == enpVar2.b) {
                            if (enpVar.c.isEmpty() || enpVar2.c.isEmpty()) {
                                map = mapNewHashMapWithExpectedSize;
                            } else {
                                dze dzeVar = ((enz) enpVar.c.get(0)).e;
                                dze dzeVar2 = ((enz) enpVar2.c.get(0)).e;
                                map = mapNewHashMapWithExpectedSize;
                                if (!Objects.equals(dzeVar.N, dzeVar2.N) || dzeVar.P != dzeVar2.P) {
                                }
                            }
                            iIntValue = Math.min(iIntValue, num2.intValue());
                        }
                        i12 = i7 + 1;
                        size = i8;
                        mapNewHashMapWithExpectedSize = map;
                    } else {
                        i7 = i12;
                        i8 = size;
                    }
                    map = mapNewHashMapWithExpectedSize;
                    i12 = i7 + 1;
                    size = i8;
                    mapNewHashMapWithExpectedSize = map;
                }
            }
            int i13 = size;
            HashMap map2 = mapNewHashMapWithExpectedSize;
            if (iIntValue != i11) {
                List list3 = (List) sparseArray.get(i11);
                List list4 = (List) sparseArray.get(iIntValue);
                list4.addAll(list3);
                sparseArray.put(i11, list4);
                arrayList.remove(list3);
            }
            i11++;
            z2 = z;
            size = i13;
            mapNewHashMapWithExpectedSize = map2;
            i9 = 0;
        }
        boolean z3 = z2;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i14 = 0; i14 < size2; i14++) {
            int[] iArrAe = sfy.ae((Collection) arrayList.get(i14));
            iArr2[i14] = iArrAe;
            Arrays.sort(iArrAe);
        }
        boolean[] zArr2 = new boolean[size2];
        dze[][] dzeVarArr2 = new dze[size2][];
        int i15 = 0;
        int i16 = 0;
        while (i15 < size2) {
            int[] iArr3 = iArr2[i15];
            int length2 = iArr3.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list5 = ((enp) r1.get(iArr3[i17])).c;
                iArr = iArr2;
                for (int i18 = 0; i18 < list5.size(); i18++) {
                    if (!((enz) list5.get(i18)).h.isEmpty()) {
                        zArr2[i15] = z3;
                        i16++;
                        break;
                    }
                }
                i17++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i15];
            int length3 = iArr4.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length3) {
                    zArr = zArr2;
                    dzeVarArr = dzeVarArr2;
                    dzeVarArrV = new dze[0];
                    break;
                }
                int i20 = iArr4[i19];
                enp enpVar3 = (enp) r1.get(i20);
                List list6 = ((enp) r1.get(i20)).d;
                int[] iArr5 = iArr4;
                int i21 = 0;
                while (i21 < list6.size()) {
                    enu enuVar = (enu) list6.get(i21);
                    zArr = zArr2;
                    dzeVarArr = dzeVarArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(enuVar.a)) {
                        dzd dzdVar = new dzd();
                        dzdVar.d("application/cea-608");
                        dzdVar.a = enpVar3.a + ":cea608";
                        dzeVarArrV = v(enuVar, j, new dze(dzdVar));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(enuVar.a)) {
                        dzd dzdVar2 = new dzd();
                        dzdVar2.d("application/cea-708");
                        dzdVar2.a = enpVar3.a + ":cea708";
                        dzeVarArrV = v(enuVar, k, new dze(dzdVar2));
                        break;
                    }
                    i21++;
                    dzeVarArr2 = dzeVarArr;
                    zArr2 = zArr;
                }
                i19++;
                iArr4 = iArr5;
            }
            dzeVarArr[i15] = dzeVarArrV;
            if (dzeVarArrV.length != 0) {
                i16++;
            }
            i15++;
            dzeVarArr2 = dzeVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        dze[][] dzeVarArr3 = dzeVarArr2;
        int size3 = i16 + size2 + list2.size();
        eba[] ebaVarArr = new eba[size3];
        emw[] emwVarArr = new emw[size3];
        int i22 = 0;
        int i23 = 0;
        List list7 = r1;
        while (i22 < size2) {
            int[] iArr7 = iArr6[i22];
            ArrayList arrayList3 = new ArrayList();
            for (int i24 : iArr7) {
                arrayList3.addAll(((enp) list7.get(i24)).c);
            }
            int size4 = arrayList3.size();
            dze[] dzeVarArr4 = new dze[size4];
            int i25 = 0;
            while (i25 < size4) {
                dze dzeVar3 = ((enz) arrayList3.get(i25)).e;
                int i26 = size2;
                dzd dzdVar3 = new dzd(dzeVar3);
                dzdVar3.N = epdVar.a(dzeVar3);
                dzeVarArr4[i25] = new dze(dzdVar3);
                i25++;
                size2 = i26;
            }
            int i27 = size2;
            enp enpVar4 = (enp) list7.get(iArr7[0]);
            long j3 = enpVar4.a;
            String string = j3 != -1 ? Long.toString(j3) : a.cf(i22, "unset:");
            int i28 = i23 + 1;
            if (zArr3[i22]) {
                i4 = i28;
                i28 = i23 + 2;
            } else {
                i4 = -1;
            }
            if (dzeVarArr3[i22].length != 0) {
                i5 = i28;
                i28++;
            } else {
                i5 = -1;
            }
            u(emuVar, dzeVarArr4);
            ebaVarArr[i23] = new eba(string, dzeVarArr4);
            emw emwVar = new emw(enpVar4.b, 0, iArr7, i23, i4, i5, -1, ImmutableList.of());
            int i29 = i4;
            int i30 = i5;
            emwVarArr[i23] = emwVar;
            if (i29 != -1) {
                String strValueOf = String.valueOf(string);
                dzd dzdVar4 = new dzd();
                String strConcat = strValueOf.concat(":emsg");
                dzdVar4.a = strConcat;
                dzdVar4.d("application/x-emsg");
                list = list7;
                dze[] dzeVarArr5 = new dze[z3];
                dzeVarArr5[0] = new dze(dzdVar4);
                ebaVarArr[i29] = new eba(strConcat, dzeVarArr5);
                emwVarArr[i29] = new emw(5, 1, iArr7, i23, -1, -1, -1, ImmutableList.of());
                i6 = -1;
            } else {
                list = list7;
                i6 = -1;
            }
            if (i30 != i6) {
                String strValueOf2 = String.valueOf(string);
                emwVarArr[i30] = new emw(3, 1, iArr7, i23, -1, -1, -1, ImmutableList.copyOf(dzeVarArr3[i22]));
                u(emuVar, dzeVarArr3[i22]);
                ebaVarArr[i30] = new eba(strValueOf2.concat(":cc"), dzeVarArr3[i22]);
            }
            i22++;
            size2 = i27;
            list7 = list;
            i23 = i28;
            z3 = true;
        }
        int i31 = 0;
        while (i31 < list2.size()) {
            iom iomVar2 = (iom) list2.get(i31);
            dzd dzdVar5 = new dzd();
            dzdVar5.a = iomVar2.B();
            dzdVar5.d("application/x-emsg");
            ebaVarArr[i23] = new eba(iomVar2.B() + ":" + i31, new dze(dzdVar5));
            int i32 = i31;
            emwVarArr[i23] = new emw(5, 2, new int[0], -1, -1, -1, i32, ImmutableList.of());
            i31 = i32 + 1;
            i23++;
        }
        Pair pairCreate = Pair.create(new exi(ebaVarArr), emwVarArr);
        this.q = (exi) pairCreate.first;
        this.r = (emw[]) pairCreate.second;
    }

    private final int r(int i2, int[] iArr) {
        int i3 = iArr[i2];
        if (i3 == -1) {
            return -1;
        }
        emw[] emwVarArr = this.r;
        int i4 = emwVarArr[i3].e;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 == i4 && emwVarArr[i6].c == 0) {
                return i5;
            }
        }
        return -1;
    }

    private static enu s(List list, String str) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            enu enuVar = (enu) list.get(i2);
            if (str.equals(enuVar.a)) {
                return enuVar;
            }
        }
        return null;
    }

    private static enu t(List list) {
        return s(list, "http://dashif.org/guidelines/trickmode");
    }

    private static void u(emu emuVar, dze[] dzeVarArr) {
        for (int i2 = 0; i2 < dzeVarArr.length; i2++) {
            dzeVarArr[i2] = emuVar.a(dzeVarArr[i2]);
        }
    }

    private static dze[] v(enu enuVar, Pattern pattern, dze dzeVar) throws NumberFormatException {
        String str = enuVar.b;
        if (str != null) {
            String[] strArrAt = edt.at(str, ";");
            dze[] dzeVarArr = new dze[strArrAt.length];
            for (int i2 = 0; i2 < strArrAt.length; i2++) {
                Matcher matcher = pattern.matcher(strArrAt[i2]);
                if (matcher.matches()) {
                    int i3 = Integer.parseInt(matcher.group(1));
                    dzd dzdVar = new dzd(dzeVar);
                    dzdVar.a = dzeVar.K + ":" + i3;
                    dzdVar.J = i3;
                    dzdVar.d = matcher.group(2);
                    dzeVarArr[i2] = new dze(dzdVar);
                }
            }
            return dzeVarArr;
        }
        return new dze[]{dzeVar};
    }

    @Override // defpackage.evx
    public final long a(long j2, ekj ekjVar) {
        long j3;
        long jG;
        long j4 = j2;
        exs[] exsVarArr = this.d;
        int length = exsVarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            exs exsVar = exsVarArr[i3];
            if (exsVar.a == 2) {
                enj[] enjVarArr = exsVar.o.f;
                while (i2 < enjVarArr.length) {
                    enj enjVar = enjVarArr[i2];
                    if (enjVar.c != null) {
                        long jD = enjVar.d();
                        if (jD != 0) {
                            long jF = enjVar.f(j4);
                            long jG2 = enjVar.g(jF);
                            if (jG2 >= j4 || (jD != -1 && jF >= (enjVar.b() + jD) - 1)) {
                                j3 = jG2;
                                jG = j3;
                            } else {
                                jG = enjVar.g(jF + 1);
                                j3 = jG2;
                            }
                            return ekjVar.a(j4, j3, jG);
                        }
                    }
                    i2++;
                    j4 = j2;
                }
            } else {
                i3++;
                j4 = j2;
            }
        }
        return j2;
    }

    @Override // defpackage.ewy
    public final /* bridge */ /* synthetic */ void b(ewz ewzVar) {
        throw null;
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long c() {
        return this.t.c();
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long d() {
        return this.t.d();
    }

    @Override // defpackage.evx
    public final void dr() {
        this.p.a();
    }

    @Override // defpackage.evx
    public final void dt(long j2) {
        for (exs exsVar : this.d) {
            if (!exsVar.j()) {
                eww ewwVar = exsVar.g;
                int i2 = ewwVar.c;
                ewwVar.I(j2, true);
                int i3 = ewwVar.c;
                if (i3 > i2) {
                    long jO = ewwVar.o();
                    int i4 = 0;
                    while (true) {
                        eww[] ewwVarArr = exsVar.h;
                        if (i4 >= ewwVarArr.length) {
                            break;
                        }
                        ewwVarArr[i4].I(jO, exsVar.d[i4]);
                        i4++;
                    }
                }
                int iMin = Math.min(exsVar.f(i3, 0), exsVar.k);
                if (iMin > 0) {
                    edt.af(exsVar.f, 0, iMin);
                    exsVar.k -= iMin;
                }
            }
        }
    }

    @Override // defpackage.evx
    public final long e() {
        exs[] exsVarArr = this.d;
        int length = exsVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            exs exsVar = exsVarArr[i2];
            try {
                if (exsVar.m) {
                    return this.v;
                }
            } finally {
                exsVar.m = false;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.evx
    public final long f(long j2) throws Throwable {
        ArrayList arrayList;
        exl exlVar;
        boolean zH;
        for (exs exsVar : this.d) {
            exsVar.j = j2;
            exsVar.l = false;
            if (exsVar.j()) {
                exsVar.i = j2;
            } else {
                int i2 = 0;
                while (true) {
                    arrayList = exsVar.f;
                    exlVar = null;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    exl exlVar2 = (exl) arrayList.get(i2);
                    long j3 = exlVar2.v;
                    if (j3 == j2 && exlVar2.a == -9223372036854775807L) {
                        exlVar = exlVar2;
                        break;
                    }
                    if (j3 > j2) {
                        break;
                    }
                    i2++;
                }
                if (exlVar != null) {
                    zH = exsVar.g.G(exlVar.a(0));
                } else {
                    long jD = exsVar.d();
                    zH = exsVar.g.H(j2, jD == Long.MIN_VALUE || j2 < jD);
                }
                if (zH) {
                    exsVar.k = exsVar.f(exsVar.g.k(), 0);
                    for (eww ewwVar : exsVar.h) {
                        ewwVar.H(j2, true);
                    }
                } else {
                    exsVar.i = j2;
                    exsVar.n = false;
                    arrayList.clear();
                    exsVar.k = 0;
                    ezw ezwVar = exsVar.e;
                    if (ezwVar.h()) {
                        exsVar.g.t();
                        for (eww ewwVar2 : exsVar.h) {
                            ewwVar2.t();
                        }
                        ezwVar.b();
                    } else {
                        ezwVar.c();
                        exsVar.i();
                    }
                }
            }
        }
        for (enm enmVar : this.e) {
            enmVar.c(j2);
        }
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.evx
    public final long g(ezf[] ezfVarArr, boolean[] zArr, ewx[] ewxVarArr, boolean[] zArr2, long j2) throws Throwable {
        int i2;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i3;
        int i4;
        eba ebaVarB;
        int i5;
        enn ennVar;
        int[] iArr3 = new int[ezfVarArr.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = -1;
            if (i7 >= ezfVarArr.length) {
                break;
            }
            ezf ezfVar = ezfVarArr[i7];
            if (ezfVar != null) {
                iArr3[i7] = this.q.a(ezfVar.h());
            } else {
                iArr3[i7] = -1;
            }
            i7++;
        }
        for (int i8 = 0; i8 < ezfVarArr.length; i8++) {
            if (ezfVarArr[i8] == null || !zArr[i8]) {
                ewx ewxVar = ewxVarArr[i8];
                if (ewxVar instanceof exs) {
                    ((exs) ewxVar).h(this);
                } else if (ewxVar instanceof exq) {
                    ((exq) ewxVar).c();
                }
                ewxVarArr[i8] = null;
            }
        }
        int i9 = 0;
        while (true) {
            z = true;
            boolean z2 = true;
            if (i9 >= ezfVarArr.length) {
                break;
            }
            ewx ewxVar2 = ewxVarArr[i9];
            if ((ewxVar2 instanceof evn) || (ewxVar2 instanceof exq)) {
                int iR = r(i9, iArr3);
                if (iR == -1) {
                    z2 = ewxVarArr[i9] instanceof evn;
                } else {
                    ewx ewxVar3 = ewxVarArr[i9];
                    if (!(ewxVar3 instanceof exq) || ((exq) ewxVar3).a != ewxVarArr[iR]) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    ewx ewxVar4 = ewxVarArr[i9];
                    if (ewxVar4 instanceof exq) {
                        ((exq) ewxVar4).c();
                    }
                    ewxVarArr[i9] = null;
                }
            }
            i9++;
        }
        int i10 = 0;
        while (i10 < ezfVarArr.length) {
            ezf ezfVar2 = ezfVarArr[i10];
            if (ezfVar2 == null) {
                iArr2 = iArr3;
                i3 = i10;
            } else {
                ewx ewxVar5 = ewxVarArr[i10];
                if (ewxVar5 == null) {
                    zArr2[i10] = z;
                    int i11 = iArr3[i10];
                    emw[] emwVarArr = this.r;
                    emw emwVar = emwVarArr[i11];
                    int i12 = emwVar.c;
                    if (i12 == 0) {
                        int i13 = emwVar.f;
                        boolean z3 = i13 != i2 ? z ? 1 : 0 : i6;
                        if (z3 != 0) {
                            ebaVarB = this.q.b(i13);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i6;
                            ebaVarB = null;
                        }
                        int i14 = emwVar.g;
                        ImmutableList immutableListOf = i14 != i2 ? emwVarArr[i14].h : ImmutableList.of();
                        int size = i4 + immutableListOf.size();
                        dze[] dzeVarArr = new dze[size];
                        int[] iArr4 = new int[size];
                        if (z3 != 0) {
                            dzeVarArr[i6] = ebaVarB.c(i6);
                            iArr4[i6] = 5;
                            i5 = z ? 1 : 0;
                        } else {
                            i5 = i6;
                        }
                        List arrayList = new ArrayList();
                        for (int i15 = i6; i15 < immutableListOf.size(); i15++) {
                            dze dzeVar = (dze) immutableListOf.get(i15);
                            dzeVarArr[i5] = dzeVar;
                            iArr4[i5] = 3;
                            arrayList.add(dzeVar);
                            i5 += z ? 1 : 0;
                        }
                        if (!this.f.d || z3 == 0) {
                            ennVar = null;
                        } else {
                            eno enoVar = this.b;
                            ennVar = new enn(enoVar, enoVar.h);
                        }
                        emu emuVar = this.l;
                        ezy ezyVar = this.p;
                        enr enrVar = this.f;
                        iom iomVar = this.A;
                        int i16 = this.g;
                        int[] iArr5 = emwVar.a;
                        int i17 = emwVar.b;
                        i3 = i10;
                        enn ennVar2 = ennVar;
                        iArr2 = iArr3;
                        exs exsVar = new exs(i17, iArr4, dzeVarArr, emuVar.d(ezyVar, enrVar, iomVar, i16, iArr5, ezfVar2, i17, this.o, z3, arrayList, ennVar, this.m), this, this.w, j2, this.n, this.y, this.z, this.x, this.u);
                        synchronized (this) {
                            this.s.put(exsVar, ennVar2);
                        }
                        ewxVarArr[i3] = exsVar;
                    } else {
                        iArr2 = iArr3;
                        i3 = i10;
                        if (i12 == 2) {
                            ewxVarArr[i3] = new enm((iom) this.h.get(emwVar.d), ezfVar2.h().c(0), this.f.d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i3 = i10;
                    if (ewxVar5 instanceof exs) {
                        ((exs) ewxVar5).o.g = ezfVar2;
                    }
                }
            }
            i10 = i3 + 1;
            iArr3 = iArr2;
            i6 = 0;
            i2 = -1;
            z = true;
        }
        int[] iArr6 = iArr3;
        int i18 = 0;
        while (i18 < ezfVarArr.length) {
            if (ewxVarArr[i18] != null || ezfVarArr[i18] == null) {
                iArr = iArr6;
            } else {
                iArr = iArr6;
                emw emwVar2 = this.r[iArr[i18]];
                if (emwVar2.c == 1) {
                    int iR2 = r(i18, iArr);
                    if (iR2 == -1) {
                        ewxVarArr[i18] = new evn();
                    } else {
                        exs exsVar2 = (exs) ewxVarArr[iR2];
                        int i19 = emwVar2.b;
                        int i20 = 0;
                        while (true) {
                            eww[] ewwVarArr = exsVar2.h;
                            if (i20 >= ewwVarArr.length) {
                                throw new IllegalStateException();
                            }
                            if (exsVar2.b[i20] == i19) {
                                boolean[] zArr3 = exsVar2.d;
                                a.ab(!zArr3[i20]);
                                zArr3[i20] = true;
                                ewwVarArr[i20].H(j2, true);
                                ewxVarArr[i18] = new exq(exsVar2, exsVar2, ewwVarArr[i20], i20);
                                break;
                            }
                            i20++;
                        }
                    }
                }
                i18++;
                iArr6 = iArr;
            }
            i18++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (ewx ewxVar6 : ewxVarArr) {
            if (ewxVar6 instanceof exs) {
                arrayList2.add((exs) ewxVar6);
            } else if (ewxVar6 instanceof enm) {
                arrayList3.add((enm) ewxVar6);
            }
        }
        exs[] exsVarArr = new exs[arrayList2.size()];
        this.d = exsVarArr;
        arrayList2.toArray(exsVarArr);
        enm[] enmVarArr = new enm[arrayList3.size()];
        this.e = enmVarArr;
        arrayList3.toArray(enmVarArr);
        this.t = new evi(arrayList2, Lists.transform(arrayList2, new dzc(13)));
        if (this.u) {
            this.u = false;
            this.v = j2;
        }
        return j2;
    }

    @Override // defpackage.evx
    public final exi h() {
        return this.q;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.evx
    public final List i(List list) {
        ?? r0 = this.f.f(this.g).b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ezf ezfVar = (ezf) it.next();
            emw emwVar = this.r[this.q.a(ezfVar.h())];
            if (emwVar.c == 0) {
                int[] iArr = emwVar.a;
                int iT = ezfVar.t();
                int[] iArr2 = new int[iT];
                for (int i2 = 0; i2 < ezfVar.t(); i2++) {
                    iArr2[i2] = ezfVar.q(i2);
                }
                Arrays.sort(iArr2);
                int size = ((enp) r0.get(iArr[0])).c.size();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < iT; i5++) {
                    int i6 = iArr2[i5];
                    while (true) {
                        int i7 = i4 + size;
                        if (i6 >= i7) {
                            i3++;
                            size = ((enp) r0.get(iArr[i3])).c.size();
                            i4 = i7;
                        }
                    }
                    arrayList.add(new eas(this.g, iArr[i3], i6 - i4));
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.exr
    public final synchronized void k(exs exsVar) {
        enn ennVar = (enn) this.s.remove(exsVar);
        if (ennVar != null) {
            ennVar.a.z();
        }
    }

    @Override // defpackage.evx
    public final void l(evw evwVar, long j2) {
        this.c = evwVar;
        evwVar.dp(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    @Override // defpackage.evx, defpackage.ewz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(long r20) {
        /*
            r19 = this;
            r0 = r19
            exs[] r1 = r0.d
            int r2 = r1.length
            r4 = 0
        L6:
            if (r4 >= r2) goto L90
            r5 = r1[r4]
            boolean r6 = r5.o()
            if (r6 != 0) goto L8a
            enr r6 = r0.f
            int r7 = r0.g
            long r10 = r6.c(r7)
            ezw r6 = r5.e
            boolean r6 = r6.h()
            r6 = r6 ^ 1
            defpackage.a.ab(r6)
            boolean r6 = r5.j()
            if (r6 != 0) goto L8a
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 == 0) goto L8a
            java.util.ArrayList r8 = r5.f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L3b
            goto L8a
        L3b:
            exl r8 = r5.g()
            long r12 = r8.b
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 == 0) goto L46
            goto L48
        L46:
            long r12 = r8.w
        L48:
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 <= 0) goto L8a
            eww r6 = r5.g
            long r12 = r6.p()
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 <= 0) goto L8a
            long r7 = r6.q()
            r14 = 1
            long r7 = r7 + r14
            long r7 = java.lang.Math.max(r10, r7)
            r6.u(r7)
            eww[] r6 = r5.h
            int r7 = r6.length
            r8 = 0
        L68:
            if (r8 >= r7) goto L80
            r9 = r6[r8]
            long r16 = r9.q()
            r18 = r4
            long r3 = r16 + r14
            long r3 = java.lang.Math.max(r10, r3)
            r9.u(r3)
            int r8 = r8 + 1
            r4 = r18
            goto L68
        L80:
            r18 = r4
            eph r8 = r5.p
            int r9 = r5.a
            r8.l(r9, r10, r12)
            goto L8c
        L8a:
            r18 = r4
        L8c:
            int r4 = r18 + 1
            goto L6
        L90:
            ewz r1 = r0.t
            r2 = r20
            r1.m(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emx.m(long):void");
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean n(eji ejiVar) {
        return this.t.n(ejiVar);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean o() {
        return this.t.o();
    }

    public final void q() {
        this.c.b(this);
    }
}
