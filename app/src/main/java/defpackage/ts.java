package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.result.IntentSenderRequest;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ts extends ux {
    final /* synthetic */ tt a;

    public ts(tt ttVar) {
        this.a = ttVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ux
    public final void a(final int i, vb vbVar, Object obj) throws IntentSender.SendIntentException {
        Bundle bundleExtra;
        final int i2;
        tt ttVar = this.a;
        final va vaVarC = vbVar.c(ttVar, obj);
        if (vaVarC != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tq
                @Override // java.lang.Runnable
                public final void run() {
                    ts tsVar = this.a;
                    String str = (String) tsVar.b.get(Integer.valueOf(i));
                    if (str == null) {
                        return;
                    }
                    ut utVar = (ut) tsVar.e.get(str);
                    uq uqVar = utVar != null ? utVar.a : null;
                    Object obj2 = vaVarC.a;
                    if (uqVar == null) {
                        tsVar.g.remove(str);
                        tsVar.f.put(str, obj2);
                    } else {
                        uq uqVar2 = utVar.a;
                        if (tsVar.d.remove(str)) {
                            uqVar2.a(obj2);
                        }
                    }
                }
            });
            return;
        }
        Intent intentB = vbVar.b(obj);
        if (intentB.getExtras() != null) {
            Bundle extras = intentB.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentB.setExtrasClassLoader(ttVar.getClassLoader());
            }
        }
        if (intentB.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentB.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentB.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!agvy.c("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentB.getAction())) {
            if (!agvy.c("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentB.getAction())) {
                ttVar.startActivityForResult(intentB, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentB.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                intentSenderRequest.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                ttVar.startIntentSenderForResult(intentSenderRequest.a, i2, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                final IntentSender.SendIntentException sendIntentException = e;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                    }
                });
                return;
            }
        }
        String[] stringArrayExtra = intentB.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            int length = stringArrayExtra.length;
            if (i3 >= length) {
                int size = hashSet.size();
                String[] strArr = size > 0 ? new String[length - size] : stringArrayExtra;
                if (size > 0) {
                    if (size == length) {
                        return;
                    }
                    int i4 = 0;
                    for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                        if (!hashSet.contains(Integer.valueOf(i5))) {
                            strArr[i4] = stringArrayExtra[i5];
                            i4++;
                        }
                    }
                }
                if (ttVar instanceof aaw) {
                }
                ttVar.requestPermissions(stringArrayExtra, i);
                return;
            }
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
            i3++;
        }
    }
}
