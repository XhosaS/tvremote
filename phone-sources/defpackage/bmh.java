package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bko;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmh {
    public final bmt a;
    public final bmd c;
    public bmr e;
    private final bzz h;
    private jl i;
    public final bmr b = new bmr(2, null, 6);
    public final ydk g = new ydk(null, null, null);
    public final bkp d = new bzi<bmr>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // defpackage.bzi
        public final /* bridge */ /* synthetic */ bko d() {
            return this.a.b;
        }

        @Override // defpackage.bzi
        public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.a.b.hashCode();
        }
    };
    public final kc f = new kc(1);

    public bmh(bmt bmtVar, bzz bzzVar) {
        this.a = bmtVar;
        this.h = bzzVar;
        this.c = new bmd(this, bzzVar);
    }

    private final void k() {
        bzm bzmVar;
        bmr bmrVar = this.e;
        if (bmrVar == null) {
            return;
        }
        f(null);
        bmp bmpVar = bmp.a;
        bmp bmpVar2 = bmp.d;
        bmrVar.m(bmpVar, bmpVar2);
        if (!bmrVar.q.A) {
            bty.c("visitAncestors called on an unattached node");
        }
        bko bkoVar = bmrVar.q.t;
        bys bysVarI = fh.I(bmrVar);
        while (bysVarI != null) {
            if ((bysVarI.t.f.s & 1024) != 0) {
                while (bkoVar != null) {
                    if ((bkoVar.r & 1024) != 0) {
                        bfz bfzVar = null;
                        bko bkoVarF = bkoVar;
                        while (bkoVarF != null) {
                            if (bkoVarF instanceof bmr) {
                                ((bmr) bkoVarF).m(bmp.b, bmpVar2);
                            } else if ((bkoVarF.r & 1024) != 0 && (bkoVarF instanceof bxw)) {
                                int i = 0;
                                for (bko bkoVar2 = ((bxw) bkoVarF).C; bkoVar2 != null; bkoVar2 = bkoVar2.u) {
                                    if ((bkoVar2.r & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            bkoVarF = bkoVar2;
                                        } else {
                                            if (bfzVar == null) {
                                                bfzVar = new bfz(new bko[16], 0);
                                            }
                                            if (bkoVarF != null) {
                                                bfzVar.o(bkoVarF);
                                            }
                                            bfzVar.o(bkoVar2);
                                            bkoVarF = null;
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            bkoVarF = fh.F(bfzVar);
                        }
                    }
                    bkoVar = bkoVar.t;
                }
            }
            bysVarI = bysVarI.j();
            bkoVar = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
        }
    }

    public final bmr a() {
        return d.G(this.b);
    }

    public final bmy b() {
        bmr bmrVarA = a();
        if (bmrVarA != null) {
            return d.I(bmrVarA);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v12, types: [bko] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v10, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v11, types: [bmr] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean c(int r20, defpackage.bmy r21, defpackage.yjv r22) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmh.c(int, bmy, yjv):java.lang.Boolean");
    }

    public final void d(boolean z) {
        i(z, true, 8);
    }

    public final void e() {
        this.a.b();
    }

    public final void f(bmr bmrVar) {
        bys bysVarI;
        cfc cfcVarP;
        bys bysVarI2;
        cfc cfcVarP2;
        bmr bmrVar2 = this.e;
        this.e = bmrVar;
        kc kcVar = this.f;
        Object[] objArr = kcVar.a;
        int i = kcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            bla blaVar = (bla) objArr[i2];
            if (bmrVar2 != null && (bysVarI2 = fh.I(bmrVar2)) != null && (cfcVarP2 = bysVarI2.p()) != null && bdi.v(cfcVarP2)) {
                bb$$ExternalSyntheticApiModelOutline1.m69m(blaVar.i.a).notifyViewExited(blaVar.a, bysVarI2.c);
            }
            if (bmrVar != null && (bysVarI = fh.I(bmrVar)) != null && (cfcVarP = bysVarI.p()) != null && bdi.v(cfcVarP)) {
                int i3 = bysVarI.c;
                blaVar.b.a.b(i3, new bkv(blaVar, i3));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0191 A[Catch: all -> 0x035e, TryCatch #0 {all -> 0x035e, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0015, B:8:0x0025, B:10:0x0029, B:11:0x0031, B:21:0x004c, B:24:0x0057, B:26:0x005d, B:27:0x0062, B:29:0x006a, B:31:0x006f, B:33:0x0075, B:37:0x007b, B:135:0x0191, B:137:0x0199, B:138:0x019c, B:140:0x01a9, B:173:0x020c, B:175:0x0212, B:177:0x0216, B:144:0x01b6, B:148:0x01c0, B:151:0x01c6, B:152:0x01cb, B:171:0x0204, B:153:0x01cf, B:155:0x01d5, B:157:0x01d9, B:159:0x01e1, B:161:0x01e7, B:165:0x01ef, B:167:0x01f8, B:168:0x01fb, B:169:0x01ff, B:172:0x0209, B:180:0x021d, B:182:0x0225, B:188:0x023b, B:189:0x024b, B:191:0x024f, B:193:0x0253, B:221:0x02ab, B:196:0x025c, B:198:0x0265, B:200:0x0269, B:202:0x0270, B:204:0x0276, B:206:0x027a, B:207:0x027d, B:209:0x0283, B:210:0x028a, B:212:0x0292, B:214:0x0298, B:215:0x029b, B:216:0x029d, B:218:0x02a3, B:219:0x02a6, B:222:0x02b6, B:225:0x02c4, B:226:0x02d4, B:228:0x02d8, B:230:0x02dc, B:258:0x0335, B:233:0x02e6, B:235:0x02ef, B:237:0x02f3, B:239:0x02fa, B:241:0x0300, B:243:0x0304, B:244:0x0307, B:246:0x030d, B:247:0x0314, B:249:0x031c, B:251:0x0322, B:252:0x0325, B:253:0x0327, B:255:0x032d, B:256:0x0330, B:260:0x0342, B:262:0x0349, B:41:0x0083, B:43:0x0089, B:44:0x008c, B:46:0x0094, B:77:0x00ed, B:79:0x00f3, B:81:0x00f7, B:50:0x00a1, B:54:0x00ab, B:84:0x00fd, B:86:0x0101, B:57:0x00b0, B:59:0x00b6, B:61:0x00ba, B:63:0x00c2, B:65:0x00c8, B:69:0x00d0, B:71:0x00d9, B:72:0x00dc, B:73:0x00e0, B:75:0x00e5, B:76:0x00ea, B:87:0x0107, B:89:0x010f, B:90:0x0112, B:92:0x011c, B:123:0x0175, B:125:0x017b, B:127:0x017f, B:96:0x0129, B:100:0x0133, B:130:0x0185, B:132:0x0189, B:103:0x0138, B:105:0x013e, B:107:0x0142, B:109:0x014a, B:111:0x0150, B:115:0x0158, B:117:0x0161, B:118:0x0164, B:119:0x0168, B:121:0x016d, B:122:0x0172, B:12:0x0035, B:14:0x003b, B:16:0x003f, B:18:0x0045, B:20:0x0049), top: B:271:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024f A[Catch: all -> 0x035e, TryCatch #0 {all -> 0x035e, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0015, B:8:0x0025, B:10:0x0029, B:11:0x0031, B:21:0x004c, B:24:0x0057, B:26:0x005d, B:27:0x0062, B:29:0x006a, B:31:0x006f, B:33:0x0075, B:37:0x007b, B:135:0x0191, B:137:0x0199, B:138:0x019c, B:140:0x01a9, B:173:0x020c, B:175:0x0212, B:177:0x0216, B:144:0x01b6, B:148:0x01c0, B:151:0x01c6, B:152:0x01cb, B:171:0x0204, B:153:0x01cf, B:155:0x01d5, B:157:0x01d9, B:159:0x01e1, B:161:0x01e7, B:165:0x01ef, B:167:0x01f8, B:168:0x01fb, B:169:0x01ff, B:172:0x0209, B:180:0x021d, B:182:0x0225, B:188:0x023b, B:189:0x024b, B:191:0x024f, B:193:0x0253, B:221:0x02ab, B:196:0x025c, B:198:0x0265, B:200:0x0269, B:202:0x0270, B:204:0x0276, B:206:0x027a, B:207:0x027d, B:209:0x0283, B:210:0x028a, B:212:0x0292, B:214:0x0298, B:215:0x029b, B:216:0x029d, B:218:0x02a3, B:219:0x02a6, B:222:0x02b6, B:225:0x02c4, B:226:0x02d4, B:228:0x02d8, B:230:0x02dc, B:258:0x0335, B:233:0x02e6, B:235:0x02ef, B:237:0x02f3, B:239:0x02fa, B:241:0x0300, B:243:0x0304, B:244:0x0307, B:246:0x030d, B:247:0x0314, B:249:0x031c, B:251:0x0322, B:252:0x0325, B:253:0x0327, B:255:0x032d, B:256:0x0330, B:260:0x0342, B:262:0x0349, B:41:0x0083, B:43:0x0089, B:44:0x008c, B:46:0x0094, B:77:0x00ed, B:79:0x00f3, B:81:0x00f7, B:50:0x00a1, B:54:0x00ab, B:84:0x00fd, B:86:0x0101, B:57:0x00b0, B:59:0x00b6, B:61:0x00ba, B:63:0x00c2, B:65:0x00c8, B:69:0x00d0, B:71:0x00d9, B:72:0x00dc, B:73:0x00e0, B:75:0x00e5, B:76:0x00ea, B:87:0x0107, B:89:0x010f, B:90:0x0112, B:92:0x011c, B:123:0x0175, B:125:0x017b, B:127:0x017f, B:96:0x0129, B:100:0x0133, B:130:0x0185, B:132:0x0189, B:103:0x0138, B:105:0x013e, B:107:0x0142, B:109:0x014a, B:111:0x0150, B:115:0x0158, B:117:0x0161, B:118:0x0164, B:119:0x0168, B:121:0x016d, B:122:0x0172, B:12:0x0035, B:14:0x003b, B:16:0x003f, B:18:0x0045, B:20:0x0049), top: B:271:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107 A[Catch: all -> 0x035e, TryCatch #0 {all -> 0x035e, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0015, B:8:0x0025, B:10:0x0029, B:11:0x0031, B:21:0x004c, B:24:0x0057, B:26:0x005d, B:27:0x0062, B:29:0x006a, B:31:0x006f, B:33:0x0075, B:37:0x007b, B:135:0x0191, B:137:0x0199, B:138:0x019c, B:140:0x01a9, B:173:0x020c, B:175:0x0212, B:177:0x0216, B:144:0x01b6, B:148:0x01c0, B:151:0x01c6, B:152:0x01cb, B:171:0x0204, B:153:0x01cf, B:155:0x01d5, B:157:0x01d9, B:159:0x01e1, B:161:0x01e7, B:165:0x01ef, B:167:0x01f8, B:168:0x01fb, B:169:0x01ff, B:172:0x0209, B:180:0x021d, B:182:0x0225, B:188:0x023b, B:189:0x024b, B:191:0x024f, B:193:0x0253, B:221:0x02ab, B:196:0x025c, B:198:0x0265, B:200:0x0269, B:202:0x0270, B:204:0x0276, B:206:0x027a, B:207:0x027d, B:209:0x0283, B:210:0x028a, B:212:0x0292, B:214:0x0298, B:215:0x029b, B:216:0x029d, B:218:0x02a3, B:219:0x02a6, B:222:0x02b6, B:225:0x02c4, B:226:0x02d4, B:228:0x02d8, B:230:0x02dc, B:258:0x0335, B:233:0x02e6, B:235:0x02ef, B:237:0x02f3, B:239:0x02fa, B:241:0x0300, B:243:0x0304, B:244:0x0307, B:246:0x030d, B:247:0x0314, B:249:0x031c, B:251:0x0322, B:252:0x0325, B:253:0x0327, B:255:0x032d, B:256:0x0330, B:260:0x0342, B:262:0x0349, B:41:0x0083, B:43:0x0089, B:44:0x008c, B:46:0x0094, B:77:0x00ed, B:79:0x00f3, B:81:0x00f7, B:50:0x00a1, B:54:0x00ab, B:84:0x00fd, B:86:0x0101, B:57:0x00b0, B:59:0x00b6, B:61:0x00ba, B:63:0x00c2, B:65:0x00c8, B:69:0x00d0, B:71:0x00d9, B:72:0x00dc, B:73:0x00e0, B:75:0x00e5, B:76:0x00ea, B:87:0x0107, B:89:0x010f, B:90:0x0112, B:92:0x011c, B:123:0x0175, B:125:0x017b, B:127:0x017f, B:96:0x0129, B:100:0x0133, B:130:0x0185, B:132:0x0189, B:103:0x0138, B:105:0x013e, B:107:0x0142, B:109:0x014a, B:111:0x0150, B:115:0x0158, B:117:0x0161, B:118:0x0164, B:119:0x0168, B:121:0x016d, B:122:0x0172, B:12:0x0035, B:14:0x003b, B:16:0x003f, B:18:0x0045, B:20:0x0049), top: B:271:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.KeyEvent r14, defpackage.yjk r15) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmh.g(android.view.KeyEvent, yjk):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(int i) {
        View viewB;
        Boolean boolC;
        ylf ylfVar = new ylf();
        ylfVar.a = false;
        ydk ydkVar = this.g;
        int i2 = ydkVar.a;
        bmr bmrVar = this.e;
        bmt bmtVar = this.a;
        Boolean boolC2 = c(i, bmtVar.a(), new bmg(ylfVar, i));
        int i3 = ydkVar.a;
        if (yks.e(boolC2, true) && bmrVar != this.e) {
            return true;
        }
        if (boolC2 != null && ylfVar.a != null) {
            if (boolC2.booleanValue() && ((Boolean) ylfVar.a).booleanValue()) {
                return true;
            }
            if (d.R(i)) {
                return i(false, false, i) && (boolC = c(i, null, new cba(i, 1))) != null && boolC.booleanValue();
            }
            if (!a.r(i, 7) && !a.r(i, 8)) {
                Integer numW = d.W(i);
                if (numW == null) {
                    throw new IllegalStateException("Invalid focus direction");
                }
                int iIntValue = numW.intValue();
                cbc cbcVar = (cbc) bmtVar;
                bmy bmyVarA = cbcVar.a();
                Rect rectM = bmyVarA != null ? bnj.m(bmyVarA) : null;
                ccw ccwVar = ccy.a;
                ccy ccyVarQ = cbp.q();
                if (rectM == null) {
                    viewB = ccyVarQ.a((ViewGroup) bmtVar, cbcVar.findFocus(), iIntValue);
                } else {
                    Rect rect = ccyVarQ.b;
                    rect.set(rectM);
                    ViewGroup viewGroupC = ccy.c((ViewGroup) bmtVar, null);
                    ArrayList arrayList = ccyVarQ.c;
                    try {
                        arrayList.clear();
                        cbp.p(viewGroupC, arrayList, iIntValue);
                        viewB = arrayList.isEmpty() ? null : ccyVarQ.b(viewGroupC, null, rect, iIntValue, arrayList);
                    } finally {
                        arrayList.clear();
                    }
                }
                if (viewB != null && d.X(viewB, Integer.valueOf(iIntValue), rectM)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z, boolean z2, int i) {
        boolean z3;
        if (z) {
            k();
        } else {
            int iM = d.M(this.b, i);
            int i2 = iM - 1;
            if (iM == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw new yfu();
                }
                z3 = false;
                if (z3 || !z2) {
                    return z3;
                }
                e();
                return true;
            }
            k();
        }
        z3 = true;
        if (z3) {
        }
        return z3;
    }

    public final bmp j() {
        return this.b.e();
    }
}
