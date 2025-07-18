package defpackage;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zu {
    public final zt a;
    final String b;
    public final String c;
    public String d;
    public String e;
    boolean f;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    zf m;
    private Uri o;
    private final boolean p;
    private int q;
    private boolean r;
    private int s;
    private Bundle u;
    private IntentSender v;
    public final ArrayList g = new ArrayList();
    private int t = -1;
    protected List n = new ArrayList();

    public zu(zt ztVar, String str, String str2, boolean z) {
        this.a = ztVar;
        this.b = str;
        this.c = str2;
        this.p = z;
    }

    public final int b() {
        if (f()) {
            if (zv.a == null) {
                return 0;
            }
            zv.a();
        }
        return this.s;
    }

    final int c(zf zfVar) {
        int i;
        zu zuVar;
        int iCountActions;
        if (this.m != zfVar) {
            this.m = zfVar;
            if (zfVar != null) {
                if (Objects.equals(this.d, zfVar.o())) {
                    i = 0;
                } else {
                    this.d = zfVar.o();
                    i = 1;
                }
                if (!Objects.equals(this.e, zfVar.m())) {
                    this.e = zfVar.m();
                    i = 1;
                }
                if (!Objects.equals(this.o, zfVar.j())) {
                    this.o = zfVar.j();
                    i = 1;
                }
                if (this.f != zfVar.t()) {
                    this.f = zfVar.t();
                    i = 1;
                }
                if (this.q != zfVar.a()) {
                    this.q = zfVar.a();
                    i = 1;
                }
                ArrayList arrayList = this.g;
                List listP = zfVar.p();
                if (arrayList != listP) {
                    ListIterator listIterator = arrayList.listIterator();
                    ListIterator listIterator2 = listP.listIterator();
                    loop0: while (listIterator.hasNext() && listIterator2.hasNext()) {
                        IntentFilter intentFilter = (IntentFilter) listIterator.next();
                        IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                        if (intentFilter != intentFilter2) {
                            if (intentFilter == null || intentFilter2 == null || (iCountActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                                break;
                            }
                            int i2 = 0;
                            while (true) {
                                if (i2 < iCountActions) {
                                    if (!intentFilter.getAction(i2).equals(intentFilter2.getAction(i2))) {
                                        break loop0;
                                    }
                                    i2++;
                                } else {
                                    int iCountCategories = intentFilter.countCategories();
                                    if (iCountCategories != intentFilter2.countCategories()) {
                                        break;
                                    }
                                    for (int i3 = 0; i3 < iCountCategories; i3++) {
                                        if (!intentFilter.getCategory(i3).equals(intentFilter2.getCategory(i3))) {
                                            break loop0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (listIterator.hasNext() || listIterator2.hasNext()) {
                        arrayList.clear();
                        arrayList.addAll(zfVar.p());
                        i = 1;
                    }
                }
                if (this.h != zfVar.d()) {
                    this.h = zfVar.d();
                    i = 1;
                }
                if (this.i != zfVar.c()) {
                    this.i = zfVar.c();
                    i = 1;
                }
                if (this.j != zfVar.b()) {
                    this.j = zfVar.b();
                    i = 1;
                }
                int i4 = 3;
                if (this.s != zfVar.g()) {
                    this.s = zfVar.g();
                    i = 3;
                }
                if (this.k != zfVar.f()) {
                    this.k = zfVar.f();
                    i = 3;
                }
                if (this.l != zfVar.h()) {
                    this.l = zfVar.h();
                } else {
                    i4 = i;
                }
                if (this.t != zfVar.e()) {
                    this.t = zfVar.e();
                    i4 |= 5;
                }
                if (!Objects.equals(this.u, zfVar.k())) {
                    this.u = zfVar.k();
                    i4 |= 1;
                }
                if (!Objects.equals(this.v, zfVar.i())) {
                    this.v = zfVar.i();
                    i4 |= 1;
                }
                if (this.r != zfVar.s()) {
                    this.r = zfVar.s();
                    i4 |= 5;
                }
                List listQ = zfVar.q();
                ArrayList arrayList2 = new ArrayList();
                boolean z = listQ.size() != this.n.size();
                if (!listQ.isEmpty()) {
                    yv yvVarA = zv.a();
                    Iterator it = listQ.iterator();
                    while (it.hasNext()) {
                        String str = (String) yvVarA.i.get(new oz(this.a.a().flattenToShortString(), (String) it.next()));
                        ArrayList arrayList3 = yvVarA.h;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size) {
                                zuVar = null;
                                break;
                            }
                            zuVar = (zu) arrayList3.get(i5);
                            i5++;
                            if (zuVar.c.equals(str)) {
                                break;
                            }
                        }
                        if (zuVar != null) {
                            arrayList2.add(zuVar);
                            if (!z && !this.n.contains(zuVar)) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    return i4;
                }
                this.n = arrayList2;
                return i4 | 1;
            }
        }
        return 0;
    }

    public final zn d() {
        zv.c();
        return this.a.a;
    }

    public final zr e() {
        if (this instanceof zr) {
            return (zr) this;
        }
        return null;
    }

    public final boolean f() {
        return !this.n.isEmpty();
    }

    final boolean g() {
        return this.m != null && this.f;
    }

    public final boolean h(String str) {
        zv.c();
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            boolean zHasCategory = ((IntentFilter) arrayList.get(i)).hasCategory(str);
            i++;
            if (zHasCategory) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        zv.c();
        zv.a().j(this, 3, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.o);
        sb.append(", enabled=");
        sb.append(this.f);
        sb.append(", isSystemRoute=");
        sb.append(this.p);
        sb.append(", connectionState=");
        sb.append(this.q);
        sb.append(", canDisconnect=");
        sb.append(this.r);
        sb.append(", playbackType=");
        sb.append(this.h);
        sb.append(", playbackStream=");
        sb.append(this.i);
        sb.append(", deviceType=");
        sb.append(this.j);
        sb.append(", volumeHandling=");
        sb.append(this.s);
        sb.append(", volume=");
        sb.append(this.k);
        sb.append(", volumeMax=");
        sb.append(this.l);
        sb.append(", presentationDisplayId=");
        sb.append(this.t);
        sb.append(", extras=");
        sb.append(this.u);
        sb.append(", settingsIntent=");
        sb.append(this.v);
        sb.append(", providerPackageName=");
        sb.append(this.a.c());
        if (f()) {
            sb.append(", members=[");
            int size = this.n.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.n.get(i) != this) {
                    sb.append(((zu) this.n.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
