package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import com.google.android.katniss.R;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hee implements usc {
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/providers/slice/AssistantSliceDataProvider");
    public final hdr a;
    public final gyy b;
    private final Context d;
    private final ahbt e;
    private final boolean f;
    private final agow g;
    private final fjx h;
    private final Supplier i;
    private final gtu j;
    private final PackageManager k;
    private final agow l;
    private final agow m;
    private int n;

    public hee(hdr hdrVar, Context context, ahbt ahbtVar, boolean z, agow agowVar, fjx fjxVar, gyy gyyVar, Supplier supplier, gtu gtuVar, PackageManager packageManager, agow agowVar2, agow agowVar3) {
        hdrVar.getClass();
        context.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        fjxVar.getClass();
        gyyVar.getClass();
        gtuVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        this.a = hdrVar;
        this.d = context;
        this.e = ahbtVar;
        this.f = z;
        this.g = agowVar;
        this.h = fjxVar;
        this.b = gyyVar;
        this.i = supplier;
        this.j = gtuVar;
        this.k = packageManager;
        this.l = agowVar2;
        this.m = agowVar3;
        this.n = 1;
    }

    private final PendingIntent e(Intent intent, Account account, int i, boolean z) {
        return tpf.a(this.d, account.name.hashCode() + i + (!z ? 1 : 0), intent, 201326592);
    }

    private final Intent f(Account account, String str, boolean z, Optional optional) {
        Intent intent = new Intent();
        ComponentName componentName = irm.a;
        Intent intentPutExtra = intent.setComponent(irm.u).putExtra("reauthAccount", account).putExtra("reauthPersonalResults", z).putExtra("reauthDisplayId", str);
        int i = this.n;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        Intent intentPutExtra2 = intentPutExtra.putExtra("entryPoint", i2).putExtra("settingItem", 2);
        intentPutExtra2.getClass();
        if (optional.isPresent()) {
            intentPutExtra2.putExtra("reauthProactiveResults", ((Boolean) optional.get()).booleanValue());
        }
        return intentPutExtra2;
    }

    private final void g(cxf cxfVar, hcp hcpVar, Uri uri) {
        int i = Build.VERSION.SDK_INT;
        Intent intent = new Intent("ACTION_SAFE_SEARCH_CHANGED");
        ComponentName componentName = irm.a;
        Intent data = intent.setComponent(irm.d).setData(uri);
        data.getClass();
        int i2 = i >= 31 ? 167772160 : 134217728;
        Context context = this.d;
        PendingIntent pendingIntentB = tpf.b(context, data, i2, 1);
        cxe cxeVar = new cxe();
        cxeVar.p = "KEY_SAFE_SEARCH_TOGGLE";
        cxeVar.e = context.getString(R.string.title_safe_search);
        cxeVar.c = 303239168;
        cxeVar.a(pendingIntentB, context.getString(R.string.title_safe_search), hcpVar.a);
        if (this.a.k()) {
            cxeVar.g = context.getString(R.string.shared_settings_info_title_text);
            cxeVar.h = context.getString(R.string.shared_settings_info_summary_text);
            cxeVar.i = IconCompat.e(context, R.drawable.quantum_ic_info_outline_white_18);
        }
        cxfVar.a.b(cxeVar, "TYPE_PREFERENCE");
    }

    @Override // defpackage.usc
    public final Slice a(Uri uri) {
        Account account;
        String str;
        boolean z;
        String str2;
        hdr hdrVar;
        cxf cxfVar = new cxf(uri);
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        hdr hdrVar2 = this.a;
        Account accountA = hdrVar2.a(lastPathSegment);
        if (accountA == null) {
            ((zdv) c.b().q("com/google/android/apps/tvsearch/providers/slice/AssistantSliceDataProvider", "onBindSlice", 130, "AssistantSliceDataProvider.kt")).u("Account name does not exist on device.");
            return cxfVar.d();
        }
        hcp hcpVarB = hdrVar2.b();
        if (hcpVarB == null) {
            cxfVar.a.c();
            return cxfVar.d();
        }
        boolean z2 = this.j.r(accountA) && ((Boolean) this.g.a()).booleanValue();
        Context context = this.d;
        cxe cxeVar = new cxe();
        cxeVar.e = context.getString(R.string.header_google);
        cxeVar.d = 303235072;
        if (hdrVar2.k()) {
            cxeVar.f = lastPathSegment;
        }
        cxfVar.a.b(cxeVar, "TYPE_PREFERENCE_SCREEN_TITLE");
        if (hdrVar2.m(lastPathSegment) && hdrVar2.k()) {
            if (!z2) {
                cxe cxeVar2 = new cxe();
                cxeVar2.p = "KEY_CATEGORY_PERSONAL_SETTINGS";
                cxeVar2.e = context.getString(R.string.header_personal_settings);
                cxfVar.a.b(cxeVar2, "TYPE_PREFERENCE_CATEGORY");
            }
            int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
            z = z2;
            Intent intent = new Intent("ACTION_VOICE_INPUT_ENABLED_CHANGED");
            ComponentName componentName = irm.a;
            ComponentName componentName2 = irm.d;
            str2 = "TYPE_PREFERENCE_CATEGORY";
            account = accountA;
            Intent data = intent.setComponent(componentName2).putExtra("display_id", uri.getLastPathSegment()).setData(uri);
            data.getClass();
            PendingIntent pendingIntentB = tpf.b(context, data, i, 1);
            cxe cxeVar3 = new cxe();
            cxeVar3.p = "KEY_VOICE_INPUT_ENABLE_TOGGLE";
            str = "onBindSlice";
            cxeVar3.e = context.getString(R.string.title_amati_voice_input_enabled);
            cxeVar3.f = context.getString(R.string.subtitle_amati_voice_input_enabled);
            cxeVar3.c = 303255552;
            String string = context.getString(R.string.title_amati_voice_input_enabled);
            boolean z3 = hcpVarB.b;
            cxeVar3.a(pendingIntentB, string, z3);
            cxfVar.a.b(cxeVar3, "TYPE_PREFERENCE");
            if (this.f && ((Boolean) this.i.get()).booleanValue()) {
                Intent data2 = new Intent("ACTION_FARFIELD_MIC_CHANGED").setComponent(componentName2).setData(uri);
                data2.getClass();
                PendingIntent pendingIntentB2 = tpf.b(context, data2, i, 1);
                cxe cxeVar4 = new cxe();
                cxeVar4.c = 303259904;
                cxeVar4.a(pendingIntentB2, context.getString(R.string.assistant_setup_hotword_intro_title_amati), this.h.b == foc.TOGGLE_ON);
                cxeVar4.s = z3;
                cxeVar4.p = "KEY_FARFIELD_MIC_TOGGLE";
                cxeVar4.f = context.getString(R.string.title_handsfree_mic_page);
                cxeVar4.e = context.getString(R.string.title_handsfree_mic);
                cxeVar4.h = context.getString(R.string.assistant_setup_farfield_toggle_summary) + "\n\n" + context.getString(R.string.assistant_setup_hotword_mic_instructions);
                cxeVar4.i = IconCompat.e(context, R.drawable.quantum_ic_info_outline_white_18);
                cxfVar.a.b(cxeVar4, "TYPE_PREFERENCE");
            }
        } else {
            account = accountA;
            str = "onBindSlice";
            z = z2;
            str2 = "TYPE_PREFERENCE_CATEGORY";
        }
        boolean z4 = hcpVarB.b;
        if (hdrVar2.n(lastPathSegment)) {
            if (hdrVar2.l()) {
                Intent intent2 = new Intent();
                ComponentName componentName3 = irm.a;
                Intent intentPutExtra = intent2.setComponent(irm.e).putExtra("is_intent_from_setting", true);
                intentPutExtra.getClass();
                PendingIntent pendingIntentA = tpf.a(context, 0, intentPutExtra, 67108864);
                if (pendingIntentA != null) {
                    cxe cxeVar5 = new cxe();
                    cxeVar5.p = "KEY_ACCEPT_UDC_PERMISSIONS";
                    cxeVar5.e = context.getString(R.string.title_accept_permissions);
                    cxeVar5.b(pendingIntentA);
                    cxeVar5.s = z4;
                    cxfVar.a.b(cxeVar5, "TYPE_PREFERENCE");
                } else {
                    ((zdv) c.d().q("com/google/android/apps/tvsearch/providers/slice/AssistantSliceDataProvider", str, 259, "AssistantSliceDataProvider.kt")).u("Intent to launch Setup activity is null");
                }
            } else {
                String str3 = str;
                Intent intent3 = new Intent();
                ComponentName componentName4 = irm.a;
                PendingIntent pendingIntentA2 = tpf.a(context, 0, intent3.setComponent(irm.z), 67108864);
                if (pendingIntentA2 != null) {
                    cxe cxeVar6 = new cxe();
                    cxeVar6.p = "KEY_VIEW_UDC_PERMISSIONS";
                    cxeVar6.e = context.getString(R.string.title_view_permissions);
                    cxeVar6.b(pendingIntentA2);
                    cxeVar6.s = z4;
                    cxfVar.a.b(cxeVar6, "TYPE_PREFERENCE");
                } else {
                    ((zdv) c.d().q("com/google/android/apps/tvsearch/providers/slice/AssistantSliceDataProvider", str3, 280, "AssistantSliceDataProvider.kt")).u("Intent to view UDC permissions is null");
                }
            }
        }
        cxe cxeVar7 = new cxe();
        cxeVar7.p = "KEY_SEARCHABLE_APPS";
        cxeVar7.e = context.getString(R.string.title_searchable_apps);
        cxeVar7.c = 303247360;
        cxeVar7.f = context.getString(R.string.desc_searchable_apps);
        cxeVar7.o = hef.b.buildUpon().appendPath(lastPathSegment).toString();
        if (z) {
            cxfVar.a.b(cxeVar7, "TYPE_PREFERENCE");
        } else if (hdrVar2.m(lastPathSegment)) {
            if (!hdrVar2.k()) {
                cxfVar.a.b(cxeVar7, "TYPE_PREFERENCE");
                g(cxfVar, hcpVarB, uri);
            }
            if (this.k.resolveActivity(new Intent("com.google.android.apps.tv.REAUTH").setPackage("com.google.android.apps.tv.launcherx"), 1048576) == null) {
                hdrVar = hdrVar2;
            } else if (((Boolean) this.l.a()).booleanValue()) {
                boolean z5 = hcpVarB.c;
                boolean z6 = hcpVarB.d;
                Account account2 = account;
                PendingIntent pendingIntentE = e(f(account2, lastPathSegment, !z5, Optional.empty()), account2, 10, z5);
                cxe cxeVar8 = new cxe();
                cxeVar8.p = "KEY_PERSONAL_RESULTS";
                hdrVar = hdrVar2;
                cxeVar8.e = context.getString(R.string.title_personal_results);
                cxeVar8.f = context.getString(R.string.subtitle_personal_results);
                cxeVar8.c = 303251456;
                cxeVar8.a(pendingIntentE, context.getString(R.string.title_personal_results), z5);
                cxeVar8.s = z4;
                cxfVar.a.b(cxeVar8, "TYPE_PREFERENCE");
                cxe cxeVar9 = new cxe();
                cxeVar9.p = "KEY_PERSONAL_RESULTS_EXPLANTION";
                cxeVar9.e = context.getString(R.string.title_personal_results_explantion);
                cxeVar9.f = context.getString(R.string.subtitle_personal_results_explantion);
                cxfVar.a.b(cxeVar9, "TYPE_PREFERENCE");
                boolean z7 = !z6;
                PendingIntent pendingIntentE2 = e(f(account2, lastPathSegment, z5, Optional.of(Boolean.valueOf(z7))), account2, 20, z6);
                boolean z8 = z5 && z4;
                cxe cxeVar10 = new cxe();
                cxeVar10.p = "KEY_BUTTON_ENABLE_PROACTIVE_BIT";
                cxeVar10.e = context.getString(R.string.title_enable_proactive_result);
                cxeVar10.f = context.getString(R.string.subtitle_enable_proactive_result);
                cxeVar10.d(pendingIntentE2, z6);
                cxeVar10.s = z8;
                cxfVar.a.b(cxeVar10, "TYPE_PREFERENCE");
                cxe cxeVar11 = new cxe();
                cxeVar11.p = "KEY_BUTTON_DISABLE_PROACTIVE_BIT";
                cxeVar11.e = context.getString(R.string.title_disable_proactive_result);
                cxeVar11.f = context.getString(R.string.subtitle_disable_proactive_result);
                cxeVar11.d(pendingIntentE2, z7);
                cxeVar11.s = z8;
                cxfVar.a.b(cxeVar11, "TYPE_PREFERENCE");
            } else {
                Account account3 = account;
                hdrVar = hdrVar2;
                boolean z9 = hcpVarB.c;
                PendingIntent pendingIntentE3 = e(f(account3, lastPathSegment, !z9, Optional.empty()), account3, 0, z9);
                cxe cxeVar12 = new cxe();
                cxeVar12.p = "KEY_PERSONAL_RESULTS";
                cxeVar12.e = context.getString(R.string.title_personal_results);
                cxeVar12.c = 303251456;
                cxeVar12.a(pendingIntentE3, context.getString(R.string.title_personal_results), z9);
                cxeVar12.s = z4;
                cxfVar.a.b(cxeVar12, "TYPE_PREFERENCE");
            }
            if (hdrVar.k()) {
                cxfVar.a.b(cxeVar7, "TYPE_PREFERENCE");
                cxe cxeVar13 = new cxe();
                cxeVar13.p = "KEY_CATEGORY_SHARED_SETTINGS";
                cxeVar13.e = context.getString(R.string.header_shared_settings);
                cxfVar.a.b(cxeVar13, str2);
                g(cxfVar, hcpVarB, uri);
            }
        }
        return cxfVar.d();
    }

    @Override // defpackage.usc
    public final void b(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        this.n = true != agvy.c(uri.getQueryParameter("settings_entry_point"), "start_from_pr") ? 2 : 3;
        Account accountA = this.a.a(lastPathSegment);
        if (accountA != null) {
            d(accountA);
            return;
        }
        ((zdv) c.b().q("com/google/android/apps/tvsearch/providers/slice/AssistantSliceDataProvider", "onSlicePinned", 104, "AssistantSliceDataProvider.kt")).u("Account name does not exist on device.");
        if (((Boolean) this.m.a()).booleanValue()) {
            ahal.e(this.e, null, 0, new hed(this, lastPathSegment, null), 3);
        }
    }

    @Override // defpackage.usc
    public final void c(Uri uri) {
        this.a.c();
    }

    public final void d(Account account) {
        hdr hdrVar = this.a;
        hdrVar.o(this.n);
        hdrVar.f(account);
        hdrVar.d(account);
        hdrVar.e();
    }
}
