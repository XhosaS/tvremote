package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eno implements Handler.Callback {
    public enr d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final ezp h;
    public final pku i;
    public final TreeMap c = new TreeMap();
    public final Handler b = edt.K(this);
    public final ffv a = new ffv();

    public eno(enr enrVar, pku pkuVar, ezp ezpVar) {
        this.d = enrVar;
        this.i = pkuVar;
        this.h = ezpVar;
    }

    public final void a() {
        if (this.e) {
            this.f = true;
            this.e = false;
            enf enfVar = (enf) this.i.a;
            enfVar.e.removeCallbacks(enfVar.b);
            enfVar.m();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.g) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        fhk fhkVar = (fhk) message.obj;
        long j = fhkVar.a;
        long j2 = fhkVar.b;
        TreeMap treeMap = this.c;
        Long lValueOf = Long.valueOf(j2);
        Long l = (Long) treeMap.get(lValueOf);
        if (l == null || l.longValue() > j) {
            treeMap.put(lValueOf, Long.valueOf(j));
        }
        return true;
    }
}
