package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isx implements ism {
    private final agow a;
    private final agow b;
    private final String c;

    public isx(agow agowVar, agow agowVar2) {
        agowVar.getClass();
        agowVar2.getClass();
        this.a = agowVar;
        this.b = agowVar2;
        this.c = "action.devices.traits.MediaState";
    }

    @Override // defpackage.ism
    public final Object a(agsw agswVar) {
        return agrj.d(new agpi("supportActivityState", new abax((Object) true)), new agpi("supportPlaybackState", new abax((Object) true)), new agpi("supportActionState", new abax((Object) true)));
    }

    @Override // defpackage.ism
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ism
    public final boolean c() {
        if (!((Boolean) this.a.a()).booleanValue()) {
            return false;
        }
        Object objA = this.b.a();
        objA.getClass();
        Duration durationB = acbh.b((abwf) objA);
        durationB.getClass();
        return durationB.compareTo(Duration.ZERO) >= 0;
    }
}
