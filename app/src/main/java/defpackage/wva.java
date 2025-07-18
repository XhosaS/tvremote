package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wva extends wsn implements wtx {
    static final wtv a = new wtw();
    public static final /* synthetic */ int b = 0;
    private final Exception c;
    private final boolean d;

    public wva(UUID uuid, String str, Exception exc, boolean z, wwl wwlVar) {
        super("<missing root>", uuid, str, wwlVar);
        this.c = exc;
        this.d = z;
    }

    static wva m(wwl wwlVar) {
        UUID uuidB = wun.a.b();
        String strFc = wsn.fc(uuidB);
        if (!wws.a()) {
            s();
            return new wva(uuidB, strFc, a, false, wwlVar);
        }
        wtv wtvVar = new wtv();
        s();
        return new wva(uuidB, strFc, wtvVar, wum.s(wtvVar), wwlVar);
    }

    public static void s() {
        yzq yzqVarJ = wum.j();
        if (yzqVarJ.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(yzqVarJ, new Consumer() { // from class: wuz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i = wva.b;
                ((wxk) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.wtx
    public final Exception c() {
        return this.c;
    }

    @Override // defpackage.wtx
    public final boolean h() {
        return this.d;
    }

    @Override // defpackage.wtx
    public final wwq i(String str, wwc wwcVar, boolean z, wwl wwlVar) {
        if (z) {
            wum.w(true);
        }
        return new wvc(str, this, wwcVar, z, wwlVar);
    }

    @Override // defpackage.wwq
    public final wvy j(wvz wvzVar) {
        return wvy.d(2);
    }

    @Override // defpackage.wwq
    public final wwc k() {
        return wwb.a;
    }

    @Override // defpackage.wwq
    public final long l() {
        return -1L;
    }

    @Override // defpackage.wwq
    public final wwc n() {
        throw null;
    }

    @Override // defpackage.wwq
    public final wwq q(String str, wwc wwcVar, wwl wwlVar) {
        wum.w(true);
        return i(str, wwcVar, true, wwlVar);
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
