package defpackage;

import com.google.apps.tiktok.account.AccountId;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmo extends vhq implements vin {
    private final vll a;
    private final vln b;

    public vmo(vll vllVar, vln vlnVar) {
        this.a = vllVar;
        this.b = vlnVar;
    }

    @Override // defpackage.vhq
    public final zyd a(AccountId accountId) {
        return this.b.c(accountId);
    }

    @Override // defpackage.vhq
    public final zyd b(AccountId accountId) {
        return this.b.d(accountId);
    }

    @Override // defpackage.vhq
    public final zyd c(final AccountId accountId) {
        zyd zydVarA = this.a.a.a();
        yqi yqiVar = new yqi() { // from class: vli
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return vll.a(vll.b((voi) obj, accountId));
            }
        };
        return zuz.g(zydVarA, wyo.a(yqiVar), zwk.a);
    }

    @Override // defpackage.vhq
    public final zyd d() {
        vll vllVar = this.a;
        return zuz.g(vllVar.a.a(), wyo.a(new yqi() { // from class: vlk
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                yzo yzoVar = new yzo();
                Iterator it = DesugarCollections.unmodifiableMap(((voi) obj).d).values().iterator();
                while (it.hasNext()) {
                    yzoVar.c(AccountId.b(((von) it.next()).c));
                }
                return yzoVar.f();
            }
        }), vllVar.b);
    }

    @Override // defpackage.vhq
    public final zyd e() {
        vll vllVar = this.a;
        return zuz.g(vllVar.a.a(), wyo.a(new yqi() { // from class: vlj
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = yyk.e;
                yyf yyfVar = new yyf(4);
                Iterator it = DesugarCollections.unmodifiableMap(((voi) obj).d).values().iterator();
                while (it.hasNext()) {
                    yyfVar.g(vll.a((von) it.next()));
                }
                return yyfVar.f();
            }
        }), vllVar.b);
    }

    @Override // defpackage.vhq
    public final zyd f() {
        vll vllVar = this.a;
        return zuz.g(vllVar.a.a(), wyo.a(new yqi() { // from class: vlh
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = yyk.e;
                yyf yyfVar = new yyf(4);
                for (von vonVar : DesugarCollections.unmodifiableMap(((voi) obj).d).values()) {
                    int iA = vig.a(vonVar.e);
                    if (iA != 0 && iA == 2) {
                        yyfVar.g(vll.a(vonVar));
                    }
                }
                return yyfVar.f();
            }
        }), vllVar.b);
    }

    @Override // defpackage.vhq
    public final zyd g(final AccountId accountId) {
        zyd zydVarA = this.a.a.a();
        yqi yqiVar = new yqi() { // from class: vlg
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int iA = vig.a(vll.b((voi) obj, accountId).e);
                boolean z = false;
                if (iA != 0 && iA == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        return zuz.g(zydVarA, wyo.a(yqiVar), zwk.a);
    }

    @Override // defpackage.vhq
    public final zyd h() {
        zyd zydVarA = this.a.a.a();
        yqi yqiVar = new yqi() { // from class: vlf
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return DesugarCollections.unmodifiableMap(((voi) obj).d).keySet();
            }
        };
        return zuz.g(zydVarA, wyo.a(yqiVar), zwk.a);
    }

    @Override // defpackage.vhq
    public final vha i(AccountId accountId) {
        try {
            vle vleVar = this.a.a;
            mfw mfwVar = vleVar.c;
            final ujk ujkVar = vleVar.a;
            ujkVar.getClass();
            return vll.a(vll.b((voi) mfwVar.b(new zvh() { // from class: vlb
                @Override // defpackage.zvh
                public final zyd a() {
                    return ujkVar.c();
                }
            }), accountId));
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    @Override // defpackage.vhq
    public final zyd j(Collection collection) {
        return this.b.g(collection);
    }

    @Override // defpackage.vhq
    public final zyd k(Collection collection, yzq yzqVar) {
        return this.b.h(collection, yzqVar);
    }

    @Override // defpackage.vin
    public final zyd l(Collection collection) {
        return this.b.a(collection);
    }

    @Override // defpackage.vin
    public final zyd m(Collection collection) {
        return this.b.b(collection);
    }

    @Override // defpackage.vin
    public final zyd n(Collection collection) {
        return this.b.e(collection);
    }

    @Override // defpackage.vin
    public final zyd o(Collection collection) {
        return this.b.f(collection);
    }
}
