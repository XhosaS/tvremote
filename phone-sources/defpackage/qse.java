package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qse {
    public static final tvn a = tvn.n("GnpSdk");
    public final rbi b;
    private final pva c;
    private final qei d;
    private final pzq e;
    private final qol f;
    private final pzo g;
    private final tst h;

    public qse(pva pvaVar, qei qeiVar, pzq pzqVar, rbi rbiVar, qol qolVar, pzo pzoVar, tst tstVar, Context context, qpr qprVar) {
        this.c = pvaVar;
        this.d = qeiVar;
        this.e = pzqVar;
        this.b = rbiVar;
        this.f = qolVar;
        this.g = pzoVar;
        this.h = tstVar;
        qprVar.a(context);
    }

    private final void b(String str) {
        tst tstVar = this.h;
        if (tstVar.g()) {
            qem qemVarA = qen.a();
            qemVarA.b(new qpz(str));
            qemVarA.a();
            ((qrv) tstVar.c()).a();
        }
    }

    public final psy a(String str, boolean z, vmd vmdVar) {
        boolean zContains;
        sij.o(!TextUtils.isEmpty(str), "Account name must not be empty.");
        sij.o(this.d.b != null, "GcmSenderProjectId must be set on GnpConfig");
        str.getClass();
        try {
            Set setA = ((qon) this.f).a();
            ArrayList arrayList = new ArrayList(yfm.z(setA, 10));
            Iterator it = setA.iterator();
            while (it.hasNext()) {
                arrayList.add(((Account) it.next()).name);
            }
            zContains = yfm.aq(arrayList).contains(str);
        } catch (qok e) {
            ((tvk) ((tvk) qon.a.g()).i(e)).s("HasCorrespondingAccountOnDevice fell back to true");
            zContains = true;
        }
        if (!zContains) {
            ((tvk) ((tvk) a.g()).j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "register", 96, "RegistrationHandler.java")).s("Registration failed. Provided account is not available on device.");
            Exception exc = new Exception("Account intended to register is not available on device.");
            b(str);
            return psy.a(exc);
        }
        try {
            qen qenVarA = this.c.a(new qpz(str));
            if (!z) {
                try {
                    vjq vjqVarA = this.g.a(qenVarA, vmdVar, vme.a);
                    int i = qsk.a;
                    int iE = qtl.e(vjqVarA);
                    int i2 = qenVarA.f;
                    if (i2 == 1 || i2 == 2) {
                        int i3 = qenVarA.l;
                        if (i3 == 0 || i3 != iE) {
                            ((tvk) a.l().j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "isNewRegistrationRequest", 202, "RegistrationHandler.java")).w("New request hash [%d] differs with old request hash [%d].", iE, i3);
                        } else {
                            long epochMilli = Instant.now().toEpochMilli();
                            long j = qenVarA.k;
                            long jMax = Math.max(0L, this.d.e);
                            if (epochMilli - j <= jMax) {
                                tvn tvnVar = a;
                                ((tvk) tvnVar.l().j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "isNewRegistrationRequest", 223, "RegistrationHandler.java")).F("Not treating this register request as new. The last registration was at [%d], which is less than [%d] ms ago (current time [%d]), also the request hash [%d] doesn't differ from the old one.", Long.valueOf(j), Long.valueOf(jMax), Long.valueOf(epochMilli), Integer.valueOf(iE));
                                ((tvk) tvnVar.l().j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "register", R.styleable.AppCompatTheme_windowFixedWidthMinor, "RegistrationHandler.java")).v("Skip registration. Target already stored for account: %s.", str);
                                tst tstVar = this.h;
                                if (tstVar.g()) {
                                    ((qrv) tstVar.c()).b();
                                }
                                return psy.a;
                            }
                            ((tvk) a.l().j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "isNewRegistrationRequest", 215, "RegistrationHandler.java")).u("Last registration was more than [%d] ms ago, considering this as new.", jMax);
                        }
                    }
                } catch (qjr unused) {
                }
            }
            this.c.b(str);
            ((tvk) a.l().j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "register", 134, "RegistrationHandler.java")).v("Registration scheduled for account: %s.", str);
            return this.e.a(qenVarA, vmdVar);
        } catch (qnq e2) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e2)).j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "register", 'k', "RegistrationHandler.java")).s("Registration failed. Error inserting account.");
            b(str);
            return psy.a(e2);
        }
    }
}
