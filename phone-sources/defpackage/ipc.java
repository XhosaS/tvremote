package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipc {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ipe a(imb imbVar) {
        wme wmeVar;
        boolean z;
        int i;
        inm inmVar;
        imbVar.getClass();
        iia iiaVar = imbVar.l;
        wme wmeVar2 = iiaVar.c;
        if (wmeVar2 == null) {
            wmeVar2 = wme.a;
        }
        boolean z2 = true;
        int i2 = (wmeVar2.b == 1 ? (wmi) wmeVar2.c : wmi.a).b & 1;
        wme wmeVar3 = iiaVar.c;
        if ((wmeVar3 == null ? wme.a : wmeVar3).b == 1) {
            wmeVar = wmeVar3;
            z = true;
        } else {
            wmeVar = wmeVar3;
            z = false;
        }
        if (wmeVar == null) {
            wmeVar = wme.a;
        }
        if (wmeVar.b == 2) {
            i = 1;
        } else {
            i = 1;
            z2 = false;
        }
        wmf wmfVar = iiaVar.d;
        if (wmfVar == null) {
            wmfVar = wmf.a;
        }
        boolean z3 = wmfVar.b;
        wmf wmfVar2 = iiaVar.d;
        if (wmfVar2 == null) {
            wmfVar2 = wmf.a;
        }
        int i3 = i;
        wni wniVar = imbVar.g;
        wni wniVar2 = imbVar.h;
        String str = imbVar.e;
        Integer num = imbVar.f;
        String str2 = imbVar.k;
        boolean z4 = wmfVar2.c;
        if (str2 != null) {
            wni wniVar3 = imbVar.b.c;
            if (wniVar3 == null) {
                wniVar3 = wni.a;
            }
            wniVar3.getClass();
            inmVar = new inm(wniVar3, str2);
        } else {
            inmVar = null;
        }
        return new ipe(i3 != i2 ? 0 : i3, z, z2, z3, z4, wniVar, wniVar2, str == null ? "" : str, num, inmVar);
    }

    public static final iua b(Map map, tmd tmdVar) {
        Object obj;
        Object next;
        Iterator it = map.values().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((iua) next).B(tmdVar, true)) {
                break;
            }
        }
        iua iuaVar = (iua) next;
        if (iuaVar != null) {
            return iuaVar;
        }
        Iterator it2 = map.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((iua) next2).B(tmdVar, false)) {
                obj = next2;
                break;
            }
        }
        return (iua) obj;
    }

    public static final iua c(Map map, fux fuxVar) {
        Object obj;
        Object next;
        Iterator it = map.values().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((iua) next).A(fuxVar, true)) {
                break;
            }
        }
        iua iuaVar = (iua) next;
        if (iuaVar != null) {
            return iuaVar;
        }
        Iterator it2 = map.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((iua) next2).A(fuxVar, false)) {
                obj = next2;
                break;
            }
        }
        return (iua) obj;
    }

    public static final boolean d(fux fuxVar, fur furVar) {
        return !fuxVar.q() && fuxVar.h && fuxVar.u(furVar);
    }

    public static final String e(long j) {
        long j2 = ynm.a;
        long jP = ylh.p(j, yno.c);
        long jH = ynm.h(jP);
        int iC = ynm.c(jP);
        int iD = ynm.d(jP);
        int iF = ynm.f(jP);
        StringBuilder sb = new StringBuilder();
        long jI = ynm.i(ylh.p(jH, yno.g)) + iC;
        if (jI > 0) {
            sb.append(jI + ":" + f(iD) + ":");
        } else {
            sb.append(iD + ":");
        }
        sb.append(f(iF));
        return sb.toString();
    }

    static /* synthetic */ String f(int i) {
        return ylh.W(String.valueOf(i), 2);
    }

    public static final ivu g(int i, Long l, Long l2, boolean z) {
        if (i == 0) {
            return new ivu();
        }
        if (i == 4 || i == 1) {
            return null;
        }
        if (l == null || l2 == null) {
            return new ivu(0L, 0L, z);
        }
        long jMax = Math.max(0L, l2.longValue());
        return new ivu(Math.max(0L, Math.min(l.longValue(), jMax)), jMax, z);
    }

    public static final String h(long j) {
        return e(ynm.k(j));
    }

    public static final void i(sca scaVar, ihe iheVar, int i) {
        iheVar.getClass();
        scaVar.p(i).setOnTouchListener(iheVar);
    }

    public static final boolean j(wpm wpmVar) {
        int i = wpmVar.b;
        return ((i & 1) == 0 && (i & 8) == 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String k(tmd tmdVar) {
        if (tmdVar.c != 1) {
            return null;
        }
        String str = (String) tmdVar.b.iterator().next();
        str.getClass();
        List listAa = ylh.aa(ylh.Y(str, "tcp://", ""), new String[]{":"});
        if (listAa.isEmpty()) {
            return null;
        }
        return (String) listAa.get(0);
    }

    public static final /* synthetic */ inl m(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (inl) vucVarO;
    }

    public static final void n(wvv wvvVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        inl inlVar = (inl) vtwVar.b;
        inl inlVar2 = inl.a;
        inlVar.c = wvvVar;
        inlVar.b = 4;
    }

    public static final void o(wwz wwzVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        inl inlVar = (inl) vtwVar.b;
        inl inlVar2 = inl.a;
        inlVar.c = wwzVar;
        inlVar.b = 5;
    }

    public static final /* synthetic */ ink p(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (ink) vucVarO;
    }

    public static final void q(wvu wvuVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        ink inkVar = (ink) vtwVar.b;
        ink inkVar2 = ink.a;
        inkVar.d = wvuVar;
        inkVar.c = 1;
    }

    public static final void r(wwy wwyVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        ink inkVar = (ink) vtwVar.b;
        ink inkVar2 = ink.a;
        inkVar.d = wwyVar;
        inkVar.c = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009e, code lost:
    
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a2, code lost:
    
        return r0.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String s(int r4, defpackage.wmn r5) {
        /*
            wni r0 = r5.e
            if (r0 != 0) goto L6
            wni r0 = defpackage.wni.a
        L6:
            int r0 = r0.c
            int r0 = defpackage.a.aU(r0)
            r1 = 1
            if (r0 != 0) goto L10
            r0 = r1
        L10:
            int r0 = r0 + (-2)
            r2 = 2
            r3 = 0
            if (r0 == r1) goto L5e
            if (r0 == r2) goto L1a
            goto La3
        L1a:
            int r0 = defpackage.a.as(r4)
            if (r0 == 0) goto La3
            int r0 = r5.c
            r2 = 3
            if (r0 != r2) goto L2a
            java.lang.Object r5 = r5.d
            wmm r5 = (defpackage.wmm) r5
            goto L2c
        L2a:
            wmm r5 = defpackage.wmm.a
        L2c:
            wmz r5 = r5.e
            if (r5 != 0) goto L32
            wmz r5 = defpackage.wmz.a
        L32:
            vun r5 = r5.b
            r5.getClass()
            java.util.Iterator r5 = r5.iterator()
        L3b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r5.next()
            r2 = r0
            wmy r2 = (defpackage.wmy) r2
            int r2 = r2.c
            int r2 = defpackage.a.as(r2)
            if (r2 != 0) goto L51
            r2 = r1
        L51:
            int r2 = defpackage.a.aF(r2)
            if (r2 != r4) goto L3b
            goto L59
        L58:
            r0 = r3
        L59:
            wmy r0 = (defpackage.wmy) r0
            if (r0 == 0) goto La3
            goto La0
        L5e:
            int r0 = defpackage.a.as(r4)
            if (r0 == 0) goto La3
            int r0 = r5.c
            if (r0 != r2) goto L6d
            java.lang.Object r5 = r5.d
            wmg r5 = (defpackage.wmg) r5
            goto L6f
        L6d:
            wmg r5 = defpackage.wmg.a
        L6f:
            wmz r5 = r5.e
            if (r5 != 0) goto L75
            wmz r5 = defpackage.wmz.a
        L75:
            vun r5 = r5.b
            r5.getClass()
            java.util.Iterator r5 = r5.iterator()
        L7e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r5.next()
            r2 = r0
            wmy r2 = (defpackage.wmy) r2
            int r2 = r2.c
            int r2 = defpackage.a.as(r2)
            if (r2 != 0) goto L94
            r2 = r1
        L94:
            int r2 = defpackage.a.aF(r2)
            if (r2 != r4) goto L7e
            goto L9c
        L9b:
            r0 = r3
        L9c:
            wmy r0 = (defpackage.wmy) r0
            if (r0 == 0) goto La3
        La0:
            java.lang.String r4 = r0.b
            return r4
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipc.s(int, wmn):java.lang.String");
    }

    public static final String t(wni wniVar) {
        String str = null;
        if (wniVar == null || yks.e(wniVar, wni.a)) {
            return null;
        }
        int iAU = a.aU(wniVar.c);
        if (iAU == 0) {
            iAU = 1;
        }
        int i = iAU - 2;
        if (i == 1) {
            str = "movie";
        } else if (i == 2) {
            str = "show";
        } else if (i == 3) {
            str = "season";
        } else if (i == 4) {
            str = "episode";
        }
        return "yt:" + str + ":" + wniVar.b;
    }

    public static final wni u(String str) {
        if (str != null && str.length() != 0) {
            List listAn = ylh.an(str, String.valueOf(new char[]{':'}[0]));
            if (!listAn.isEmpty() && listAn.size() == 3 && yks.e(listAn.get(0), "yt") && y((String) listAn.get(1)) != 2 && ((CharSequence) listAn.get(2)).length() != 0) {
                vtw vtwVarM = wni.a.m();
                vtwVarM.getClass();
                wcq.N(y((String) listAn.get(1)), vtwVarM);
                wcq.M((String) listAn.get(2), vtwVarM);
                return wcq.L(vtwVarM);
            }
            krd.c(a.cg(str, "Failed to parse ", " into PlayId proto"));
        }
        return null;
    }

    public static final wmu v(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            vuc vucVarP = vuc.p(wmu.a, bArr, 0, bArr.length, vtp.a());
            vuc.B(vucVarP);
            return (wmu) vucVarP;
        } catch (Exception unused) {
            krd.c("Failed to parse byteArray into MediaLibraryItemMetadata proto");
            return null;
        }
    }

    public static final iia w(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            vuc vucVarP = vuc.p(iia.a, bArr, 0, bArr.length, vtp.a());
            vuc.B(vucVarP);
            return (iia) vucVarP;
        } catch (Exception unused) {
            krd.c("Failed to parse byteArray into MediaLibraryItemInfo proto");
            return null;
        }
    }

    public static final wmp x(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            vuc vucVarP = vuc.p(wmp.a, bArr, 0, bArr.length, vtp.a());
            vuc.B(vucVarP);
            return (wmp) vucVarP;
        } catch (Exception unused) {
            krd.c("Failed to parse byteArray into MediaLibraryItemId proto");
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final int y(String str) {
        switch (str.hashCode()) {
            case -1544438277:
                if (str.equals("episode")) {
                    return 6;
                }
                break;
            case -906335517:
                if (str.equals("season")) {
                    return 5;
                }
                break;
            case 3529469:
                if (str.equals("show")) {
                    return 4;
                }
                break;
            case 104087344:
                if (str.equals("movie")) {
                    return 3;
                }
                break;
        }
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case -1853006109:
                if (upperCase.equals("SEASON")) {
                    return 5;
                }
                break;
            case -826455589:
                if (upperCase.equals("EPISODE")) {
                    return 6;
                }
                break;
            case -349232877:
                if (upperCase.equals("TRAILER")) {
                    return 7;
                }
                break;
            case 2544381:
                if (upperCase.equals("SHOW")) {
                    return 4;
                }
                break;
            case 73549584:
                if (upperCase.equals("MOVIE")) {
                    return 3;
                }
                break;
            case 437714322:
                if (upperCase.equals("TYPE_UNSPECIFIED")) {
                    return 2;
                }
                break;
            case 573789423:
                if (upperCase.equals("UNRECOGNIZED")) {
                    return 1;
                }
                break;
        }
        throw new IllegalArgumentException();
    }
}
