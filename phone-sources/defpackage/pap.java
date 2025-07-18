package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pap implements ufw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pap(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, tsl] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, tsl] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, tsl] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ufw
    public final uhp a(Object obj) {
        uhp uhpVarB;
        int i = 0;
        boolean zA = true;
        switch (this.c) {
            case 0:
                ArrayList arrayList = new ArrayList();
                paq paqVar = (paq) this.a;
                pim pimVarA = ((pir) paqVar.b).b();
                UnmodifiableIterator it = ((ImmutableSet) obj).iterator();
                while (it.hasNext()) {
                    Object obj2 = this.b;
                    String str = (String) it.next();
                    pii piiVar = (pii) paqVar.a.get(str);
                    if (piiVar != null) {
                        arrayList.add(piiVar.a(((pam) obj2).b));
                    } else if (pimVarA != null) {
                        arrayList.add(pimVarA.d(str));
                    }
                }
                return arrayList.isEmpty() ? sfy.C(ImmutableMap.of()) : ufn.i(sfy.z(arrayList), new oyj(8), paqVar.c);
            case 1:
                ntf ntfVar = (ntf) obj;
                ?? r0 = this.a;
                if (ntfVar != null) {
                    return r0;
                }
                uhp uhpVar = ((nsw) this.b).l;
                return uhpVar == null ? sfy.C(null) : uhpVar;
            case 2:
                pfh.a.l().E("%s promos replaced with %s promos for account: %s", (Integer) obj, Integer.valueOf(this.a.size()), this.b);
                return uhl.a;
            case 3:
                List list = (List) obj;
                list.getClass();
                Object obj3 = this.a;
                String str2 = (String) obj3;
                String strV = qtl.v(str2);
                List listAc = yfm.ac(list);
                LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(yfm.z(listAc, 10)), 16));
                Iterator it2 = listAc.iterator();
                while (true) {
                    Object obj4 = this.b;
                    int i2 = 2;
                    if (!it2.hasNext()) {
                        return ufn.j(((pdw) ((pfh) obj4).l.g(str2)).b(linkedHashMap), new pap(list, obj3, i2), ugk.a);
                    }
                    Object next = it2.next();
                    pfh pfhVar = (pfh) obj4;
                    ((snf) ((qoj) pfhVar.g.b()).s.get()).b(pfhVar.c, strV);
                    linkedHashMap.put(osk.u((uwi) next), next);
                }
            case 4:
                return ((phz) this.a).d.i((oyd) this.b, null);
            case 5:
                pjd pjdVar = (pjd) obj;
                int i3 = pjdVar.b;
                Object obj5 = this.a;
                if (i3 == 1) {
                    uhpVarB = sfy.C(true);
                } else {
                    pjo pjoVar = (pjo) obj5;
                    uho uhoVar = pjoVar.f;
                    if (uhoVar == null) {
                        synchronized (obj5) {
                            uhoVar = ((pjo) obj5).f;
                            if (uhoVar == null) {
                                uhoVar = new uho();
                                ((pjo) obj5).f = uhoVar;
                            }
                        }
                    }
                    uhpVarB = uhoVar.b(pjoVar.a, ((qit) pjoVar.c).a().booleanValue(), true);
                }
                pjo pjoVar2 = (pjo) obj5;
                return ufn.j(uhpVarB, new oyy(pjoVar2, (pjn) this.b, pjdVar, 4), pjoVar2.b);
            case 6:
                prt prtVar = (prt) obj;
                xhd xhdVar = xhc.a.get();
                pro proVar = (pro) this.b;
                if (xhdVar.c(proVar.c) && ((uzr) this.a).b.size() > 0) {
                    uzr uzrVar = prtVar.b;
                    if (uzrVar == null) {
                        uzrVar = uzr.a;
                    }
                    if (uzrVar.b.size() == 0) {
                        tko tkoVar = proVar.d;
                        ((slf) ((riv) tkoVar.b).g).a((Uri) tkoVar.a);
                        return proVar.f.p();
                    }
                }
                return sfy.C(prtVar);
            case 7:
                rjq rjqVar = (rjq) obj;
                ((AtomicReference) ((rla) this.b).b).set(rjqVar);
                return (uhp) this.a.apply(rjqVar);
            case 8:
                final List list2 = (List) obj;
                final ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (true) {
                    Object obj6 = this.b;
                    if (!it3.hasNext()) {
                        final vvd vvdVar = (vvd) obj6;
                        return szg.r(new Callable() { // from class: rkg
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:84:0x01a4 A[Catch: all -> 0x00b1, uil -> 0x00b4, MdiOwnersLoader$MdiException | uil -> 0x00b7, PHI: r7
  0x01a4: PHI (r7v19 int) = (r7v18 int), (r7v20 int) binds: [B:81:0x019f, B:83:0x01a2] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0035, B:6:0x0041, B:8:0x0047, B:19:0x0089, B:20:0x008d, B:22:0x0091, B:33:0x00ba, B:35:0x00c2, B:39:0x00e1, B:41:0x00ed, B:42:0x00ef, B:44:0x00f7, B:48:0x0127, B:52:0x013b, B:53:0x013e, B:55:0x0146, B:57:0x0156, B:59:0x015a, B:61:0x0160, B:63:0x0164, B:65:0x016a, B:66:0x016c, B:67:0x016e, B:69:0x0174, B:71:0x0178, B:72:0x017d, B:73:0x0181, B:76:0x018a, B:86:0x01ab, B:85:0x01a7, B:84:0x01a4, B:92:0x01c9, B:94:0x01d1, B:96:0x01d5, B:97:0x01da, B:98:0x01db, B:99:0x01df, B:100:0x01e0, B:101:0x01e7, B:103:0x01e9, B:104:0x01f4, B:11:0x0058, B:15:0x006f, B:17:0x007e, B:18:0x0081, B:105:0x01f5, B:107:0x0207, B:112:0x021a, B:113:0x0224, B:114:0x0225, B:115:0x022f, B:116:0x0230), top: B:127:0x0035 }] */
                            /* JADX WARN: Type inference failed for: r7v0 */
                            /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r7v10 */
                            @Override // java.util.concurrent.Callable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object call() {
                                /*
                                    Method dump skipped, instructions count: 640
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.rkg.call():java.lang.Object");
                            }
                        }, ugk.a, sfy.M(arrayList2));
                    }
                    arrayList2.add((uhp) this.a.apply(((riv) ((vvd) obj6).c).a((Account) it3.next())));
                }
            case 9:
                rkk rkkVar = (rkk) this.b;
                rkkVar.g((rkd) obj);
                return (uhp) this.a.apply(rkkVar.a);
            case 10:
                return ((rsa) this.b).e.b(rsa.a((zat) obj, (rse) this.a));
            case 11:
                rvv rvvVar = (rvv) obj;
                vtw vtwVar = (vtw) rvvVar.a(5, null);
                vtwVar.x(rvvVar);
                vty vtyVar = (vty) vtwVar;
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                Object obj7 = this.b;
                Object obj8 = this.a;
                rvv rvvVar2 = (rvv) vtyVar.b;
                rvv rvvVar3 = rvv.a;
                obj8.getClass();
                rvvVar2.c = (zba) obj8;
                rvvVar2.b |= 1;
                rwd rwdVar = (rwd) obj7;
                return rwdVar.b.a(rwdVar.a, (rvv) vtyVar.r());
            case 12:
                Context context = ((rwv) this.b).c;
                int i4 = ryy.a;
                ImmutableList.Builder builder = ImmutableList.builder();
                builder.add((ImmutableList.Builder) context);
                int i5 = osx.a;
                builder.add((ImmutableList.Builder) osx.a(context));
                UnmodifiableIterator it4 = builder.build().iterator();
                while (it4.hasNext()) {
                    Object obj9 = this.a;
                    File file = new File(String.valueOf(((Context) it4.next()).getFilesDir()) + "/phenotype/shared/" + ((String) obj9));
                    if (file.exists()) {
                        zA = ryy.a(file);
                    }
                }
                return zA ? uhl.a : sfy.B(new IOException("Unable to remove snapshots for removed user"));
            case 13:
                ryz ryzVar = (ryz) this.b;
                return ((ulp) ryzVar.d.get()).aI(new tvv(ryzVar, (rza) this.a));
            case 14:
                return sfy.C(((slk) this.a).e((Uri) this.b));
            case 15:
                Object obj10 = this.b;
                return ufn.j(this.a, trc.c(new sls(obj10, i)), ((slw) obj10).c);
            case 16:
                return sfy.C(((slw) this.a).c((Uri) this.b));
            case 17:
                return sfy.C(((slw) this.a).g((Uri) this.b));
            default:
                Object obj11 = this.b;
                slz slzVar = (slz) obj11;
                slzVar.c((Uri) sfy.J(slzVar.a), obj);
                Object obj12 = slzVar.d;
                ?? r2 = this.a;
                synchronized (obj12) {
                    ((slz) obj11).e = r2;
                }
                return sfy.C(obj);
        }
    }

    public /* synthetic */ pap(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
