package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.tvsearch.preferences.fragment.google.GooglePreferenceFragment;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hba {
    public static final /* synthetic */ int q = 0;
    private static final Set r = agqj.p(new String[]{"enable_udc_permission", "searchable_apps", "hotword_toggle", "ok_google_detection", "safe_search", "permissions"});
    public final gwo a;
    public final Supplier b;
    public final fda c;
    public final ahbt d;
    public final Supplier e;
    public final gph f;
    public final GooglePreferenceFragment g;
    public final boolean h;
    public final ffp i;
    public final gtu j;
    public final agow k;
    public final idl l;
    public final idu m;
    public PreferenceScreen n;
    public Preference o;
    public final fcu p;
    private final fjr s;
    private final Supplier t;
    private final jcy u;

    public hba(gwo gwoVar, Supplier supplier, fda fdaVar, ahbt ahbtVar, Supplier supplier2, gph gphVar, GooglePreferenceFragment googlePreferenceFragment, boolean z, fjr fjrVar, Supplier supplier3, jcy jcyVar, ffp ffpVar, gtu gtuVar, agow agowVar, fcu fcuVar, idl idlVar, idu iduVar) {
        fdaVar.getClass();
        ahbtVar.getClass();
        fjrVar.getClass();
        jcyVar.getClass();
        ffpVar.getClass();
        gtuVar.getClass();
        agowVar.getClass();
        fcuVar.getClass();
        idlVar.getClass();
        iduVar.getClass();
        this.a = gwoVar;
        this.b = supplier;
        this.c = fdaVar;
        this.d = ahbtVar;
        this.e = supplier2;
        this.f = gphVar;
        this.g = googlePreferenceFragment;
        this.h = z;
        this.s = fjrVar;
        this.t = supplier3;
        this.u = jcyVar;
        this.i = ffpVar;
        this.j = gtuVar;
        this.k = agowVar;
        this.p = fcuVar;
        this.l = idlVar;
        this.m = iduVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.hay
            if (r0 == 0) goto L13
            r0 = r7
            hay r0 = (defpackage.hay) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            hay r0 = new hay
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r1 = r0.b
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r7)
            goto L86
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            defpackage.agpl.b(r7)
            com.google.android.apps.tvsearch.preferences.fragment.google.GooglePreferenceFragment r7 = r6.g
            java.lang.String r2 = "hotword_toggle"
            androidx.preference.Preference r7 = r7.cR(r2)
            androidx.preference.SwitchPreference r7 = (androidx.preference.SwitchPreference) r7
            if (r7 == 0) goto L9c
            jcy r2 = r6.u
            boolean r2 = r2.b()
            if (r2 != 0) goto L71
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r5 = "SHIELD Android TV"
            boolean r2 = defpackage.agvy.c(r2, r5)
            if (r2 != 0) goto L71
            boolean r2 = r6.h
            if (r2 == 0) goto L71
            java.util.function.Supplier r2 = r6.t
            java.lang.Object r2 = defpackage.al$$ExternalSyntheticApiModelOutline1.m(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L71
            androidx.preference.Preference r2 = r6.o
            if (r2 == 0) goto L71
            boolean r2 = r2.x
            if (r2 != 0) goto L71
            r2 = r3
            goto L72
        L71:
            r2 = r4
        L72:
            r7.J(r2)
            fjr r2 = r6.s
            r0.a = r7
            r0.b = r7
            r0.e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 == r1) goto L9b
            r1 = r7
            r7 = r0
            r0 = r1
        L86:
            foc r2 = defpackage.foc.TOGGLE_ON
            if (r7 != r2) goto L8b
            goto L8c
        L8b:
            r3 = r4
        L8c:
            androidx.preference.TwoStatePreference r1 = (androidx.preference.TwoStatePreference) r1
            r1.k(r3)
            hav r7 = new hav
            r7.<init>()
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            r0.n = r7
            goto L9c
        L9b:
            return r1
        L9c:
            agpu r7 = defpackage.agpu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hba.a(agsw):java.lang.Object");
    }

    public final void b() {
        boolean z = true;
        if (((Boolean) this.b.get()).booleanValue() && ((Boolean) this.e.get()).booleanValue() && !this.l.R(this.j.c())) {
            z = false;
        }
        Iterator it = r.iterator();
        while (it.hasNext()) {
            Preference preferenceCR = this.g.cR((String) it.next());
            if (preferenceCR != null) {
                preferenceCR.D(z);
            }
        }
    }

    public final void c(Preference preference) {
        preference.J(false);
        PreferenceScreen preferenceScreen = this.n;
        if (preferenceScreen == null) {
            agvy.b("preferenceScreen");
            preferenceScreen = null;
        }
        preferenceScreen.X(preference);
        preferenceScreen.x();
    }

    public final void d() {
        Intent intent = new Intent();
        ComponentName componentName = irm.a;
        intent.setComponent(irm.b);
        intent.putExtra("suppress_assistant_setup", true);
        intent.putExtra("start_stop_hotword", true);
        wyo.l(this.g.dZ(), intent);
    }
}
