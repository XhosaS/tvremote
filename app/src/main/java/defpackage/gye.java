package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gye extends agtu implements agvb {
    final /* synthetic */ gyf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gye(gyf gyfVar, agsw agswVar) {
        super(2, agswVar);
        this.a = gyfVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gye) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        try {
            ltn.a(this.a.b);
            ((zdv) gyf.a.b().q("com/google/android/apps/tvsearch/platform/gms/SecurityProviderTask$run$2", "invokeSuspend", 52, "SecurityProviderTask.kt")).u("Security provider installed.");
        } catch (kdr e) {
            zdv zdvVar = (zdv) ((zdv) gyf.a.b()).p(e).q("com/google/android/apps/tvsearch/platform/gms/SecurityProviderTask$run$2", "invokeSuspend", 66, "SecurityProviderTask.kt");
            int i = kcy.c;
            boolean z = kdu.b;
            int i2 = e.a;
            zdvVar.F("Failed to install security provider: %s (%s)", ConnectionResult.a(i2), new qsg(i2));
        } catch (kds e2) {
            zdv zdvVar2 = (zdv) ((zdv) gyf.a.b()).p(e2).q("com/google/android/apps/tvsearch/platform/gms/SecurityProviderTask$run$2", "invokeSuspend", 57, "SecurityProviderTask.kt");
            int i3 = kcy.c;
            boolean z2 = kdu.b;
            int i4 = e2.a;
            zdvVar2.F("Failed to install security provider: %s (%s)", ConnectionResult.a(i4), new qsg(i4));
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gye(this.a, agswVar);
    }
}
