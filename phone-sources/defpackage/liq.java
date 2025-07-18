package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class liq implements Parcelable {
    public static final Parcelable.Creator<liq> CREATOR = new jbu(14);
    public final wjf a;
    public final List b;
    private int c;

    public liq(wjf wjfVar, List list, int i) {
        this.a = wjfVar;
        this.b = list;
        this.c = i;
    }

    public static liq a(int i, ksy ksyVar, ktz ktzVar) {
        return c(i, ksyVar.b, l(ksyVar.n()), ktzVar, kys.a);
    }

    public static liq b(int i, String str, wij wijVar, ktz ktzVar) {
        return c(i, str, wijVar, ktzVar, kys.a);
    }

    public static liq c(int i, String str, wij wijVar, ktz ktzVar, kys kysVar) {
        vtw vtwVarM = wik.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wik wikVar = (wik) vucVar;
        wikVar.c = wijVar.q;
        wikVar.b |= 1;
        wii wiiVar = wii.YOUTUBE_ID;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wik wikVar2 = (wik) vucVar2;
        wikVar2.d = wiiVar.h;
        wikVar2.b |= 2;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        wik wikVar3 = (wik) vtwVarM.b;
        wikVar3.b |= 4;
        wikVar3.e = str;
        wik wikVar4 = (wik) vtwVarM.r();
        vtw vtwVarM2 = wji.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wji wjiVar = (wji) vtwVarM2.b;
        wikVar4.getClass();
        wjiVar.c = wikVar4;
        wjiVar.b |= 1;
        if (ktzVar != null) {
            vtwVarM2.aI(n(ktzVar));
        }
        return j(i, (wji) vtwVarM2.r(), kysVar);
    }

    public static liq d(int i) {
        return new liq(i, null, kys.a, Collections.EMPTY_LIST);
    }

    public static liq e(int i) {
        return j(i, null, kys.a);
    }

    public static liq f(int i, ksy ksyVar) {
        return a(i, ksyVar, ktz.a);
    }

    public static liq g(int i, kuf kufVar) {
        return c(i, kufVar.b, wij.DISTRIBUTOR, ktz.a, kys.a);
    }

    public static liq h(int i, kvf kvfVar) {
        return a(i, kvfVar.o(), kvfVar.dW());
    }

    public static liq i(int i, kwl kwlVar) {
        return a(i, kwlVar.d, kwlVar.dW());
    }

    public static liq j(int i, wji wjiVar, kys kysVar) {
        return new liq(i, wjiVar, kysVar, new ArrayList());
    }

    public static liq k(int i) {
        vtw vtwVarM = wji.a.m();
        vtw vtwVarM2 = wik.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wik wikVar = (wik) vtwVarM2.b;
        wikVar.b |= 8;
        wikVar.f = true;
        wik wikVar2 = (wik) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wji wjiVar = (wji) vtwVarM.b;
        wikVar2.getClass();
        wjiVar.c = wikVar2;
        wjiVar.b |= 1;
        return new liq(i, (wji) vtwVarM.r(), kys.a, Collections.EMPTY_LIST);
    }

    public static wij l(xay xayVar) {
        int iOrdinal = xayVar.ordinal();
        if (iOrdinal == 1) {
            return wij.MUSIC_ALBUM;
        }
        if (iOrdinal == 3) {
            return wij.SONG;
        }
        if (iOrdinal == 13) {
            return wij.DISTRIBUTOR;
        }
        if (iOrdinal == 15) {
            return wij.FHR_BANNER;
        }
        if (iOrdinal == 17 || iOrdinal == 5) {
            return wij.MOVIE;
        }
        if (iOrdinal == 6) {
            return wij.CONTAINER;
        }
        switch (iOrdinal) {
            case 8:
                return wij.SHOW;
            case 9:
                return wij.SEASON;
            case 10:
                return wij.EPISODE;
            case 11:
                return wij.VOUCHER;
            default:
                return wij.UNKNOWN_ASSET_TYPE;
        }
    }

    public static wji m(kuf kufVar) {
        vtw vtwVarM = wik.a.m();
        wij wijVar = wij.DISTRIBUTOR;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wik wikVar = (wik) vucVar;
        wikVar.c = wijVar.q;
        wikVar.b |= 1;
        wii wiiVar = wii.YOUTUBE_ID;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wik wikVar2 = (wik) vucVar2;
        wikVar2.d = wiiVar.h;
        wikVar2.b |= 2;
        String str = kufVar.b;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        wik wikVar3 = (wik) vtwVarM.b;
        wikVar3.b |= 4;
        wikVar3.e = str;
        wik wikVar4 = (wik) vtwVarM.r();
        vtw vtwVarM2 = wji.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wji wjiVar = (wji) vtwVarM2.b;
        wikVar4.getClass();
        wjiVar.c = wikVar4;
        wjiVar.b |= 1;
        return (wji) vtwVarM2.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List n(ktz ktzVar) {
        int iA = ktzVar.a();
        if (iA == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iA; i++) {
            kvo kvoVar = (kvo) ktzVar.b.get(i);
            vtw vtwVarM = wjh.a.m();
            long j = kvoVar.f;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wjh wjhVar = (wjh) vucVar;
            wjhVar.b |= 1;
            wjhVar.c = j;
            String str = kvoVar.g;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            wjh wjhVar2 = (wjh) vucVar2;
            wjhVar2.b |= 2;
            wjhVar2.d = str;
            int i2 = kvoVar.h.f;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            vuc vucVar3 = vtwVarM.b;
            wjh wjhVar3 = (wjh) vucVar3;
            wjhVar3.b |= 4;
            wjhVar3.e = i2;
            int i3 = kvoVar.i.f;
            if (!vucVar3.A()) {
                vtwVarM.u();
            }
            wjh wjhVar4 = (wjh) vtwVarM.b;
            wjhVar4.b |= 8;
            wjhVar4.f = i3;
            boolean zB = kvoVar.b();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar4 = vtwVarM.b;
            wjh wjhVar5 = (wjh) vucVar4;
            wjhVar5.b |= 16;
            wjhVar5.g = zB;
            boolean z = kvoVar.l;
            if (!vucVar4.A()) {
                vtwVarM.u();
            }
            wjh wjhVar6 = (wjh) vtwVarM.b;
            wjhVar6.b |= 32;
            wjhVar6.h = z;
            arrayList.add((wjh) vtwVarM.r());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.wji p(defpackage.ksy r4) {
        /*
            wik r0 = defpackage.wik.a
            vtw r0 = r0.m()
            int r1 = r4.a
            r2 = 6
            if (r1 == r2) goto L39
            r2 = 7
            if (r1 == r2) goto L36
            r2 = 29
            if (r1 == r2) goto L33
            r2 = 61
            if (r1 == r2) goto L30
            r2 = 70
            if (r1 == r2) goto L2d
            r2 = 5000(0x1388, float:7.006E-42)
            if (r1 == r2) goto L39
            switch(r1) {
                case 18: goto L2a;
                case 19: goto L27;
                case 20: goto L24;
                default: goto L21;
            }
        L21:
            wij r1 = defpackage.wij.UNKNOWN_ASSET_TYPE
            goto L3b
        L24:
            wij r1 = defpackage.wij.EPISODE
            goto L3b
        L27:
            wij r1 = defpackage.wij.SEASON
            goto L3b
        L2a:
            wij r1 = defpackage.wij.SHOW
            goto L3b
        L2d:
            wij r1 = defpackage.wij.FHR_BANNER
            goto L3b
        L30:
            wij r1 = defpackage.wij.DISTRIBUTOR
            goto L3b
        L33:
            wij r1 = defpackage.wij.VOUCHER
            goto L3b
        L36:
            wij r1 = defpackage.wij.CONTAINER
            goto L3b
        L39:
            wij r1 = defpackage.wij.MOVIE
        L3b:
            vuc r2 = r0.b
            boolean r2 = r2.A()
            if (r2 != 0) goto L46
            r0.u()
        L46:
            vuc r2 = r0.b
            r3 = r2
            wik r3 = (defpackage.wik) r3
            int r1 = r1.q
            r3.c = r1
            int r1 = r3.b
            r1 = r1 | 1
            r3.b = r1
            wii r1 = defpackage.wii.YOUTUBE_ID
            boolean r2 = r2.A()
            if (r2 != 0) goto L60
            r0.u()
        L60:
            vuc r2 = r0.b
            r3 = r2
            wik r3 = (defpackage.wik) r3
            int r1 = r1.h
            r3.d = r1
            int r1 = r3.b
            r1 = r1 | 2
            r3.b = r1
            java.lang.String r4 = r4.b
            boolean r1 = r2.A()
            if (r1 != 0) goto L7a
            r0.u()
        L7a:
            vuc r1 = r0.b
            wik r1 = (defpackage.wik) r1
            int r2 = r1.b
            r2 = r2 | 4
            r1.b = r2
            r1.e = r4
            vuc r4 = r0.r()
            wik r4 = (defpackage.wik) r4
            wji r0 = defpackage.wji.a
            vtw r0 = r0.m()
            vuc r1 = r0.b
            boolean r1 = r1.A()
            if (r1 != 0) goto L9d
            r0.u()
        L9d:
            vuc r1 = r0.b
            wji r1 = (defpackage.wji) r1
            r4.getClass()
            r1.c = r4
            int r4 = r1.b
            r4 = r4 | 1
            r1.b = r4
            vuc r4 = r0.r()
            wji r4 = (defpackage.wji) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.liq.p(ksy):wji");
    }

    public static liq q(String str) {
        vtw vtwVarM = wjg.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wjg wjgVar = (wjg) vucVar;
        wjgVar.b |= 1;
        wjgVar.c = str;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wjg wjgVar2 = (wjg) vtwVarM.b;
        wjgVar2.b |= 2;
        wjgVar2.d = 2;
        wjg wjgVar3 = (wjg) vtwVarM.r();
        vtw vtwVarM2 = wji.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wji wjiVar = (wji) vtwVarM2.b;
        wjgVar3.getClass();
        wjiVar.e = wjgVar3;
        wjiVar.b |= 4;
        return j(400, (wji) vtwVarM2.r(), kys.a);
    }

    public static liq r(ksy ksyVar) {
        return b(500, ksyVar.b, wij.TRAILER, ktz.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof liq) {
            return o((liq) obj);
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int i = this.c;
        if (i == 0) {
            return i;
        }
        wjf wjfVar = this.a;
        int iHashCode = (wjfVar.c * 31) + Arrays.hashCode(wjfVar.f.w());
        wji wjiVar = wjfVar.e;
        if (wjiVar == null) {
            wjiVar = wji.a;
        }
        if (wjiVar.A()) {
            iJ = wjiVar.j();
        } else {
            int iJ2 = wjiVar.M;
            if (iJ2 == 0) {
                iJ2 = wjiVar.j();
                wjiVar.M = iJ2;
            }
            iJ = iJ2;
        }
        int i2 = (iHashCode * 31) + iJ;
        this.c = i2;
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(defpackage.liq r9) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.liq.o(liq):boolean");
    }

    public final void s(vtw vtwVar) {
        wjf wjfVar = this.a;
        if ((wjfVar.b & 2) != 0) {
            wji wjiVar = wjfVar.e;
            if (wjiVar == null) {
                wjiVar = wji.a;
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            wjf wjfVar2 = (wjf) vtwVar.b;
            wjiVar.getClass();
            wjfVar2.e = wjiVar;
            wjfVar2.b |= 2;
        }
        if ((wjfVar.b & 4) != 0) {
            vsz vszVar = wjfVar.f;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            wjf wjfVar3 = (wjf) vtwVar.b;
            vszVar.getClass();
            wjfVar3.b |= 4;
            wjfVar3.f = vszVar;
        }
        if ((wjfVar.b & 1) != 0) {
            int i = wjfVar.c;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            wjf wjfVar4 = (wjf) vtwVar.b;
            wjfVar4.b |= 1;
            wjfVar4.c = i;
        }
    }

    public final wjf t(kdj kdjVar) {
        vtw vtwVarM = wjf.a.m();
        s(vtwVarM);
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vtwVarM.aH(((liq) list.get(i)).t(kdjVar));
        }
        list.clear();
        return (wjf) vtwVarM.r();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        byte[] bArrH = this.a.h();
        parcel.writeInt(bArrH.length);
        parcel.writeByteArray(bArrH);
        parcel.writeInt(this.c);
    }

    private liq(int i, wji wjiVar, kys kysVar, List list) {
        this.b = list;
        vtw vtwVarM = wjf.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wjf wjfVar = (wjf) vtwVarM.b;
        wjfVar.b |= 1;
        wjfVar.c = i;
        vsz vszVarQ = vsz.q(kysVar.b);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wjf wjfVar2 = (wjf) vucVar;
        wjfVar2.b |= 4;
        wjfVar2.f = vszVarQ;
        if (wjiVar != null) {
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wjf wjfVar3 = (wjf) vtwVarM.b;
            wjfVar3.e = wjiVar;
            wjfVar3.b |= 2;
        }
        this.a = (wjf) vtwVarM.r();
    }
}
