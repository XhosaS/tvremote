package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqo {
    public ngj a;
    public Context b;
    public oqj c;
    public ImmutableList d;
    public ImmutableList e;
    public final Map f;
    public oqn g;
    public boolean h;
    public boolean i;

    public oqo() {
        this.a = ngj.UNKNOWN;
        this.e = ImmutableList.of();
        this.f = new HashMap();
        this.d = null;
    }

    public final oqp a() {
        sij.x(this.a != ngj.UNKNOWN, "Entry Point must be set.");
        if (this.c == null) {
            Log.w("AppDoctorFixerContext", "No AppDoctorLogger set.");
            this.c = new oqr(0);
        }
        return new oqp(this);
    }

    public final void b(oql oqlVar) {
        this.f.put(oqlVar.a, oqlVar);
    }

    public final void c() {
        this.i = true;
    }

    public final void d(oqk oqkVar, int i) {
        Map map = this.f;
        ngl nglVar = oqkVar.a;
        if (map.containsKey(nglVar)) {
            int i2 = i - 2;
            b(new oql(nglVar, i2 != 2 ? i2 != 4 ? 3 : 6 : 5));
        } else {
            throw new IllegalArgumentException("Status of '" + oqkVar.b() + "' cannot be updated since no original status was set.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oqo(oqp oqpVar) {
        this.a = ngj.UNKNOWN;
        this.e = ImmutableList.of();
        this.f = new HashMap();
        this.a = oqpVar.a;
        this.b = oqpVar.b;
        this.c = oqpVar.c;
        this.d = oqpVar.d;
        this.e = oqpVar.e;
        ImmutableList immutableListAsList = oqpVar.f.values().asList();
        for (int i = 0; i < immutableListAsList.size(); i++) {
            oql oqlVar = (oql) immutableListAsList.get(i);
            this.f.put(oqlVar.a, oqlVar);
        }
        this.g = oqpVar.g;
        this.h = oqpVar.h;
        this.i = oqpVar.i;
    }
}
