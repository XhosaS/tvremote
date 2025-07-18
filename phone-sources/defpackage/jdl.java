package defpackage;

import android.content.Context;
import com.google.android.apps.googletv.app.player.offline.OfflineService;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdl {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/player/offline/DownloadNotificationHandler");
    public final Context b;
    private final crv c;
    private final euc d;
    private final mem e;

    public jdl(Context context, crv crvVar, euc eucVar, mem memVar) {
        crvVar.getClass();
        eucVar.getClass();
        memVar.getClass();
        this.b = context;
        this.c = crvVar;
        this.d = eucVar;
        this.e = memVar;
    }

    private final String g(long j) {
        if (j == -1 || j < 0) {
            String string = this.b.getString(R.string.downloading);
            string.getClass();
            return string;
        }
        if (j >= 1073741824) {
            String str = String.format(Locale.getDefault(), "%.1f GB", Arrays.copyOf(new Object[]{Float.valueOf(j / 1.0737418E9f)}, 1));
            str.getClass();
            return str;
        }
        if (j >= 1048576) {
            String str2 = String.format(Locale.getDefault(), "%.1f MB", Arrays.copyOf(new Object[]{Float.valueOf(j / 1048576.0f)}, 1));
            str2.getClass();
            return str2;
        }
        if (j >= 1024) {
            String str3 = String.format(Locale.getDefault(), "%.1f KB", Arrays.copyOf(new Object[]{Float.valueOf(j / 1024.0f)}, 1));
            str3.getClass();
            return str3;
        }
        String str4 = String.format(Locale.getDefault(), "%d bytes", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        str4.getClass();
        return str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Notification a(defpackage.etn r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdl.a(etn, int, boolean):android.app.Notification");
    }

    public final void b(etn etnVar, boolean z) {
        String str = etnVar.a.a;
        str.getClass();
        this.c.a(null, str.hashCode());
        if (z) {
            OfflineService.h.remove(str);
        }
    }

    public final void c(List list) {
        ArrayList<etn> arrayList = new ArrayList();
        for (Object obj : list) {
            if (e(((etn) obj).b)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        ((tug) a.b().j("com/google/android/apps/googletv/app/player/offline/DownloadNotificationHandler", "refreshManagedNotificationsLayout$java_com_google_android_apps_googletv_app_player_offline_offline", android.support.v7.appcompat.R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, "DownloadNotificationHandler.kt")).w("Handler:refreshManagedNotificationsLayout - Current total: %d, Active for grouping: %d", list.size(), size);
        if (size <= 1) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                etn etnVar = (etn) it.next();
                int i = etnVar.b;
                if (e(i) || !f(i)) {
                    b(etnVar, false);
                }
            }
            return;
        }
        for (etn etnVar2 : arrayList) {
            if (e(etnVar2.b)) {
                d(etnVar2);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((etn) it2.next()).a.a);
        }
        Set setAq = yfm.aq(arrayList2);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            etn etnVar3 = (etn) it3.next();
            if (e(etnVar3.b) && !setAq.contains(etnVar3.a.a)) {
                b(etnVar3, false);
            }
        }
    }

    public final void d(etn etnVar) {
        int i;
        String str = etnVar.a.a;
        str.getClass();
        int iHashCode = str.hashCode();
        List list = this.d.l;
        list.getClass();
        boolean z = false;
        if (list.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (e(((etn) it.next()).b) && (i = i + 1) < 0) {
                    yfm.v();
                }
            }
        }
        int i2 = etnVar.b;
        if (!e(i2) ? !(i2 != 3 || i <= 0) : i > 1) {
            z = true;
        }
        this.c.b(null, iHashCode, a(etnVar, iHashCode, z));
    }

    public final boolean e(int i) {
        return i == 2 || i == 0 || i == 1;
    }

    public final boolean f(int i) {
        return i == 2 || i == 0 || i == 1 || i == 3;
    }
}
