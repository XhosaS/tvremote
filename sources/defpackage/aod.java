package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aod {
    public final acm a;
    public final Context b;
    public final anw c;
    public bzs d;
    public final bzs e;
    public final bzw f;
    public final aob g;
    public final boolean h;
    public final boolean i;

    public aod(aoc aocVar) {
        this.a = aocVar.a;
        Context context = aocVar.b;
        context.getClass();
        this.b = context;
        anw anwVar = aocVar.c;
        anwVar.getClass();
        this.c = anwVar;
        this.d = aocVar.d;
        this.e = aocVar.e;
        Set setEntrySet = aocVar.f.entrySet();
        bzu bzuVar = new bzu(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        bzuVar.d(setEntrySet);
        this.f = bzuVar.b();
        this.g = aocVar.g;
        this.h = aocVar.h;
        this.i = aocVar.i;
    }

    public final any a(aco acoVar) {
        any anyVar = (any) this.f.get(acoVar);
        return anyVar == null ? new any(acoVar, 2) : anyVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final bzs b() {
        bzs bzsVar = this.d;
        if (bzsVar != null) {
            return bzsVar;
        }
        awy awyVar = new awy(this.b, (byte[]) null);
        try {
            bzs bzsVarO = bzs.o((List) ((cgx) chk.h(((bgc) awyVar.b).a(), new ata(1), awyVar.a)).s());
            this.d = bzsVarO;
            return bzsVarO == null ? cax.a : bzsVarO;
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalArgumentException("Retrieval of recent fix data failed", e);
        }
    }

    public final String toString() {
        byf byfVarR = bdq.r(this);
        byfVarR.b("entry_point", this.a);
        byfVarR.b("context", this.b);
        byfVarR.b("appDoctorLogger", this.c);
        byfVarR.b("recentFixes", this.d);
        byfVarR.b("fixesExecutedThisIteration", this.e);
        byfVarR.b("fixStatusesExecutedThisIteration", this.f);
        byfVarR.b("currentFixer", this.g);
        byfVarR.c("processRestartNeeded", this.h);
        byfVarR.c("appRestartNeeded", this.i);
        return byfVarR.toString();
    }
}
