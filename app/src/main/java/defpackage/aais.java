package defpackage;

import android.os.Trace;
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
public class aais implements aaih, aaks {
    private static final aamy c = new aamy() { // from class: aaim
        @Override // defpackage.aamy
        public final Object a() {
            return Collections.EMPTY_SET;
        }
    };
    private final List f;
    private final aaja h;
    private final aail i;
    public final Map a = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private Set g = new HashSet();
    public final AtomicReference b = new AtomicReference();

    public aais(Executor executor, Iterable iterable, Collection collection, aail aailVar) {
        aaja aajaVar = new aaja(executor);
        this.h = aajaVar;
        this.i = aailVar;
        ArrayList<aaif> arrayList = new ArrayList();
        arrayList.add(aaif.d(aajaVar, aaja.class, aaln.class, aalm.class));
        arrayList.add(aaif.d(this, aaks.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aaif aaifVar = (aaif) it.next();
            if (aaifVar != null) {
                arrayList.add(aaifVar);
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((aamy) it3.next()).a();
                    if (componentRegistrar != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (final aaif aaifVar2 : componentRegistrar.getComponents()) {
                            final String str = aaifVar2.a;
                            if (str != null) {
                                aaifVar2 = new aaif(str, aaifVar2.b, aaifVar2.c, aaifVar2.d, aaifVar2.e, new aaik() { // from class: aarp
                                    @Override // defpackage.aaik
                                    public final Object a(aaih aaihVar) {
                                        String str2 = str;
                                        aaif aaifVar3 = aaifVar2;
                                        try {
                                            Trace.beginSection(str2);
                                            return aaifVar3.f.a(aaihVar);
                                        } finally {
                                            Trace.endSection();
                                        }
                                    }
                                }, aaifVar2.g);
                            }
                            arrayList4.add(aaifVar2);
                        }
                        arrayList.addAll(arrayList4);
                        it3.remove();
                    }
                } catch (aajb e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((aaif) it4.next()).b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.g.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.g.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                aaiv.a(arrayList);
            } else {
                ArrayList arrayList5 = new ArrayList(this.a.keySet());
                arrayList5.addAll(arrayList);
                aaiv.a(arrayList5);
            }
            for (final aaif aaifVar3 : arrayList) {
                this.a.put(aaifVar3, new aajc(new aamy() { // from class: aain
                    @Override // defpackage.aamy
                    public final Object a() {
                        aaif aaifVar4 = aaifVar3;
                        return aaifVar4.f.a(new aajl(aaifVar4, this.a));
                    }
                }));
            }
            ArrayList arrayList6 = new ArrayList();
            for (aaif aaifVar4 : arrayList) {
                if (aaifVar4.e()) {
                    final aamy aamyVar = (aamy) this.a.get(aaifVar4);
                    for (aajj aajjVar : aaifVar4.b) {
                        if (this.d.containsKey(aajjVar)) {
                            final aajg aajgVar = (aajg) ((aamy) this.d.get(aajjVar));
                            arrayList6.add(new Runnable() { // from class: aaio
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aajg aajgVar2 = aajgVar;
                                    aamy aamyVar2 = aamyVar;
                                    if (aajgVar2.b != aajg.a) {
                                        throw new IllegalStateException("provide() can be called only once.");
                                    }
                                    synchronized (aajgVar2) {
                                        aajgVar2.b = aamyVar2;
                                    }
                                }
                            });
                        } else {
                            this.d.put(aajjVar, aamyVar);
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            HashMap map = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                aaif aaifVar5 = (aaif) entry.getKey();
                if (!aaifVar5.e()) {
                    aamy aamyVar2 = (aamy) entry.getValue();
                    for (aajj aajjVar2 : aaifVar5.b) {
                        if (!map.containsKey(aajjVar2)) {
                            map.put(aajjVar2, new HashSet());
                        }
                        ((Set) map.get(aajjVar2)).add(aamyVar2);
                    }
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                if (this.e.containsKey(entry2.getKey())) {
                    final aajd aajdVar = (aajd) this.e.get(entry2.getKey());
                    for (final aamy aamyVar3 : (Set) entry2.getValue()) {
                        arrayList7.add(new Runnable() { // from class: aaip
                            @Override // java.lang.Runnable
                            public final void run() {
                                aajdVar.c(aamyVar3);
                            }
                        });
                    }
                } else {
                    this.e.put((aajj) entry2.getKey(), aajd.b((Collection) entry2.getValue()));
                }
            }
            arrayList3.addAll(arrayList7);
            for (aaif aaifVar6 : this.a.keySet()) {
                for (aaiw aaiwVar : aaifVar6.c) {
                    if (aaiwVar.b() && !this.e.containsKey(aaiwVar.a)) {
                        this.e.put(aaiwVar.a, aajd.b(Collections.EMPTY_SET));
                    } else if (this.d.containsKey(aaiwVar.a)) {
                        continue;
                    } else {
                        if (aaiwVar.b == 1) {
                            throw new aaje(String.format("Unsatisfied dependency for component %s: %s", aaifVar6, aaiwVar.a));
                        }
                        if (!aaiwVar.b()) {
                            this.d.put(aaiwVar.a, new aajg(aajg.a));
                        }
                    }
                }
            }
        }
        int size = arrayList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Runnable) arrayList3.get(i2)).run();
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            g(this.a, bool.booleanValue());
        }
    }

    @Override // defpackage.aaih
    public final synchronized aamy a(aajj aajjVar) {
        aajh.b(aajjVar, "Null interface requested.");
        return (aamy) this.d.get(aajjVar);
    }

    @Override // defpackage.aaih
    public final /* synthetic */ aamy b(Class cls) {
        return aaig.a(this, cls);
    }

    @Override // defpackage.aaih
    public final synchronized aamy c(aajj aajjVar) {
        aajd aajdVar = (aajd) this.e.get(aajjVar);
        if (aajdVar != null) {
            return aajdVar;
        }
        return c;
    }

    @Override // defpackage.aaih
    public final /* synthetic */ Object d(aajj aajjVar) {
        aamy aamyVarA = a(aajjVar);
        if (aamyVarA == null) {
            return null;
        }
        return aamyVarA.a();
    }

    @Override // defpackage.aaih
    public final /* synthetic */ Object e(Class cls) {
        return aaig.b(this, cls);
    }

    @Override // defpackage.aaih
    public final /* synthetic */ Set f(aajj aajjVar) {
        return (Set) c(aajjVar).a();
    }

    public final void g(Map map, boolean z) {
        Queue<aalk> queue;
        for (Map.Entry entry : map.entrySet()) {
            aaif aaifVar = (aaif) entry.getKey();
            aamy aamyVar = (aamy) entry.getValue();
            int i = aaifVar.d;
            if (i == 1 || (i == 2 && z)) {
                aamyVar.a();
            }
        }
        aaja aajaVar = this.h;
        synchronized (aajaVar) {
            queue = aajaVar.a;
            if (queue != null) {
                aajaVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (aalk aalkVar : queue) {
                aalkVar.getClass();
                synchronized (aajaVar) {
                    Queue queue2 = aajaVar.a;
                    if (queue2 != null) {
                        queue2.add(aalkVar);
                    } else {
                        for (final Map.Entry entry2 : aajaVar.c()) {
                            ((Executor) entry2.getValue()).execute(new Runnable() { // from class: aaiz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((aall) entry2.getKey()).a();
                                }
                            });
                        }
                    }
                }
            }
        }
    }
}
