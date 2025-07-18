package defpackage;

import android.content.SharedPreferences;
import com.google.android.videos.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwz {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/download/DownloadDialogCreatorImpl");
    public final SharedPreferences b;
    public final mem c;
    public final xmg d;
    public final ino e;
    public final lfn f;
    public final yow g;
    public int h;
    public yjv i;
    public final jdr j;
    private final ikm k;

    public iwz(SharedPreferences sharedPreferences, jdr jdrVar, mem memVar, xmg xmgVar, ino inoVar, ikm ikmVar, lfn lfnVar, yow yowVar) {
        sharedPreferences.getClass();
        memVar.getClass();
        inoVar.getClass();
        ikmVar.getClass();
        lfnVar.getClass();
        this.b = sharedPreferences;
        this.j = jdrVar;
        this.c = memVar;
        this.d = xmgVar;
        this.e = inoVar;
        this.k = ikmVar;
        this.f = lfnVar;
        this.g = yowVar;
    }

    public static final void c(by byVar, Exception exc) {
        if (byVar.isFinishing() || byVar.getSupportFragmentManager().ab()) {
            return;
        }
        int i = true != (exc instanceof IOException) ? R.string.error_generic : R.string.download_start_no_network_title;
        String string = byVar.getString(i);
        string.getClass();
        try {
            rub rubVar = new rub((char[]) null);
            rubVar.k(i);
            rubVar.j(string);
            mvc.a(rubVar.i()).show(byVar.getSupportFragmentManager(), "NoPreferredNetworkDialogFragment");
        } catch (Exception e) {
            ((tug) ((tug) a.f()).i(e).j("com/google/android/apps/googletv/app/download/DownloadDialogCreatorImpl", "showDownloadErrorDialog", 699, "DownloadDialogCreatorImpl.kt")).s("Unexpected error when trying to show download error dialog");
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Iterable, java.lang.Object] */
    public final ebf a(by byVar, enr enrVar, String str, String str2) {
        int i;
        String str3;
        int iMax = Math.max(byVar.getResources().getDisplayMetrics().widthPixels, byVar.getResources().getDisplayMetrics().heightPixels);
        int iMin = Math.min(byVar.getResources().getDisplayMetrics().heightPixels, byVar.getResources().getDisplayMetrics().widthPixels);
        boolean zE = yks.e(str == null ? this.b.getString(krh.DOWNLOAD_QUALITY, byVar.getString(R.string.quality_sd)) : str, byVar.getString(R.string.quality_sd));
        int i2 = 1;
        if (true == zE) {
            iMin = 719;
        }
        if (true == zE) {
            iMax = 1279;
        }
        eyu eyuVar = new eyu(eyv.ao);
        eyuVar.t();
        eyuVar.u(iMax, iMin);
        eyuVar.c = 30;
        eyuVar.r();
        String string = str2 == null ? this.b.getString(krh.AUDIO_LANGUAGE, null) : str2;
        if (string != null && !yks.e(string, "original")) {
            eyuVar.v(ylh.ag(string, string));
        }
        ArrayList arrayList = new ArrayList();
        int iA = enrVar.a();
        int i3 = 0;
        while (i3 < iA) {
            gsf gsfVarF = enrVar.f(i3);
            gsfVarF.getClass();
            ?? r12 = gsfVarF.b;
            r12.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r12.iterator();
            while (true) {
                i = 10;
                if (!it.hasNext()) {
                    break;
                }
                List list = ((enp) it.next()).c;
                list.getClass();
                ArrayList arrayList3 = new ArrayList(yfm.z(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    dze[] dzeVarArr = new dze[i2];
                    dzeVarArr[0] = ((enz) it2.next()).e;
                    arrayList3.add(new eba(dzeVarArr));
                }
                yfm.I(arrayList2, arrayList3);
            }
            int i4 = 0;
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                eba ebaVar = (eba) it3.next();
                ymd ymdVarR = ykn.r(i4, ebaVar.c);
                ArrayList arrayList5 = new ArrayList(yfm.z(ymdVarR, i));
                yhf it4 = ymdVarR.iterator();
                while (((ymc) it4).a) {
                    arrayList5.add(new ygb(ebaVar, Integer.valueOf(it4.a()), ebaVar.c(0)));
                    it3 = it3;
                }
                yfm.I(arrayList4, arrayList5);
                i4 = 0;
                i = 10;
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : arrayList4) {
                Object obj2 = ((ygb) obj).c;
                obj2.getClass();
                String str4 = ((dze) obj2).Y;
                if (str4 != null && ylh.ac(str4, "video")) {
                    arrayList6.add(obj);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            for (Object obj3 : arrayList6) {
                Object obj4 = ((ygb) obj3).c;
                obj4.getClass();
                dze dzeVar = (dze) obj4;
                if (dzeVar.ag <= iMin && dzeVar.af <= iMax) {
                    arrayList7.add(obj3);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj5 : arrayList4) {
                Object obj6 = ((ygb) obj5).c;
                obj6.getClass();
                dze dzeVar2 = (dze) obj6;
                String str5 = dzeVar2.Y;
                if (str5 != null && ylh.ac(str5, "audio") && (str3 = dzeVar2.N) != null && (string == null || yks.e(ylh.ag(string, string), str3))) {
                    arrayList8.add(obj5);
                }
            }
            ygb ygbVar = (ygb) yfm.Y(arrayList7, new acs(new dsc(7), 8, null));
            if (ygbVar != null) {
                arrayList.add(new ebb((eba) ygbVar.a, yfm.p(Integer.valueOf(((Number) ygbVar.b).intValue()))));
            }
            ygb ygbVar2 = (ygb) yfm.Y(arrayList8, new acs(new dsc(8), 9, null));
            if (ygbVar2 != null) {
                arrayList.add(new ebb((eba) ygbVar2.a, ((Number) ygbVar2.b).intValue()));
            }
            i3++;
            i2 = 1;
        }
        eyuVar.p();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            eyuVar.o((ebb) it5.next());
        }
        return new eyv(eyuVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.ksy r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.iwx
            if (r0 == 0) goto L13
            r0 = r6
            iwx r0 = (defpackage.iwx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iwx r0 = new iwx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r6)
            goto L3e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r6)
            ikm r6 = r4.k
            java.lang.String r5 = r5.c
            r0.c = r3
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 == r1) goto L8f
        L3e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.yfm.z(r6, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r6.next()
            imf r0 = (defpackage.imf) r0
            java.lang.String r0 = r0.c
            r5.add(r0)
            goto L4f
        L61:
            boolean r6 = r5.isEmpty()
            r0 = 0
            if (r6 == 0) goto L6a
        L68:
            r3 = r0
            goto L8a
        L6a:
            java.util.Iterator r5 = r5.iterator()
        L6e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = "tftag;res_hd"
            boolean r1 = defpackage.yks.e(r6, r1)
            if (r1 != 0) goto L8a
            java.lang.String r1 = "tftag;res_4k"
            boolean r6 = defpackage.yks.e(r6, r1)
            if (r6 == 0) goto L6e
        L8a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwz.b(ksy, yih):java.lang.Object");
    }
}
