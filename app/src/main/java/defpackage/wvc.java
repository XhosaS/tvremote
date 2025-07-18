package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wvc extends wty implements wtx {
    public final boolean a;
    private final Exception b;
    private final boolean c;

    public wvc(String str, wtx wtxVar, wwc wwcVar, boolean z, wwl wwlVar) {
        super("<missing root>:".concat(String.valueOf(str)), wtxVar, wwc.d(wwcVar, wwb.b), wwlVar);
        this.b = wtxVar.c();
        this.a = wtxVar.h();
        this.c = z;
    }

    public static void m() {
        yzq yzqVarJ = wum.j();
        if (yzqVarJ.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(yzqVarJ, new Consumer() { // from class: wvb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((wxk) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.wtx
    public final Exception c() {
        return this.b;
    }

    @Override // defpackage.wtx
    public final boolean h() {
        return this.a;
    }

    @Override // defpackage.wtx
    public final wwq i(String str, wwc wwcVar, boolean z, wwl wwlVar) {
        boolean z2 = true;
        if (z && !this.c) {
            wum.w(true);
        }
        if ((!z || this.c) && !this.c) {
            z2 = false;
        }
        return new wvc(str, this, wwcVar, z2, wwlVar);
    }

    @Override // defpackage.wty, defpackage.wwq
    public final wvy j(wvz wvzVar) {
        wvy wvyVarI = wwc.i(wvzVar, k());
        return wvyVarI.c() == 3 ? wvy.d(2) : wvyVarI;
    }

    @Override // defpackage.wwq
    public final long l() {
        return -1L;
    }

    @Override // defpackage.wwq
    public final wwc n() {
        return wwb.a;
    }

    @Override // defpackage.wwq
    public final wwq q(String str, wwc wwcVar, wwl wwlVar) {
        wum.w(true);
        return i(str, wwcVar, true, wwlVar);
    }

    public wvc(UUID uuid, String str, String str2, wwc wwcVar, Exception exc, boolean z, boolean z2, wwl wwlVar) {
        super("<missing root>:".concat(String.valueOf(str2)), uuid, str, wwc.d(wwcVar, wwb.b), wwlVar);
        this.a = z2;
        this.b = exc;
        this.c = z;
    }

    @Override // defpackage.wwq
    public final void r() {
    }

    @Override // defpackage.wwq
    public final void t() {
    }

    @Override // defpackage.wwq
    public final void p(boolean z) {
    }

    @Override // defpackage.wwq
    public final void o(wvz wvzVar, Object obj) {
    }
}
