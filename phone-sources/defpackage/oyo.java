package defpackage;

import android.support.v7.appcompat.R;
import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyo implements oyi {
    private static final tvn a = tvn.n("GnpSdk");
    private final rbi b;

    public oyo(rbi rbiVar) {
        this.b = rbiVar;
    }

    private static String g(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    private final void h(oyd oydVar, String str) {
        if (xff.c()) {
            vtw vtwVarM = oyw.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uwi uwiVar = oydVar.c;
            oyw oywVar = (oyw) vtwVarM.b;
            uwiVar.getClass();
            oywVar.c = uwiVar;
            oywVar.b |= 1;
            long epochMilli = Instant.now().toEpochMilli();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            oyw oywVar2 = (oyw) vucVar;
            oywVar2.b |= 4;
            oywVar2.e = epochMilli;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            String str2 = oydVar.b;
            vuc vucVar2 = vtwVarM.b;
            oyw oywVar3 = (oyw) vucVar2;
            str.getClass();
            oywVar3.b |= 8;
            oywVar3.f = str;
            if (str2 != null) {
                if (!vucVar2.A()) {
                    vtwVarM.u();
                }
                oyw oywVar4 = (oyw) vtwVarM.b;
                oywVar4.b |= 2;
                oywVar4.d = str2;
            }
            ((pdw) this.b.g(str2)).d(UUID.randomUUID().toString(), (oyw) vtwVarM.r());
        }
    }

    @Override // defpackage.oyi
    public final void a(oyd oydVar, String str, Object... objArr) {
        String strG = g(str, objArr);
        tvk tvkVar = (tvk) a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logDebug", R.styleable.AppCompatTheme_textAppearanceListItem, "PromoEvalLoggerImpl.java");
        uwm uwmVar = oydVar.c.c;
        if (uwmVar == null) {
            uwmVar = uwm.a;
        }
        tvkVar.x("Promo ID [%s]: %s", uwmVar.b, strG);
        h(oydVar, strG);
    }

    @Override // defpackage.oyi
    public final void b(oyd oydVar, String str, Object... objArr) {
        String strG = g(str, objArr);
        tvk tvkVar = (tvk) ((tvk) a.f()).j("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logError", 38, "PromoEvalLoggerImpl.java");
        uwm uwmVar = oydVar.c.c;
        if (uwmVar == null) {
            uwmVar = uwm.a;
        }
        tvkVar.x("Promo ID [%s]: %s", uwmVar.b, strG);
        h(oydVar, strG);
    }

    @Override // defpackage.oyi
    public final void c(oyd oydVar, String str, Object... objArr) {
        String strG = g(str, objArr);
        tvk tvkVar = (tvk) a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logVerbose", 90, "PromoEvalLoggerImpl.java");
        uwm uwmVar = oydVar.c.c;
        if (uwmVar == null) {
            uwmVar = uwm.a;
        }
        tvkVar.x("Promo ID [%s]: %s", uwmVar.b, strG);
        h(oydVar, strG);
    }

    @Override // defpackage.oyi
    public final void d(oyd oydVar, String str, Object... objArr) {
        String strG = g(str, objArr);
        tvk tvkVar = (tvk) ((tvk) a.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logWarning", 63, "PromoEvalLoggerImpl.java");
        uwm uwmVar = oydVar.c.c;
        if (uwmVar == null) {
            uwmVar = uwm.a;
        }
        tvkVar.x("Promo ID [%s]: %s", uwmVar.b, strG);
        h(oydVar, strG);
    }

    @Override // defpackage.oyi
    public final void e(oyd oydVar, Throwable th, Object... objArr) {
        String strG = g("Unexpected exception while rendering promotion.", objArr);
        tvk tvkVar = (tvk) ((tvk) ((tvk) a.f()).i(th)).j("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logError", 52, "PromoEvalLoggerImpl.java");
        uwm uwmVar = oydVar.c.c;
        if (uwmVar == null) {
            uwmVar = uwm.a;
        }
        tvkVar.x("Promo ID [%s]: %s", uwmVar.b, strG);
        h(oydVar, strG);
    }

    @Override // defpackage.oyi
    public final void f(oyd oydVar, Throwable th, Object... objArr) {
        String strG = g("getPackageInfo(%s) failed", objArr);
        tvk tvkVar = (tvk) ((tvk) ((tvk) a.g()).i(th)).j("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logWarning", 77, "PromoEvalLoggerImpl.java");
        uwm uwmVar = oydVar.c.c;
        if (uwmVar == null) {
            uwmVar = uwm.a;
        }
        tvkVar.x("Promo ID [%s]: %s", uwmVar.b, strG);
        h(oydVar, strG);
    }
}
