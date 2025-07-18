package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agb {
    public final Context b;
    public final String c;
    public final afw d;
    public final agr e;
    public final Looper f;
    public final int g;
    public final age h;
    public final ahf i;
    public final adx j;
    public final awy k;

    public agb(Context context, awy awyVar, afw afwVar, aga agaVar) {
        qp.q(context, "Null context is not permitted.");
        qp.q(agaVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        qp.q(applicationContext, "The provided context did not have an application context.");
        this.b = applicationContext;
        adx adxVar = null;
        String attributionTag = (Build.VERSION.SDK_INT < 30 || context == null || Build.VERSION.SDK_INT < 30) ? null : context.getAttributionTag();
        this.c = attributionTag;
        if (Build.VERSION.SDK_INT >= 31 && context != null) {
            adxVar = new adx(context.getAttributionSource());
        }
        this.j = adxVar;
        this.k = awyVar;
        this.d = afwVar;
        this.f = agaVar.b;
        this.e = new agr(awyVar, afwVar, attributionTag);
        this.h = new agz(this);
        ahf ahfVarC = ahf.c(applicationContext);
        this.i = ahfVarC;
        this.g = ahfVarC.h.getAndIncrement();
        qo qoVar = agaVar.c;
        Handler handler = ahfVarC.k;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    private final ami a(int i, ahr ahrVar) {
        adx adxVar = new adx((byte[]) null);
        int i2 = ahrVar.c;
        ahf ahfVar = this.i;
        ahfVar.g(adxVar, i2, this);
        ago agoVar = new ago(i, ahrVar, adxVar);
        Handler handler = ahfVar.k;
        handler.sendMessage(handler.obtainMessage(4, new bda((agq) agoVar, ahfVar.i.get(), this)));
        return (ami) adxVar.a;
    }

    public final aic b() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        aic aicVar = new aic();
        afw afwVar = this.d;
        boolean z = afwVar instanceof afu;
        Account accountA = null;
        if (z && (googleSignInAccountA2 = ((afu) afwVar).a()) != null) {
            String str = googleSignInAccountA2.c;
            if (str != null) {
                accountA = new Account(str, "com.google");
            }
        } else if (afwVar instanceof aft) {
            accountA = ((aft) afwVar).a();
        }
        aicVar.a = accountA;
        Set setA = (!z || (googleSignInAccountA = ((afu) afwVar).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.a();
        if (aicVar.b == null) {
            aicVar.b = new mb();
        }
        aicVar.b.addAll(setA);
        Context context = this.b;
        aicVar.d = context.getClass().getName();
        aicVar.c = context.getPackageName();
        return aicVar;
    }

    public final ami c(ahr ahrVar) {
        return a(0, ahrVar);
    }

    public final ami d() {
        ahq ahqVar = new ahq();
        ahqVar.a = new ald(2);
        ahqVar.c = 4501;
        return c(ahqVar.a());
    }

    public final ami e(anb anbVar) {
        final ahi ahiVarD = qo.d(anbVar, this.f, anb.class.getSimpleName());
        final ane aneVar = ((amz) this.d).b;
        aho ahoVar = new aho() { // from class: ams
            @Override // defpackage.aho
            public final void a(Object obj, Object obj2) {
                ane aneVar2 = new ane(ahiVarD, 0);
                ((ank) obj).F(aneVar, aneVar2, new amu(this.c, (adx) obj2, aneVar2));
            }
        };
        ajk ajkVar = new ajk(this, 4);
        ahn ahnVar = new ahn();
        ahnVar.a = ahoVar;
        ahnVar.b = ajkVar;
        ahnVar.c = ahiVarD;
        ahnVar.d = new aes[]{amr.a};
        ahnVar.f = 4507;
        return g(ahnVar.a());
    }

    public final void f(ahr ahrVar) {
        a(2, ahrVar);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.lang.Runnable] */
    public final ami g(bzt bztVar) {
        ahm ahmVar = (ahm) bztVar.b;
        qp.q(ahmVar.a(), "Listener has already been released.");
        adx adxVar = new adx((byte[]) null);
        int i = ahmVar.d;
        ahf ahfVar = this.i;
        ahfVar.g(adxVar, i, this);
        agn agnVar = new agn(new bzt(ahmVar, (byj) bztVar.c, (Runnable) bztVar.a, (byte[]) null), adxVar);
        Handler handler = ahfVar.k;
        handler.sendMessage(handler.obtainMessage(8, new bda((agq) agnVar, ahfVar.i.get(), this)));
        return (ami) adxVar.a;
    }

    public agb(Context context, amz amzVar) {
        this(context, ana.a, amzVar, aga.a);
    }
}
