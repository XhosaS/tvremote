package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pun implements pum {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final Set c;
    private final pvg d;
    private final qoj e;

    public pun(Context context, Set set, pvg pvgVar, qoj qojVar) {
        set.getClass();
        pvgVar.getClass();
        qojVar.getClass();
        this.b = context;
        this.c = set;
        this.d = pvgVar;
        this.e = qojVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pum
    public final psy a(String str, Bundle bundle) {
        if (xdk.b()) {
            this.d.c().a();
        }
        qsx qsxVar = null;
        if (str != null && str.length() != 0) {
            Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (yks.e(((qsx) next).d(), str)) {
                    qsxVar = next;
                    break;
                }
            }
            qsxVar = qsxVar;
        }
        if (qsxVar == null) {
            ((tvk) a.f()).v("ChimeTask NOT found. key: '%s'", str);
            return psy.a(new Exception("ChimeTask NOT found."));
        }
        a.l().v("Starting task execution. Job key: '%s'", str);
        qoj qojVar = this.e;
        Context context = this.b;
        psy psyVarB = qsxVar.b(bundle);
        qojVar.a(context.getPackageName(), Build.VERSION.SDK_INT, false, qsxVar.d(), false, psyVarB.c());
        return psyVarB;
    }
}
