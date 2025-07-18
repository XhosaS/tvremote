package defpackage;

import android.app.Activity;
import android.app.Application;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvz {
    static void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public static final dvd b(dvd dvdVar, dvd dvdVar2) {
        dvdVar.getClass();
        return (dvdVar2 == null || dvdVar2.compareTo(dvdVar) >= 0) ? dvdVar : dvdVar2;
    }

    public static dwt c(dwx dwxVar, ymh ymhVar, dxj dxjVar) {
        return dwxVar.b(wef.o(ymhVar), dxjVar);
    }

    public static dwt d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static dwt e(dwx dwxVar, Class cls) {
        return dwxVar.a(cls);
    }

    public static final dxa f(dxc dxcVar, dwx dwxVar, dxj dxjVar) {
        dxcVar.getClass();
        dwxVar.getClass();
        dxjVar.getClass();
        return new dxa(dxcVar, dwxVar, dxjVar);
    }
}
