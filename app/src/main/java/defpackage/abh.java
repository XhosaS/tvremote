package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abh {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    abk l;
    public String n;
    Bundle o;
    public String r;
    public final Notification s;

    @Deprecated
    public final ArrayList t;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean m = false;
    public int p = 0;
    public int q = 0;

    public abh(Context context, String str) {
        Notification notification = new Notification();
        this.s = notification;
        this.a = context;
        this.r = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.t = new ArrayList();
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        abl ablVar = new abl(this);
        abk abkVar = ablVar.c.l;
        if (abkVar != null) {
            abkVar.b(ablVar);
        }
        Notification notificationBuild = ablVar.b.build();
        if (abkVar != null && (bundle = notificationBuild.extras) != null) {
            abkVar.c(bundle);
        }
        return notificationBuild;
    }

    public final Bundle b() {
        if (this.o == null) {
            this.o = new Bundle();
        }
        return this.o;
    }

    public final void d(int i, boolean z) {
        if (z) {
            Notification notification = this.s;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.s;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final void e(abk abkVar) {
        if (this.l != abkVar) {
            this.l = abkVar;
            if (abkVar == null || abkVar.c == this) {
                return;
            }
            abkVar.c = this;
            abh abhVar = abkVar.c;
            if (abhVar != null) {
                abhVar.e(abkVar);
            }
        }
    }

    public final void f(CharSequence charSequence) {
        this.s.tickerText = c(charSequence);
    }
}
