package androidx.mediarouter.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SystemOutputSwitcherDialogController {

    /* compiled from: PG */
    final class Api23Impl {
        private Api23Impl() {
        }

        public static boolean isSuitableDeviceAlreadyConnectedAsAudioOutput(Context context) {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) context.getSystemService(AudioManager.class)).getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if (type == 3 || type == 4 || type == 5 || type == 6 || type == 8 || type == 11 || type == 30 || type == 22 || type == 23 || type == 26 || type == 27) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: PG */
    class Api30Impl {
        private Api30Impl() {
        }
    }

    /* compiled from: PG */
    class Api34Impl {
        private Api34Impl() {
        }
    }

    private SystemOutputSwitcherDialogController() {
    }

    private static boolean a(Context context) {
        Intent intentPutExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intentPutExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && activityInfo.applicationInfo != null) {
                ApplicationInfo applicationInfo = activityInfo.applicationInfo;
                if ((applicationInfo.flags & 129) != 0) {
                    intentPutExtra.setPackage(applicationInfo.packageName);
                    context.startActivity(intentPutExtra);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean showDialog(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            r3 = 1
            r4 = 34
            if (r0 < r4) goto L1d
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L1b
            android.media.MediaRouter2 r0 = defpackage.agx$$ExternalSyntheticApiModelOutline0.m(r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L1b
            boolean r0 = defpackage.fd$$ExternalSyntheticApiModelOutline0.m(r0)
            goto L7a
        L1b:
            r0 = r2
            goto L7a
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r0 < r4) goto L72
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG"
            android.content.Intent r0 = r0.setAction(r1)
            java.lang.String r1 = "com.android.systemui"
            android.content.Intent r0 = r0.setPackage(r1)
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r4 = "package_name"
            android.content.Intent r0 = r0.putExtra(r4, r1)
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.util.List r1 = r1.queryBroadcastReceivers(r0, r2)
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r1.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            if (r4 == 0) goto L4a
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 == 0) goto L4a
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo
            int r4 = r4.flags
            r4 = r4 & 129(0x81, float:1.81E-43)
            if (r4 == 0) goto L4a
            r6.sendBroadcast(r0)
            goto L70
        L6a:
            boolean r0 = a(r6)
            if (r0 == 0) goto L1b
        L70:
            r0 = r3
            goto L7a
        L72:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L7e
            boolean r0 = a(r6)
        L7a:
            if (r0 != 0) goto L7d
            goto L7e
        L7d:
            return r3
        L7e:
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            java.lang.String r1 = "android.hardware.type.watch"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto Le0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.BLUETOOTH_SETTINGS"
            r0.<init>(r1)
            r1 = 268468224(0x10008000, float:2.5342157E-29)
            android.content.Intent r0 = r0.addFlags(r1)
            java.lang.String r1 = "EXTRA_CONNECTION_ONLY"
            android.content.Intent r0 = r0.putExtra(r1, r3)
            java.lang.String r1 = "android.bluetooth.devicepicker.extra.FILTER_TYPE"
            android.content.Intent r0 = r0.putExtra(r1, r3)
            boolean r1 = androidx.mediarouter.app.SystemOutputSwitcherDialogController.Api23Impl.isSuitableDeviceAlreadyConnectedAsAudioOutput(r6)
            r1 = r1 ^ r3
            java.lang.String r4 = "EXTRA_CLOSE_ON_CONNECT"
            android.content.Intent r0 = r0.putExtra(r4, r1)
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.util.List r1 = r1.queryIntentActivities(r0, r2)
            java.util.Iterator r1 = r1.iterator()
        Lbb:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Le0
            java.lang.Object r4 = r1.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            if (r4 == 0) goto Lbb
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 == 0) goto Lbb
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo
            int r5 = r4.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto Lbb
            java.lang.String r1 = r4.packageName
            r0.setPackage(r1)
            r6.startActivity(r0)
            return r3
        Le0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.SystemOutputSwitcherDialogController.showDialog(android.content.Context):boolean");
    }
}
