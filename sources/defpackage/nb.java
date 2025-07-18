package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nb {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public Bundle j;
    public String k;
    public final Notification l;

    @Deprecated
    public final ArrayList m;
    public afz n;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean i = false;

    @Deprecated
    public nb(Context context) {
        Notification notification = new Notification();
        this.l = notification;
        this.a = context;
        this.k = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.m = new ArrayList();
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Bundle a() {
        if (this.j == null) {
            this.j = new Bundle();
        }
        return this.j;
    }

    public final void c(int i) {
        this.l.icon = i;
    }

    public final void d(afz afzVar) {
        if (this.n != afzVar) {
            this.n = afzVar;
            if (afzVar == null || afzVar.b == this) {
                return;
            }
            afzVar.b = this;
            Object obj = afzVar.b;
            if (obj != null) {
                ((nb) obj).d(afzVar);
            }
        }
    }
}
