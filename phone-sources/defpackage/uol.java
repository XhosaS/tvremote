package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uol {
    private static final Object a = new Object();
    private static upj b;

    public static onz a(Context context, Intent intent, boolean z) {
        upj upjVar;
        synchronized (a) {
            if (b == null) {
                b = new upj(context);
            }
            upjVar = b;
        }
        if (!z) {
            return upjVar.a(intent).a(new fba(11), new nuz(4));
        }
        if (uox.a().c(context)) {
            synchronized (uph.b) {
                uph.a(context);
                boolean zD = uph.d(intent);
                uph.c(intent, true);
                if (!zD) {
                    uph.c.a(uph.a);
                }
                upjVar.a(intent).k(new nmn(intent, 6));
            }
        } else {
            upjVar.a(intent);
        }
        return osk.r(-1);
    }

    public static final onz b(final Intent intent, final Context context, Executor executor) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean z = ocv.f() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? osk.p(executor, new grz(context, intent, 17, null)).b(executor, new ono() { // from class: uok
            @Override // defpackage.ono
            public final Object a(onz onzVar) {
                if (!ocv.f() || ((Integer) onzVar.e()).intValue() != 402) {
                    return onzVar;
                }
                boolean z3 = z2;
                return uol.a(context, intent, z3).a(new fba(11), new nuz(5));
            }
        }) : a(context, intent, false);
    }
}
