package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syh extends agtu implements agvb {
    final /* synthetic */ syj a;
    final /* synthetic */ syl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syh(syj syjVar, syl sylVar, agsw agswVar) {
        super(2, agswVar);
        this.a = syjVar;
        this.b = sylVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((syh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        syj syjVar = this.a;
        if (syjVar.d.a(true)) {
            return agpu.a;
        }
        final syl sylVar = this.b;
        long j = syjVar.b;
        ryr ryrVar = syjVar.a;
        abvo abvoVar = syjVar.c;
        abvoVar.getClass();
        ryp rypVar = ryp.a;
        ryo ryoVar = new ryo();
        if ((ryoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryoVar.y();
        }
        ryp rypVar2 = (ryp) ryoVar.b;
        rypVar2.b |= 1;
        rypVar2.c = j;
        abxd abxdVarV = ryoVar.v();
        abxdVarV.getClass();
        final ryp rypVar3 = (ryp) abxdVarV;
        ((zdv) syl.a.b().o(zfi.a, "ALT.SingleRecordStore").q("com/google/android/libraries/search/audio/store/memory/SingleAudioRecordStore", "storeAudio", 117, "SingleAudioRecordStore.kt")).w("#audio# Storing audio. AudioRecordId: %d", j);
        agzy agzyVar = sylVar.d;
        ryt rytVar = ryt.a;
        rys rysVar = new rys();
        if ((rysVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rysVar.y();
        }
        ryt rytVar2 = (ryt) rysVar.b;
        rytVar2.c = rypVar3;
        rytVar2.b = 1 | rytVar2.b;
        if ((rysVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rysVar.y();
        }
        ryt rytVar3 = (ryt) rysVar.b;
        rytVar3.e = ryrVar;
        rytVar3.b |= 4;
        if ((rysVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rysVar.y();
        }
        ryt rytVar4 = (ryt) rysVar.b;
        rytVar4.b |= 2;
        rytVar4.d = abvoVar;
        abxd abxdVarV2 = rysVar.v();
        abxdVarV2.getClass();
        agzyVar.c((ryt) abxdVarV2);
        sylVar.c.schedule(wyo.h(new Runnable() { // from class: syg
            @Override // java.lang.Runnable
            public final void run() {
                syl sylVar2 = sylVar;
                sylVar2.e.a(new syk(sylVar2, rypVar3, null));
            }
        }), syl.b.toMinutes(), TimeUnit.MINUTES);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new syh(this.a, this.b, agswVar);
    }
}
