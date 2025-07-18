package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqs extends kqu {
    private final lbk a;
    private final leo b;

    public kqs(lbk lbkVar) {
        kkk.k(lbkVar);
        this.a = lbkVar;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        this.b = leoVar;
    }

    @Override // defpackage.lep
    public final int a(String str) {
        kkk.h(str);
        ktx ktxVar = this.b.y.d;
        return 25;
    }

    @Override // defpackage.lep
    public final long b() {
        lbk lbkVar = this.a;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        return lioVar.v();
    }

    @Override // defpackage.lep
    public final String c() {
        return this.b.j();
    }

    @Override // defpackage.lep
    public final String d() {
        return this.b.k();
    }

    @Override // defpackage.lep
    public final String e() {
        return this.b.l();
    }

    @Override // defpackage.lep
    public final String f() {
        return this.b.j();
    }

    @Override // defpackage.lep
    public final List g(String str, String str2) {
        leo leoVar = this.b;
        lbk lbkVar = leoVar.y;
        lbk lbkVar2 = leoVar.y;
        lbh lbhVar = lbkVar2.g;
        lbkVar2.o(lbhVar);
        if (lbhVar.k()) {
            lab labVar = lbkVar2.f;
            lbkVar2.o(labVar);
            labVar.c.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (lbkVar2.c.a()) {
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        lbk lbkVar3 = leoVar.y;
        lbh lbhVar2 = lbkVar3.g;
        lbkVar3.o(lbhVar2);
        lbhVar2.b(atomicReference, 5000L, "get conditional user properties", new ldz(leoVar, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return lio.G(list);
        }
        lab labVar3 = lbkVar2.f;
        lbkVar2.o(labVar3);
        labVar3.c.b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    @Override // defpackage.lep
    public final Map h(String str, String str2, boolean z) {
        leo leoVar = this.b;
        lbk lbkVar = leoVar.y;
        lbk lbkVar2 = leoVar.y;
        lbh lbhVar = lbkVar2.g;
        lbkVar2.o(lbhVar);
        if (lbhVar.k()) {
            lab labVar = lbkVar2.f;
            lbkVar2.o(labVar);
            labVar.c.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (lbkVar2.c.a()) {
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        lbk lbkVar3 = leoVar.y;
        lbh lbhVar2 = lbkVar3.g;
        lbkVar3.o(lbhVar2);
        lbhVar2.b(atomicReference, 5000L, "get user properties", new lea(leoVar, atomicReference, str, str2, z));
        List<UserAttributeParcel> list = (List) atomicReference.get();
        if (list == null) {
            lab labVar3 = lbkVar2.f;
            lbkVar2.o(labVar3);
            labVar3.c.b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.EMPTY_MAP;
        }
        we weVar = new we(list.size());
        for (UserAttributeParcel userAttributeParcel : list) {
            Object objA = userAttributeParcel.a();
            if (objA != null) {
                weVar.put(userAttributeParcel.b, objA);
            }
        }
        return weVar;
    }

    @Override // defpackage.lep
    public final void i(String str) {
        lbk lbkVar = this.a;
        kst kstVar = lbkVar.m;
        lbkVar.l(kstVar);
        klk klkVar = lbkVar.B;
        kstVar.a(str, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.lep
    public final void j(String str, String str2, Bundle bundle) {
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        lbk lbkVar2 = leoVar.y;
        leoVar.M(str, str2, bundle);
    }

    @Override // defpackage.lep
    public final void k(String str) {
        lbk lbkVar = this.a;
        kst kstVar = lbkVar.m;
        lbkVar.l(kstVar);
        klk klkVar = lbkVar.B;
        kstVar.b(str, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.lep
    public final void l(String str, String str2, Bundle bundle) {
        this.b.r(str, str2, bundle);
    }

    @Override // defpackage.lep
    public final void m(Bundle bundle) {
        leo leoVar = this.b;
        klk klkVar = leoVar.y.B;
        leoVar.A(bundle, System.currentTimeMillis());
    }
}
