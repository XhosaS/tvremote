package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class opz implements oqd {
    private final nsz c;
    private final Context d;
    private AtomicBoolean e;
    private final boolean f;
    private final nwq g;
    private static final Set b = yfm.aZ(new String[]{"com.google.android.deskclock", "com.google.android.libraries.androidatgoogle.unbrandeddemo", "com.google.android.settings.intelligence"});
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public opz(Context context, Integer num) {
        nsz nszVarA;
        if (num != null) {
            final int iIntValue = num.intValue();
            nsu nsuVarJ = nsz.j(context.getApplicationContext(), "ANDROID_AT_GOOGLE");
            nsuVarJ.e = new ntc() { // from class: opx
                @Override // defpackage.ntc
                public final nte a() {
                    ConcurrentHashMap concurrentHashMap = opz.a;
                    return nte.a(iIntValue, whn.LOGGER_OVERRIDE_PROVIDER);
                }
            };
            nszVarA = nsuVarJ.a();
        } else {
            nszVarA = nsz.j(context.getApplicationContext(), "ANDROID_AT_GOOGLE").a();
        }
        nwq nwqVarA = oos.a(context.getApplicationContext());
        this.c = nszVarA;
        this.g = nwqVarA;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.d = applicationContext;
        boolean z = true;
        this.e = new AtomicBoolean(true);
        Set<String> set = b;
        if ((set instanceof Collection) && set.isEmpty()) {
            z = false;
        } else {
            for (String str : set) {
                String packageName = this.d.getPackageName();
                packageName.getClass();
                if (ylh.K(packageName, str, true)) {
                    break;
                }
            }
            z = false;
        }
        this.f = z;
    }

    public static final void b(opz opzVar, wcv wcvVar) {
        vtw vtwVarM = wct.a.m();
        String packageName = opzVar.d.getPackageName();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wct wctVar = (wct) vucVar;
        packageName.getClass();
        wctVar.b |= 1;
        wctVar.e = packageName;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wct wctVar2 = (wct) vtwVarM.b;
        wctVar2.d = wcvVar;
        wctVar2.c = 2;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        opzVar.c.g((wct) vucVarR).c();
    }

    @Override // defpackage.oqd
    public final void a(wcv wcvVar) {
        if (this.e.get()) {
            if (!this.f) {
                b(this, wcvVar);
                return;
            }
            onz onzVarX = this.g.x();
            onzVarX.q(new igu(new jzu(wcvVar, this, 14), 5));
            onzVarX.p(new opw(0));
        }
    }
}
