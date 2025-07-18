package defpackage;

import android.hardware.display.DisplayManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evu extends agtu implements agvb {
    final /* synthetic */ evx a;
    final /* synthetic */ vrm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evu(evx evxVar, vrm vrmVar, agsw agswVar) {
        super(2, agswVar);
        this.a = evxVar;
        this.b = vrmVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((evu) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        ahbt ahbtVar = (ahbt) this.c;
        evx evxVar = this.a;
        DisplayManager displayManager = evxVar.b;
        evxVar.d(displayManager);
        ahbu.c(ahbtVar);
        displayManager.registerDisplayListener(evxVar.f, this.b);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        evu evuVar = new evu(this.a, this.b, agswVar);
        evuVar.c = obj;
        return evuVar;
    }
}
