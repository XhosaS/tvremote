package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpl implements jbd {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/ondevice/sources/CloudSearchableSources");
    public final PackageManager b;
    public final ett c;
    private final fiu d;
    private final agow e;

    public gpl(ett ettVar, fiu fiuVar, PackageManager packageManager, agow agowVar) {
        ettVar.getClass();
        fiuVar.getClass();
        agowVar.getClass();
        this.c = ettVar;
        this.d = fiuVar;
        this.b = packageManager;
        this.e = agowVar;
    }

    public final Object a(agsw agswVar) {
        List listC = c();
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((jba) it.next()).i());
        }
        Object objP = this.d.p(arrayList, agswVar);
        return objP == agtg.a ? objP : agpu.a;
    }

    @Override // defpackage.jbd
    public final Object b(agsw agswVar) {
        Object objA = a(agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    @Override // defpackage.jbj
    public final List c() {
        abxs abxsVar = ((acfo) this.e.a()).b;
        abxsVar.getClass();
        return agxv.b(new agxn(new agyk(new agxn(agqq.C(abxsVar), true, new agux() { // from class: gpi
            @Override // defpackage.agux
            public final Object a(Object obj) {
                String str = (String) obj;
                str.getClass();
                boolean z = false;
                if (!str.startsWith("com.google.") && !str.startsWith("com.android.")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }), new agux() { // from class: gpj
            @Override // defpackage.agux
            public final Object a(Object obj) throws PackageManager.NameNotFoundException {
                gpl gplVar = this.a;
                String str = (String) obj;
                if (str != null) {
                    try {
                        ett ettVar = gplVar.c;
                        PackageInfo packageInfo = gplVar.b.getPackageInfo(str, 0);
                        packageInfo.getClass();
                        eup eupVar = ettVar.a.a;
                        return new jaz((gtu) eupVar.bE.a(), (fcu) eupVar.fb.a(), eupVar.ct(), packageInfo, eupVar.k());
                    } catch (PackageManager.NameNotFoundException e) {
                        ((zdv) ((zdv) gpl.a.b()).p(e).q("com/google/android/apps/tvsearch/ondevice/sources/CloudSearchableSources", "createSearchableSource", 100, "CloudSearchableSources.kt")).x("Source not found for package: %s", str);
                    }
                }
                return null;
            }
        }), false, new agux() { // from class: agyc
            @Override // defpackage.agux
            public final Object a(Object obj) {
                return Boolean.valueOf(obj == null);
            }
        }));
    }
}
