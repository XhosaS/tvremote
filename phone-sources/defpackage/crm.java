package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.videos.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crm {
    public RemoteViews A;
    public String B;
    public int C;
    public boolean D;
    public Notification E;
    public boolean F;

    @Deprecated
    public ArrayList G;
    public Context a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean k;
    public crr l;
    public CharSequence m;
    public CharSequence[] n;
    public int o;
    public int p;
    public boolean q;
    public String r;
    public boolean s;
    public String t;
    public boolean u;
    public String v;
    public Bundle w;
    public int x;
    public int y;
    public Notification z;

    @Deprecated
    public crm(Context context) {
        this(context, null);
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    private final void u(int i, boolean z) {
        if (z) {
            Notification notification = this.E;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.E;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        fhy fhyVar = new fhy(this);
        crm crmVar = (crm) fhyVar.c;
        crr crrVar = crmVar.l;
        if (crrVar != null) {
            crrVar.d(fhyVar);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            notificationBuild = ((Notification.Builder) fhyVar.d).build();
        } else {
            Notification notificationBuild2 = ((Notification.Builder) fhyVar.d).build();
            if (fhyVar.a != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && fhyVar.a == 2) {
                    fhy.a(notificationBuild2);
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && fhyVar.a == 1) {
                    fhy.a(notificationBuild2);
                }
            }
            notificationBuild = notificationBuild2;
        }
        if (crrVar != null) {
            crmVar.l.f();
        }
        if (crrVar != null && (bundle = notificationBuild.extras) != null) {
            crrVar.e(bundle);
        }
        return notificationBuild;
    }

    public final Bundle b() {
        if (this.w == null) {
            this.w = new Bundle();
        }
        return this.w;
    }

    public final void d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new crg(i != 0 ? IconCompat.g(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null));
    }

    public final void e(crg crgVar) {
        if (crgVar != null) {
            this.b.add(crgVar);
        }
    }

    public final void f(boolean z) {
        u(16, z);
    }

    public final void g(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void h(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void i(int i) {
        this.E.defaults = i;
        if ((i & 4) != 0) {
            this.E.flags |= 1;
        }
    }

    public final void j(PendingIntent pendingIntent) {
        this.E.deleteIntent = pendingIntent;
    }

    public final void k(Bitmap bitmap) {
        IconCompat iconCompatE;
        if (bitmap == null) {
            iconCompatE = null;
        } else {
            Context context = this.a;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
                }
            }
            iconCompatE = IconCompat.e(bitmap);
        }
        this.h = iconCompatE;
    }

    public final void l(boolean z) {
        u(2, z);
    }

    public final void m(boolean z) {
        u(8, z);
    }

    public final void n(int i, int i2, boolean z) {
        this.o = i;
        this.p = i2;
        this.q = z;
    }

    public final void o(int i) {
        this.E.icon = i;
    }

    public final void p(crr crrVar) {
        if (this.l != crrVar) {
            this.l = crrVar;
            if (crrVar == null || crrVar.a == this) {
                return;
            }
            crrVar.a = this;
            crm crmVar = crrVar.a;
            if (crmVar != null) {
                crmVar.p(crrVar);
            }
        }
    }

    public final void q(CharSequence charSequence) {
        this.m = c(charSequence);
    }

    public final void r(CharSequence charSequence) {
        this.E.tickerText = c(charSequence);
    }

    public final void s(long[] jArr) {
        this.E.vibrate = jArr;
    }

    public final void t(long j) {
        this.E.when = j;
    }

    public crm(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.k = true;
        this.u = false;
        this.x = 0;
        this.y = 0;
        this.C = 0;
        Notification notification = new Notification();
        this.E = notification;
        this.a = context;
        this.B = str;
        notification.when = System.currentTimeMillis();
        this.E.audioStreamType = -1;
        this.j = 0;
        this.G = new ArrayList();
        this.D = true;
    }
}
