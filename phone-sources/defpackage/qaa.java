package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qaa extends qad {
    private final pyd c;
    private final String d;
    private final ntp e;

    public qaa(pyd pydVar, ntp ntpVar) {
        pydVar.getClass();
        ntpVar.getClass();
        this.c = pydVar;
        this.e = ntpVar;
        this.d = "RPC_FETCH_UPDATED_THREADS";
    }

    @Override // defpackage.qsx
    public final String d() {
        return this.d;
    }

    @Override // defpackage.qad
    public final Object f(Bundle bundle, vme vmeVar, qen qenVar, yih yihVar) {
        if (qenVar == null) {
            return j();
        }
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION");
        vlo vloVarB = vlo.b(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", vlo.FETCH_REASON_UNSPECIFIED.p));
        if (vloVarB == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ntp ntpVar = this.e;
        rzy rzyVar = new rzy((short[]) null);
        rzyVar.D("last_updated__version");
        rzyVar.E(">?", Long.valueOf(j));
        ImmutableList immutableListA = ((qas) ntpVar.a).a(qenVar, ImmutableList.of(rzyVar.C()));
        immutableListA.getClass();
        pyd pydVar = this.c;
        ArrayList arrayList = new ArrayList(yfm.z(immutableListA, 10));
        Iterator<E> it = immutableListA.iterator();
        while (it.hasNext()) {
            arrayList.add(osk.X((qis) it.next()));
        }
        return pydVar.e(qenVar, j, arrayList, vloVarB, vmeVar, yihVar);
    }

    @Override // defpackage.qad
    protected final String g() {
        return "FetchUpdatedThreadsCallback";
    }
}
