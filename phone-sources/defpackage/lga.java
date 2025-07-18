package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.ThumbnailUtils;
import com.google.android.videos.R;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lga {
    public boolean a;
    public boolean b;
    public final Object c;

    public lga(String str) {
        this.c = str;
    }

    public static lga b(Context context, kyt kytVar, String str, boolean z) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (ksk.b >= 26 && notificationManager != null) {
            if (Collection.EL.stream(notificationManager.getNotificationChannels()).filter(new ldw(kytVar, 2)).count() == 0) {
                NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
                String str2 = kytVar.k;
                String string = context.getString(kytVar.l);
                boolean z2 = kytVar.n;
                NotificationChannel notificationChannel = new NotificationChannel(str2, string, true == z2 ? 4 : 2);
                notificationChannel.setShowBadge(false);
                notificationChannel.enableLights(z2);
                notificationChannel.enableVibration(z2);
                notificationChannel.setDescription(context.getResources().getString(kytVar.m));
                kyu kyuVar = kytVar.o;
                if (kyuVar != null) {
                    notificationChannel.setGroup(kyuVar.d);
                }
                notificationManager2.createNotificationChannel(notificationChannel);
            }
        }
        return new lga(context, kytVar, str, z);
    }

    public static lga c(Context context, kyt kytVar, Bitmap bitmap, String str, boolean z) {
        lga lgaVarB = b(context, kytVar, str, z);
        lgaVarB.j(context, bitmap);
        ((crm) lgaVarB.c).x = jwq.C(context, R.attr.colorPrimary);
        return lgaVarB;
    }

    public final Notification a() {
        boolean z = true;
        if (this.a && !this.b) {
            z = false;
        }
        sij.o(z, "If MediaStyle is set, contentTitle need to be set");
        return ((crm) this.c).a();
    }

    public final void d(int i, String str, PendingIntent pendingIntent) {
        ((crm) this.c).d(i, str, pendingIntent);
    }

    public final void e(boolean z) {
        ((crm) this.c).f(z);
    }

    public final void f(PendingIntent pendingIntent) {
        ((crm) this.c).g = pendingIntent;
    }

    public final void g(CharSequence charSequence) {
        ((crm) this.c).g(charSequence);
    }

    public final void h(CharSequence charSequence) {
        this.b = true;
        ((crm) this.c).h(charSequence);
    }

    public final void i(PendingIntent pendingIntent) {
        ((crm) this.c).j(pendingIntent);
    }

    public final void j(Context context, Bitmap bitmap) {
        Bitmap bitmapExtractThumbnail = null;
        if (bitmap != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.notification_large_icon_max_size);
            if (bitmap.getHeight() != bitmap.getWidth()) {
                int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawColor(0);
                canvas.drawBitmap(bitmap, (iMax - bitmap.getWidth()) / 2.0f, (iMax - bitmap.getHeight()) / 2, (Paint) null);
                bitmap = bitmapCreateBitmap;
            }
            bitmapExtractThumbnail = Math.max(bitmap.getWidth(), bitmap.getHeight()) > dimensionPixelSize ? ThumbnailUtils.extractThumbnail(bitmap, dimensionPixelSize, dimensionPixelSize) : bitmap;
        }
        ((crm) this.c).k(bitmapExtractThumbnail);
    }

    public final void k() {
        ((crm) this.c).l(true);
    }

    public final void l() {
        ((crm) this.c).k = false;
    }

    public final void m(CharSequence charSequence) {
        ((crm) this.c).r(charSequence);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private lga(android.content.Context r3, defpackage.kyt r4, java.lang.String r5, boolean r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.b = r0
            crm r1 = new crm
            r1.<init>(r3)
            r2.c = r1
            java.lang.String r3 = r4.k
            r4 = r1
            crm r4 = (defpackage.crm) r4
            r1.B = r3
            int r3 = r5.hashCode()
            switch(r3) {
                case -1831144304: goto L5d;
                case -1799656349: goto L51;
                case -1525508909: goto L45;
                case -861020243: goto L39;
                case 180935854: goto L30;
                case 1721768933: goto L27;
                case 1928871185: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L69
        L1e:
            java.lang.String r3 = "Pending download"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L69
            goto L65
        L27:
            java.lang.String r3 = "Watch now"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L69
            goto L59
        L30:
            java.lang.String r3 = "Top Movies"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L69
            goto L59
        L39:
            java.lang.String r3 = "Ongoing download"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L69
            r3 = 17301633(0x1080081, float:2.4979616E-38)
            goto L72
        L45:
            java.lang.String r3 = "Download completed"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L69
            r3 = 2131231830(0x7f080456, float:1.8079752E38)
            goto L72
        L51:
            java.lang.String r3 = "Top TV Shows"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L69
        L59:
            r3 = 2131231452(0x7f0802dc, float:1.8078985E38)
            goto L72
        L5d:
            java.lang.String r3 = "Download error"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L69
        L65:
            r3 = 2131231831(0x7f080457, float:1.8079754E38)
            goto L72
        L69:
            if (r6 == 0) goto L6f
            r3 = 2131231832(0x7f080458, float:1.8079756E38)
            goto L72
        L6f:
            r3 = 2131231835(0x7f08045b, float:1.8079762E38)
        L72:
            r1.o(r3)
            r1.r = r5
            r1.i(r0)
            r3 = 1
            r1.m(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lga.<init>(android.content.Context, kyt, java.lang.String, boolean):void");
    }
}
