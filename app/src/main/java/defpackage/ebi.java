package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebi {
    public static ebi a;
    private final Set b = new LinkedHashSet();
    private final ArrayList c = new ArrayList();
    private final Map d = new HashMap();
    private boolean e = false;
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private boolean h = false;
    private final ebf i;

    public ebi(ebf ebfVar) {
        this.i = ebfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final synchronized void a(long j) {
        if (this.h) {
            ArrayList arrayList = this.c;
            arrayList.clear();
            Set set = this.b;
            if (set.size() != 0) {
                wg wgVar = new wg(0);
                wx wxVar = new wx(0);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList2 = ((ebl) it.next()).c;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        ebr ebrVar = (ebr) arrayList2.get(i);
                        ArrayList arrayList3 = ebrVar.b;
                        int size2 = arrayList3 == null ? 0 : arrayList3.size();
                        if (size2 == 0) {
                            wgVar.add(ebrVar);
                        } else {
                            wxVar.put(ebrVar, Integer.valueOf(size2));
                        }
                    }
                }
                if (!wxVar.isEmpty() && wgVar.isEmpty()) {
                    throw new ebj("Graph has nodes, but they represent a cycle with no leaf nodes!");
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.addAll(wgVar);
                while (!arrayDeque.isEmpty()) {
                    ebr ebrVar2 = (ebr) arrayDeque.pollFirst();
                    arrayList.add(ebrVar2);
                    for (ebr ebrVar3 : ebrVar2.h()) {
                        int iIntValue = ((Integer) wxVar.get(ebrVar3)).intValue() - 1;
                        wxVar.put(ebrVar3, Integer.valueOf(iIntValue));
                        if (iIntValue == 0) {
                            arrayDeque.addLast(ebrVar3);
                        } else if (iIntValue < 0) {
                            throw new ebj("Detected cycle.");
                        }
                    }
                }
                if (arrayList.size() != wxVar.d + wgVar.c) {
                    throw new ebj("Had unreachable nodes in graph -- this likely means there was a cycle");
                }
                Collections.reverse(arrayList);
                this.h = false;
            }
        }
        ArrayList arrayList4 = this.c;
        int size3 = arrayList4.size();
        for (int i2 = 0; i2 < size3; i2++) {
            ebr ebrVar4 = (ebr) arrayList4.get(i2);
            float fA = ebrVar4.a(j);
            if (j == ebrVar4.d) {
                throw new RuntimeException("Got a calculate value call multiple times in the same frame. This isn't expected.");
            }
            ebrVar4.d = j;
            ebrVar4.c = fA;
        }
        int size4 = arrayList4.size();
        for (int i3 = 0; i3 < size4; i3++) {
            ebr ebrVar5 = (ebr) arrayList4.get(i3);
            Map map = this.d;
            ebh ebhVar = (ebh) map.get(ebrVar5);
            if (ebhVar != null && !ebhVar.a) {
                Iterator it2 = ebrVar5.h().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((ebh) map.get((ebr) it2.next())).a) {
                            break;
                        }
                    } else if (!(ebrVar5 instanceof ebo) || ((ebo) ebrVar5).b()) {
                        ebhVar.a = true;
                    }
                }
            }
        }
        this.e = true;
        for (ebl eblVar : this.b) {
            ArrayList arrayList5 = eblVar.c;
            int size5 = arrayList5.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size5) {
                    ear earVar = eblVar.f;
                    if (earVar != null) {
                        eas easVar = earVar.a;
                        easVar.j();
                        easVar.f();
                    }
                    eblVar.c();
                } else if (((ebh) this.d.get(arrayList5.get(i4))).a) {
                    i4++;
                }
            }
        }
        this.e = false;
        List list = this.g;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            b((ebl) it3.next());
        }
        List list2 = this.f;
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            c((ebl) it4.next());
        }
        list.clear();
        list2.clear();
    }

    public final synchronized void b(ebl eblVar) {
        if (!eblVar.d) {
            throw new RuntimeException("Expected added GraphBinding to be active: ".concat(String.valueOf(String.valueOf(eblVar))));
        }
        if (this.e) {
            this.g.add(eblVar);
            return;
        }
        Set set = this.b;
        set.add(eblVar);
        ArrayList arrayList = eblVar.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ebr ebrVar = (ebr) arrayList.get(i);
            Map map = this.d;
            ebh ebhVar = (ebh) map.get(ebrVar);
            if (ebhVar != null) {
                ebhVar.b++;
            } else {
                ebh ebhVar2 = new ebh();
                ebhVar2.b = 1;
                map.put(ebrVar, ebhVar2);
            }
        }
        if (set.size() == 1) {
            ebf ebfVar = this.i;
            if (ebfVar.c == null) {
                throw new RuntimeException("Must set a binding graph first.");
            }
            if (ebfVar.d) {
                throw new RuntimeException("Tried to start but was already running.");
            }
            ebfVar.d = true;
            ebfVar.a();
        }
        this.h = true;
    }

    public final synchronized void c(ebl eblVar) {
        if (this.e) {
            this.f.add(eblVar);
            return;
        }
        Set set = this.b;
        if (!set.remove(eblVar)) {
            throw new RuntimeException("Tried to unregister non-existent binding");
        }
        ArrayList arrayList = eblVar.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ebr ebrVar = (ebr) arrayList.get(i);
            Map map = this.d;
            ebh ebhVar = (ebh) map.get(ebrVar);
            int i2 = ebhVar.b - 1;
            ebhVar.b = i2;
            if (i2 == 0) {
                map.remove(ebrVar);
            }
        }
        if (set.isEmpty()) {
            ebf ebfVar = this.i;
            if (!ebfVar.d) {
                throw new RuntimeException("Tried to stop but wasn't running.");
            }
            ebfVar.d = false;
            eaz eazVar = ebfVar.a;
            eay eayVar = ebfVar.b;
            eayVar.a.set(null);
            if (((ebb) eazVar).b != null) {
                ((ebb) eazVar).b.removeFrameCallback(eayVar.a());
            } else {
                ((ebb) eazVar).a.removeCallbacks(eayVar.b());
            }
            ebfVar.e = false;
            this.c.clear();
            if (!this.d.isEmpty()) {
                throw new RuntimeException("Failed to clean up all nodes");
            }
        }
        this.h = true;
    }
}
