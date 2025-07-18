package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qce implements qbp {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final qei c;

    public qce(Context context, qei qeiVar) {
        this.b = context;
        this.c = qeiVar;
    }

    @Override // defpackage.qbp
    public final String a(qis qisVar) {
        Set itVar;
        if (qtl.E()) {
            if (qtl.E()) {
                itVar = new it();
                Iterator it = ((NotificationManager) this.b.getSystemService("notification")).getNotificationChannels().iterator();
                while (it.hasNext()) {
                    itVar.add(kw$$ExternalSyntheticApiModelOutline0.m(it.next()).getId());
                }
            } else {
                itVar = Collections.EMPTY_SET;
            }
            vkw vkwVar = qisVar.l.o;
            if (vkwVar == null) {
                vkwVar = vkw.a;
            }
            String str = vkwVar.b;
            if (!TextUtils.isEmpty(str) && itVar.contains(str)) {
                return str;
            }
            String str2 = this.c.c.i;
            if (!TextUtils.isEmpty(str2) && itVar.contains(str2)) {
                return str2;
            }
            ((tvk) ((tvk) a.f()).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationChannelHelperImpl", "getChannelIdAndroidOOrLater", 182, "NotificationChannelHelperImpl.java")).E("Did not find the intended channel '%s' or the default channel '%s' in '%s'", str, str2, itVar);
        }
        return null;
    }

    @Override // defpackage.qbp
    public final List b() {
        String str;
        if (!qtl.F()) {
            return Arrays.asList(new qbo[0]);
        }
        NotificationManager notificationManager = (NotificationManager) this.b.getSystemService("notification");
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = notificationManager.getNotificationChannelGroups().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup notificationChannelGroupM441m = kw$$ExternalSyntheticApiModelOutline0.m441m(it.next());
                qbn qbnVar = new qbn();
                qbnVar.a(false);
                String id = notificationChannelGroupM441m.getId();
                if (id == null) {
                    throw new NullPointerException("Null id");
                }
                qbnVar.a = id;
                qbnVar.a(notificationChannelGroupM441m.isBlocked());
                if (qbnVar.c == 1 && (str = qbnVar.a) != null) {
                    arrayList.add(new qbo(str, qbnVar.b));
                }
                StringBuilder sb = new StringBuilder();
                if (qbnVar.a == null) {
                    sb.append(" id");
                }
                if (qbnVar.c == 0) {
                    sb.append(" blocked");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            return arrayList;
        } catch (RuntimeException e) {
            ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationChannelHelperImpl", "getNotificationChannelGroupsAndroidPOrLater", (char) 138, "NotificationChannelHelperImpl.java")).s("Failed getting notification channel groups");
            return arrayList;
        }
    }

    @Override // defpackage.qbp
    public final List c() {
        int i;
        Object obj;
        Object obj2;
        int i2;
        if (!qtl.E()) {
            return Arrays.asList(new qbm[0]);
        }
        NotificationManager notificationManager = (NotificationManager) this.b.getSystemService("notification");
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = notificationManager.getNotificationChannels().iterator();
            while (it.hasNext()) {
                NotificationChannel notificationChannelM = kw$$ExternalSyntheticApiModelOutline0.m(it.next());
                res resVar = new res((char[]) null);
                resVar.d("");
                String id = notificationChannelM.getId();
                if (id == null) {
                    throw new NullPointerException("Null id");
                }
                resVar.e = id;
                int importance = notificationChannelM.getImportance();
                if (importance != 0) {
                    i = 5;
                    if (importance != 1) {
                        i = importance != 2 ? importance != 3 ? importance != 4 ? importance != 5 ? 1 : 6 : 3 : 2 : 4;
                    }
                } else {
                    i = 7;
                }
                resVar.a = i;
                resVar.b = notificationChannelM.canShowBadge();
                resVar.c = (byte) 1;
                if (!TextUtils.isEmpty(notificationChannelM.getGroup())) {
                    resVar.d(notificationChannelM.getGroup());
                }
                if (resVar.c != 1 || (obj = resVar.e) == null || (obj2 = resVar.d) == null || (i2 = resVar.a) == 0) {
                    StringBuilder sb = new StringBuilder();
                    if (resVar.e == null) {
                        sb.append(" id");
                    }
                    if (resVar.d == null) {
                        sb.append(" group");
                    }
                    if (resVar.a == 0) {
                        sb.append(" importance");
                    }
                    if (resVar.c == 0) {
                        sb.append(" canShowBadge");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                arrayList.add(new qbm((String) obj, (String) obj2, i2, resVar.b));
            }
            return arrayList;
        } catch (Exception e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationChannelHelperImpl", "getNotificationChannelsAndroidOOrLater", '[', "NotificationChannelHelperImpl.java")).s("Failed to get notification channels from Android.");
            return arrayList;
        }
    }

    @Override // defpackage.qbp
    public final void d(crm crmVar, qis qisVar) {
        String strA = a(qisVar);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        ((tvk) ((tvk) a.e()).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationChannelHelperImpl", "setChannelId", 45, "NotificationChannelHelperImpl.java")).v("Setting channel Id: '%s'", strA);
        crmVar.B = strA;
    }

    @Override // defpackage.qbp
    public final boolean e(String str) {
        NotificationChannel notificationChannel;
        Context context = this.b;
        if (qtl.J(context)) {
            return (TextUtils.isEmpty(str) || (notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str)) == null || notificationChannel.getImportance() <= 0) ? false : true;
        }
        return true;
    }
}
