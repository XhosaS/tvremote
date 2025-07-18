package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class mc extends oc {
    final /* synthetic */ mj a;
    final /* synthetic */ mm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(mm mmVar, View view, mj mjVar) {
        super(view);
        this.b = mmVar;
        this.a = mjVar;
    }

    @Override // defpackage.oc
    public final ka a() {
        return this.a;
    }

    @Override // defpackage.oc
    public final boolean b() {
        mm mmVar = this.b;
        if (mmVar.a.u()) {
            return true;
        }
        mmVar.b();
        return true;
    }
}
