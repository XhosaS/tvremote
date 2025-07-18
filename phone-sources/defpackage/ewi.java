package defpackage;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewi implements evx, evw {
    private final evx[] a;
    private final boolean[] b;
    private evw f;
    private exi g;
    private final ArrayList d = new ArrayList();
    private final HashMap e = new HashMap();
    private ewz i = cme.u();
    private final IdentityHashMap c = new IdentityHashMap();
    private evx[] h = new evx[0];

    public ewi(long[] jArr, evx... evxVarArr) {
        this.a = evxVarArr;
        this.b = new boolean[evxVarArr.length];
        for (int i = 0; i < evxVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new exg(evxVarArr[i], j);
            }
        }
    }

    @Override // defpackage.evx
    public final long a(long j, ekj ekjVar) {
        evx[] evxVarArr = this.h;
        return (evxVarArr.length > 0 ? evxVarArr[0] : this.a[0]).a(j, ekjVar);
    }

    @Override // defpackage.ewy
    public final /* bridge */ /* synthetic */ void b(ewz ewzVar) {
        evw evwVar = this.f;
        evwVar.getClass();
        evwVar.b(this);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long c() {
        return this.i.c();
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long d() {
        return this.i.d();
    }

    @Override // defpackage.evw
    public final void dp(evx evxVar) {
        ArrayList arrayList = this.d;
        arrayList.remove(evxVar);
        if (arrayList.isEmpty()) {
            evx[] evxVarArr = this.a;
            int i = 0;
            for (evx evxVar2 : evxVarArr) {
                i += evxVar2.h().c;
            }
            eba[] ebaVarArr = new eba[i];
            int i2 = 0;
            for (int i3 = 0; i3 < evxVarArr.length; i3++) {
                exi exiVarH = evxVarArr[i3].h();
                int i4 = exiVarH.c;
                int i5 = 0;
                while (i5 < i4) {
                    eba ebaVarB = exiVarH.b(i5);
                    int i6 = ebaVarB.c;
                    dze[] dzeVarArr = new dze[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        dze dzeVarC = ebaVarB.c(i7);
                        dzd dzdVar = new dzd(dzeVarC);
                        String str = dzeVarC.K;
                        if (str == null) {
                            str = "";
                        }
                        dzdVar.a = i3 + ":" + str;
                        dzeVarArr[i7] = new dze(dzdVar);
                    }
                    eba ebaVar = new eba(i3 + ":" + ebaVarB.d, dzeVarArr);
                    this.e.put(ebaVar, ebaVarB);
                    ebaVarArr[i2] = ebaVar;
                    i5++;
                    i2++;
                }
            }
            this.g = new exi(ebaVarArr);
            evw evwVar = this.f;
            evwVar.getClass();
            evwVar.dp(this);
        }
    }

    @Override // defpackage.evx
    public final void dr() {
        int i = 0;
        while (true) {
            evx[] evxVarArr = this.a;
            if (i >= evxVarArr.length) {
                return;
            }
            evxVarArr[i].dr();
            i++;
        }
    }

    @Override // defpackage.evx
    public final void dt(long j) {
        for (evx evxVar : this.h) {
            evxVar.dt(j);
        }
    }

    @Override // defpackage.evx
    public final long e() {
        long j = -9223372036854775807L;
        for (evx evxVar : this.h) {
            long jE = evxVar.e();
            if (jE == -9223372036854775807L) {
                if (j != -9223372036854775807L && evxVar.f(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (evx evxVar2 : this.h) {
                    if (evxVar2 == evxVar) {
                        break;
                    }
                    if (evxVar2.f(jE) != jE) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jE;
            } else if (jE != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // defpackage.evx
    public final long f(long j) {
        long jF = this.h[0].f(j);
        int i = 1;
        while (true) {
            evx[] evxVarArr = this.h;
            if (i >= evxVarArr.length) {
                return jF;
            }
            if (evxVarArr[i].f(jF) != jF) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.evx
    public final long g(ezf[] ezfVarArr, boolean[] zArr, ewx[] ewxVarArr, boolean[] zArr2, long j) {
        int length;
        int[] iArr;
        int length2 = ezfVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = ezfVarArr.length;
            if (i2 >= length) {
                break;
            }
            ewx ewxVar = ewxVarArr[i2];
            Integer num = ewxVar == null ? null : (Integer) this.c.get(ewxVar);
            iArr2[i2] = num == null ? -1 : num.intValue();
            ezf ezfVar = ezfVarArr[i2];
            if (ezfVar != null) {
                String str = ezfVar.h().d;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        IdentityHashMap identityHashMap = this.c;
        identityHashMap.clear();
        evx[] evxVarArr = this.a;
        ewx[] ewxVarArr2 = new ewx[length];
        ewx[] ewxVarArr3 = new ewx[length];
        ezf[] ezfVarArr2 = new ezf[length];
        ArrayList arrayList = new ArrayList(evxVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < evxVarArr.length) {
            int i4 = i;
            while (i4 < ezfVarArr.length) {
                ewxVarArr3[i4] = iArr2[i4] == i3 ? ewxVarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    ezf ezfVar2 = ezfVarArr[i4];
                    ezfVar2.getClass();
                    iArr = iArr3;
                    eba ebaVar = (eba) this.e.get(ezfVar2.h());
                    ebaVar.getClass();
                    ezfVarArr2[i4] = new ewh(ezfVar2, ebaVar);
                } else {
                    iArr = iArr3;
                    ezfVarArr2[i4] = null;
                }
                i4++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            long jG = evxVarArr[i3].g(ezfVarArr2, zArr, ewxVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jG;
            } else if (jG != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < ezfVarArr.length; i6++) {
                if (iArr4[i6] == i5) {
                    ewx ewxVar2 = ewxVarArr3[i6];
                    ewxVar2.getClass();
                    ewxVarArr2[i6] = ewxVarArr3[i6];
                    identityHashMap.put(ewxVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr2[i6] == i5) {
                    a.ab(ewxVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(evxVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(ewxVarArr2, i7, ewxVarArr, i7, length);
        this.h = (evx[]) arrayList3.toArray(new evx[i7]);
        this.i = new evi(arrayList3, Lists.transform(arrayList3, new dzc(16)));
        return j2;
    }

    @Override // defpackage.evx
    public final exi h() {
        exi exiVar = this.g;
        exiVar.getClass();
        return exiVar;
    }

    @Override // defpackage.evx
    public final /* synthetic */ List i(List list) {
        return Collections.EMPTY_LIST;
    }

    public final evx k(int i) {
        return this.b[i] ? ((exg) this.a[i]).a : this.a[i];
    }

    @Override // defpackage.evx
    public final void l(evw evwVar, long j) {
        this.f = evwVar;
        ArrayList arrayList = this.d;
        evx[] evxVarArr = this.a;
        Collections.addAll(arrayList, evxVarArr);
        for (evx evxVar : evxVarArr) {
            evxVar.l(this, j);
        }
    }

    @Override // defpackage.evx, defpackage.ewz
    public final void m(long j) {
        this.i.m(j);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean n(eji ejiVar) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.i.n(ejiVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((evx) arrayList.get(i)).n(ejiVar);
        }
        return false;
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean o() {
        return this.i.o();
    }
}
