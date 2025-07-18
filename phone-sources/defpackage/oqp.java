package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqp {
    public final ngj a;
    public final Context b;
    public final oqj c;
    public ImmutableList d;
    public final ImmutableList e;
    public final ImmutableMap f;
    public final oqn g;
    public final boolean h;
    public final boolean i;

    public oqp(oqo oqoVar) {
        this.a = oqoVar.a;
        Context context = oqoVar.b;
        context.getClass();
        this.b = context;
        oqj oqjVar = oqoVar.c;
        oqjVar.getClass();
        this.c = oqjVar;
        this.d = oqoVar.d;
        this.e = oqoVar.e;
        this.f = ImmutableMap.copyOf(oqoVar.f);
        this.g = oqoVar.g;
        this.h = oqoVar.h;
        this.i = oqoVar.i;
    }

    public final oql a(ngl nglVar) {
        oql oqlVar = (oql) this.f.get(nglVar);
        return oqlVar == null ? new oql(nglVar, 2) : oqlVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ImmutableList b() {
        ImmutableList immutableList = this.d;
        if (immutableList != null) {
            return immutableList;
        }
        oxe oxeVar = new oxe(this.b);
        try {
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) ((ufb) ufn.i(((smc) oxeVar.a).a(), new oyj(1), oxeVar.b)).s());
            this.d = immutableListCopyOf;
            return immutableListCopyOf == null ? ImmutableList.of() : immutableListCopyOf;
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalArgumentException("Retrieval of recent fix data failed", e);
        }
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("entry_point", this.a);
        tssVarH.b("context", this.b);
        tssVarH.b("appDoctorLogger", this.c);
        tssVarH.b("recentFixes", this.d);
        tssVarH.b("fixesExecutedThisIteration", this.e);
        tssVarH.b("fixStatusesExecutedThisIteration", this.f);
        tssVarH.b("currentFixer", this.g);
        tssVarH.f("processRestartNeeded", this.h);
        tssVarH.f("appRestartNeeded", this.i);
        return tssVarH.toString();
    }
}
