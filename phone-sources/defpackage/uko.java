package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uko implements uki, uma {
    private static final unj c = new uky(1);
    private final List f;
    private final ukt h;
    private final ukk i;
    public final Map a = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private Set g = new HashSet();
    public final AtomicReference b = new AtomicReference();

    public uko(Executor executor, Iterable iterable, Collection collection, ukk ukkVar) {
        ukt uktVar = new ukt(executor);
        this.h = uktVar;
        this.i = ukkVar;
        ArrayList<ukh> arrayList = new ArrayList();
        int i = 2;
        int i2 = 0;
        arrayList.add(ukh.e(uktVar, ukt.class, umr.class, umq.class));
        arrayList.add(ukh.e(this, uma.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ukh ukhVar = (ukh) it.next();
            if (ukhVar != null) {
                arrayList.add(ukhVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((unj) it3.next()).a();
                    if (componentRegistrar != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (ukh<?> ukhVar2 : componentRegistrar.getComponents()) {
                            String str = ukhVar2.a;
                            if (str != null) {
                                ukhVar2 = new ukh<>(str, ukhVar2.b, ukhVar2.c, ukhVar2.d, ukhVar2.e, new upv(str, ukhVar2, 0), ukhVar2.g);
                            }
                            arrayList4.add(ukhVar2);
                        }
                        arrayList.addAll(arrayList4);
                        it3.remove();
                    }
                } catch (uku e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((ukh) it4.next()).b.toArray();
                int length = array.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        Object obj = array[i3];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.g.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.g.add(obj.toString());
                        }
                        i3++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                uiv.j(arrayList);
            } else {
                ArrayList arrayList5 = new ArrayList(this.a.keySet());
                arrayList5.addAll(arrayList);
                uiv.j(arrayList5);
            }
            for (ukh ukhVar3 : arrayList) {
                this.a.put(ukhVar3, new ukv(new ukl(this, ukhVar3, i2)));
            }
            ArrayList arrayList6 = new ArrayList();
            for (ukh ukhVar4 : arrayList) {
                if (ukhVar4.f()) {
                    unj unjVar = (unj) this.a.get(ukhVar4);
                    for (ulb ulbVar : ukhVar4.b) {
                        if (this.d.containsKey(ulbVar)) {
                            arrayList6.add(new ukm((ukz) ((unj) this.d.get(ulbVar)), unjVar, i2));
                        } else {
                            this.d.put(ulbVar, unjVar);
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            HashMap map = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                ukh ukhVar5 = (ukh) entry.getKey();
                if (!ukhVar5.f()) {
                    unj unjVar2 = (unj) entry.getValue();
                    for (ulb ulbVar2 : ukhVar5.b) {
                        if (!map.containsKey(ulbVar2)) {
                            map.put(ulbVar2, new HashSet());
                        }
                        ((Set) map.get(ulbVar2)).add(unjVar2);
                    }
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                if (this.e.containsKey(entry2.getKey())) {
                    ukw ukwVar = (ukw) this.e.get(entry2.getKey());
                    Iterator it5 = ((Set) entry2.getValue()).iterator();
                    while (it5.hasNext()) {
                        arrayList7.add(new ukm(ukwVar, (unj) it5.next(), i));
                    }
                } else {
                    this.e.put((ulb) entry2.getKey(), ukw.b((Collection) entry2.getValue()));
                }
            }
            arrayList3.addAll(arrayList7);
            for (ukh ukhVar6 : this.a.keySet()) {
                for (ukq ukqVar : ukhVar6.c) {
                    if (ukqVar.b() && !this.e.containsKey(ukqVar.a)) {
                        this.e.put(ukqVar.a, ukw.b(Collections.EMPTY_SET));
                    } else if (this.d.containsKey(ukqVar.a)) {
                        continue;
                    } else {
                        if (ukqVar.b == 1) {
                            throw new ukx(String.format("Unsatisfied dependency for component %s: %s", ukhVar6, ukqVar.a));
                        }
                        if (!ukqVar.b()) {
                            this.d.put(ukqVar.a, new ukz(ukz.a));
                        }
                    }
                }
            }
        }
        int size = arrayList3.size();
        while (i2 < size) {
            ((Runnable) arrayList3.get(i2)).run();
            i2++;
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            Map map2 = this.a;
            bool.booleanValue();
            f(map2);
        }
    }

    @Override // defpackage.uki
    public final synchronized unj a(ulb ulbVar) {
        a.ar(ulbVar, "Null interface requested.");
        return (unj) this.d.get(ulbVar);
    }

    @Override // defpackage.uki
    public final /* synthetic */ unj b(Class cls) {
        return uiv.a(this, cls);
    }

    @Override // defpackage.uki
    public final synchronized unj c(ulb ulbVar) {
        ukw ukwVar = (ukw) this.e.get(ulbVar);
        if (ukwVar != null) {
            return ukwVar;
        }
        return c;
    }

    @Override // defpackage.uki
    public final /* synthetic */ Object d(ulb ulbVar) {
        throw null;
    }

    @Override // defpackage.uki
    public final /* synthetic */ Object e(Class cls) {
        return uiv.c(this, cls);
    }

    public final void f(Map map) {
        Queue<ump> queue;
        for (Map.Entry entry : map.entrySet()) {
            ukh ukhVar = (ukh) entry.getKey();
            unj unjVar = (unj) entry.getValue();
            if (ukhVar.d == 1) {
                unjVar.a();
            }
        }
        ukt uktVar = this.h;
        synchronized (uktVar) {
            queue = uktVar.a;
            if (queue != null) {
                uktVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (ump umpVar : queue) {
                umpVar.getClass();
                synchronized (uktVar) {
                    Queue queue2 = uktVar.a;
                    if (queue2 != null) {
                        queue2.add(umpVar);
                    } else {
                        for (Map.Entry entry2 : uktVar.a()) {
                            ((Executor) entry2.getValue()).execute(new ufx(entry2, 4));
                        }
                    }
                }
            }
        }
    }
}
