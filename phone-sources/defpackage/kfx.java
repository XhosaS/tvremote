package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.google.android.apps.googletv.app.presentation.pages.sharing.SendTextToClipboardActivity;
import com.google.android.apps.googletv.app.presentation.pages.webview.WebViewActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfx {
    public static final Intent a;
    public static final Intent b;
    public final List c;
    public final List d;
    private final List e;
    private final boolean f;

    static {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/jpeg");
        a = intent;
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType(WebViewActivity.URL_MIME_TYPE);
        b = intent2;
    }

    public kfx(xlw xlwVar, by byVar) {
        List listAf;
        ResolveInfo resolveInfoResolveActivity;
        xlwVar.getClass();
        xlx xlxVar = (xlx) xlwVar;
        vun vunVar = ((vxj) xlx.c.et(xlxVar.d)).b;
        vunVar.getClass();
        this.e = vunVar;
        vun vunVar2 = ((vxj) xlx.b.et(xlxVar.d)).b;
        vunVar2.getClass();
        this.c = vunVar2;
        boolean zBooleanValue = ((Boolean) xlx.a.et(xlxVar.d)).booleanValue();
        this.f = zBooleanValue;
        if (byVar != null) {
            Intent intent = a;
            PackageManager packageManager = byVar.getPackageManager();
            packageManager.getClass();
            List listB = b(a(intent, packageManager), vunVar2, zBooleanValue);
            Intent intent2 = b;
            PackageManager packageManager2 = byVar.getPackageManager();
            packageManager2.getClass();
            List listB2 = b(a(intent2, packageManager2), vunVar, false);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB2) {
                if (!this.c.contains(((ResolveInfo) obj).activityInfo.packageName)) {
                    arrayList.add(obj);
                }
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(byVar, (Class<?>) SendTextToClipboardActivity.class));
            if (Build.VERSION.SDK_INT >= 33) {
                resolveInfoResolveActivity = byVar.getPackageManager().resolveActivity(intent3, PackageManager.ResolveInfoFlags.of(0L));
                resolveInfoResolveActivity.getClass();
            } else {
                resolveInfoResolveActivity = byVar.getPackageManager().resolveActivity(intent3, 0);
                resolveInfoResolveActivity.getClass();
            }
            listAf = yfm.af(yfm.af(yfm.p(resolveInfoResolveActivity), listB), arrayList);
        } else {
            listAf = null;
        }
        this.d = listAf;
    }

    private static final List a(Intent intent, PackageManager packageManager) {
        List<ResolveInfo> listQueryIntentActivities;
        if (Build.VERSION.SDK_INT >= 33) {
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(131072L));
            listQueryIntentActivities.getClass();
        } else {
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
            listQueryIntentActivities.getClass();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQueryIntentActivities) {
            if (!yks.e(((ResolveInfo) obj).activityInfo.name, "com.google.android.apps.docs.drive.clipboard.SendTextToClipBoardActivity")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static final List b(List list, List list2, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(list2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (linkedHashSet.contains(((ResolveInfo) obj).activityInfo.packageName)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        yfw yfwVar = new yfw(arrayList, arrayList2);
        Object obj2 = yfwVar.a;
        List list3 = (List) yfwVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : (List) obj2) {
            String str = ((ResolveInfo) obj3).activityInfo.packageName;
            Object arrayList3 = linkedHashMap.get(str);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(str, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        if (z) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Iterable iterable = (List) linkedHashMap.get((String) it.next());
                if (iterable == null) {
                    iterable = yhb.a;
                }
                yfm.I(arrayList4, iterable);
            }
            return arrayList4;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Iterable iterable2 = (List) linkedHashMap.get((String) it2.next());
            if (iterable2 == null) {
                iterable2 = yhb.a;
            }
            yfm.I(arrayList5, iterable2);
        }
        return yfm.af(arrayList5, list3);
    }
}
