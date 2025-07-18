package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.apps.play.movies.mobile.MobileVideosApplication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uun extends twx {
    public static final /* synthetic */ int b = 0;
    private static final long c = TimeUnit.HOURS.toSeconds(1);
    public final Context a;
    private final yfo d;
    private final uuv e;
    private final uup f;

    public uun(Context context, uup uupVar, yfo yfoVar, yfo yfoVar2) {
        super(null);
        this.e = new uuv(c);
        this.a = context;
        this.f = uupVar;
        this.d = new uul(context, yfoVar2);
    }

    private final void e(uuz uuzVar, uhp uhpVar) {
        uup uupVar = this.f;
        uho uhoVar = uupVar.b;
        if (uhoVar == null) {
            synchronized (uupVar) {
                uhoVar = uupVar.b;
                if (uhoVar == null) {
                    uhoVar = new uho();
                    uupVar.b = uhoVar;
                }
            }
        }
        sfy.K(uhoVar.b(uupVar.a, false, true), trc.e(new uum(this, uhpVar, uuzVar, 0)), ugk.a);
    }

    @Override // defpackage.twx, defpackage.tvw
    public final void b(RuntimeException runtimeException, tvu tvuVar) {
        Log.e("ClientLoggingBackend", "Internal logging error", runtimeException);
    }

    @Override // defpackage.tvw
    public final void c(tvu tvuVar) {
        uul uulVar;
        ArrayList<uut> arrayList;
        String str = (String) uui.a(tvuVar, uuk.a);
        uhp uhpVar = (uhp) (str == null ? trk.a : tst.i(sfy.C(str))).e(sfy.C(null));
        uul uulVar2 = (uul) this.d;
        uut uutVar = new uut(uulVar2.b().b(tvuVar, 3, uui.b), uhpVar, tvuVar.e());
        String str2 = tvuVar.m() != null ? tvuVar.m().b : null;
        uuv uuvVar = this.e;
        uuu uuuVar = new uuu(tvuVar.f(), str2);
        synchronized (uuvVar) {
            long j = uutVar.b;
            if (j >= uuvVar.b || uuvVar.c.size() >= 1000) {
                LinkedHashMap linkedHashMap = uuvVar.c;
                Collection collectionValues = linkedHashMap.values();
                long nanos = TimeUnit.SECONDS.toNanos(uuvVar.a);
                Iterator it = collectionValues.iterator();
                int size = linkedHashMap.size();
                while (it.hasNext()) {
                    uut uutVar2 = (uut) it.next();
                    uulVar = uulVar2;
                    long j2 = uutVar2.b + nanos;
                    if (j2 >= j && size <= 1000) {
                        uuvVar.b = j2;
                        break;
                    }
                    if (uutVar2.c > 0 && uuvVar.d.size() < 1000) {
                        uuvVar.d.add(uutVar2);
                    }
                    it.remove();
                    size--;
                    uulVar2 = uulVar;
                }
                uulVar = uulVar2;
            } else {
                uulVar = uulVar2;
            }
            LinkedHashMap linkedHashMap2 = uuvVar.c;
            uut uutVar3 = (uut) linkedHashMap2.get(uuuVar);
            if (uutVar3 != null) {
                uutVar3.c++;
                synchronized (uuvVar) {
                    arrayList = uuvVar.d;
                    uuvVar.d = new ArrayList();
                }
                for (uut uutVar4 : arrayList) {
                    vtw vtwVar = uutVar4.d;
                    long j3 = uutVar4.c;
                    if (!vtwVar.b.A()) {
                        vtwVar.u();
                    }
                    uuz uuzVar = (uuz) vtwVar.b;
                    uuz uuzVar2 = uuz.a;
                    uuzVar.b |= 2;
                    uuzVar.d = j3;
                    e((uuz) vtwVar.r(), uutVar4.a);
                }
                return;
            }
            linkedHashMap2.put(uuuVar, uutVar);
            uui uuiVarB = uulVar.b();
            uug uugVarA = uuh.a();
            uugVarA.b(true);
            uugVarA.c(true);
            uugVarA.d(true);
            vtw vtwVarB = uuiVarB.b(tvuVar, 2, uugVarA.a());
            Throwable th = (Throwable) uui.a(tvuVar, tul.a);
            if (tvuVar.p().intValue() >= Integer.MAX_VALUE && !(th instanceof tut)) {
                udb udbVar = ((uuz) vtwVarB.b).g;
                if (udbVar == null) {
                    udbVar = udb.a;
                }
                vtw vtwVar2 = (vtw) udbVar.a(5, null);
                vtwVar2.x(udbVar);
                vtw vtwVarAy = sfy.ay(new uuo(th));
                if (!vtwVar2.b.A()) {
                    vtwVar2.u();
                }
                udb udbVar2 = (udb) vtwVar2.b;
                udg udgVar = (udg) vtwVarAy.r();
                udgVar.getClass();
                udbVar2.k = udgVar;
                udbVar2.b |= 1024;
                udb udbVar3 = (udb) vtwVar2.r();
                if (!vtwVarB.b.A()) {
                    vtwVarB.u();
                }
                uuz uuzVar3 = (uuz) vtwVarB.b;
                udbVar3.getClass();
                uuzVar3.g = udbVar3;
                uuzVar3.b |= 32;
            }
            e((uuz) vtwVarB.r(), uhpVar);
        }
    }

    @Override // defpackage.tvw
    public final boolean d(Level level) {
        int i = MobileVideosApplication.j;
        return level.intValue() >= Level.WARNING.intValue();
    }
}
