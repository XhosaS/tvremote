package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqg {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final ttm e;
    public final yfo f;
    public final tst g;
    public final tst h;
    public final tst i;
    public final yfo j;
    public final int k;
    public final upc l;
    public final vvd m;

    public rqg(Context context, tst tstVar, String str, yfo yfoVar, vvd vvdVar, tst tstVar2, tst tstVar3, tst tstVar4, yfo yfoVar2) {
        this.a = context;
        this.f = yfoVar;
        this.b = context.getPackageName();
        ActivityManager activityManager = rpd.a;
        this.c = rpd.c(context.getPackageName(), rpd.b());
        if (tstVar.g()) {
        }
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        this.k = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : packageManager.hasSystemFeature("android.hardware.type.watch") ? 3 : packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        this.l = new upc(context, (byte[]) null);
        this.e = sij.l(new riu(this, 18));
        this.m = vvdVar;
        this.g = tstVar2;
        this.h = tstVar3;
        this.i = tstVar4;
        this.j = yfoVar2;
    }

    public static List a(List list, int i) {
        return list.size() > i ? list.subList(0, i) : list;
    }
}
