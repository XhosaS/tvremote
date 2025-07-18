package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nqr {
    public static final nsf a = new nsf("MediaNotificationProxy");
    public final NotificationManager b;
    public final npd c;
    public final nql d;
    public final npc e;
    public nqq f;
    public obl g;
    private final Context h;
    private final nmg i;
    private final npk j;
    private final ComponentName k;
    private final ComponentName l;
    private List m = new ArrayList();
    private int[] n;
    private final long o;
    private final Resources p;
    private Notification q;
    private crg r;
    private crg s;
    private crg t;
    private crg u;
    private crg v;
    private crg w;
    private crg x;
    private crg y;

    public nqr(Context context) throws Resources.NotFoundException {
        this.h = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        nmg nmgVarC = nmg.c();
        ocv.aF(nmgVarC);
        this.i = nmgVarC;
        nmj nmjVarF = nmgVarC.f();
        ocv.aF(nmjVarF);
        now nowVar = nmjVarF.h;
        ocv.aF(nowVar);
        npk npkVar = nowVar.c;
        ocv.aF(npkVar);
        this.j = npkVar;
        this.c = nowVar.a();
        Resources resources = context.getResources();
        this.p = resources;
        this.k = new ComponentName(context.getApplicationContext(), nowVar.a);
        if (TextUtils.isEmpty(npkVar.e)) {
            this.l = null;
        } else {
            this.l = new ComponentName(context.getApplicationContext(), npkVar.e);
        }
        this.o = npkVar.d;
        int dimensionPixelSize = resources.getDimensionPixelSize(npkVar.s);
        npc npcVar = new npc(1, dimensionPixelSize, dimensionPixelSize);
        this.e = npcVar;
        this.d = new nql(context.getApplicationContext(), npcVar);
        if (ocv.f() && notificationManager != null) {
            ocv.aF(context);
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        nnx.e(uck.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final crg b(String str) throws Resources.NotFoundException {
        PendingIntent pendingIntentA;
        PendingIntent pendingIntentA2;
        int i;
        int i2;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    long j = this.o;
                    if (this.w == null) {
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                        intent.setComponent(this.k);
                        intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                        PendingIntent pendingIntentA3 = ogf.a(this.h, intent, 201326592);
                        npk npkVar = this.j;
                        int iC = nqw.c(npkVar, j);
                        this.w = crh.c(iC == 0 ? null : IconCompat.g(null, "", iC), crm.c(this.p.getString(nqw.d(npkVar, j))), pendingIntentA3, new Bundle(), null);
                    }
                    return this.w;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    boolean z = this.f.c;
                    if (this.t == null) {
                        if (z) {
                            Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                            intent2.setComponent(this.k);
                            pendingIntentA = ogf.a(this.h, intent2, 67108864);
                        } else {
                            pendingIntentA = null;
                        }
                        npk npkVar2 = this.j;
                        String string = this.p.getString(npkVar2.x);
                        int i3 = npkVar2.j;
                        this.t = crh.c(i3 == 0 ? null : IconCompat.g(null, "", i3), crm.c(string), pendingIntentA, new Bundle(), null);
                    }
                    return this.t;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    boolean z2 = this.f.d;
                    if (this.u == null) {
                        if (z2) {
                            Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                            intent3.setComponent(this.k);
                            pendingIntentA2 = ogf.a(this.h, intent3, 67108864);
                        } else {
                            pendingIntentA2 = null;
                        }
                        npk npkVar3 = this.j;
                        String string2 = this.p.getString(npkVar3.y);
                        int i4 = npkVar3.k;
                        this.u = crh.c(i4 == 0 ? null : IconCompat.g(null, "", i4), crm.c(string2), pendingIntentA2, new Bundle(), null);
                    }
                    return this.u;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.y == null) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                        intent4.setComponent(this.k);
                        PendingIntent pendingIntentA4 = ogf.a(this.h, intent4, 67108864);
                        npk npkVar4 = this.j;
                        String string3 = this.p.getString(npkVar4.F);
                        int i5 = npkVar4.r;
                        this.y = crh.c(i5 == 0 ? null : IconCompat.g(null, "", i5), crm.c(string3), pendingIntentA4, new Bundle(), null);
                    }
                    return this.y;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.x == null) {
                        Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                        intent5.setComponent(this.k);
                        PendingIntent pendingIntentA5 = ogf.a(this.h, intent5, 67108864);
                        npk npkVar5 = this.j;
                        String string4 = this.p.getString(npkVar5.F, "");
                        int i6 = npkVar5.r;
                        this.x = crh.c(i6 == 0 ? null : IconCompat.g(null, "", i6), crm.c(string4), pendingIntentA5, new Bundle(), null);
                    }
                    return this.x;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    nqq nqqVar = this.f;
                    int i7 = nqqVar.b;
                    if (!nqqVar.a) {
                        if (this.r == null) {
                            Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                            intent6.setComponent(this.k);
                            PendingIntent pendingIntentA6 = ogf.a(this.h, intent6, 67108864);
                            npk npkVar6 = this.j;
                            String string5 = this.p.getString(npkVar6.w);
                            int i8 = npkVar6.i;
                            this.r = crh.c(i8 == 0 ? null : IconCompat.g(null, "", i8), crm.c(string5), pendingIntentA6, new Bundle(), null);
                        }
                        return this.r;
                    }
                    if (this.s == null) {
                        if (i7 == 2) {
                            npk npkVar7 = this.j;
                            i = npkVar7.g;
                            i2 = npkVar7.u;
                        } else {
                            npk npkVar8 = this.j;
                            i = npkVar8.h;
                            i2 = npkVar8.v;
                        }
                        Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent7.setComponent(this.k);
                        this.s = crh.c(i == 0 ? null : IconCompat.g(null, "", i), crm.c(this.p.getString(i2)), ogf.a(this.h, intent7, 67108864), new Bundle(), null);
                    }
                    return this.s;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    long j2 = this.o;
                    if (this.v == null) {
                        Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                        intent8.setComponent(this.k);
                        intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j2);
                        PendingIntent pendingIntentA7 = ogf.a(this.h, intent8, 201326592);
                        npk npkVar9 = this.j;
                        int iA = nqw.a(npkVar9, j2);
                        this.v = crh.c(iA == 0 ? null : IconCompat.g(null, "", iA), crm.c(this.p.getString(nqw.b(npkVar9, j2))), pendingIntentA7, new Bundle(), null);
                    }
                    return this.v;
                }
                break;
        }
        a.b("Action: %s is not a pre-defined action.", str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.CharSequence, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqr.a():void");
    }
}
