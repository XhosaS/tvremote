package defpackage;

import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sft extends agtu implements agvb {
    final /* synthetic */ AudioDeviceInfo[] a;
    final /* synthetic */ sge b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sft(AudioDeviceInfo[] audioDeviceInfoArr, sge sgeVar, agsw agswVar) {
        super(2, agswVar);
        this.a = audioDeviceInfoArr;
        this.b = sgeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sft) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sft.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sft(this.a, this.b, agswVar);
    }
}
