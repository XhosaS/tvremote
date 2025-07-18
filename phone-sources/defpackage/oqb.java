package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqb implements uha {
    final /* synthetic */ oqc a;
    final /* synthetic */ oqe b;
    final /* synthetic */ Context c;
    final /* synthetic */ int d;

    public oqb(oqc oqcVar, oqe oqeVar, Context context, int i) {
        this.a = oqcVar;
        this.b = oqeVar;
        this.c = context;
        this.d = i;
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        th.getClass();
        Log.e("LoggingAppWdgtPrvdrDlgt", "Failed to add widget ID " + this.d + ".", th);
    }

    @Override // defpackage.uha
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            oqc oqcVar = this.a;
            oqe oqeVar = this.b;
            Context context = this.c;
            vtw vtwVarM = wcv.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wcv wcvVar = (wcv) vtwVarM.b;
            wcvVar.c = 2;
            wcvVar.b |= 1;
            oqcVar.b(oqeVar, context, vtwVarM);
        }
    }
}
