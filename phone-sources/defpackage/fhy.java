package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhy {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0423  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.CharSequence, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fhy(defpackage.crm r22) {
        /*
            Method dump skipped, instructions count: 1225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhy.<init>(crm):void");
    }

    public static final void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Set] */
    private final void b(crg crgVar) {
        IconCompat iconCompatA = crgVar.a();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? cmq.n(iconCompatA, null) : null, crgVar.e, crgVar.f);
        ity[] ityVarArr = crgVar.g;
        if (ityVarArr != null) {
            int length = ityVarArr.length;
            RemoteInput[] remoteInputArr = new RemoteInput[length];
            for (int i = 0; i < ityVarArr.length; i++) {
                ity ityVar = ityVarArr[i];
                RemoteInput.Builder choices = new RemoteInput.Builder((String) ityVar.e).setLabel(ityVar.b).setChoices(null);
                boolean z = ityVar.a;
                RemoteInput.Builder builderAddExtras = choices.setAllowFreeFormInput(true).addExtras((Bundle) ityVar.c);
                if (Build.VERSION.SDK_INT >= 26) {
                    Iterator it = ityVar.d.iterator();
                    while (it.hasNext()) {
                        builderAddExtras.setAllowDataType((String) it.next(), true);
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    builderAddExtras.setEditChoicesBeforeSending(0);
                }
                remoteInputArr[i] = builderAddExtras.build();
            }
            for (int i2 = 0; i2 < length; i2++) {
                builder.addRemoteInput(remoteInputArr[i2]);
            }
        }
        Bundle bundle = new Bundle(crgVar.a);
        boolean z2 = crgVar.b;
        bundle.putBoolean("android.support.allowGeneratedReplies", true);
        builder.setAllowGeneratedReplies(true);
        bundle.putInt("android.support.action.semanticAction", 0);
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(false);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setAuthenticationRequired(false);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", crgVar.c);
        builder.addExtras(bundle);
        ((Notification.Builder) this.d).addAction(builder.build());
    }

    public fhy(fic ficVar, fif fifVar, fel felVar) {
        this.b = ficVar;
        this.c = fifVar;
        this.d = felVar;
        this.e = "audio/true-hd".equals(ficVar.g.Y) ? new fem() : null;
    }
}
