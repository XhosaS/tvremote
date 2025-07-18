package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.rfr;
import defpackage.rlh;
import defpackage.rlo;
import defpackage.yqi;
import defpackage.zud;
import defpackage.zuz;
import defpackage.zvi;
import defpackage.zwk;
import defpackage.zwx;
import defpackage.zxn;
import defpackage.zxy;
import defpackage.zyd;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        String stringExtra;
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("accountType")) != null && rlh.a(stringExtra)) {
            Bundle extras = intent.getExtras();
            final String string = extras != null ? extras.getString("authAccount") : null;
            if (string != null && (string.contains("../") || string.contains("/.."))) {
                Log.w("AccountRemovedRecv", a.e(string, "Got an invalid account name for P/H that includes '..':", ". Exiting."));
                return;
            }
            rfr.g();
            final rfr rfrVarA = rfr.a(context);
            if (rfrVarA == null) {
                Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                return;
            }
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            zyd[] zydVarArr = new zyd[2];
            zyd zydVarH = string != null ? zuz.h(zwx.u(rlo.a(rfrVarA).a(new yqi() { // from class: rlj
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    rkm rkmVar = rlo.a;
                    riw riwVar = riw.a;
                    riv rivVar = new riv();
                    for (Map.Entry entry : DesugarCollections.unmodifiableMap(((riw) obj).b).entrySet()) {
                        String str = string;
                        riq riqVar = (riq) entry.getValue();
                        riq riqVar2 = riq.a;
                        rip ripVar = new rip();
                        if (!riqVar.d.equals(str)) {
                            String str2 = riqVar.d;
                            if ((ripVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                ripVar.y();
                            }
                            riq riqVar3 = (riq) ripVar.b;
                            str2.getClass();
                            riqVar3.b |= 1;
                            riqVar3.d = str2;
                        }
                        for (String str3 : riqVar.c) {
                            if (!str3.equals(str)) {
                                ripVar.a(str3);
                            }
                        }
                        rivVar.a((String) entry.getKey(), (riq) ripVar.v());
                    }
                    return (riw) rivVar.v();
                }
            }, rfrVarA.e())), new zvi() { // from class: rlk
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    rkm rkmVar = rlo.a;
                    int i = yyk.e;
                    yyf yyfVar = new yyf(4);
                    Context context2 = rfrVarA.d;
                    yyfVar.g(context2);
                    int i2 = mhv.a;
                    yyfVar.g(mhv.a(context2));
                    yyk yykVarF = yyfVar.f();
                    int i3 = ((zcg) yykVarF).d;
                    boolean zC = true;
                    for (int i4 = 0; i4 < i3; i4++) {
                        String str = string;
                        File file = new File(String.valueOf(((Context) yykVarF.get(i4)).getFilesDir()) + "/phenotype/shared/" + str);
                        Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
                        if (file.exists()) {
                            zC = rlo.c(file);
                        }
                    }
                    return zC ? zxy.a : zxn.g(new IOException("Unable to remove snapshots for removed user"));
                }
            }, rfrVarA.e()) : zxy.a;
            yqi yqiVar = new yqi() { // from class: rir
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
                }
            };
            zwk zwkVar = zwk.a;
            zydVarArr[0] = zud.g(zydVarH, IOException.class, yqiVar, zwkVar);
            zydVarArr[1] = string != null ? rfrVarA.e().submit(new Runnable() { // from class: ris
                @Override // java.lang.Runnable
                public final void run() {
                    SharedPreferences sharedPreferencesA = rmb.a(context);
                    SharedPreferences.Editor editorEdit = null;
                    for (Map.Entry<String, ?> entry : sharedPreferencesA.getAll().entrySet()) {
                        if (entry.getValue() instanceof String) {
                            if (entry.getValue().equals(string)) {
                                if (editorEdit == null) {
                                    editorEdit = sharedPreferencesA.edit();
                                }
                                editorEdit.remove(entry.getKey());
                            }
                        }
                    }
                    if (editorEdit != null) {
                        editorEdit.commit();
                    }
                }
            }) : zxy.a;
            zxn.b(zydVarArr).a(new Callable() { // from class: rit
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    pendingResultGoAsync.finish();
                    return null;
                }
            }, zwkVar);
        }
    }
}
