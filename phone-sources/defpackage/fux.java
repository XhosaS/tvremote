package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fux {
    private final boolean a;
    public final fuw b;
    public final String c;
    public final String d;
    public String e;
    public String f;
    public Uri g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public Bundle q;
    fug r;
    private int u;
    private Display v;
    private IntentSender w;
    private final ArrayList t = new ArrayList();
    public int p = -1;
    protected List s = new ArrayList();

    public fux(fuw fuwVar, String str, String str2, boolean z) {
        this.b = fuwVar;
        this.c = str;
        this.d = str2;
        this.a = z;
    }

    public static final fuk w() {
        fuy.e();
        fun funVar = fuy.a().e;
        if (funVar instanceof fuk) {
            return (fuk) funVar;
        }
        return null;
    }

    public final int f() {
        if (!r() || fuy.g()) {
            return this.u;
        }
        return 0;
    }

    final int g(fug fugVar) {
        int i;
        fux fuxVar;
        int iCountActions;
        if (this.r != fugVar) {
            this.r = fugVar;
            if (fugVar != null) {
                if (Objects.equals(this.e, fugVar.o())) {
                    i = 0;
                } else {
                    this.e = fugVar.o();
                    i = 1;
                }
                if (!Objects.equals(this.f, fugVar.m())) {
                    this.f = fugVar.m();
                    i = 1;
                }
                if (!Objects.equals(this.g, fugVar.j())) {
                    this.g = fugVar.j();
                    i = 1;
                }
                if (this.h != fugVar.t()) {
                    this.h = fugVar.t();
                    i = 1;
                }
                if (this.i != fugVar.a()) {
                    this.i = fugVar.a();
                    i = 1;
                }
                ArrayList arrayList = this.t;
                List listP = fugVar.p();
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
                        arrayList.addAll(fugVar.p());
                        i = 1;
                    }
                }
                if (this.k != fugVar.d()) {
                    this.k = fugVar.d();
                    i = 1;
                }
                if (this.l != fugVar.c()) {
                    this.l = fugVar.c();
                    i = 1;
                }
                if (this.m != fugVar.b()) {
                    this.m = fugVar.b();
                    i = 1;
                }
                int i4 = 3;
                if (this.u != fugVar.g()) {
                    this.u = fugVar.g();
                    i = 3;
                }
                if (this.n != fugVar.f()) {
                    this.n = fugVar.f();
                    i = 3;
                }
                if (this.o != fugVar.h()) {
                    this.o = fugVar.h();
                } else {
                    i4 = i;
                }
                if (this.p != fugVar.e()) {
                    this.p = fugVar.e();
                    this.v = null;
                    i4 |= 5;
                }
                if (!Objects.equals(this.q, fugVar.k())) {
                    this.q = fugVar.k();
                    i4 |= 1;
                }
                if (!Objects.equals(this.w, fugVar.i())) {
                    this.w = fugVar.i();
                    i4 |= 1;
                }
                if (this.j != fugVar.s()) {
                    this.j = fugVar.s();
                    i4 |= 5;
                }
                List listQ = fugVar.q();
                ArrayList arrayList2 = new ArrayList();
                boolean z = listQ.size() != this.s.size();
                if (!listQ.isEmpty()) {
                    ftw ftwVarA = fuy.a();
                    Iterator it = listQ.iterator();
                    while (it.hasNext()) {
                        String str = (String) ftwVarA.k.get(new cui(this.b.a().flattenToShortString(), (String) it.next()));
                        ArrayList arrayList3 = ftwVarA.i;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size) {
                                fuxVar = null;
                                break;
                            }
                            fuxVar = (fux) arrayList3.get(i5);
                            i5++;
                            if (fuxVar.d.equals(str)) {
                                break;
                            }
                        }
                        if (fuxVar != null) {
                            arrayList2.add(fuxVar);
                            if (!z && !this.s.contains(fuxVar)) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    return i4;
                }
                this.s = arrayList2;
                return i4 | 1;
            }
        }
        return 0;
    }

    public final Display h() {
        fuy.e();
        if (this.p >= 0 && this.v == null) {
            ftw ftwVarA = fuy.a();
            int i = this.p;
            if (ftwVarA.z == null) {
                ftwVarA.z = new cvw(ftwVarA.g);
            }
            this.v = ((DisplayManager) ((Context) ftwVarA.z.a).getSystemService("display")).getDisplay(i);
        }
        return this.v;
    }

    public final fup i() {
        fuy.e();
        return this.b.a;
    }

    public final fuu j() {
        if (this instanceof fuu) {
            return (fuu) this;
        }
        return null;
    }

    public final List k() {
        return DesugarCollections.unmodifiableList(this.s);
    }

    public final void l(int i) {
        fuy.e();
        ftw ftwVarA = fuy.a();
        int iMin = Math.min(this.o, Math.max(0, i));
        fun funVarB = ftwVarA.b(this);
        if (funVarB != null) {
            funVarB.d(iMin);
        }
    }

    public final void m(int i) {
        fun funVarB;
        fuy.e();
        if (i == 0 || (funVarB = fuy.a().b(this)) == null) {
            return;
        }
        funVarB.f(i);
    }

    public final void n() {
        o(true);
    }

    public final void o(boolean z) {
        fuy.e();
        fuy.a().l(this, 3, z);
    }

    public final boolean p() {
        fuy.e();
        return fuy.a().e() == this;
    }

    public final boolean q() {
        if (p() || this.m == 3) {
            return true;
        }
        return TextUtils.equals(i().f.a(), "android") && v("android.media.intent.category.LIVE_AUDIO") && !v("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean r() {
        return !this.s.isEmpty();
    }

    final boolean s() {
        return this.r != null && this.h;
    }

    public final boolean t() {
        fuy.e();
        return fuy.a().f() == this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.d);
        sb.append(", name=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", iconUri=");
        sb.append(this.g);
        sb.append(", enabled=");
        sb.append(this.h);
        sb.append(", isSystemRoute=");
        sb.append(this.a);
        sb.append(", connectionState=");
        sb.append(this.i);
        sb.append(", canDisconnect=");
        sb.append(this.j);
        sb.append(", playbackType=");
        sb.append(this.k);
        sb.append(", playbackStream=");
        sb.append(this.l);
        sb.append(", deviceType=");
        sb.append(this.m);
        sb.append(", volumeHandling=");
        sb.append(this.u);
        sb.append(", volume=");
        sb.append(this.n);
        sb.append(", volumeMax=");
        sb.append(this.o);
        sb.append(", presentationDisplayId=");
        sb.append(this.p);
        sb.append(", extras=");
        sb.append(this.q);
        sb.append(", settingsIntent=");
        sb.append(this.w);
        sb.append(", providerPackageName=");
        sb.append(this.b.c());
        if (r()) {
            sb.append(", members=[");
            int size = this.s.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.s.get(i) != this) {
                    sb.append(((fux) this.s.get(i)).d);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }

    public final boolean u(fur furVar) {
        if (furVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        fuy.e();
        ArrayList<IntentFilter> arrayList = this.t;
        furVar.c();
        if (furVar.c.isEmpty()) {
            return false;
        }
        for (IntentFilter intentFilter : arrayList) {
            if (intentFilter != null) {
                Iterator it = furVar.c.iterator();
                while (it.hasNext()) {
                    if (intentFilter.hasCategory((String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean v(String str) {
        fuy.e();
        ArrayList arrayList = this.t;
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
}
