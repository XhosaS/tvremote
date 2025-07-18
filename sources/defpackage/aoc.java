package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoc {
    public acm a;
    public Context b;
    public anw c;
    public bzs d;
    public bzs e;
    public final Map f;
    public aob g;
    public boolean h;
    public boolean i;

    public aoc() {
        this.a = acm.UNKNOWN;
        int i = bzs.d;
        this.e = cax.a;
        this.f = new HashMap();
        this.d = null;
    }

    public final aod a() {
        bdq.k(this.a != acm.UNKNOWN, "Entry Point must be set.");
        if (this.c == null) {
            Log.w("AppDoctorFixerContext", "No AppDoctorLogger set.");
            this.c = new aof(0);
        }
        return new aod(this);
    }

    public final void b(any anyVar) {
        this.f.put(anyVar.a, anyVar);
    }

    public final void c() {
        this.i = true;
    }

    public final void d(anx anxVar, int i) {
        Map map = this.f;
        aco acoVar = anxVar.a;
        if (map.containsKey(acoVar)) {
            int i2 = i - 2;
            b(new any(acoVar, i2 != 2 ? i2 != 4 ? 3 : 6 : 5));
        } else {
            throw new IllegalArgumentException("Status of '" + anxVar.b() + "' cannot be updated since no original status was set.");
        }
    }

    public aoc(aod aodVar) {
        this.a = acm.UNKNOWN;
        int i = bzs.d;
        this.e = cax.a;
        this.f = new HashMap();
        this.a = aodVar.a;
        this.b = aodVar.b;
        this.c = aodVar.c;
        this.d = aodVar.d;
        this.e = aodVar.e;
        bzl bzlVarValues = aodVar.f.values();
        for (int i2 = 0; i2 < ((cbb) bzlVarValues).a; i2++) {
            any anyVar = (any) ((bzs) bzlVarValues).get(i2);
            this.f.put(anyVar.a, anyVar);
        }
        this.g = aodVar.g;
        this.h = aodVar.h;
        this.i = aodVar.i;
    }
}
