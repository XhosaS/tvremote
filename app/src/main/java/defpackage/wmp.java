package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wmp extends afga {
    final /* synthetic */ wkv a;
    final /* synthetic */ wmq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmp(wmq wmqVar, afeq afeqVar, wkv wkvVar) {
        super(afeqVar);
        this.a = wkvVar;
        this.b = wmqVar;
    }

    @Override // defpackage.afgb, defpackage.afeq
    public final void a(afep afepVar, afih afihVar) {
        this.b.b = SystemClock.elapsedRealtime();
        f().a(new wmo(this, afepVar, this.a), afihVar);
    }
}
