package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcw {
    public final boolean b;
    private final Set c = new LinkedHashSet();
    private final Set d = new LinkedHashSet();
    private final Map e = new HashMap();
    public final List a = new ArrayList();
    private final List f = new ArrayList();
    private final Map g = new HashMap();
    private Collection h = null;

    public pcw() {
        zcp zcpVar = zcp.b;
        this.b = false;
    }

    private final pcv g(pbv pbvVar) {
        List list = this.a;
        pcv pcvVar = new pcv(list.size(), this.c.size());
        pcc pccVarA = pcvVar.a(pbvVar, -1);
        ArrayList arrayList = new ArrayList(1);
        pco.a(pbvVar, arrayList);
        zpk zpkVar = pccVarA.d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        pcvVar.b(new pdh(1, arrayList, zpkVar.c));
        list.add(pcvVar);
        this.e.put(pccVarA, pcvVar);
        return pcvVar;
    }

    private final pcv h(List list, int i) {
        pcc pccVar = (pcc) zag.e(list);
        Map map = this.e;
        pcv pcvVar = (pcv) map.get(pccVar);
        if (pcvVar != null) {
            return pcvVar;
        }
        List list2 = this.a;
        pcv pcvVar2 = new pcv(list2.size(), i);
        list2.add(pcvVar2);
        map.put(pccVar, pcvVar2);
        return pcvVar2;
    }

    private final pcv i(pbv pbvVar) {
        String string;
        int i = pbvVar.d;
        if (i != -1) {
            if (i != -2) {
                return (pcv) this.a.get(i);
            }
        } else {
            if (!pbvVar.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append(pbvVar);
                sb.append(" has no VE id, it may need to be re-instrumented if it has been reset.\n\tError occurred on SyntheticNode");
                pbv pbvVar2 = ((pft) pbvVar.c).c;
                if (pbvVar2 != null) {
                    sb.append("\n\t\tAncestry (leaf -> root):");
                }
                while (true) {
                    if (pbvVar2 != null) {
                        pcm pcmVar = pbvVar2.c;
                        if (pcmVar == null) {
                            sb.append("\n\t\t\t<Found CVE with no Node attached. Ending traversal.>");
                            string = sb.toString();
                            break;
                        }
                        sb.append("\n\t\t\tSyntheticNode");
                        pbvVar2 = ((pft) pcmVar).c;
                    } else {
                        string = sb.toString();
                        break;
                    }
                }
                throw new IllegalStateException(string);
            }
            this.f.add(pbvVar);
            pcm pcmVar2 = pbvVar.c;
            if (pcmVar2.d()) {
                return g(pbvVar);
            }
            pbv pbvVar3 = ((pft) pcmVar2).c;
            if (pbvVar3 == null) {
                pcc pccVarA = pbvVar.a();
                abxc abxcVar = pfn.a;
                if (abxcVar.a != pcc.a) {
                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }
                if (pccVarA.n.n(abxcVar.d)) {
                    return g(pbvVar);
                }
                int i2 = pcd.a;
                pcm pcmVar3 = pbvVar.c;
                View view = null;
                while (view != null) {
                    if (view.getId() != 16908290) {
                        Object parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        Log.e("GIL", a.o(pbvVar, "Unexpected visual element (", ") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/instrumentation#requirements."));
                        break;
                    }
                }
                if (Log.isLoggable("GIL", 2)) {
                    Log.v("GIL", a.o(pbvVar, "Ignoring CVE (", ") outside of AutoLogger scope."));
                }
                pbvVar.d = -2;
                return null;
            }
            if (pbvVar3.d == -1 && pbvVar3.c()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(null);
                pco.a(pbvVar3, arrayList);
                yqw.L(arrayList.size() > 1);
                pcv pcvVarH = h(arrayList, this.c.size());
                pcc pccVarA2 = pcvVarH.a(pbvVar, -1);
                arrayList.set(0, pccVarA2);
                zpk zpkVar = pccVarA2.d;
                if (zpkVar == null) {
                    zpkVar = zpk.a;
                }
                pcvVarH.b(new pdh(1, arrayList, zpkVar.c));
                return pcvVarH;
            }
            pcv pcvVarI = i(pbvVar3);
            if (pcvVarI != null) {
                zpk zpkVar2 = ((pcc) pbvVar3.a.b).d;
                if (zpkVar2 == null) {
                    zpkVar2 = zpk.a;
                }
                pcvVarI.a(pbvVar, zpkVar2.c);
                return pcvVarI;
            }
        }
        return null;
    }

    public final List a() {
        wvx wvxVarF = wzg.f("GIL:LogBatch", wwb.a, true);
        try {
            List<pcv> list = this.a;
            ArrayList arrayList = new ArrayList(list.size());
            for (pcv pcvVar : list) {
                arrayList.add(new pdi(pcvVar.a, pcvVar.b, pcvVar.c, pcvVar.d, pcvVar.e, pcvVar.f));
            }
            list.clear();
            this.e.clear();
            wvxVarF.close();
            return arrayList;
        } finally {
        }
    }

    public final void b() {
        char c = 2;
        if (Log.isLoggable("GIL", 2)) {
            Log.v("GIL", String.format(Locale.US, "AutoGIL Batch: inserts=%d; visibility=%d; removes=%d", Integer.valueOf(this.c.size()), Integer.valueOf(this.d.size()), Integer.valueOf(this.g.size())));
        }
        wwc wwcVar = wwb.a;
        wvx wvxVarF = wzg.f("GIL:CreateInsertGrafts", wwcVar, true);
        try {
            Set<pbv> set = this.c;
            for (pbv pbvVar : set) {
                if (pbvVar.d == -1) {
                    i(pbvVar);
                }
            }
            set.clear();
            List list = this.f;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((pbv) it.next()).d = -1;
            }
            list.clear();
            wvxVarF.close();
            wvx wvxVarF2 = wzg.f("GIL:CreateVisibilityGrafts", wwcVar, true);
            try {
                Set<pbv> set2 = this.d;
                for (pbv pbvVar2 : set2) {
                    yqw.R(pbvVar2.c(), "Not impressed: %s", pbvVar2);
                    int i = ((pft) pbvVar2.c).f;
                    pcb pcbVar = pbvVar2.a;
                    int i2 = ((pcc) pcbVar.b).e;
                    int iB = zos.b(i2);
                    if (iB == 0) {
                        iB = 1;
                    }
                    if (iB != i) {
                        int iB2 = zos.b(i2);
                        if (iB2 == 0) {
                            iB2 = 1;
                        }
                        int i3 = iB2 - 1;
                        if (i3 == 2 || i3 == 4) {
                            if (i == 2) {
                                continue;
                            } else {
                                yqw.M(i != 1, "Repressed VE was visible.");
                            }
                        }
                        if ((Integer.MIN_VALUE & pcbVar.b.memoizedSerializedSize) == 0) {
                            pcbVar.y();
                        }
                        pcc pccVar = (pcc) pcbVar.b;
                        int i4 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        pccVar.e = i4;
                        pccVar.b |= 2;
                        List arrayList = new ArrayList();
                        pco.a(pbvVar2, arrayList);
                        pcv pcvVarH = h(arrayList, 0);
                        int iB3 = zos.b(((pcc) arrayList.get(0)).e);
                        if (iB3 == 0 || iB3 == 1) {
                            pcvVarH.b(new pdh(2, arrayList, pcvVarH.e.size()));
                            pcu pcuVar = new pcu(pcvVarH);
                            zpk zpkVar = ((pcc) pcbVar.b).d;
                            if (zpkVar == null) {
                                zpkVar = zpk.a;
                            }
                            zpn zpnVar = zpkVar.f;
                            if (zpnVar == null) {
                                zpnVar = zpn.a;
                            }
                            if ((zpnVar.b & 2) != 0) {
                                pcuVar.a(pbvVar2);
                            }
                        } else {
                            pcvVarH.b(new pdh(3, arrayList, -1));
                        }
                    }
                }
                set2.clear();
                wvxVarF2.close();
                Map map = this.g;
                if (map.isEmpty()) {
                    return;
                }
                wvxVarF = wzg.f("GIL:CreateRemoveGrafts", wwcVar, true);
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        Collection<pcc> collection = (Collection) entry.getValue();
                        for (pcc pccVar2 : collection) {
                            pbv pbvVar3 = (pbv) entry.getKey();
                            int iB4 = zos.b(pccVar2.e);
                            if (iB4 == 0 || iB4 == 1) {
                                ArrayList arrayList2 = new ArrayList();
                                pcb pcbVar2 = new pcb();
                                pcbVar2.B(pccVar2);
                                if ((pcbVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    pcbVar2.y();
                                }
                                pcc pccVar3 = (pcc) pcbVar2.b;
                                pccVar3.e = 1;
                                char c2 = c;
                                pccVar3.b |= 2;
                                arrayList2.add((pcc) pcbVar2.v());
                                if (pbvVar3 != null) {
                                    pco.a(pbvVar3, arrayList2);
                                }
                                h(arrayList2, 0).b(new pdh(3, arrayList2, -1));
                                c = c2;
                            }
                        }
                        char c3 = c;
                        collection.clear();
                        this.h = collection;
                        c = c3;
                    }
                    wvxVarF.close();
                    this.g.clear();
                } finally {
                }
            } finally {
            }
        } finally {
            try {
                wvxVarF.close();
                throw th;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    public final boolean c() {
        return (this.a.isEmpty() && this.c.isEmpty() && this.d.isEmpty() && this.g.isEmpty()) ? false : true;
    }

    public final boolean d(pbv pbvVar) {
        pcb pcbVar = pbvVar.a;
        pcm pcmVar = pbvVar.c;
        zpk zpkVar = ((pcc) pcbVar.b).d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        if ((zpkVar.b & 2048) == 0) {
            this.c.add(pbvVar);
            return true;
        }
        int i = ((pft) pcmVar).f;
        int iB = zos.b(((pcc) pcbVar.b).e);
        if ((iB != 0 ? iB : 1) != i) {
            return f(pbvVar, i);
        }
        return false;
    }

    public final boolean e(pbv pbvVar) {
        Map map = this.g;
        Collection collection = (Collection) map.remove(pbvVar);
        if (collection != null) {
            collection.clear();
            this.h = collection;
        }
        if (pbvVar.c()) {
            pcm pcmVar = pbvVar.c;
            pbv pbvVar2 = ((pft) pcmVar).c;
            if (pcmVar.d() || (pbvVar2 != null && pbvVar2.c())) {
                Collection collection2 = (Collection) map.get(pbvVar2);
                if (collection2 != null) {
                    collection2.add(pbvVar.a());
                } else {
                    Collection arrayList = this.h;
                    if (arrayList != null) {
                        this.h = null;
                    } else {
                        if (Log.isLoggable("GIL", 2)) {
                            Log.v("GIL", "Array Alloc for Removal");
                        }
                        arrayList = new ArrayList();
                    }
                    arrayList.add(pbvVar.a());
                    map.put(pbvVar2, arrayList);
                }
            }
        }
        this.c.remove(pbvVar);
        this.d.remove(pbvVar);
        return !map.isEmpty();
    }

    public final boolean f(pbv pbvVar, int i) {
        if (this.c.contains(pbvVar)) {
            return false;
        }
        int iB = zos.b(((pcc) pbvVar.a.b).e);
        if (iB == 0) {
            iB = 1;
        }
        if (iB == i) {
            this.d.remove(pbvVar);
            return false;
        }
        this.d.add(pbvVar);
        return true;
    }
}
