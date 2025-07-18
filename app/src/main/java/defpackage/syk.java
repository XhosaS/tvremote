package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syk extends agtu implements agvb {
    final /* synthetic */ syl a;
    final /* synthetic */ ryp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syk(syl sylVar, ryp rypVar, agsw agswVar) {
        super(2, agswVar);
        this.a = sylVar;
        this.b = rypVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((syk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        ryp rypVar;
        agpl.b(obj);
        agzy agzyVar = this.a.d;
        ryt rytVar = (ryt) agzyVar.a;
        if (rytVar != null) {
            rypVar = rytVar.c;
            if (rypVar == null) {
                rypVar = ryp.a;
            }
        } else {
            rypVar = null;
        }
        ryp rypVar2 = this.b;
        if (!agvy.c(rypVar, rypVar2)) {
            return agpu.a;
        }
        ((zdv) syl.a.b().o(zfi.a, "ALT.SingleRecordStore").q("com/google/android/libraries/search/audio/store/memory/SingleAudioRecordStore$removeAudio$1", "invokeSuspend", 140, "SingleAudioRecordStore.kt")).E("#audio# Cleaning up audio %s after storing. AudioRecordId: %d", syl.b, rypVar2.c);
        agzyVar.d(rytVar, null);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new syk(this.a, this.b, agswVar);
    }
}
