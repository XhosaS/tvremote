package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class abl implements abb {
    public final Context a;
    public final Notification.Builder b;
    public final abh c;
    private final Bundle d;

    public abl(abh abhVar) {
        Bundle[] bundleArr;
        new ArrayList();
        this.d = new Bundle();
        this.c = abhVar;
        Context context = abhVar.a;
        this.a = context;
        Notification.Builder builder = new Notification.Builder(abhVar.a, abhVar.r);
        this.b = builder;
        Notification notification = abhVar.s;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(abhVar.e).setContentText(abhVar.f).setContentInfo(null).setContentIntent(abhVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(abhVar.i).setProgress(0, 0, false);
        IconCompat iconCompat = abhVar.h;
        builder.setLargeIcon(iconCompat == null ? null : adi.a(iconCompat, context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(abhVar.j);
        abk abkVar = abhVar.l;
        if (abkVar instanceof abj) {
            abj abjVar = (abj) abkVar;
            int color = abjVar.c.a.getColor(R.color.call_notification_decline_color);
            Integer numValueOf = Integer.valueOf(color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) abjVar.c.a.getResources().getString(R.string.call_notification_hang_up_action));
            numValueOf.getClass();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            IconCompat iconCompatE = IconCompat.e(abjVar.c.a, R.drawable.ic_call_decline);
            Bundle bundle = new Bundle();
            CharSequence charSequenceC = abh.c(spannableStringBuilder);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!arrayList.isEmpty()) {
            }
            abc abcVar = new abc(iconCompatE, charSequenceC, null, bundle, arrayList2.isEmpty() ? null : (abo[]) arrayList2.toArray(new abo[arrayList2.size()]));
            abcVar.a.putBoolean("key_action_priority", true);
            ArrayList arrayList3 = new ArrayList(3);
            arrayList3.add(abcVar);
            ArrayList arrayList4 = abjVar.c.b;
            int size = arrayList4.size();
            for (int i = 0; i < size; i++) {
                abc abcVar2 = (abc) arrayList4.get(i);
                if (abcVar2 == null || !abcVar2.a.getBoolean("key_action_priority")) {
                    arrayList3.add(abcVar2);
                }
            }
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                a((abc) arrayList3.get(i2));
            }
        } else {
            ArrayList arrayList5 = abhVar.b;
            int size3 = arrayList5.size();
            for (int i3 = 0; i3 < size3; i3++) {
                a((abc) arrayList5.get(i3));
            }
        }
        Bundle bundle2 = abhVar.o;
        if (bundle2 != null) {
            this.d.putAll(bundle2);
        }
        this.b.setShowWhen(abhVar.k);
        this.b.setLocalOnly(abhVar.m);
        this.b.setGroup(null);
        this.b.setSortKey(null);
        this.b.setGroupSummary(false);
        this.b.setCategory(abhVar.n);
        this.b.setColor(abhVar.p);
        this.b.setVisibility(abhVar.q);
        this.b.setPublicVersion(null);
        this.b.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList6 = abhVar.t;
        if (!arrayList6.isEmpty()) {
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                this.b.addPerson((String) it.next());
            }
        }
        if (abhVar.d.size() > 0) {
            Bundle bundle3 = abhVar.b().getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i4 = 0; i4 < abhVar.d.size(); i4++) {
                String string = Integer.toString(i4);
                abc abcVar3 = (abc) abhVar.d.get(i4);
                Bundle bundle6 = new Bundle();
                IconCompat iconCompatA = abcVar3.a();
                bundle6.putInt("icon", iconCompatA != null ? iconCompatA.a() : 0);
                bundle6.putCharSequence("title", abcVar3.f);
                bundle6.putParcelable("actionIntent", abcVar3.g);
                Bundle bundle7 = new Bundle(abcVar3.a);
                boolean z = abcVar3.c;
                bundle7.putBoolean("android.support.allowGeneratedReplies", true);
                bundle6.putBundle("extras", bundle7);
                abo[] aboVarArr = abcVar3.b;
                if (aboVarArr == null) {
                    bundleArr = null;
                } else {
                    int length = aboVarArr.length;
                    bundleArr = new Bundle[length];
                    if (length > 0) {
                        abo aboVar = aboVarArr[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", abcVar3.d);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            abhVar.b().putBundle("android.car.EXTENSIONS", bundle3);
            this.d.putBundle("android.car.EXTENSIONS", bundle4);
        }
        this.b.setExtras(abhVar.o);
        this.b.setRemoteInputHistory(null);
        this.b.setBadgeIconType(0);
        this.b.setSettingsText(null);
        this.b.setShortcutId(null);
        this.b.setTimeoutAfter(0L);
        this.b.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(abhVar.r)) {
            this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        ArrayList arrayList7 = abhVar.c;
        if (arrayList7.size() > 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.b.setAllowSystemGeneratedContextualActions(true);
            this.b.setBubbleMetadata(null);
        }
        if (Build.VERSION.SDK_INT >= 36) {
            this.b.setShortCriticalText(null);
        }
    }

    private final void a(abc abcVar) {
        IconCompat iconCompatA = abcVar.a();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? adi.a(iconCompatA, null) : null, abcVar.f, abcVar.g);
        abo[] aboVarArr = abcVar.b;
        if (aboVarArr != null) {
            int length = aboVarArr.length;
            RemoteInput[] remoteInputArr = new RemoteInput[length];
            if (length > 0) {
                abo aboVar = aboVarArr[0];
                throw null;
            }
            for (int i = 0; i < length; i++) {
                builder.addRemoteInput(remoteInputArr[i]);
            }
        }
        Bundle bundle = new Bundle(abcVar.a);
        boolean z = abcVar.c;
        bundle.putBoolean("android.support.allowGeneratedReplies", true);
        builder.setAllowGeneratedReplies(true);
        bundle.putInt("android.support.action.semanticAction", 0);
        builder.setSemanticAction(0);
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(false);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setAuthenticationRequired(false);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", abcVar.d);
        builder.addExtras(bundle);
        this.b.addAction(builder.build());
    }
}
