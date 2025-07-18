package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aui {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final aps e;
    public final byo f;
    public final crv g;
    public final byg h;
    public final byg i;
    public final byg j;
    public final crv k;
    public final int l;
    public final cmt m;

    public aui(Context context, byg bygVar, String str, crv crvVar, cmt cmtVar, byg bygVar2, byg bygVar3, byg bygVar4, crv crvVar2) {
        this.a = context;
        this.g = crvVar;
        this.b = context.getPackageName();
        ActivityManager activityManager = atb.a;
        this.c = atb.c(context.getPackageName(), atb.b());
        if (bygVar.f()) {
        }
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        this.l = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : packageManager.hasSystemFeature("android.hardware.type.watch") ? 3 : packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        this.e = new aps(context);
        this.f = bit.k(new asf(this, 6));
        this.m = cmtVar;
        this.h = bygVar2;
        this.i = bygVar3;
        this.j = bygVar4;
        this.k = crvVar2;
    }

    public static List a(List list, int i) {
        return list.size() > i ? list.subList(0, i) : list;
    }
}
