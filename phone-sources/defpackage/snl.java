package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snl implements Application.ActivityLifecycleCallbacks, sni {
    private static final long g = TimeUnit.MINUTES.toMillis(1);
    public final ScheduledExecutorService a;
    public ScheduledFuture d;
    public aafi f;
    private final snj h;
    public final AtomicLong c = new AtomicLong(0);
    public final long b = g;
    protected final Object e = new Object();

    private snl(aafi aafiVar, ScheduledExecutorService scheduledExecutorService, snj snjVar) {
        this.f = aafiVar;
        this.a = scheduledExecutorService;
        this.h = snjVar;
    }

    public static snl c(aafi aafiVar, ScheduledExecutorService scheduledExecutorService, snj snjVar, Application application) {
        snl snlVar = new snl(aafiVar, scheduledExecutorService, snjVar);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(snlVar);
        }
        snjVar.c = snlVar;
        return snlVar;
    }

    public final void a() {
        synchronized (this.e) {
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.d = null;
            }
        }
    }

    public final void b() {
        int i;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int i3;
        int i4;
        this.c.set(0L);
        aafi aafiVar = this.f;
        ArrayList arrayList3 = new ArrayList();
        snj snjVar = this.h;
        synchronized (snjVar.b) {
            Iterator it = snjVar.a.values().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                snh snhVar = (snh) it.next();
                sne[] sneVarArr = snhVar.c;
                HashMap map = new HashMap(sneVarArr.length > 0 ? 10 : 1);
                sng sngVar = new sng(snhVar.b, sneVarArr);
                synchronized (snhVar.a) {
                    sngVar.c = snhVar.d;
                    sngVar.d = snhVar.e;
                    snhVar.d = map;
                    snhVar.e = 0;
                }
                arrayList3.add(sngVar);
            }
        }
        vtw vtwVarM = trg.a.m();
        int size = arrayList3.size();
        int i5 = 0;
        while (true) {
            nsy nsyVarG = null;
            uvh uvhVar = null;
            if (i5 >= size) {
                trg trgVar = (trg) vtwVarM.r();
                if (trgVar.b.size() != 0) {
                    nsyVarG = ((nsz) aafiVar.a).g(trgVar);
                    nsyVarG.j = (String) aafiVar.b;
                    Iterator it2 = ((CopyOnWriteArrayList) aafiVar.c).iterator();
                    while (it2.hasNext()) {
                        nsyVarG.f((String) it2.next());
                    }
                }
                if (nsyVarG != null) {
                    nsyVarG.c();
                    return;
                }
                return;
            }
            sng sngVar2 = (sng) arrayList3.get(i5);
            if (sngVar2.d == 0) {
                arrayList = arrayList3;
                i2 = size;
            } else {
                vtw vtwVarM2 = uvh.a.m();
                String str = sngVar2.a;
                long jA = snj.a(str);
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                uvh uvhVar2 = (uvh) vtwVarM2.b;
                uvhVar2.b |= 2;
                uvhVar2.c = jA;
                sne[] sneVarArr2 = sngVar2.b;
                int length = sneVarArr2.length;
                for (int i6 = i; i6 < length; i6++) {
                    long jA2 = snj.a(sneVarArr2[i6].a);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    uvh uvhVar3 = (uvh) vtwVarM2.b;
                    vum vumVar = uvhVar3.d;
                    if (!vumVar.c()) {
                        uvhVar3.d = vuc.r(vumVar);
                    }
                    uvhVar3.d.g(jA2);
                }
                for (Map.Entry entry : sngVar2.c.entrySet()) {
                    vtw vtwVarM3 = uvg.a.m();
                    smz smzVar = (smz) entry.getKey();
                    sna snaVar = (sna) entry.getValue();
                    if (sneVarArr2.length > 0) {
                        Object[] objArr = smzVar.c;
                        ArrayList arrayList4 = new ArrayList(objArr.length);
                        int i7 = 0;
                        while (i7 < objArr.length) {
                            vtw vtwVarM4 = uve.a.m();
                            Object obj = objArr[i7];
                            ArrayList arrayList5 = arrayList3;
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                if (!vtwVarM4.b.A()) {
                                    vtwVarM4.u();
                                }
                                uve uveVar = (uve) vtwVarM4.b;
                                str2.getClass();
                                i4 = size;
                                uveVar.b = 1;
                                uveVar.c = str2;
                            } else {
                                i4 = size;
                                if (obj instanceof Integer) {
                                    Integer num = (Integer) obj;
                                    num.intValue();
                                    if (!vtwVarM4.b.A()) {
                                        vtwVarM4.u();
                                    }
                                    uve uveVar2 = (uve) vtwVarM4.b;
                                    uveVar2.b = 2;
                                    uveVar2.c = num;
                                } else {
                                    if (!(obj instanceof Boolean)) {
                                        throw new IllegalArgumentException("Metric " + str + " has field " + i7 + " with an unexpected value: " + String.valueOf(obj));
                                    }
                                    Boolean bool = (Boolean) obj;
                                    bool.booleanValue();
                                    if (!vtwVarM4.b.A()) {
                                        vtwVarM4.u();
                                    }
                                    uve uveVar3 = (uve) vtwVarM4.b;
                                    uveVar3.b = 3;
                                    uveVar3.c = bool;
                                }
                            }
                            arrayList4.add((uve) vtwVarM4.r());
                            i7++;
                            arrayList3 = arrayList5;
                            size = i4;
                        }
                        arrayList2 = arrayList3;
                        i3 = size;
                        if (!vtwVarM3.b.A()) {
                            vtwVarM3.u();
                        }
                        uvg uvgVar = (uvg) vtwVarM3.b;
                        vun vunVar = uvgVar.c;
                        if (!vunVar.c()) {
                            uvgVar.c = vuc.s(vunVar);
                        }
                        vsf.h(arrayList4, uvgVar.c);
                    } else {
                        arrayList2 = arrayList3;
                        i3 = size;
                    }
                    uvf uvfVarA = snaVar.a();
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    uvg uvgVar2 = (uvg) vtwVarM3.b;
                    uvfVarA.getClass();
                    uvgVar2.d = uvfVarA;
                    uvgVar2.b |= 1;
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    uvh uvhVar4 = (uvh) vtwVarM2.b;
                    uvg uvgVar3 = (uvg) vtwVarM3.r();
                    uvgVar3.getClass();
                    vun vunVar2 = uvhVar4.e;
                    if (!vunVar2.c()) {
                        uvhVar4.e = vuc.s(vunVar2);
                    }
                    uvhVar4.e.add(uvgVar3);
                    arrayList3 = arrayList2;
                    size = i3;
                }
                arrayList = arrayList3;
                i2 = size;
                uvhVar = (uvh) vtwVarM2.r();
            }
            if (uvhVar != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                trg trgVar2 = (trg) vtwVarM.b;
                vun vunVar3 = trgVar2.b;
                if (!vunVar3.c()) {
                    trgVar2.b = vuc.s(vunVar3);
                }
                trgVar2.b.add(uvhVar);
            }
            i5++;
            arrayList3 = arrayList;
            size = i2;
            i = 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        synchronized (this.e) {
            b();
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
