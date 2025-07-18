package defpackage;

import j$.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sme implements rux {
    public static final Duration a;
    public final zyd b;
    private final zyd c;
    private final ruo d;
    private final agux e;
    private final zyh f;
    private final Future g;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(10L);
        durationOfMinutes.getClass();
        a = durationOfMinutes;
    }

    public sme(zyd zydVar, zyd zydVar2, ruo ruoVar, agux aguxVar, zyh zyhVar) {
        zyhVar.getClass();
        this.c = zydVar;
        this.b = zydVar2;
        this.d = ruoVar;
        this.e = aguxVar;
        this.f = zyhVar;
        this.g = zyhVar.schedule(new Callable() { // from class: smd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.d(rxn.TIMEOUT);
            }
        }, (ruoVar.b & 128) != 0 ? ruoVar.i : a.toMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.rux
    public final ruw a() {
        return d(rxn.CLIENT_REQUESTED);
    }

    @Override // defpackage.rzv
    public final zyd b() {
        return this.c;
    }

    @Override // defpackage.rzv
    public final /* synthetic */ Object c() {
        return new ruw() { // from class: smc
            @Override // defpackage.ruw
            public final zyd a() {
                return this.a.b;
            }
        };
    }

    public final ruw d(rxn rxnVar) {
        this.g.cancel(false);
        this.e.a(rxnVar);
        return new ruw() { // from class: smb
            @Override // defpackage.ruw
            public final zyd a() {
                return this.a.b;
            }
        };
    }
}
