package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qum {
    public final yrp a;

    public qum(final Context context) {
        this.a = yru.a(new yrp() { // from class: qul
            @Override // defpackage.yrp
            public final Object eV() {
                if (Build.VERSION.SDK_INT < 30) {
                    return ypv.a;
                }
                Context context2 = context;
                try {
                    return yqt.h(context2.getPackageManager().getInstallSourceInfo(context2.getPackageName()).getInstallingPackageName());
                } catch (PackageManager.NameNotFoundException unused) {
                    return ypv.a;
                }
            }
        });
    }
}
