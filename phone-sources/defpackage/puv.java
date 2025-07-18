package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.common.collect.ImmutableExtensionsKt;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class puv implements pus {
    public static final tvn a = tvn.n("GnpSdk");
    public final xbw b;
    public final xbw c;
    public final xbw d;
    public final qbz e;
    private final xbw f;
    private final qpr g;

    public puv(xbw xbwVar, xbw xbwVar2, xbw xbwVar3, xbw xbwVar4, qpr qprVar, qbz qbzVar) {
        xbwVar.getClass();
        xbwVar2.getClass();
        xbwVar3.getClass();
        xbwVar4.getClass();
        this.f = xbwVar;
        this.b = xbwVar2;
        this.c = xbwVar3;
        this.d = xbwVar4;
        this.g = qprVar;
        this.e = qbzVar;
    }

    @Override // defpackage.pus
    public final void a(Context context, final Intent intent) {
        int iU;
        context.getClass();
        if (!ocv.bs(intent)) {
            a.l().s("Intent is null or have null action.");
            return;
        }
        if (intent.getBooleanExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", false)) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", true);
        this.g.a(context.getApplicationContext());
        final String strG = qcb.g(intent);
        final String strF = qcb.f(intent);
        final vmo vmoVarD = qcb.d(intent);
        final vht vhtVarB = qcb.b(intent);
        if (strG != null || strF != null) {
            final int iQ = qcb.q(intent);
            String strE = qcb.e(intent);
            if (strE != null && ylh.ac(strE, "com.google.android.libraries.notifications.ACTION_ID:") && (iU = ylh.U(strE, "com.google.android.libraries.notifications.ACTION_ID:", 0, false, 2)) >= 0) {
                int i = iU + 53;
                if (i < iU) {
                    throw new IndexOutOfBoundsException(a.cn(iU, i, "End index (", ") is less than start index (", ")."));
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) strE, 0, iU);
                sb.append((CharSequence) "");
                sb.append((CharSequence) strE, i, strE.length());
                strE = sb.toString();
            }
            final String str = strE;
            ((qgq) this.f.b()).a(new Runnable() { // from class: put
                @Override // java.lang.Runnable
                public final void run() throws SecurityException, IllegalArgumentException {
                    puv puvVar = this.a;
                    int i2 = iQ;
                    vmo vmoVar = vmoVarD;
                    Intent intent2 = intent;
                    String str2 = strF;
                    String str3 = str;
                    vht vhtVar = vhtVarB;
                    int threadPriority = Process.getThreadPriority(0);
                    try {
                        Process.setThreadPriority(10);
                        qen qenVar = (qen) ykr.n(yim.a, new pfd(puvVar, intent2, (yih) null, 8));
                        if (qenVar != null) {
                            String str4 = strG;
                            ImmutableList immutableListM = str4 != null ? ((nsf) puvVar.b.b()).m(qenVar, str4) : ((nsf) puvVar.b.b()).l(qenVar, str2);
                            for (qqx qqxVar : (Set) puvVar.d.b()) {
                                immutableListM.getClass();
                                ImmutableExtensionsKt.toImmutableList((Collection) immutableListM);
                                qqxVar.f();
                            }
                            ykr.n(yim.a, new puu(puvVar, i2, str3, qenVar, immutableListM, vmoVar, intent2, vhtVar, null));
                        }
                    } finally {
                        Process.setThreadPriority(threadPriority);
                    }
                }
            });
            a.l().s("Scheduled job to handle thread update.");
        }
        a.l().s("Marking thread update as handled.");
    }
}
