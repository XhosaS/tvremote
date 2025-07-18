package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvb {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final oio e;
    public final yrp f;
    public final agow g;
    public final qun h;
    public final yqt i;
    public final yqt j;
    public final int k;

    public qvb(Context context, yqt yqtVar, String str, agow agowVar, qun qunVar, yqt yqtVar2, yqt yqtVar3) {
        this.a = context;
        this.g = agowVar;
        this.b = context.getPackageName();
        ActivityManager activityManager = qth.a;
        this.c = qth.c(context.getPackageName(), qth.b());
        if (yqtVar.g()) {
        }
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        this.k = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : packageManager.hasSystemFeature("android.hardware.type.watch") ? 3 : packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        this.e = new oio(context);
        this.f = yru.a(new yrp() { // from class: qva
            @Override // defpackage.yrp
            public final Object eV() {
                return Long.valueOf(this.a.e.a().getTotalSpace() / 1024);
            }
        });
        this.h = qunVar;
        this.i = yqtVar2;
        this.j = yqtVar3;
    }
}
