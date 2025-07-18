package defpackage;

import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebe {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public ImmutableList m;
    public ImmutableList n;
    public int o;
    public ImmutableList p;
    public int q;
    public int r;
    public int s;
    public ImmutableList t;
    public ebd u;
    public ImmutableList v;
    public int w;
    public boolean x;
    public int y;
    public boolean z;

    public ebe() {
        this.a = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.b = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.c = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.d = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.k = true;
        this.l = true;
        this.m = ImmutableList.of();
        this.n = ImmutableList.of();
        this.o = 0;
        this.p = ImmutableList.of();
        this.q = 0;
        this.r = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.s = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.t = ImmutableList.of();
        this.u = ebd.a;
        this.v = ImmutableList.of();
        this.w = 0;
        this.x = true;
        this.y = 0;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = new HashMap();
        this.E = new HashSet();
    }

    private static ImmutableList o(String[] strArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (String str : strArr) {
            str.getClass();
            builder.add((ImmutableList.Builder) edt.aa(str));
        }
        return builder.build();
    }

    public ebf a() {
        return new ebf(this);
    }

    public final void b(ebf ebfVar) {
        this.a = ebfVar.J;
        this.b = ebfVar.K;
        this.c = ebfVar.L;
        this.d = ebfVar.M;
        this.e = ebfVar.N;
        this.f = ebfVar.O;
        this.g = ebfVar.P;
        this.h = ebfVar.Q;
        this.i = ebfVar.R;
        this.j = ebfVar.S;
        this.k = ebfVar.T;
        this.l = ebfVar.U;
        this.m = ebfVar.V;
        this.n = ebfVar.W;
        this.o = ebfVar.X;
        this.p = ebfVar.Y;
        this.q = ebfVar.Z;
        this.r = ebfVar.aa;
        this.s = ebfVar.ab;
        this.t = ebfVar.ac;
        this.u = ebfVar.ad;
        this.v = ebfVar.ae;
        this.w = ebfVar.af;
        this.x = ebfVar.ag;
        this.y = ebfVar.ah;
        this.z = ebfVar.ai;
        this.A = ebfVar.aj;
        this.B = ebfVar.ak;
        this.C = ebfVar.al;
        this.E = new HashSet(ebfVar.an);
        this.D = new HashMap(ebfVar.am);
    }

    public final void c(ebb ebbVar) {
        this.D.put(ebbVar.c, ebbVar);
    }

    public void d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void e() {
        this.D.clear();
    }

    public final void f(int i) {
        Iterator it = this.D.values().iterator();
        while (it.hasNext()) {
            if (((ebb) it.next()).a() == i) {
                it.remove();
            }
        }
    }

    public final void g(Set set) {
        this.E.clear();
        this.E.addAll(set);
    }

    public final void h(ebb ebbVar) {
        f(ebbVar.a());
        this.D.put(ebbVar.c, ebbVar);
    }

    public final void i(String... strArr) {
        this.p = o(strArr);
    }

    public final void j(String... strArr) {
        this.v = o(strArr);
        this.x = false;
    }

    public final void k(int i) {
        this.w = i;
        this.x = false;
    }

    public final void l(int i, boolean z) {
        if (z) {
            this.E.add(Integer.valueOf(i));
        } else {
            this.E.remove(Integer.valueOf(i));
        }
    }

    public void m(String str) {
        if (str == null) {
            i(new String[0]);
        } else {
            i(str);
        }
    }

    public void n(String str) {
        if (str == null) {
            j(new String[0]);
        } else {
            j(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ebe(Bundle bundle) {
        ebd ebdVar;
        ImmutableList immutableListA;
        String str = ebf.g;
        ebf ebfVar = ebf.a;
        this.a = bundle.getInt(str, ebfVar.J);
        this.b = bundle.getInt(ebf.h, ebfVar.K);
        this.c = bundle.getInt(ebf.i, ebfVar.L);
        this.d = bundle.getInt(ebf.j, ebfVar.M);
        this.e = bundle.getInt(ebf.k, ebfVar.N);
        this.f = bundle.getInt(ebf.l, ebfVar.O);
        this.g = bundle.getInt(ebf.m, ebfVar.P);
        this.h = bundle.getInt(ebf.n, ebfVar.Q);
        this.i = bundle.getInt(ebf.o, ebfVar.R);
        int i = bundle.getInt(ebf.p, ebfVar.S);
        this.j = i;
        this.k = this.i == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(ebf.H, ebfVar.T);
        this.l = bundle.getBoolean(ebf.q, ebfVar.U);
        this.m = ImmutableList.copyOf((String[]) sij.I(bundle.getStringArray(ebf.r), new String[0]));
        this.n = ImmutableList.copyOf((String[]) sij.I(bundle.getStringArray(ebf.G), new String[0]));
        this.o = bundle.getInt(ebf.z, ebfVar.X);
        this.p = o((String[]) sij.I(bundle.getStringArray(ebf.b), new String[0]));
        this.q = bundle.getInt(ebf.c, ebfVar.Z);
        this.r = bundle.getInt(ebf.s, ebfVar.aa);
        this.s = bundle.getInt(ebf.t, ebfVar.ab);
        this.t = ImmutableList.copyOf((String[]) sij.I(bundle.getStringArray(ebf.u), new String[0]));
        Bundle bundle2 = bundle.getBundle(ebf.E);
        if (bundle2 != null) {
            ebd ebdVar2 = ebd.a;
            ebc ebcVar = new ebc();
            String str2 = ebd.b;
            ebd ebdVar3 = ebd.a;
            ebcVar.a = bundle2.getInt(str2, ebdVar3.e);
            ebcVar.b = bundle2.getBoolean(ebd.c, ebdVar3.f);
            ebcVar.c = bundle2.getBoolean(ebd.d, ebdVar3.g);
            ebdVar = new ebd(ebcVar);
        } else {
            ebc ebcVar2 = new ebc();
            String str3 = ebf.B;
            ebd ebdVar4 = ebd.a;
            ebcVar2.a = bundle.getInt(str3, ebdVar4.e);
            ebcVar2.b = bundle.getBoolean(ebf.C, ebdVar4.f);
            ebcVar2.c = bundle.getBoolean(ebf.D, ebdVar4.g);
            ebdVar = new ebd(ebcVar2);
        }
        this.u = ebdVar;
        this.v = o((String[]) sij.I(bundle.getStringArray(ebf.d), new String[0]));
        this.w = bundle.getInt(ebf.e, ebfVar.af);
        this.x = this.v.isEmpty() && this.w == 0 && bundle.getBoolean(ebf.I, ebfVar.ag);
        this.y = bundle.getInt(ebf.A, ebfVar.ah);
        this.z = bundle.getBoolean(ebf.f, ebfVar.ai);
        this.A = bundle.getBoolean(ebf.F, ebfVar.aj);
        this.B = bundle.getBoolean(ebf.v, ebfVar.ak);
        this.C = bundle.getBoolean(ebf.w, ebfVar.al);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(ebf.x);
        if (parcelableArrayList == null) {
            immutableListA = ImmutableList.of();
        } else {
            immutableListA = ecm.a(new dzc(8), parcelableArrayList);
        }
        this.D = new HashMap();
        for (int i2 = 0; i2 < immutableListA.size(); i2++) {
            ebb ebbVar = (ebb) immutableListA.get(i2);
            this.D.put(ebbVar.c, ebbVar);
        }
        int[] iArr = (int[]) sij.I(bundle.getIntArray(ebf.y), new int[0]);
        this.E = new HashSet();
        for (int i3 : iArr) {
            this.E.add(Integer.valueOf(i3));
        }
    }

    public ebe(ebf ebfVar) {
        b(ebfVar);
    }
}
