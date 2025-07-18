package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shw {
    public final Activity a;
    public final ViewGroup b;
    public final shh c;
    public sif d;
    public sia e;
    public uhs f;
    public shq g;
    public final shy h;
    public final String i;
    public boolean j;
    public kfz k;
    public she l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v31 */
    public shw(shv shvVar) {
        String str;
        sij.f(((ViewGroup) shvVar.c).getContext());
        Object obj = shvVar.c;
        obj.getClass();
        Object obj2 = shvVar.i;
        obj2.getClass();
        shvVar.f.getClass();
        this.b = (ViewGroup) obj;
        final Activity activity = (Activity) shvVar.b;
        this.a = activity;
        if (obj2 == null) {
            this.i = "";
        } else {
            this.i = ((shs) obj2).c;
        }
        Object obj3 = shvVar.d;
        ?? r3 = obj3;
        if (obj3 == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            uie uieVar = new uie();
            uieVar.d("AutocompleteBackground-%d");
            ThreadFactory threadFactoryB = uie.b(uieVar);
            int iAb = sfy.ab(15L);
            sij.o(iAb > 0, "maxThreads == 0 is invalid. At least one thread must be created.");
            sih sihVar = new sih(iAb, iAb, timeUnit, new LinkedBlockingQueue(), threadFactoryB);
            sihVar.allowCoreThreadTimeOut(true);
            r3 = sihVar;
        }
        uhs uhsVarV = sfy.v(r3);
        int i = ((shs) shvVar.i).e;
        shs shsVar = (shs) obj2;
        final String str2 = shsVar.a;
        jzs jzsVar = omg.a;
        final omi omiVar = new omi(activity);
        final String packageName = activity.getPackageName();
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        final String string = Integer.toString(i2);
        String strE = sij.e(packageName, string);
        ArrayList arrayList = new ArrayList();
        arrayList.add("PEOPLE_AUTOCOMPLETE");
        arrayList.add("SENDKIT");
        arrayList.add("SOCIAL_AFFINITY");
        int iG = sij.g(i) - 1;
        if (iG == 131) {
            arrayList.add("KEEP_ANDROID_PRIMES");
        } else if (iG == 135) {
            arrayList.add("ANDROID_GMAIL");
            arrayList.add("GMAIL_ANDROID");
            arrayList.add("GMAIL_ANDROID_PRIMES");
        } else if (iG == 137) {
            arrayList.add("GMM_PRIMES");
        } else if (iG == 165) {
            arrayList.add("PHOTOS");
            arrayList.add("PHOTOS_ANDROID_PRIMES");
            arrayList.add("SOCIAL_AFFINITY_PHOTOS");
        }
        ufn.i(qtl.aH(omiVar.d(strE, 0, (String[]) arrayList.toArray(new String[0]))), new tsl() { // from class: shj
            @Override // defpackage.tsl
            public final Object apply(Object obj4) {
                String str3 = packageName;
                omi omiVar2 = omiVar;
                String strE2 = sij.e(str3, string);
                String str4 = str2;
                omiVar2.b(strE2, str4).q(new shl(omiVar2, strE2, activity, str4));
                return null;
            }
        }, uhsVarV);
        sij.f(activity);
        shh shhVar = new shh();
        shhVar.a(new siu(vgl.d));
        shhVar.c(shsVar.b);
        this.c = shhVar;
        this.l = (she) shvVar.h;
        if (!shsVar.d) {
            this.l.e.clear();
        }
        she sheVar = this.l;
        sheVar.a = shsVar.a;
        try {
            Context context = sheVar.c;
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "0";
        }
        String str3 = true != TextUtils.isEmpty(str) ? str : "0";
        int i3 = shsVar.e;
        int i4 = shsVar.f;
        vtw vtwVarM = wer.a.m();
        int iG2 = sij.g(i3);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wer werVar = (wer) vtwVarM.b;
        werVar.c = iG2 - 1;
        werVar.b |= 2;
        wer werVar2 = (wer) vtwVarM.r();
        vtw vtwVarM2 = aagg.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        aagg aaggVar = (aagg) vucVar;
        werVar2.getClass();
        aaggVar.e = werVar2;
        aaggVar.b |= 4;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        vuc vucVar2 = vtwVarM2.b;
        aagg aaggVar2 = (aagg) vucVar2;
        int i5 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        aaggVar2.c = i5;
        aaggVar2.b |= 1;
        i4 = i4 == 0 ? 1 : i4;
        if (!vucVar2.A()) {
            vtwVarM2.u();
        }
        vuc vucVar3 = vtwVarM2.b;
        aagg aaggVar3 = (aagg) vucVar3;
        aaggVar3.d = i4 - 1;
        aaggVar3.b |= 2;
        if (!vucVar3.A()) {
            vtwVarM2.u();
        }
        vuc vucVar4 = vtwVarM2.b;
        aagg aaggVar4 = (aagg) vucVar4;
        aaggVar4.h = 0;
        aaggVar4.b |= 32;
        if (!vucVar4.A()) {
            vtwVarM2.u();
        }
        vuc vucVar5 = vtwVarM2.b;
        aagg aaggVar5 = (aagg) vucVar5;
        str3.getClass();
        aaggVar5.b |= 8;
        aaggVar5.f = str3;
        if (!vucVar5.A()) {
            vtwVarM2.u();
        }
        aagg aaggVar6 = (aagg) vtwVarM2.b;
        aaggVar6.b |= 16;
        aaggVar6.g = 770518479L;
        sheVar.b = (aagg) vtwVarM2.r();
        sheVar.g = 1;
        sheVar.h = 1;
        shc shcVar = sheVar.f;
        if (shcVar != null) {
            shcVar.b = new nsz(shcVar.a, "SENDKIT", sheVar.a);
        }
        shy shyVar = (shy) shvVar.f;
        this.h = shyVar;
        ?? r32 = shvVar.d;
        if (r32 != 0) {
            this.f = sfy.v(r32);
        }
        Object obj4 = shvVar.g;
        if (obj4 != null) {
            kfz kfzVar = (kfz) obj4;
            this.k = kfzVar;
            sif sifVar = this.d;
            if (sifVar != null) {
                sifVar.m = kfzVar;
            }
        }
        if (shvVar.a != null) {
            shz shzVar = new shz();
            shzVar.a = this.a;
            shzVar.b = shvVar.a;
            shzVar.c = shyVar.a;
            this.e = new sia(shzVar);
        }
        this.g = (shq) shvVar.e;
        shi shiVarC = this.l.c("InitToBindView");
        shiVarC.c();
        shiVarC.d();
    }
}
