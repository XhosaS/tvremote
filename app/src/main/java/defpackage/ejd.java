package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ejd implements ig {
    public final int a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final edl g;
    public final edm h;

    public ejd(List list, List list2, edl edlVar, edm edmVar) {
        this.b = list;
        this.a = list != null ? list.size() : 0;
        this.c = list2;
        this.g = edlVar;
        this.h = edmVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        for (int i = 0; i < this.a; i++) {
            this.e.add(new ejb(null, false));
            this.f.add(new dtd(this.b.get(i), null));
        }
    }

    @Override // defpackage.ig
    public final void a(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            ejb ejbVar = new ejb(null, true);
            this.e.add(i4, ejbVar);
            arrayList.add(ejbVar);
            dtd dtdVar = new dtd(null, null);
            this.f.add(i4, dtdVar);
            arrayList2.add(dtdVar);
        }
        this.d.add(new ejc(0, i, -1, arrayList, arrayList2));
    }

    @Override // defpackage.ig
    public final void b(int i, int i2) {
        ArrayList arrayList = new ArrayList(1);
        List list = this.e;
        list.add(i2, (ejb) list.remove(i));
        List list2 = this.f;
        dtd dtdVar = (dtd) list2.remove(i);
        arrayList.add(dtdVar);
        list2.add(i2, dtdVar);
        this.d.add(new ejc(3, i, i2, null, arrayList));
    }

    @Override // defpackage.ig
    public final void c(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.e.remove(i);
            arrayList.add((dtd) this.f.remove(i));
        }
        this.d.add(new ejc(2, i, i2, null, arrayList));
    }

    @Override // defpackage.ig
    public final void d(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            ejb ejbVar = (ejb) this.e.get(i4);
            ejbVar.b = true;
            arrayList.add(ejbVar);
            arrayList2.add((dtd) this.f.get(i4));
        }
        this.d.add(new ejc(1, i, -1, arrayList, arrayList2));
    }
}
