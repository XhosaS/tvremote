package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Trace;
import com.google.android.gms.net.HttpEngineProviderSingleton;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class owe implements ovo {
    public static final zdy a = zdy.h("com/google/android/libraries/home/grpc/GrpcServerImpl");
    protected final ouk b;
    public final Set e;
    public afhq f;
    public afhq g;
    public final agow h;
    protected final Handler j;
    protected final Context k;
    public final List l;
    public final oun m;
    private final Optional o;
    public final Object c = new Object();
    public final Object d = new Object();
    public final AtomicBoolean i = new AtomicBoolean();
    private final AtomicBoolean n = new AtomicBoolean();
    private final ouj p = new ovv(this);
    private final ouj q = new ovw(this);

    public owe(Context context, oun ounVar, ouk oukVar, agow agowVar, List list, Set set, Optional optional) {
        this.k = context;
        this.m = ounVar;
        this.l = list;
        this.e = set;
        this.b = oukVar;
        this.o = optional;
        this.h = agowVar;
        this.j = new Handler(context.getMainLooper());
    }

    public static afej c(String str) {
        return new afki(new owd(str), afki.b);
    }

    @Override // defpackage.ovo
    public final ager a(owf owfVar, ager agerVar) {
        return new owc(this, owfVar, agerVar);
    }

    @Override // defpackage.ovo
    public final void b(owf owfVar) {
        ouj oujVar;
        this.o.ifPresent(new Consumer() { // from class: ovt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ova) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        int iOrdinal = owfVar.g().ordinal();
        if (iOrdinal == 0) {
            oujVar = this.p;
        } else {
            if (iOrdinal != 1) {
                ((zdv) a.a(pai.a).q("com/google/android/libraries/home/grpc/GrpcServerImpl", "send", 250, "GrpcServerImpl.java")).x("Invalid channel type: %s", owfVar.g());
                return;
            }
            oujVar = this.q;
        }
        owfVar.n(new ovx(this, owfVar, oujVar));
    }

    public final void d() {
        lvn lvnVar;
        if (this.n.getAndSet(true)) {
            return;
        }
        try {
            final Context context = this.k;
            ltn.a(context);
            Object obj = lne.a;
            kkk.l(context, "Context must not be null");
            final lvj lvjVar = new lvj();
            if (HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
                lvjVar.a.p(null);
                synchronized (lne.a) {
                    lne.c = true;
                }
                lvnVar = lvjVar.a;
            } else if (lne.c()) {
                lvnVar = lvjVar.a;
                lvnVar.p(null);
            } else {
                new lni("PlayServices CronetProviderInstaller#installProvider starting thread");
                try {
                    new Thread(new Runnable() { // from class: lnd
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj2 = lne.a;
                            lvj lvjVar2 = lvjVar;
                            try {
                                lne.b(context);
                                lvjVar2.a.p(null);
                            } catch (Exception e) {
                                lvjVar2.a.o(e);
                            }
                        }
                    }).start();
                    Trace.endSection();
                    lvnVar = lvjVar.a;
                } finally {
                }
            }
            lvq.d(lvnVar);
        } catch (Exception e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/home/grpc/GrpcServerImpl", "installProvidersIfNeeded", (char) 506, "GrpcServerImpl.java")).u("Failed to update the security provider through Google Play Services");
        }
        AtomicBoolean atomicBoolean = this.i;
        atomicBoolean.set(lne.c());
        if (atomicBoolean.get()) {
            return;
        }
        Collection.EL.stream(this.e).forEach(new Consumer() { // from class: ovp
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                ((ovn) obj2).c();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
