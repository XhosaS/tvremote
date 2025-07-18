package defpackage;

import com.google.protobuf.MessageLite;
import io.grpc.Status;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oye implements oxs {
    public static final zdy a = zdy.h("com/google/android/libraries/home/homegraph/foyer/FoyerGrpcClientImpl");
    public final Optional b;
    private final oxk c = new oxk();
    private final ovk d;
    private final Optional e;
    private oxr f;

    public oye(ovk ovkVar, Optional optional, Optional optional2) {
        this.d = ovkVar;
        this.b = optional;
        this.e = optional2;
    }

    @Override // defpackage.oxs
    public final owv a(afil afilVar, owj owjVar, Class cls, MessageLite messageLite, Function function, long j) {
        return d(afilVar, owjVar, messageLite, function, "oauth2:https://www.googleapis.com/auth/homegraph", j);
    }

    @Override // defpackage.oxs
    public final owv b(final String str, afil afilVar, final owj owjVar, MessageLite messageLite, Function function, String str2, long j) {
        final oyd oydVar = new oyd();
        final oxj oxjVarB = this.c.b(new owj() { // from class: oya
            @Override // defpackage.owj
            public final void a(Status status, Object obj) {
                owjVar.a(status, oydVar.a);
            }
        }, function);
        d(afilVar, new owj() { // from class: oyb
            @Override // defpackage.owj
            public final void a(Status status, Object obj) {
                oxj oxjVar = oxjVarB;
                if (!status.e()) {
                    oxjVar.c(status, null);
                    return;
                }
                abxk abxkVar = abgm.a;
                final abgl abglVar = new abgl();
                if ((abglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    abglVar.y();
                }
                ((abgm) abglVar.b).i = true;
                if ((abglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    abglVar.y();
                }
                oye oyeVar = this.a;
                ((abgm) abglVar.b).e = true;
                Consumer consumer = new Consumer() { // from class: oxt
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        boolean zC = ((oxq) obj2).c();
                        abgl abglVar2 = abglVar;
                        if ((abglVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            abglVar2.y();
                        }
                        abgm abgmVar = (abgm) abglVar2.b;
                        abxk abxkVar2 = abgm.a;
                        abgmVar.f = zC;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                Optional optional = oyeVar.b;
                optional.ifPresent(consumer);
                optional.ifPresent(new Consumer() { // from class: oxv
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        boolean zD = ((oxq) obj2).d();
                        abgl abglVar2 = abglVar;
                        if ((abglVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            abglVar2.y();
                        }
                        abgm abgmVar = (abgm) abglVar2.b;
                        abxk abxkVar2 = abgm.a;
                        abgmVar.j = zD;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
                optional.ifPresent(new Consumer() { // from class: oxw
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        boolean zB = ((oxq) obj2).b();
                        abgl abglVar2 = abglVar;
                        if ((abglVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            abglVar2.y();
                        }
                        abgm abgmVar = (abgm) abglVar2.b;
                        abxk abxkVar2 = abgm.a;
                        abgmVar.k = zB;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
                optional.ifPresent(new Consumer() { // from class: oxx
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        abglVar.a(((oxq) obj2).a());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
                optional.ifPresent(new Consumer() { // from class: oxy
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        boolean zE = ((oxq) obj2).e();
                        abgl abglVar2 = abglVar;
                        if ((abglVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            abglVar2.y();
                        }
                        abgm abgmVar = (abgm) abglVar2.b;
                        abxk abxkVar2 = abgm.a;
                        abgmVar.g = zE;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
                if (aeqy.c() || aerq.c()) {
                    abgg abggVarA = oxf.a();
                    if ((Integer.MIN_VALUE & abglVar.b.memoizedSerializedSize) == 0) {
                        abglVar.y();
                    }
                    abgm abgmVar = (abgm) abglVar.b;
                    abgmVar.h = abggVarA;
                    abgmVar.c = 1 | abgmVar.c;
                }
                oyeVar.f(abhs.a(), (abgm) abglVar.v(), "oauth2:https://www.googleapis.com/auth/homegraph", str, aerh.b(), oxjVar);
            }
        }, messageLite, new Function() { // from class: oxu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                oydVar.a = (MessageLite) obj;
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, str2, j);
        return oxjVarB;
    }

    @Override // defpackage.oxs
    public final void c(oxr oxrVar) {
        this.f = oxrVar;
    }

    @Override // defpackage.oxs
    public final owv d(afil afilVar, owj owjVar, MessageLite messageLite, Function function, String str, long j) {
        oxj oxjVarB = this.c.b(owjVar, function);
        f(afilVar, messageLite, str, null, j, oxjVarB);
        return oxjVarB;
    }

    @Override // defpackage.oxs
    public final owv e(String str, afil afilVar, owj owjVar, MessageLite messageLite, Function function, long j) {
        oxj oxjVarB = this.c.b(owjVar, function);
        f(afilVar, messageLite, "oauth2:https://www.googleapis.com/auth/homegraph", str, j, oxjVarB);
        return oxjVarB;
    }

    public final void f(afil afilVar, MessageLite messageLite, String str, String str2, long j, oxj oxjVar) {
        oyc oycVar = new oyc(oxjVar, afilVar, this.f);
        oxjVar.b(oycVar);
        this.e.ifPresent(new Consumer() { // from class: oxz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ova) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ovm ovmVar = ovm.FOYER;
        ovk ovkVar = this.d;
        ovl ovlVar = new ovl(ovkVar.a, ovmVar, afilVar, messageLite, oycVar, ovkVar.b, j, str, str2, (owg) ovkVar.c.a());
        ovlVar.a.b(ovlVar);
    }
}
