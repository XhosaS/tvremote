package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qex implements qed {
    final /* synthetic */ yqt a;
    final /* synthetic */ Context b;

    public qex(yqt yqtVar, Context context) {
        this.a = yqtVar;
        this.b = context;
    }

    @Override // defpackage.qed
    public final void a(String str, int i) {
        if (i == 1) {
            yqt yqtVar = this.a;
            if (yqtVar.g()) {
                pmm.b(this.b, (Class) yqtVar.c(), str);
            }
        }
    }

    @Override // defpackage.qed
    public final void b(String str, int i) {
        if (i == 0) {
            yqt yqtVar = this.a;
            if (yqtVar.g()) {
                pmm.c(this.b, (Class) yqtVar.c(), str);
            }
        }
    }
}
