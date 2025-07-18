package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aty implements yjv {
    final /* synthetic */ boolean a;
    final /* synthetic */ yow b;
    final /* synthetic */ cvi c;

    public aty(boolean z, cvi cviVar, yow yowVar) {
        this.a = z;
        this.c = cviVar;
        this.b = yowVar;
    }

    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        KeyEvent keyEvent = ((brw) obj).a;
        if (!this.a) {
            cvi cviVar = this.c;
            if (!aun.d(cviVar) && a.s(brx.b(keyEvent), brv.e)) {
                ykr.q(this.b, null, 0, new ajn(cviVar, (yih) null, 17), 3);
                return true;
            }
        }
        return false;
    }
}
