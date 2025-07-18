package defpackage;

import android.app.Notification;
import android.content.pm.PackageInfo;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crp {
    static Notification.Style a() {
        return new Notification.DecoratedCustomViewStyle();
    }

    public static long b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    public static /* synthetic */ List d(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static final drj e(bao baoVar) {
        return (drj) baoVar.f(diy.e);
    }

    public static Object f(djg djgVar, Object obj, yjz yjzVar) {
        return yjzVar.a(obj, djgVar);
    }

    public static boolean g(djg djgVar, yjv yjvVar) {
        return ((Boolean) yjvVar.a(djgVar)).booleanValue();
    }

    public static boolean h(djg djgVar, yjv yjvVar) {
        return ((Boolean) yjvVar.a(djgVar)).booleanValue();
    }

    public static djh i(djh djhVar, djh djhVar2) {
        return djhVar2 == djh.b ? djhVar : new dix(djhVar, djhVar2);
    }

    public static final void j(djd djdVar, diz dizVar) {
        if (dizVar != null) {
            djdVar.d.add(dizVar);
        }
    }
}
