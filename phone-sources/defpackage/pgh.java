package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgh implements pfs {
    public static final tvn a = tvn.n("GnpSdk");
    private static final pcg j = new pcg();
    public final oxp b;
    public final yfo c;
    private final Context d;
    private final String e;
    private final yfo f;
    private final Set g;
    private final uhs h;
    private final oxe i;
    private final rbi k;

    public pgh(Context context, String str, rbi rbiVar, oxp oxpVar, yfo yfoVar, Set set, yfo yfoVar2, uhs uhsVar, oxe oxeVar) {
        this.d = context;
        this.e = str;
        this.k = rbiVar;
        this.b = oxpVar;
        this.f = yfoVar;
        this.g = set;
        this.c = yfoVar2;
        this.h = uhsVar;
        this.i = oxeVar;
    }

    private final Intent f(uxf uxfVar) {
        Intent launchIntentForPackage;
        String str = uxfVar.e;
        String str2 = uxfVar.d;
        String str3 = !uxfVar.c.isEmpty() ? uxfVar.c : TextUtils.isEmpty(str2) ? this.e : "";
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            launchIntentForPackage = this.d.getPackageManager().getLaunchIntentForPackage(str3);
            if (launchIntentForPackage == null) {
                return null;
            }
        } else {
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(str)) {
                intent.setClassName(str3, str);
            } else if (!TextUtils.isEmpty(str3)) {
                intent.setPackage(str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.setAction(str2);
            }
            launchIntentForPackage = intent;
        }
        String str4 = uxfVar.f;
        if (!TextUtils.isEmpty(str4)) {
            launchIntentForPackage.setData(Uri.parse(str4));
        }
        launchIntentForPackage.addFlags(uxfVar.i);
        return launchIntentForPackage;
    }

    @Override // defpackage.pfs
    public final /* synthetic */ uxd a(uxw uxwVar) {
        uxv uxvVarB = uxv.b(uxwVar.e);
        if (uxvVarB == null) {
            uxvVarB = uxv.ACTION_UNKNOWN;
        }
        int iOrdinal = uxvVarB.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? uxd.UNKNOWN_ACTION : uxd.ACKNOWLEDGE_RESPONSE : uxd.DISMISSED : uxd.NEGATIVE_RESPONSE : uxd.POSITIVE_RESPONSE;
    }

    @Override // defpackage.pfs
    public final void b(Activity activity, uxe uxeVar, Intent intent) {
        if (intent == null) {
            ((tvk) ((tvk) a.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", 174, "UserActionUtilImpl.java")).s("Intent could not be loaded, not launching.");
            return;
        }
        int iOrdinal = uxeVar.ordinal();
        if (iOrdinal == 1) {
            try {
                activity.startActivity(intent);
                return;
            } catch (ActivityNotFoundException e) {
                ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", (char) 182, "UserActionUtilImpl.java")).s("Did not found activity to start");
                return;
            }
        }
        if (iOrdinal == 2) {
            activity.startService(intent);
            return;
        }
        if (iOrdinal == 3) {
            activity.sendBroadcast(intent);
            return;
        }
        if (iOrdinal != 4) {
            ((tvk) ((tvk) a.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", 199, "UserActionUtilImpl.java")).v("IntentType %s not yet supported", uxeVar.name());
            return;
        }
        try {
            activity.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e2) {
            ((tvk) ((tvk) ((tvk) a.g()).i(e2)).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", (char) 195, "UserActionUtilImpl.java")).s("Did not found activity to start");
        }
    }

    @Override // defpackage.pfs
    public final void c(final oyd oydVar, final uxd uxdVar) {
        vtw vtwVarM = uwg.a.m();
        uwi uwiVar = oydVar.c;
        uwm uwmVar = uwiVar.c;
        if (uwmVar == null) {
            uwmVar = uwm.a;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        uwg uwgVar = (uwg) vucVar;
        uwmVar.getClass();
        uwgVar.c = uwmVar;
        uwgVar.b |= 1;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((uwg) vtwVarM.b).d = uxdVar.a();
        vtw vtwVarM2 = vwe.a.m();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(oydVar.d);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ((vwe) vtwVarM2.b).b = seconds;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uwg uwgVar2 = (uwg) vtwVarM.b;
        vwe vweVar = (vwe) vtwVarM2.r();
        vweVar.getClass();
        uwgVar2.e = vweVar;
        uwgVar2.b |= 2;
        vko vkoVar = oydVar.f;
        if (vkoVar != null) {
            uwf uwfVar = (uwf) j.convert(vkoVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uwg uwgVar3 = (uwg) vtwVarM.b;
            uwfVar.getClass();
            uwgVar3.f = uwfVar;
            uwgVar3.b |= 4;
        }
        uwg uwgVar4 = (uwg) vtwVarM.r();
        pdw pdwVar = (pdw) this.k.g(oydVar.b);
        uwm uwmVar2 = uwiVar.c;
        if (uwmVar2 == null) {
            uwmVar2 = uwm.a;
        }
        uhp uhpVarD = pdwVar.d(osk.v(uwmVar2), uwgVar4);
        oxe oxeVar = this.i;
        uwl uwlVar = uwiVar.j;
        if (uwlVar == null) {
            uwlVar = uwl.a;
        }
        oxeVar.a(uwgVar4, uwlVar);
        osk.Z(uhpVarD, new Consumer() { // from class: pgg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                pgh pghVar = this.a;
                oyd oydVar2 = oydVar;
                int iOrdinal = uxdVar.ordinal();
                if (iOrdinal == 1) {
                    pghVar.b.n(oydVar2);
                    return;
                }
                if (iOrdinal == 2) {
                    pghVar.b.m(oydVar2, voo.ACTION_POSITIVE);
                    return;
                }
                if (iOrdinal == 3) {
                    pghVar.b.m(oydVar2, voo.ACTION_NEGATIVE);
                } else if (iOrdinal != 6) {
                    pghVar.b.m(oydVar2, voo.ACTION_UNKNOWN);
                } else {
                    pghVar.b.m(oydVar2, voo.ACTION_ACKNOWLEDGE);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new mig(6));
        sfy.N(uhpVarD).b(new osv(this, 2), this.h);
        if (((pir) this.f).b() != null) {
            tac tacVar = new tac((byte[]) null);
            uyr uyrVar = uwiVar.f;
            if (uyrVar == null) {
                uyrVar = uyr.a;
            }
            tacVar.a = osk.z(uyrVar);
            tacVar.e();
            uxdVar.ordinal();
        }
    }

    @Override // defpackage.pfs
    public final boolean d(Context context, uxf uxfVar) {
        uxe uxeVarB = uxe.b(uxfVar.g);
        if (uxeVarB == null) {
            uxeVarB = uxe.UNKNOWN;
        }
        if (!uxe.ACTIVITY.equals(uxeVarB) && !uxe.ACTIVITY_WITH_RESULT.equals(uxeVarB)) {
            return true;
        }
        Intent intentF = f(uxfVar);
        return (intentF == null || intentF.resolveActivityInfo(context.getPackageManager(), intentF.getFlags()) == null) ? false : true;
    }

    @Override // defpackage.pfs
    public final uhp e(uxf uxfVar, String str, uxw uxwVar) {
        uyk uykVarB;
        Intent intentF = f(uxfVar);
        if (intentF == null) {
            return sfy.C(null);
        }
        for (uyl uylVar : uxfVar.h) {
            int i = uylVar.c;
            int iQ = sij.Q(i);
            if (iQ == 0) {
                throw null;
            }
            int i2 = iQ - 1;
            if (i2 == 0) {
                intentF.putExtra(uylVar.e, i == 2 ? (String) uylVar.d : "");
            } else if (i2 == 1) {
                intentF.putExtra(uylVar.e, i == 4 ? ((Integer) uylVar.d).intValue() : 0);
            } else if (i2 == 2) {
                intentF.putExtra(uylVar.e, i == 5 ? ((Boolean) uylVar.d).booleanValue() : false);
            } else if (i2 == 3) {
                if (i != 3 || (uykVarB = uyk.b(((Integer) uylVar.d).intValue())) == null) {
                    uykVarB = uyk.CLIENT_VALUE_UNKNOWN;
                }
                if (uykVarB.ordinal() == 1 && str != null) {
                    intentF.putExtra(uylVar.e, str);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        intentF.getExtras();
        uxv uxvVarB = uxv.b(uxwVar.e);
        if (uxvVarB == null) {
            uxvVarB = uxv.ACTION_UNKNOWN;
        }
        if (osk.y(uxvVarB) == null) {
            throw new NullPointerException("Null actionType");
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            arrayList.add(((pin) it.next()).b());
        }
        return ufn.i(sfy.z(arrayList), new pgc(intentF, 2), ugk.a);
    }
}
