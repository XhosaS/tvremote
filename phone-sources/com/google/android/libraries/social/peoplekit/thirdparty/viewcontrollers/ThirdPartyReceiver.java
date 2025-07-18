package com.google.android.libraries.social.peoplekit.thirdparty.viewcontrollers;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcelable;
import defpackage.sij;
import defpackage.ulp;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ThirdPartyReceiver extends BroadcastReceiver {
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws PendingIntent.CanceledException {
        if ("android.intent.action.PACKAGE_FULLY_REMOVED".equals(intent.getAction()) || ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false))) {
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            ?? r0 = new ulp(context, (short[]) null).a;
            SharedPreferences.Editor editorEdit = r0.edit();
            Iterator<String> it = r0.getStringSet(schemeSpecificPart, new HashSet()).iterator();
            while (it.hasNext()) {
                editorEdit.remove(it.next());
            }
            editorEdit.remove(schemeSpecificPart);
            editorEdit.commit();
            ?? r5 = new ulp(context, (byte[]) null, (byte[]) null, (byte[]) null).a;
            SharedPreferences.Editor editorEdit2 = r5.edit();
            Iterator<String> it2 = r5.getStringSet(schemeSpecificPart, new HashSet()).iterator();
            while (it2.hasNext()) {
                editorEdit2.remove(it2.next());
            }
            editorEdit2.remove(schemeSpecificPart);
            editorEdit2.commit();
            return;
        }
        for (String str : intent.getExtras().keySet()) {
            if (intent.getExtras().get(str) instanceof ComponentName) {
                ComponentName componentName = (ComponentName) intent.getExtras().get(str);
                String strB = sij.b(componentName.getPackageName(), componentName.getClassName());
                new ulp(context, (short[]) null).aw(strB);
                new ulp(context, (byte[]) null, (byte[]) null, (byte[]) null).au(strB);
            }
        }
        if (intent.hasExtra("android.intent.extra.CHOSEN_COMPONENT") && intent.hasExtra("com.google.android.libraries.social.peoplekit.thirdparty.APP_SELECTED")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            Parcelable parcelableExtra2 = intent.getParcelableExtra("com.google.android.libraries.social.peoplekit.thirdparty.APP_SELECTED");
            if ((parcelableExtra instanceof ComponentName) && (parcelableExtra2 instanceof PendingIntent)) {
                PendingIntent pendingIntent = (PendingIntent) parcelableExtra2;
                Intent intent2 = new Intent();
                intent2.putExtra("android.intent.extra.CHOSEN_COMPONENT", (ComponentName) parcelableExtra);
                try {
                    pendingIntent.send(context, -1, intent2);
                } catch (PendingIntent.CanceledException unused) {
                }
            }
        }
    }
}
