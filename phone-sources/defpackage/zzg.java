package defpackage;

import java.net.URL;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzg implements zzs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ zzg(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.zzs
    public final Object a() {
        if (this.c != 0) {
            return ((zyz) this.a).a.openConnection((URL) this.b);
        }
        zzl zzlVarB = zzl.b(nol$$ExternalSyntheticApiModelOutline8.m459m(this.b));
        zzi zziVar = (zzi) this.a;
        zziVar.a.onResponseStarted(zziVar.b, zzlVarB);
        return null;
    }
}
