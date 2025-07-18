package defpackage;

import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shu {
    public final ResolveInfo a;
    public final boolean b;
    public final boolean c;
    public String d;
    public Drawable e;

    public shu(sht shtVar) {
        ResolveInfo resolveInfo = shtVar.a;
        resolveInfo.getClass();
        this.a = resolveInfo;
        this.b = shtVar.b;
        this.c = shtVar.c;
    }

    public final String a() {
        ResolveInfo resolveInfo = this.a;
        return sij.b(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
    }
}
