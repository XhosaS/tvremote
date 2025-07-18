package defpackage;

import android.accounts.Account;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovh implements ovi {
    private final ovi a;
    private final Optional b;

    public ovh(ovi oviVar, Optional optional) {
        oviVar.getClass();
        this.a = oviVar;
        this.b = optional;
    }

    @Override // defpackage.ovi
    public final String a(Account account, String str) {
        final Optional map = this.b.map(new Function() { // from class: ovc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ovb ovbVar = (ovb) obj;
                ovbVar.getClass();
                return ovbVar.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        try {
            String strA = this.a.a(account, str);
            strA.getClass();
            return strA;
        } finally {
            Optional optional = this.b;
            final agux aguxVar = new agux() { // from class: ovd
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    final ovb ovbVar = (ovb) obj;
                    ovbVar.getClass();
                    final agux aguxVar2 = new agux() { // from class: ovf
                        @Override // defpackage.agux
                        public final Object a(Object obj2) {
                            ((yrn) obj2).getClass();
                            ovbVar.b();
                            return agpu.a;
                        }
                    };
                    map.ifPresent(new Consumer() { // from class: ovg
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj2) {
                            aguxVar2.a(obj2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return agpu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: ove
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    aguxVar.a(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.ovi
    public final void b(String str) {
        this.a.b(str);
    }
}
