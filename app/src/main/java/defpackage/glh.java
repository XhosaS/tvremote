package defpackage;

import android.os.Debug;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glh extends agtu implements agvb {
    final /* synthetic */ gli a;
    final /* synthetic */ yea b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glh(gli gliVar, yea yeaVar, agsw agswVar) {
        super(2, agswVar);
        this.a = gliVar;
        this.b = yeaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((glh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        int[] iArr = {Process.myPid()};
        gli gliVar = this.a;
        Debug.MemoryInfo[] processMemoryInfo = gliVar.a.getProcessMemoryInfo(iArr);
        if (processMemoryInfo == null || processMemoryInfo.length == 0) {
            return agpu.a;
        }
        gliVar.b.U(processMemoryInfo[0].getTotalPss(), 3, this.b);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new glh(this.a, this.b, agswVar);
    }
}
