package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzx extends agtu implements agvb {
    int a;
    final /* synthetic */ Intent b;
    final /* synthetic */ hab c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzx(Intent intent, hab habVar, agsw agswVar) {
        super(2, agswVar);
        this.b = intent;
        this.c = habVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gzx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        ahbt ahbtVar;
        Uri data;
        String schemeSpecificPart;
        agtg agtgVar = agtg.a;
        if (this.a != 0) {
            ahbtVar = (ahbt) this.d;
            agpl.b(obj);
        } else {
            agpl.b(obj);
            ahbt ahbtVar2 = (ahbt) this.d;
            Intent intent = this.b;
            if (intent != null) {
                zdy zdyVar = hab.a;
                if (((agvy.c(intent.getAction(), "android.intent.action.PACKAGE_REMOVED") && !intent.getBooleanExtra("android.intent.extra.REPLACING", false)) || agvy.c(intent.getAction(), "android.intent.action.PACKAGE_FULLY_REMOVED")) && (data = intent.getData()) != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null) {
                    hab habVar = this.c;
                    this.d = ahbtVar2;
                    this.a = 1;
                    if (habVar.f.a(schemeSpecificPart, this) == agtgVar) {
                        return agtgVar;
                    }
                }
            }
            ahbtVar = ahbtVar2;
        }
        hab habVar2 = this.c;
        List listF = habVar2.f(hab.d);
        List listF2 = habVar2.f(hab.e);
        List listT = agqq.t(agqq.t(agqq.t(listF, listF2), habVar2.f(hab.c)), habVar2.f(hab.b));
        List listE = habVar2.e();
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            gzs gzsVarB = habVar2.b(habVar2.i, (String) it.next());
            if (gzsVarB != null) {
                arrayList.add(gzsVarB);
            }
        }
        ((zdv) hab.a.b().q("com/google/android/apps/tvsearch/platform/packagemanager/PackageCache", "queryImportantPackages", 163, "PackageCache.kt")).F("Apps for experience type %s: %s", habVar2.h, arrayList);
        List listT2 = agqq.t(listT, arrayList);
        int iB = agrj.b(agqq.i(listT2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : listT2) {
            linkedHashMap.put(((gzs) obj2).c, obj2);
        }
        habVar2.j = linkedHashMap;
        ArrayList arrayList2 = new ArrayList(agqq.i(listF, 10));
        Iterator it2 = listF.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((gzs) it2.next()).c);
        }
        habVar2.k = arrayList2;
        ArrayList arrayList3 = new ArrayList(agqq.i(listF2, 10));
        Iterator it3 = listF2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((gzs) it3.next()).c);
        }
        habVar2.l = arrayList3;
        return ahal.e(ahbtVar, null, 0, new gzw(habVar2, this.b, null), 3);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gzx gzxVar = new gzx(this.b, this.c, agswVar);
        gzxVar.d = obj;
        return gzxVar;
    }
}
