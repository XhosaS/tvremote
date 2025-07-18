package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class noa {
    public static final nsf a = new nsf("SessionFlowSummary");
    public static final String b = "22.1.1";
    private static long x = System.currentTimeMillis();
    public final nnr h;
    public final String i;
    public final long k;
    public nmq l;
    public String m;
    public String n;
    public nny o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int w;
    public final ttm c = sij.l(new eik(4));
    public final List d = DesugarCollections.synchronizedList(new ArrayList());
    public final List e = DesugarCollections.synchronizedList(new ArrayList());
    public final List f = DesugarCollections.synchronizedList(new ArrayList());
    public final Map g = DesugarCollections.synchronizedMap(new HashMap());
    public int v = 0;
    public final long j = System.currentTimeMillis();

    public noa(nnr nnrVar, String str) {
        this.h = nnrVar;
        this.i = str;
        long j = x;
        x = 1 + j;
        this.k = j;
    }

    public final void a(nmq nmqVar) {
        if (nmqVar == null) {
            c(2);
            return;
        }
        CastDevice castDeviceC = nmqVar.c();
        if (castDeviceC == null) {
            c(3);
            return;
        }
        this.l = nmqVar;
        String str = this.n;
        if (str != null) {
            if (TextUtils.equals(str, castDeviceC.j)) {
                return;
            }
            c(5);
            return;
        }
        this.n = castDeviceC.j;
        this.p = castDeviceC.e;
        this.v = castDeviceC.b();
        nru nruVarD = castDeviceC.d();
        if (nruVarD != null) {
            this.q = nruVarD.d;
            this.r = nruVarD.e;
            this.s = nruVarD.f;
            this.t = nruVarD.g;
            this.u = nruVarD.h;
        }
        nmqVar.p();
    }

    public final void b(String str) {
        String str2 = this.m;
        if (str2 == null) {
            this.m = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            c(4);
        }
    }

    public final void c(int i) {
        Map map = this.g;
        Integer numValueOf = Integer.valueOf(i - 1);
        nob nobVar = (nob) map.get(numValueOf);
        if (nobVar != null) {
            nobVar.d.incrementAndGet();
            nobVar.b = System.currentTimeMillis();
        } else {
            nob nobVar2 = new nob(new sew(i));
            nobVar2.c = this.j;
            map.put(numValueOf, nobVar2);
        }
    }
}
