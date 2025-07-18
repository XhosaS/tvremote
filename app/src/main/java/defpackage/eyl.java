package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyl extends agtu implements agvb {
    final /* synthetic */ eym a;
    final /* synthetic */ Intent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyl(eym eymVar, Intent intent, agsw agswVar) {
        super(2, agswVar);
        this.a = eymVar;
        this.b = intent;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eyl) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        eym eymVar = this.a;
        jod jodVar = (jod) eymVar.h.a();
        Intent intent = this.b;
        if (jodVar.i(intent, false)) {
            ((zdv) eym.b.b().q("com/google/android/apps/tvsearch/app/launch/trampoline/SearchActivityTrampolinePeer$launchKeyboardActivity$1", "invokeSuspend", 160, "SearchActivityTrampolinePeer.kt")).u("SearchActivityTrampoline bringing up setup screens");
        } else {
            ((zdv) eym.b.b().q("com/google/android/apps/tvsearch/app/launch/trampoline/SearchActivityTrampolinePeer$launchKeyboardActivity$1", "invokeSuspend", 162, "SearchActivityTrampolinePeer.kt")).u("SearchActivityTrampoline forwarding intent to KeyboardSearchActivity");
            eymVar.j.b(intent);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new eyl(this.a, this.b, agswVar);
    }
}
