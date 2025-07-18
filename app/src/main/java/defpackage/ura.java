package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ura implements Application.ActivityLifecycleCallbacks, uqw {
    private static final long g = TimeUnit.MINUTES.toMillis(1);
    public final ScheduledExecutorService a;
    public ScheduledFuture d;
    public uqn f;
    private final uqx h;
    public final AtomicLong c = new AtomicLong(0);
    public final long b = g;
    protected final Object e = new Object();

    private ura(uqn uqnVar, ScheduledExecutorService scheduledExecutorService, uqx uqxVar) {
        this.f = uqnVar;
        this.a = scheduledExecutorService;
        this.h = uqxVar;
    }

    public static ura c(uqn uqnVar, ScheduledExecutorService scheduledExecutorService, uqx uqxVar, Application application) {
        ura uraVar = new ura(uqnVar, scheduledExecutorService, uqxVar);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(uraVar);
        }
        uqxVar.c = uraVar;
        return uraVar;
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

    public final void b() throws NoSuchAlgorithmException {
        int i;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        ArrayList arrayList3;
        this.c.set(0L);
        uqn uqnVar = this.f;
        ArrayList arrayList4 = new ArrayList();
        uqx uqxVar = this.h;
        synchronized (uqxVar.b) {
            for (uqv uqvVar : uqxVar.a.values()) {
                uqs[] uqsVarArr = uqvVar.c;
                HashMap map = new HashMap(uqsVarArr.length > 0 ? 10 : 1);
                uqu uquVar = new uqu(uqvVar.b, uqsVarArr);
                synchronized (uqvVar.a) {
                    uquVar.c = uqvVar.e;
                    uquVar.d = uqvVar.f;
                    uqvVar.e = map;
                    uqvVar.f = 0;
                }
                arrayList4.add(uquVar);
            }
        }
        ypp yppVar = ypp.a;
        ypo ypoVar = new ypo();
        int size = arrayList4.size();
        int i2 = 0;
        while (true) {
            jyv jyvVarH = null;
            aayq aayqVar = null;
            if (i2 >= size) {
                ypp yppVar2 = (ypp) ypoVar.v();
                if (yppVar2.b.size() != 0) {
                    jyvVarH = uqnVar.a.h(yppVar2);
                    jyvVarH.k = uqnVar.b;
                    Iterator it2 = uqnVar.c.iterator();
                    while (it2.hasNext()) {
                        jyvVarH.l((String) it2.next());
                    }
                }
                if (jyvVarH != null) {
                    jyvVarH.d();
                    return;
                }
                return;
            }
            uqu uquVar2 = (uqu) arrayList4.get(i2);
            int i3 = Integer.MIN_VALUE;
            if (uquVar2.d == 0) {
                arrayList = arrayList4;
                i = Integer.MIN_VALUE;
            } else {
                aayq aayqVar2 = aayq.a;
                aayj aayjVar = new aayj();
                String str = uquVar2.a;
                long jB = uqx.b(str);
                if ((aayjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aayjVar.y();
                }
                aayq aayqVar3 = (aayq) aayjVar.b;
                aayqVar3.b |= 2;
                aayqVar3.c = jB;
                uqs[] uqsVarArr2 = uquVar2.b;
                int length = uqsVarArr2.length;
                int i4 = 0;
                while (i4 < length) {
                    long jB2 = uqx.b(uqsVarArr2[i4].a);
                    if ((aayjVar.b.memoizedSerializedSize & i3) == 0) {
                        aayjVar.y();
                    }
                    aayq aayqVar4 = (aayq) aayjVar.b;
                    int i5 = i3;
                    abxm abxmVar = aayqVar4.d;
                    if (!abxmVar.c()) {
                        int size2 = abxmVar.size();
                        aayqVar4.d = abxmVar.d(size2 + size2);
                    }
                    aayqVar4.d.f(jB2);
                    i4++;
                    i3 = i5;
                }
                i = i3;
                Iterator it3 = uquVar2.c.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    aayp aaypVar = aayp.a;
                    aayk aaykVar = new aayk();
                    uql uqlVar = (uql) entry.getKey();
                    uqm uqmVar = (uqm) entry.getValue();
                    if (uqsVarArr2.length > 0) {
                        Object[] objArr = uqlVar.c;
                        ArrayList arrayList5 = new ArrayList(objArr.length);
                        int i6 = 0;
                        while (i6 < objArr.length) {
                            aaym aaymVar = aaym.a;
                            aayl aaylVar = new aayl();
                            Object obj = objArr[i6];
                            Iterator it4 = it3;
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                if ((aaylVar.b.memoizedSerializedSize & i) == 0) {
                                    aaylVar.y();
                                }
                                aaym aaymVar2 = (aaym) aaylVar.b;
                                str2.getClass();
                                arrayList3 = arrayList4;
                                aaymVar2.b = 1;
                                aaymVar2.c = str2;
                            } else {
                                arrayList3 = arrayList4;
                                if (obj instanceof Integer) {
                                    Integer num = (Integer) obj;
                                    num.intValue();
                                    if ((aaylVar.b.memoizedSerializedSize & i) == 0) {
                                        aaylVar.y();
                                    }
                                    aaym aaymVar3 = (aaym) aaylVar.b;
                                    aaymVar3.b = 2;
                                    aaymVar3.c = num;
                                } else {
                                    if (!(obj instanceof Boolean)) {
                                        throw new IllegalArgumentException("Metric " + str + " has field " + i6 + " with an unexpected value: " + String.valueOf(obj));
                                    }
                                    Boolean bool = (Boolean) obj;
                                    bool.booleanValue();
                                    if ((aaylVar.b.memoizedSerializedSize & i) == 0) {
                                        aaylVar.y();
                                    }
                                    aaym aaymVar4 = (aaym) aaylVar.b;
                                    aaymVar4.b = 3;
                                    aaymVar4.c = bool;
                                }
                            }
                            arrayList5.add((aaym) aaylVar.v());
                            i6++;
                            it3 = it4;
                            arrayList4 = arrayList3;
                        }
                        it = it3;
                        arrayList2 = arrayList4;
                        if ((aaykVar.b.memoizedSerializedSize & i) == 0) {
                            aaykVar.y();
                        }
                        aayp aaypVar2 = (aayp) aaykVar.b;
                        abxs abxsVar = aaypVar2.c;
                        if (!abxsVar.c()) {
                            int size3 = abxsVar.size();
                            aaypVar2.c = abxsVar.d(size3 + size3);
                        }
                        abus.m(arrayList5, aaypVar2.c);
                    } else {
                        it = it3;
                        arrayList2 = arrayList4;
                    }
                    aayo aayoVarA = uqmVar.a();
                    if ((aaykVar.b.memoizedSerializedSize & i) == 0) {
                        aaykVar.y();
                    }
                    aayp aaypVar3 = (aayp) aaykVar.b;
                    aayoVarA.getClass();
                    aaypVar3.d = aayoVarA;
                    aaypVar3.b |= 1;
                    if ((aayjVar.b.memoizedSerializedSize & i) == 0) {
                        aayjVar.y();
                    }
                    aayq aayqVar5 = (aayq) aayjVar.b;
                    aayp aaypVar4 = (aayp) aaykVar.v();
                    aaypVar4.getClass();
                    abxs abxsVar2 = aayqVar5.e;
                    if (!abxsVar2.c()) {
                        int size4 = abxsVar2.size();
                        aayqVar5.e = abxsVar2.d(size4 + size4);
                    }
                    aayqVar5.e.add(aaypVar4);
                    it3 = it;
                    arrayList4 = arrayList2;
                }
                arrayList = arrayList4;
                aayqVar = (aayq) aayjVar.v();
            }
            if (aayqVar != null) {
                if ((ypoVar.b.memoizedSerializedSize & i) == 0) {
                    ypoVar.y();
                }
                ypp yppVar3 = (ypp) ypoVar.b;
                abxs abxsVar3 = yppVar3.b;
                if (!abxsVar3.c()) {
                    int size5 = abxsVar3.size();
                    yppVar3.b = abxsVar3.d(size5 + size5);
                }
                yppVar3.b.add(aayqVar);
            }
            i2++;
            arrayList4 = arrayList;
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
