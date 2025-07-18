package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ico implements ServiceConnection {
    final /* synthetic */ icp a;
    final /* synthetic */ Collection b;
    final /* synthetic */ int c;
    final /* synthetic */ zyu d;

    public ico(icp icpVar, Collection collection, int i, zyu zyuVar) {
        this.a = icpVar;
        this.b = collection;
        this.c = i;
        this.d = zyuVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        icp icpVar = this.a;
        icpVar.g = 1;
        ((zdv) icp.a.d().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask$start$1", "onBindingDied", 132, "MirrorSearchSettingsTask.kt")).x("Service binding died for component %s", componentName);
        icpVar.b(this.b, this.c, this.d);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        iBinder.getClass();
        ((zdv) icp.a.b().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask$start$1", "onServiceConnected", 90, "MirrorSearchSettingsTask.kt")).u("SearchSettingsService Connected.");
        final icp icpVar = this.a;
        icpVar.g = 3;
        icpVar.c.g();
        final Collection collection = this.b;
        final int i = this.c;
        final zyu zyuVar = this.d;
        icpVar.e.submit(wyo.h(new Runnable() { // from class: icn
            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                Iterator it;
                icp icpVar2 = icpVar;
                Collection collection2 = collection;
                int i2 = i;
                IBinder iBinder2 = iBinder;
                zyu zyuVar2 = zyuVar;
                try {
                    IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.apps.tvsearch.settings.mirror.SearchSettingsReader");
                    icv ictVar = iInterfaceQueryLocalInterface instanceof icv ? (icv) iInterfaceQueryLocalInterface : new ict(iBinder2);
                    ictVar.getClass();
                    ics icsVar = icpVar2.d;
                    if (icsVar == null) {
                        ((zdv) icp.a.b().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask", "mirrorSearchSettings", 186, "MirrorSearchSettingsTask.kt")).u("No attached MirroredSettings Receiver to notify.");
                        obj = null;
                    } else {
                        Iterator it2 = collection2.iterator();
                        while (it2.hasNext()) {
                            icg icgVar = (icg) it2.next();
                            String str = icgVar.w;
                            int i3 = icgVar.x;
                            int i4 = i3 - 1;
                            if (i3 == 0) {
                                throw null;
                            }
                            if (i4 != 0) {
                                it = it2;
                                if (i4 == 1) {
                                    icsVar.f(icgVar, ictVar.c(str));
                                } else if (i4 == 2) {
                                    String strD = ictVar.d(str);
                                    strD.getClass();
                                    icsVar.g(icgVar, strD);
                                } else {
                                    if (i4 != 3) {
                                        throw new agpg();
                                    }
                                    List listE = ictVar.e(str);
                                    listE.getClass();
                                    icsVar.h(icgVar, listE);
                                }
                            } else {
                                it = it2;
                                icsVar.e(icgVar, ictVar.f(str));
                            }
                            it2 = it;
                        }
                        obj = null;
                        ((zdv) icp.a.b().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask", "mirrorSearchSettings", 214, "MirrorSearchSettingsTask.kt")).u("Successfully mirrored necessary settings from SearchSettings.");
                    }
                    ServiceConnection serviceConnection = icpVar2.f;
                    if (serviceConnection != null) {
                        icpVar2.b.unbindService(serviceConnection);
                        zyuVar2.p(obj);
                    }
                } catch (RemoteException e) {
                    ((zdv) ((zdv) icp.a.d()).p(e).q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask$start$1", "onServiceConnected$lambda$1", 111, "MirrorSearchSettingsTask.kt")).u("Failed to mirror settings after connecting.");
                    icpVar2.b(collection2, i2, zyuVar2);
                } catch (IllegalArgumentException e2) {
                    ((zdv) ((zdv) icp.a.d()).p(e2).q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask$start$1", "onServiceConnected$lambda$1", 117, "MirrorSearchSettingsTask.kt")).u("Failed to mirror settings after connecting.");
                    icpVar2.b(collection2, i2, zyuVar2);
                }
            }
        }));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.g = 1;
        ((zdv) icp.a.b().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask$start$1", "onServiceDisconnected", 127, "MirrorSearchSettingsTask.kt")).u("SearchSettingsService Disconnected.");
    }
}
