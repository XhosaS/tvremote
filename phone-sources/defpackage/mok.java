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
public final class mok extends sbt {
    public final SharedPreferences a;
    public List b = yhb.a;
    private final iea c;
    private final iea d;
    private final oxe e;
    private final kuw f;

    public mok(kuw kuwVar, oxe oxeVar, SharedPreferences sharedPreferences, iea ieaVar, iea ieaVar2) {
        this.f = kuwVar;
        this.e = oxeVar;
        this.a = sharedPreferences;
        this.c = ieaVar;
        this.d = ieaVar2;
    }

    private final List b(List list, mlc mlcVar) {
        List list2 = mlcVar.b;
        list2.getClass();
        return ((oxe) this.f.a).f(list, list2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    private final List c(List list, mpj mpjVar) {
        String str = mpjVar.b;
        ArrayList arrayList = new ArrayList(list);
        ?? r2 = this.e.a;
        Comparator comparator = (Comparator) r2.get(str);
        if (comparator == null) {
            krd.c("Trying to get movies comparator with an unrecognized key. Default comparator returned.");
            comparator = (Comparator) r2.get("MOVIE_TITLE");
        }
        Collections.sort(arrayList, comparator);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    public final void a() {
        Object next;
        List list;
        mpj next2;
        List list2 = (List) ((ieg) this.c.a()).c;
        List list3 = (List) ((ieg) this.d.a()).c;
        if (list2 == null || list3 == null) {
            this.b = yhb.a;
            z();
            return;
        }
        if (list2.isEmpty() && list3.isEmpty()) {
            this.b = yfm.p(new mob(1));
            z();
            return;
        }
        List list4 = this.b;
        List listAf = yfm.af(list2, list3);
        Iterator it = list4.iterator();
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
        kuw kuwVar = this.f;
        if (mlcVar == null || (list = mlcVar.b) == null) {
            list = yhb.a;
        }
        list.getClass();
        Set set = mpx.a;
        set.remove("tag_id_unwatched");
        set.getClass();
        Set<String> setAq = yfm.aq(set);
        Object obj = kuwVar.a;
        HashSet<String> hashSet = new HashSet();
        for (String str : setAq) {
            List listF = ((oxe) obj).f(listAf, Collections.singletonList(str));
            if (!listF.isEmpty() && listF.size() != listAf.size()) {
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
                    List listF2 = oxeVar.f(listAf, list);
                    List listF3 = oxeVar.f(listAf, arrayList2);
                    if (listF3.isEmpty() || listF3.size() == listF2.size()) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        List listH = ((ntp) kuwVar.b).h(hashSet);
        Set setI = ntp.i(list, arrayList);
        ser serVar = new ser("movies_fireball_datatree_id_prefix" + listH.hashCode() + setI.hashCode(), listH, setI);
        if (mlcVar != null) {
            mlcVar.a(serVar);
        } else {
            mlcVar = new mlc(serVar, mnu.f(serVar));
        }
        Iterator it2 = this.b.iterator();
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
            String string = sharedPreferences.getString("MOVIES_SORT_OPTIONS", "MOVIE_ADDED_DATE");
            string.getClass();
            String string2 = sharedPreferences.getString("MOVIES_VIEW_OPTIONS", "GRID_VIEW");
            string2.getClass();
            mpjVar = new mpj("MOVIES_SORT_OPTIONS", string, string2);
        }
        List listC = c(b(list2, mlcVar), mpjVar);
        List listC2 = c(b(list3, mlcVar), mpjVar);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(mlcVar);
        if (listC.isEmpty() && listC.isEmpty()) {
            arrayList3.add(new mob(true == mlcVar.b.contains("tag_id_downloaded") ? 3 : 1));
        } else {
            arrayList3.add(mpjVar);
            arrayList3.addAll(listC);
            if (!listC2.isEmpty()) {
                arrayList3.add(new mor());
                arrayList3.addAll(listC2);
            }
        }
        this.b = arrayList3;
        z();
    }

    @Override // defpackage.sbt
    protected final void e() {
        w(this.c, new ajh(this, (yih) null, 6));
        w(this.d, new ajh(this, null, 7, null));
        y(mlk.class, new kci(this, (yih) null, 5));
        y(mpi.class, new ale(this, (yih) null, 15));
        y(mpu.class, new ale(this, (yih) null, 16, (byte[]) null));
        a();
    }
}
