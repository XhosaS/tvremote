package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mpb extends sbt {
    public final SharedPreferences a;
    public final iea b;
    public List c = yhb.a;
    private final oxe d;
    private final kuw e;

    public mpb(kuw kuwVar, oxe oxeVar, SharedPreferences sharedPreferences, iea ieaVar) {
        this.e = kuwVar;
        this.d = oxeVar;
        this.a = sharedPreferences;
        this.b = ieaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    public final void a() {
        Object next;
        List list;
        mpj next2;
        List list2 = (List) ((ieg) this.b.a()).c;
        if (list2 == null) {
            this.c = yhb.a;
            z();
            return;
        }
        if (list2.isEmpty()) {
            this.c = yfm.p(new mob(2));
            z();
            return;
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (next instanceof mlc) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        mlc mlcVar = next instanceof mlc ? (mlc) next : null;
        kuw kuwVar = this.e;
        if (mlcVar == null || (list = mlcVar.b) == null) {
            list = yhb.a;
        }
        list.getClass();
        Set set = mpx.b;
        set.remove("tag_id_unwatched");
        set.getClass();
        Set<String> setAq = yfm.aq(set);
        Object obj = kuwVar.a;
        HashSet<String> hashSet = new HashSet();
        for (String str : setAq) {
            List listG = ((oxe) obj).g(list2, Collections.singletonList(str));
            if (!listG.isEmpty() && listG.size() != list2.size()) {
                hashSet.add(str);
            }
        }
        hashSet.add("tag_id_downloaded");
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            for (String str2 : hashSet) {
                if (!list.contains(str2)) {
                    ArrayList arrayList2 = new ArrayList(list);
                    arrayList2.add(str2);
                    oxe oxeVar = (oxe) obj;
                    List listG2 = oxeVar.g(list2, list);
                    List listG3 = oxeVar.g(list2, arrayList2);
                    if (listG3.isEmpty() || listG3.size() == listG2.size()) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        List listH = ((ntp) kuwVar.b).h(hashSet);
        Set setI = ntp.i(list, arrayList);
        ser serVar = new ser("shows_fireball_datatree_id_prefix" + listH.hashCode() + setI.hashCode(), listH, setI);
        if (mlcVar != null) {
            mlcVar.a(serVar);
        } else {
            mlcVar = new mlc(serVar, mnu.f(serVar));
        }
        Iterator it2 = this.c.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = it2.next();
                if (next2 instanceof mpj) {
                    break;
                }
            } else {
                next2 = 0;
                break;
            }
        }
        mpj mpjVar = next2 instanceof mpj ? next2 : null;
        if (mpjVar == null) {
            SharedPreferences sharedPreferences = this.a;
            String string = sharedPreferences.getString("SHOWS_SORT_OPTIONS", "SHOW_ADDED_DATE");
            string.getClass();
            String string2 = sharedPreferences.getString("SHOWS_VIEW_OPTIONS", "GRID_VIEW");
            string2.getClass();
            mpjVar = new mpj("SHOWS_SORT_OPTIONS", string, string2);
        }
        List list3 = mlcVar.b;
        list3.getClass();
        List listG4 = ((oxe) obj).g(list2, list3);
        oxe oxeVar2 = this.d;
        String str3 = mpjVar.b;
        ArrayList arrayList3 = new ArrayList(listG4);
        ?? r0 = oxeVar2.b;
        Comparator comparator = (Comparator) r0.get(str3);
        if (comparator == null) {
            krd.c("Trying to get show comparator with an unrecognized key. Default comparator returned.");
            comparator = (Comparator) r0.get("SHOW_TITLE");
        }
        Collections.sort(arrayList3, comparator);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(mlcVar);
        if (arrayList3.isEmpty()) {
            arrayList4.add(new mob(true == mlcVar.b.contains("tag_id_downloaded") ? 3 : 2));
        } else {
            arrayList4.add(mpjVar);
            arrayList4.addAll(arrayList3);
        }
        this.c = arrayList4;
        z();
    }

    @Override // defpackage.sbt
    protected final void e() {
        w(this.b, new ajh(this, (yih) null, 8));
        y(mlk.class, new kci(this, (yih) null, 6));
        y(mpi.class, new ale(this, (yih) null, 17));
        y(mpu.class, new ale(this, (yih) null, 18, (byte[]) null));
        a();
    }
}
