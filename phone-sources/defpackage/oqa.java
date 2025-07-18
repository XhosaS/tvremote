package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqa implements uha {
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ oqc c;
    final /* synthetic */ oqe d;
    final /* synthetic */ Context e;
    private final vtw f;

    public oqa(int i, long j, oqc oqcVar, oqe oqeVar, Context context) {
        this.a = i;
        this.b = j;
        this.c = oqcVar;
        this.d = oqeVar;
        this.e = context;
        vtw vtwVarM = wcv.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wcv wcvVar = (wcv) vtwVarM.b;
        wcvVar.c = 3;
        wcvVar.b |= 1;
        this.f = vtwVarM;
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        th.getClass();
        Log.e("LoggingAppWdgtPrvdrDlgt", "Failed to remove widget " + this.a + ".", th);
        this.c.b(this.d, this.e, this.f);
    }

    @Override // defpackage.uha
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        wcw wcwVar = (wcw) obj;
        if (wcwVar == null) {
            Log.e("LoggingAppWdgtPrvdrDlgt", "Failed to remove widget " + this.a + ". ID does not exist.");
        } else {
            long j = wcwVar.d;
            if (j > 0) {
                long j2 = this.b;
                vtw vtwVar = this.f;
                long jM = ykn.m(j2 - j, 0L);
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                wcv wcvVar = (wcv) vtwVar.b;
                wcv wcvVar2 = wcv.a;
                wcvVar.b |= 8;
                wcvVar.f = jM;
            } else if (j != 0) {
                Log.e("LoggingAppWdgtPrvdrDlgt", a.cs(j, "Not logging duration. Installation timestamp was negative: "));
            }
        }
        this.c.b(this.d, this.e, this.f);
    }
}
