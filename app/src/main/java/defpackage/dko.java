package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dko implements dap {
    private final djy a;

    public dko(djy djyVar) {
        this.a = djyVar;
    }

    @Override // defpackage.dap
    public final /* synthetic */ ddp a(Object obj, int i, int i2, dan danVar) {
        djy djyVar = this.a;
        return djyVar.a(new dkk((ParcelFileDescriptor) obj, djyVar.g, djyVar.f), i, i2, danVar, djy.e);
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ boolean b(Object obj, dan danVar) {
        return (!("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && dbk.c();
    }
}
