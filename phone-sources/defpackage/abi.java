package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abi implements yjv {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ abi(fwr fwrVar, boolean z, List list, int i) {
        this.d = i;
        this.b = fwrVar;
        this.a = z;
        this.c = list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        boolean z;
        boolean z2;
        int i = this.d;
        int i2 = 0;
        if (i == 0) {
            bwi bwiVar = (bwi) obj;
            ?? r0 = this.b;
            int size = r0.size();
            int i3 = 0;
            while (true) {
                z = this.a;
                if (i3 >= size) {
                    break;
                }
                ((abk) r0.get(i3)).j(bwiVar, z);
                i3++;
            }
            ?? r02 = this.c;
            int size2 = r02.size();
            while (i2 < size2) {
                ((abk) r02.get(i2)).j(bwiVar, z);
                i2++;
            }
            return ygi.a;
        }
        int i4 = 1;
        if (i == 1) {
            bwi bwiVar2 = (bwi) obj;
            ?? r03 = this.b;
            int size3 = r03.size();
            int i5 = 0;
            while (true) {
                z2 = this.a;
                if (i5 >= size3) {
                    break;
                }
                ((aaj) r03.get(i5)).j(bwiVar2, z2);
                i5++;
            }
            ?? r04 = this.c;
            int size4 = r04.size();
            while (i2 < size4) {
                ((aaj) r04.get(i2)).j(bwiVar2, z2);
                i2++;
            }
            return ygi.a;
        }
        int i6 = 4;
        if (i == 2) {
            cfc cfcVar = (cfc) obj;
            if (this.a) {
                cfk.A(cfcVar);
            }
            Object obj2 = this.b;
            cfk.i(cfcVar, (String) this.c);
            cfk.c(cfcVar, null, new aoe(obj2, i6));
            return ygi.a;
        }
        if (i == 3) {
            if (((bmp) obj).b() && this.a) {
                ykr.q(this.c, null, 0, new ajn((cvi) this.b, (yih) null, 18, (byte[]) null), 3);
            }
            return ygi.a;
        }
        if (i == 4) {
            cfc cfcVar2 = (cfc) obj;
            if (this.a) {
                cfk.A(cfcVar2);
            }
            Object obj3 = this.b;
            Object obj4 = this.c;
            cfk.c(cfcVar2, null, new awa(obj3, i4));
            cfk.i(cfcVar2, (String) obj4);
            return ygi.a;
        }
        if (i != 5) {
            aad aadVar = (aad) obj;
            aadVar.getClass();
            ?? r05 = this.b;
            aadVar.a(r05.size(), new bil(r05, 10), new bhq(802480018, true, new kfe(r05, this.c, this.a)));
            return ygi.a;
        }
        final ?? r8 = this.c;
        final boolean z3 = this.a;
        Object obj5 = this.b;
        final fwr fwrVar = (fwr) obj5;
        dvi dviVar = new dvi() { // from class: fye
            @Override // defpackage.dvi
            public final void a(dvk dvkVar, dvc dvcVar) {
                List list = r8;
                boolean z4 = z3;
                fwr fwrVar2 = fwrVar;
                if (z4 && !list.contains(fwrVar2)) {
                    list.add(fwrVar2);
                }
                if (dvcVar == dvc.ON_START && !list.contains(fwrVar2)) {
                    list.add(fwrVar2);
                }
                if (dvcVar == dvc.ON_STOP) {
                    list.remove(fwrVar2);
                }
            }
        };
        fwrVar.getLifecycle().c(dviVar);
        return new pg(obj5, dviVar, 10, null);
    }

    public /* synthetic */ abi(List list, Object obj, boolean z, int i) {
        this.d = i;
        this.b = list;
        this.c = obj;
        this.a = z;
    }

    public /* synthetic */ abi(boolean z, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = z;
        this.c = obj;
        this.b = obj2;
    }
}
