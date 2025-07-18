package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cyt {
    public final dhi a;
    public final doc b;
    public final doh c;
    public final doj d;
    public final dbb e;
    public final dmq f;
    public final dod g;
    public final dof h = new dof();
    public final doe i = new doe();
    public final afh j;

    public cyt() {
        dqr dqrVar = new dqr(new afj(20), new dqo(), new dqp());
        this.j = dqrVar;
        this.a = new dhi(dqrVar);
        this.b = new doc();
        this.c = new doh();
        this.d = new doj();
        this.e = new dbb();
        this.f = new dmq();
        this.g = new dod();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.c.d(arrayList);
    }

    public final List a() {
        List listA = this.g.a();
        if (listA.isEmpty()) {
            throw new cyp();
        }
        return listA;
    }
}
